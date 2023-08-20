
package CharSet;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CharSet1 {

    public static boolean debug = false;

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0501");
        java.lang.String[] strArray5 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[h, i, !]", "[h, i, !]", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        boolean boolean8 = charSet6.contains(' ');
        java.lang.Class<?> wildcardClass9 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0502");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        boolean boolean7 = charSet0.contains(' ');
        java.lang.String str8 = charSet0.toString();
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0503");
        java.lang.String[] strArray4 = new java.lang.String[] { "[h, i, !]", "[A-Z]", "[A-Z, a-z, [, ]]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean8 = charSet6.contains('4');
        java.lang.Class<?> wildcardClass9 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0504");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z]", "[A-Z, a-z, [, ]]", "[,,  , h, a-z, A-Z, [, ], i, !]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str5 = charSet4.toString();
        java.lang.String str6 = charSet4.toString();
        java.lang.Class<?> wildcardClass7 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str5.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str6.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0505");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z]", "[h, i, !]", "hi!", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean7 = charSet5.contains('a');
        boolean boolean9 = charSet5.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0506");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean3 = charSet1.contains(' ');
        boolean boolean5 = charSet1.equals((java.lang.Object) 0.0d);
        java.lang.String str6 = charSet1.toString();
        java.lang.String str7 = charSet1.toString();
        boolean boolean8 = charSet0.equals((java.lang.Object) str7);
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0507");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass9 = charSet8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
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
            System.out.format("%n%s%n", "CharSet1.test0508");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('4');
        boolean boolean7 = charSet2.contains('4');
        boolean boolean9 = charSet2.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
            System.out.format("%n%s%n", "CharSet1.test0509");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('4');
        java.lang.String str6 = charSet2.toString();
        boolean boolean8 = charSet2.contains('#');
        java.lang.String str9 = charSet2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0510");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean8 = charSet6.contains(' ');
        java.lang.Class<?> wildcardClass9 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0511");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.contains('4');
        boolean boolean8 = charSet0.contains('a');
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0512");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean7 = charSet5.contains('4');
        boolean boolean9 = charSet5.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0513");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('a');
        boolean boolean7 = charSet0.contains('#');
        boolean boolean9 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0514");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.equals((java.lang.Object) 10L);
        boolean boolean8 = charSet4.contains('4');
        java.lang.String str9 = charSet4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0515");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('a');
        boolean boolean7 = charSet2.contains('4');
        boolean boolean9 = charSet2.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
            System.out.format("%n%s%n", "CharSet1.test0516");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean7 = charSet5.contains('4');
        java.lang.String str8 = charSet5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0517");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.contains(' ');
        boolean boolean8 = charSet4.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0518");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.equals((java.lang.Object) 0.0d);
        java.lang.String str5 = charSet0.toString();
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0519");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass8 = charSet7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0520");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, ,,  , A-Z, a-z, [, i, !, ]]", "[0-9, ,,  , a-z, A-Z, [, ]]", "hi!" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass6 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0521");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean7 = charSet5.contains('a');
        boolean boolean9 = charSet5.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0522");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean4 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.String str5 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0523");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z, A-Z]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str7 = charSet6.toString();
        java.lang.Class<?> wildcardClass8 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str7.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0524");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass8 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0525");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('#');
        java.lang.String str6 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0526");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains('#');
        boolean boolean6 = charSet0.contains(' ');
        java.lang.Object obj7 = null;
        boolean boolean8 = charSet0.equals(obj7);
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0527");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('4');
        boolean boolean7 = charSet3.contains('#');
        boolean boolean9 = charSet3.equals((java.lang.Object) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0528");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z, A-Z]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass8 = charSet7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0529");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z, A-Z]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet9 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
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
            System.out.format("%n%s%n", "CharSet1.test0530");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet2.toString();
        boolean boolean6 = charSet2.contains('4');
        java.lang.Class<?> wildcardClass7 = charSet2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0531");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.contains('4');
        boolean boolean8 = charSet4.contains('a');
        java.lang.Class<?> wildcardClass9 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0532");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        boolean boolean4 = charSet0.contains('#');
        boolean boolean6 = charSet0.contains('4');
        boolean boolean8 = charSet0.contains('4');
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0533");
        java.lang.String[] strArray4 = new java.lang.String[] { "[h, i, !]", "[A-Z]", "[A-Z, a-z, [, ]]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet9 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
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
            System.out.format("%n%s%n", "CharSet1.test0534");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.equals((java.lang.Object) (byte) 0);
        java.lang.String str6 = charSet3.toString();
        java.lang.Class<?> wildcardClass7 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0535");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains(' ');
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[a-z]" + "'", str2.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0536");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains('#');
        java.lang.String str5 = charSet0.toString();
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0537");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        boolean boolean8 = charSet6.contains(' ');
        java.lang.String str9 = charSet6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z, a-z, [, ]]" + "'", str9.equals("[A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0538");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        boolean boolean4 = charSet1.equals((java.lang.Object) 10L);
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet1.equals(obj5);
        java.lang.Class<?> wildcardClass7 = charSet1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0539");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        java.lang.Object obj3 = null;
        boolean boolean4 = charSet0.equals(obj3);
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('#');
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0540");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains(' ');
        boolean boolean7 = charSet0.contains('a');
        java.lang.String str8 = charSet0.toString();
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[A-Z]" + "'", str3.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0541");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean7 = charSet5.contains('4');
        java.lang.String str8 = charSet5.toString();
        java.lang.Class<?> wildcardClass9 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0542");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        boolean boolean7 = charSet4.contains('#');
        java.lang.String str8 = charSet4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str5.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str8.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0543");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "[0-9]", "[A-Z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        java.lang.Object obj8 = null;
        boolean boolean9 = charSet7.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0544");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('a');
        java.lang.String str6 = charSet3.toString();
        boolean boolean8 = charSet3.contains('a');
        java.lang.Class<?> wildcardClass9 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0545");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean7 = charSet5.contains('#');
        java.lang.Class<?> wildcardClass8 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0546");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z]", "[A-Z, a-z, [, ]]", "[,,  , h, a-z, A-Z, [, ], i, !]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str5 = charSet4.toString();
        java.lang.String str6 = charSet4.toString();
        java.lang.String str7 = charSet4.toString();
        boolean boolean9 = charSet4.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str5.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str6.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str7.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0547");
        java.lang.String[] strArray4 = new java.lang.String[] { "[h, i, !]", "[A-Z]", "[A-Z, a-z, [, ]]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str6 = charSet5.toString();
        boolean boolean8 = charSet5.contains('4');
        java.lang.String str9 = charSet5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[h, ,,  , A-Z, a-z, [, i, !, ]]" + "'", str6.equals("[h, ,,  , A-Z, a-z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[h, ,,  , A-Z, a-z, [, i, !, ]]" + "'", str9.equals("[h, ,,  , A-Z, a-z, [, i, !, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0548");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 10);
        boolean boolean7 = charSet0.contains(' ');
        boolean boolean9 = charSet0.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
            System.out.format("%n%s%n", "CharSet1.test0549");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('4');
        java.lang.String str6 = charSet2.toString();
        boolean boolean8 = charSet2.contains('#');
        java.lang.Class<?> wildcardClass9 = charSet2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0550");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('4');
        java.lang.String str7 = charSet3.toString();
        java.lang.String str8 = charSet3.toString();
        java.lang.String str9 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0551");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean7 = charSet5.contains('a');
        boolean boolean9 = charSet5.equals((java.lang.Object) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0552");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 1);
        boolean boolean7 = charSet0.contains(' ');
        java.lang.String str8 = charSet0.toString();
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0553");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean7 = charSet5.contains('4');
        java.lang.Class<?> wildcardClass8 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0554");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean7 = charSet5.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0555");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        boolean boolean7 = charSet0.contains(' ');
        java.lang.String str8 = charSet0.toString();
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0556");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('a');
        java.lang.String str3 = charSet0.toString();
        java.lang.Class<?> wildcardClass4 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[A-Z]" + "'", str3.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0557");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.Class<?> wildcardClass9 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
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
            System.out.format("%n%s%n", "CharSet1.test0558");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean3 = charSet1.contains(' ');
        boolean boolean5 = charSet1.equals((java.lang.Object) 0.0d);
        java.lang.String str6 = charSet1.toString();
        java.lang.String str7 = charSet1.toString();
        boolean boolean8 = charSet0.equals((java.lang.Object) str7);
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0559");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.contains('4');
        boolean boolean8 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0560");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z, A-Z]", "[0-9, h, A-Z, a-z, i, !, [, ]]", "[A-Z]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0561");
        java.lang.String[] strArray6 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[a-z]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[a-z]" };
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
            System.out.format("%n%s%n", "CharSet1.test0562");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean9 = charSet7.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0563");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('4');
        boolean boolean7 = charSet3.contains('4');
        boolean boolean9 = charSet3.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0564");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str7 = charSet6.toString();
        boolean boolean9 = charSet6.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0565");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 10);
        boolean boolean7 = charSet0.contains(' ');
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0566");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        boolean boolean7 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0567");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 10);
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0568");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains(' ');
        boolean boolean7 = charSet3.contains('#');
        java.lang.String str8 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0569");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str7 = charSet6.toString();
        boolean boolean9 = charSet6.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str7.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0570");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) 10L);
        boolean boolean5 = charSet0.contains(' ');
        boolean boolean7 = charSet0.contains('4');
        java.lang.Object obj8 = null;
        boolean boolean9 = charSet0.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[0-9]" + "'", str1.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0571");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, ,,  , A-Z, a-z, [, i, !, ]]", "[0-9, ,,  , a-z, A-Z, [, ]]", "hi!" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str6 = charSet5.toString();
        boolean boolean8 = charSet5.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, h, ,,  , A-Z, a-z, [, i, !, ]]" + "'", str6.equals("[0-9, h, ,,  , A-Z, a-z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0572");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean7 = charSet4.equals((java.lang.Object) charSet6);
        boolean boolean9 = charSet4.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str5.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0573");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.contains('4');
        boolean boolean8 = charSet0.contains('#');
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0574");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains(' ');
        boolean boolean6 = charSet0.equals((java.lang.Object) ' ');
        boolean boolean8 = charSet0.contains('a');
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0575");
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
            System.out.format("%n%s%n", "CharSet1.test0576");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass3 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0577");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        java.lang.String str3 = charSet0.toString();
        java.lang.Class<?> wildcardClass4 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0578");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z, A-Z]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str6 = charSet5.toString();
        java.lang.String str7 = charSet5.toString();
        java.lang.String str8 = charSet5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str6.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str7.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str8.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0579");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str8 = charSet7.toString();
        java.lang.String str9 = charSet7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str8.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str9.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0580");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet1.contains('4');
        java.lang.Class<?> wildcardClass4 = charSet1.getClass();
        boolean boolean5 = charSet0.equals((java.lang.Object) charSet1);
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0581");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, ,,  , A-Z, a-z, [, i, !, ]]", "[0-9, ,,  , a-z, A-Z, [, ]]", "hi!" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0582");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str6 = charSet5.toString();
        java.lang.String str7 = charSet5.toString();
        boolean boolean9 = charSet5.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0583");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains(' ');
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
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
            System.out.format("%n%s%n", "CharSet1.test0584");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains(' ');
        java.lang.String str6 = charSet3.toString();
        java.lang.String str7 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str6.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str7.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0585");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z]", "[h, i, !]", "hi!", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0586");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.contains(' ');
        boolean boolean6 = charSet0.contains('#');
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0587");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z, A-Z]", "[0-9, h, A-Z, a-z, i, !, [, ]]", "[A-Z]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str7 = charSet6.toString();
        java.lang.String str8 = charSet6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , h, a-z, A-Z, [, ], i, !]" + "'", str7.equals("[0-9, ,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , h, a-z, A-Z, [, ], i, !]" + "'", str8.equals("[0-9, ,,  , h, a-z, A-Z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0588");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str2 = charSet1.toString();
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean6 = charSet1.equals((java.lang.Object) charSet3);
        boolean boolean7 = charSet0.equals((java.lang.Object) charSet3);
        boolean boolean9 = charSet0.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[0-9]" + "'", str2.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0589");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        boolean boolean4 = charSet0.contains('#');
        boolean boolean6 = charSet0.contains('4');
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0590");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        boolean boolean4 = charSet1.contains(' ');
        java.lang.String str5 = charSet1.toString();
        java.lang.String str6 = charSet1.toString();
        java.lang.Class<?> wildcardClass7 = charSet1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0591");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str6 = charSet5.toString();
        java.lang.String str7 = charSet5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str6.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str7.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0592");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        boolean boolean7 = charSet0.contains('4');
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0593");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains('#');
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('a');
        boolean boolean9 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0594");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean6 = charSet0.equals((java.lang.Object) charSet3);
        boolean boolean8 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0595");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) 10L);
        boolean boolean5 = charSet0.contains('#');
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[0-9]" + "'", str1.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9]" + "'", str6.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0596");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean4 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.Class<?> wildcardClass5 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0597");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z]", "[A-Z, a-z, [, ]]", "[,,  , h, a-z, A-Z, [, ], i, !]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str5 = charSet4.toString();
        java.lang.Class<?> wildcardClass6 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str5.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0598");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains(' ');
        java.lang.String str6 = charSet3.toString();
        boolean boolean8 = charSet3.contains('a');
        java.lang.String str9 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0599");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str6 = charSet5.toString();
        boolean boolean8 = charSet5.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0600");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.contains('4');
        boolean boolean8 = charSet4.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0601");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains(' ');
        boolean boolean7 = charSet0.contains('a');
        boolean boolean9 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[A-Z]" + "'", str3.equals("[A-Z]"));
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
            System.out.format("%n%s%n", "CharSet1.test0602");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet0.equals(obj5);
        boolean boolean8 = charSet0.contains('4');
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[a-z]" + "'", str2.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0603");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 1);
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0604");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('#');
        java.lang.String str6 = charSet3.toString();
        boolean boolean8 = charSet3.contains(' ');
        java.lang.Class<?> wildcardClass9 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0605");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains('#');
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.equals((java.lang.Object) "[,,  , h, a-z, A-Z, [, ], i, !]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0606");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.contains('a');
        boolean boolean8 = charSet0.contains(' ');
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0607");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains(' ');
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('#');
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[A-Z]" + "'", str3.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0608");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0609");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('4');
        boolean boolean8 = charSet3.contains('4');
        java.lang.String str9 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0610");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str8 = charSet7.toString();
        java.lang.Class<?> wildcardClass9 = charSet7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str8.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0611");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str7 = charSet6.toString();
        boolean boolean9 = charSet6.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str7.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0612");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains('#');
        boolean boolean6 = charSet0.contains(' ');
        boolean boolean8 = charSet0.contains('#');
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0613");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9, ,,  , A-Z, a-z, [, ]]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean8 = charSet6.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0614");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('a');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.String str6 = charSet5.toString();
        boolean boolean7 = charSet0.equals((java.lang.Object) charSet5);
        java.lang.Class<?> wildcardClass8 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[A-Z]" + "'", str3.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
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
            System.out.format("%n%s%n", "CharSet1.test0615");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('#');
        java.lang.String str7 = charSet3.toString();
        boolean boolean9 = charSet3.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0616");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        boolean boolean7 = charSet0.contains('#');
        java.lang.String str8 = charSet0.toString();
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0617");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z]", "[A-Z, a-z, [, ]]", "[,,  , h, a-z, A-Z, [, ], i, !]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str5 = charSet4.toString();
        boolean boolean7 = charSet4.contains('4');
        java.lang.String str8 = charSet4.toString();
        java.lang.Class<?> wildcardClass9 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str5.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str8.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0618");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        boolean boolean7 = charSet4.contains('#');
        boolean boolean9 = charSet4.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str5.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0619");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str2 = charSet1.toString();
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean6 = charSet1.equals((java.lang.Object) charSet3);
        boolean boolean7 = charSet0.equals((java.lang.Object) charSet3);
        boolean boolean9 = charSet0.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[0-9]" + "'", str2.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0620");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        boolean boolean4 = charSet0.contains('#');
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet0.equals(obj5);
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0621");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.contains(' ');
        java.lang.String str7 = charSet0.toString();
        java.lang.Object obj8 = null;
        boolean boolean9 = charSet0.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0622");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.equals((java.lang.Object) 100);
        boolean boolean8 = charSet3.contains('4');
        java.lang.Class<?> wildcardClass9 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0623");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.contains('4');
        java.lang.String str7 = charSet4.toString();
        boolean boolean9 = charSet4.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0624");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z]", "[A-Z, a-z, [, ]]", "[,,  , h, a-z, A-Z, [, ], i, !]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str5 = charSet4.toString();
        boolean boolean7 = charSet4.contains('4');
        boolean boolean9 = charSet4.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str5.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0625");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains(' ');
        boolean boolean7 = charSet0.contains('4');
        boolean boolean9 = charSet0.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
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
            System.out.format("%n%s%n", "CharSet1.test0626");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z, A-Z]", "[0-9, h, A-Z, a-z, i, !, [, ]]", "[A-Z]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.Class<?> wildcardClass6 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0627");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('#');
        boolean boolean7 = charSet2.contains('4');
        boolean boolean9 = charSet2.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
            System.out.format("%n%s%n", "CharSet1.test0628");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.contains('a');
        boolean boolean7 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0629");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass4 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0630");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean4 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet3.equals(obj5);
        boolean boolean8 = charSet3.contains('a');
        java.lang.Class<?> wildcardClass9 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0631");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean8 = charSet6.contains('a');
        java.lang.String str9 = charSet6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0632");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.equals((java.lang.Object) "[0-9, ,,  , A-Z, a-z, [, ]]");
        boolean boolean8 = charSet3.contains('#');
        java.lang.String str9 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0633");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.contains('#');
        java.lang.Class<?> wildcardClass7 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0634");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, ,,  , A-Z, a-z, [, i, !, ]]", "[0-9, ,,  , a-z, A-Z, [, ]]", "hi!" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass8 = charSet7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0635");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z, A-Z]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str7 = charSet6.toString();
        java.lang.String str8 = charSet6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str7.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str8.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0636");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean8 = charSet6.contains('a');
        java.lang.Class<?> wildcardClass9 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0637");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z, A-Z]", "[0-9, h, A-Z, a-z, i, !, [, ]]", "[A-Z]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str7 = charSet6.toString();
        boolean boolean9 = charSet6.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , h, a-z, A-Z, [, ], i, !]" + "'", str7.equals("[0-9, ,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0638");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains('#');
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        boolean boolean7 = charSet5.contains('a');
        boolean boolean8 = charSet0.equals((java.lang.Object) charSet5);
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0639");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.Object obj1 = null;
        boolean boolean2 = charSet0.equals(obj1);
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[A-Z]" + "'", str3.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0640");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        java.lang.String str6 = charSet3.toString();
        java.lang.Class<?> wildcardClass7 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str5.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0641");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.equals((java.lang.Object) 0.0d);
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('4');
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0642");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.contains('#');
        java.lang.String str5 = charSet0.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = charSet0.equals(obj6);
        boolean boolean9 = charSet0.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0643");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.Class<?> wildcardClass5 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0644");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.Object obj1 = null;
        boolean boolean2 = charSet0.equals(obj1);
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.Class<?> wildcardClass5 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[A-Z]" + "'", str3.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0645");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) 1L);
        boolean boolean6 = charSet0.contains('4');
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[a-z]" + "'", str2.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0646");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        boolean boolean4 = charSet1.equals((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass5 = charSet1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0647");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('#');
        java.lang.String str6 = charSet3.toString();
        boolean boolean8 = charSet3.contains('a');
        java.lang.String str9 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0648");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0649");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0650");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains(' ');
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0651");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str5 = charSet4.toString();
        boolean boolean7 = charSet4.contains('a');
        java.lang.String str8 = charSet4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str5.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str8.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0652");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('#');
        java.lang.String str6 = charSet2.toString();
        java.lang.String str7 = charSet2.toString();
        java.lang.String str8 = charSet2.toString();
        java.lang.String str9 = charSet2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0653");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0654");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 1);
        java.lang.Object obj6 = null;
        boolean boolean7 = charSet0.equals(obj6);
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0655");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str3 = charSet2.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) str3);
        java.lang.String str5 = charSet0.toString();
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[0-9]" + "'", str3.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0656");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0657");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str6 = charSet5.toString();
        boolean boolean8 = charSet5.contains('#');
        java.lang.String str9 = charSet5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0658");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.contains(' ');
        boolean boolean6 = charSet0.contains('a');
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0659");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = charSet0.equals(obj6);
        boolean boolean9 = charSet0.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
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
            System.out.format("%n%s%n", "CharSet1.test0660");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        java.lang.String str6 = charSet4.toString();
        boolean boolean8 = charSet4.equals((java.lang.Object) "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]");
        java.lang.Class<?> wildcardClass9 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str5.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0661");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) 1L);
        boolean boolean6 = charSet0.contains('4');
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[a-z]" + "'", str2.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0662");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean4 = charSet0.equals((java.lang.Object) charSet3);
        boolean boolean6 = charSet3.contains('4');
        boolean boolean8 = charSet3.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0663");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet4.equals(obj5);
        java.lang.String str7 = charSet4.toString();
        java.lang.Class<?> wildcardClass8 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str7.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0664");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.contains(' ');
        boolean boolean6 = charSet0.contains('#');
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0665");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        boolean boolean4 = charSet1.equals((java.lang.Object) 10L);
        boolean boolean6 = charSet1.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0666");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains(' ');
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0667");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass9 = charSet8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
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
            System.out.format("%n%s%n", "CharSet1.test0668");
        java.lang.String[] strArray4 = new java.lang.String[] { "[h, i, !]", "[A-Z]", "[A-Z, a-z, [, ]]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str8 = charSet7.toString();
        java.lang.String str9 = charSet7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[h, ,,  , A-Z, a-z, [, i, !, ]]" + "'", str8.equals("[h, ,,  , A-Z, a-z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[h, ,,  , A-Z, a-z, [, i, !, ]]" + "'", str9.equals("[h, ,,  , A-Z, a-z, [, i, !, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0669");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('#');
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z, A-Z]" + "'", str1.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z, A-Z]" + "'", str4.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z, A-Z]" + "'", str5.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0670");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str5 = charSet4.toString();
        boolean boolean7 = charSet4.contains('a');
        java.lang.Class<?> wildcardClass8 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str5.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0671");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.equals((java.lang.Object) (-1L));
        java.lang.String str7 = charSet0.toString();
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0672");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str6 = charSet5.toString();
        boolean boolean8 = charSet5.contains('#');
        java.lang.Class<?> wildcardClass9 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0673");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 1);
        boolean boolean7 = charSet0.contains('#');
        boolean boolean9 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
            System.out.format("%n%s%n", "CharSet1.test0674");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean9 = charSet7.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0675");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean7 = charSet5.contains('a');
        java.lang.Class<?> wildcardClass8 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0676");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        boolean boolean4 = charSet0.contains('#');
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet0.equals(obj5);
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0677");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z]", "[A-Z, a-z, [, ]]", "[,,  , h, a-z, A-Z, [, ], i, !]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass6 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0678");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.contains('#');
        java.lang.String str5 = charSet0.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = charSet0.equals(obj6);
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0679");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        boolean boolean4 = charSet0.contains('#');
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet0.equals(obj5);
        java.lang.String str7 = charSet0.toString();
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0680");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.String str7 = charSet6.toString();
        java.lang.String str8 = charSet6.toString();
        java.lang.Class<?> wildcardClass9 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z, a-z, [, ]]" + "'", str7.equals("[A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z, a-z, [, ]]" + "'", str8.equals("[A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0681");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.String str7 = charSet6.toString();
        boolean boolean9 = charSet6.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z, a-z, [, ]]" + "'", str7.equals("[A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0682");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.equals((java.lang.Object) (byte) 0);
        java.lang.String str6 = charSet3.toString();
        java.lang.String str7 = charSet3.toString();
        java.lang.Class<?> wildcardClass8 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0683");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, ,,  , A-Z, a-z, [, i, !, ]]", "[0-9, ,,  , a-z, A-Z, [, ]]", "hi!" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str9 = charSet8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, h, ,,  , A-Z, a-z, [, i, !, ]]" + "'", str9.equals("[0-9, h, ,,  , A-Z, a-z, [, i, !, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0684");
        java.lang.String[] strArray6 = new java.lang.String[] { "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]", "[0-9, ,,  , h, a-z, A-Z, [, ], i, !]", "[a-z, A-Z]", "[h, i, !]", "[h, i, !]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        boolean boolean9 = charSet7.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0685");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('#');
        java.lang.Class<?> wildcardClass4 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z, A-Z]" + "'", str1.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0686");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z, A-Z]", "[0-9, h, A-Z, a-z, i, !, [, ]]", "[A-Z]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean9 = charSet7.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0687");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains(' ');
        java.lang.String str4 = charSet0.toString();
        java.lang.Class<?> wildcardClass5 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z, A-Z]" + "'", str1.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z, A-Z]" + "'", str4.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0688");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('4');
        boolean boolean9 = charSet0.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0689");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean8 = charSet6.contains(' ');
        java.lang.Class<?> wildcardClass9 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0690");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z, A-Z]", "[0-9, h, A-Z, a-z, i, !, [, ]]", "[A-Z]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet9 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
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
            System.out.format("%n%s%n", "CharSet1.test0691");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean7 = charSet5.contains('a');
        boolean boolean9 = charSet5.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0692");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains(' ');
        java.lang.String str6 = charSet3.toString();
        java.lang.String str7 = charSet3.toString();
        boolean boolean9 = charSet3.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0693");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.equals((java.lang.Object) 0.0d);
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0694");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z, A-Z]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str5 = charSet4.toString();
        boolean boolean7 = charSet4.contains('4');
        java.lang.Class<?> wildcardClass8 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str5.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0695");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 1);
        boolean boolean7 = charSet0.contains('#');
        boolean boolean9 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
            System.out.format("%n%s%n", "CharSet1.test0696");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        boolean boolean4 = charSet0.contains('#');
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet0.equals(obj5);
        boolean boolean8 = charSet0.contains(' ');
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0697");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 10);
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0698");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('#');
        java.lang.String str6 = charSet3.toString();
        java.lang.String str7 = charSet3.toString();
        java.lang.Class<?> wildcardClass8 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0699");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str9 = charSet8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str9.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0700");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str3 = charSet2.toString();
        java.lang.String str4 = charSet2.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean7 = charSet0.contains('a');
        boolean boolean9 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[0-9]" + "'", str1.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
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
            System.out.format("%n%s%n", "CharSet1.test0701");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0702");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('a');
        boolean boolean6 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0703");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0704");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z, A-Z]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0705");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.Class<?> wildcardClass4 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[A-Z]" + "'", str3.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0706");
        java.lang.String[] strArray6 = new java.lang.String[] { "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]", "[0-9, ,,  , h, a-z, A-Z, [, ], i, !]", "[a-z, A-Z]", "[h, i, !]", "[h, i, !]", "[a-z]" };
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
            System.out.format("%n%s%n", "CharSet1.test0707");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains(' ');
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z, A-Z]" + "'", str1.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z, A-Z]" + "'", str4.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z, A-Z]" + "'", str5.equals("[a-z, A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0708");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('4');
        boolean boolean7 = charSet2.contains('4');
        java.lang.Class<?> wildcardClass8 = charSet2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0709");
        java.lang.String[] strArray5 = new java.lang.String[] { "[0-9]", "[a-z, A-Z]", "[]", "[0-9]", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        boolean boolean8 = charSet6.contains('4');
        java.lang.String str9 = charSet6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str9.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0710");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains(' ');
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[A-Z]" + "'", str3.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0711");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean3 = charSet1.contains('4');
        java.lang.Class<?> wildcardClass4 = charSet1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0712");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z, A-Z]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass7 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0713");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str5 = charSet4.toString();
        java.lang.String str6 = charSet4.toString();
        boolean boolean8 = charSet4.contains(' ');
        java.lang.Class<?> wildcardClass9 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str5.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str6.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0714");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) 10L);
        boolean boolean5 = charSet0.contains(' ');
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
            System.out.format("%n%s%n", "CharSet1.test0715");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str5 = charSet4.toString();
        java.lang.Class<?> wildcardClass6 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str5.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0716");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        boolean boolean4 = charSet0.contains(' ');
        boolean boolean6 = charSet0.contains(' ');
        java.lang.Object obj7 = null;
        boolean boolean8 = charSet0.equals(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0717");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray1);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray1);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray1);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray1);
        java.lang.Class<?> wildcardClass6 = strArray1.getClass();
        boolean boolean7 = charSet0.equals((java.lang.Object) strArray1);
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0718");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean4 = charSet0.equals((java.lang.Object) charSet3);
        boolean boolean6 = charSet3.equals((java.lang.Object) "[0-9, h, ,,  , A-Z, a-z, [, i, !, ]]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0719");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet4.equals(obj5);
        java.lang.String str7 = charSet4.toString();
        java.lang.String str8 = charSet4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0720");
        java.lang.String[] strArray5 = new java.lang.String[] { "[0-9]", "[a-z, A-Z]", "[]", "[0-9]", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.String str8 = charSet7.toString();
        java.lang.Class<?> wildcardClass9 = charSet7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str8.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0721");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('#');
        java.lang.String[] strArray7 = new java.lang.String[] { "[a-z]", "[A-Z, a-z, [, ]]", "[,,  , h, a-z, A-Z, [, ], i, !]" };
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray7);
        boolean boolean9 = charSet0.equals((java.lang.Object) strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[0-9]" + "'", str1.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0722");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.contains(' ');
        java.lang.String str7 = charSet0.toString();
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0723");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('a');
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0724");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean3 = charSet1.contains(' ');
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str5 = charSet4.toString();
        java.lang.String str6 = charSet4.toString();
        java.lang.String str7 = charSet4.toString();
        boolean boolean8 = charSet1.equals((java.lang.Object) charSet4);
        java.lang.Class<?> wildcardClass9 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0725");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0726");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[A-Z]" + "'", str3.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0727");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str7 = charSet6.toString();
        boolean boolean9 = charSet6.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0728");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9, ,,  , A-Z, a-z, [, ]]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0729");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet2.toString();
        boolean boolean6 = charSet2.contains('4');
        java.lang.String str7 = charSet2.toString();
        java.lang.String str8 = charSet2.toString();
        java.lang.String str9 = charSet2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0730");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, ,,  , A-Z, a-z, [, i, !, ]]", "[0-9, ,,  , a-z, A-Z, [, ]]", "hi!" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str6 = charSet5.toString();
        boolean boolean8 = charSet5.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, h, ,,  , A-Z, a-z, [, i, !, ]]" + "'", str6.equals("[0-9, h, ,,  , A-Z, a-z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0731");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        java.lang.String str3 = charSet1.toString();
        boolean boolean5 = charSet1.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0732");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str6 = charSet5.toString();
        boolean boolean8 = charSet5.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0733");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('#');
        boolean boolean5 = charSet0.equals((java.lang.Object) 10L);
        boolean boolean7 = charSet0.contains('4');
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0734");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.contains('4');
        java.lang.String str7 = charSet4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str7.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0735");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str3 = charSet2.toString();
        java.lang.String str4 = charSet2.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str6 = charSet2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[0-9]" + "'", str1.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0736");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('4');
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[a-z]" + "'", str2.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0737");
        java.lang.String[] strArray4 = new java.lang.String[] { "[h, i, !]", "[A-Z]", "[A-Z, a-z, [, ]]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.Class<?> wildcardClass6 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0738");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('#');
        java.lang.Class<?> wildcardClass5 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0739");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        java.lang.Class<?> wildcardClass5 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str4.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0740");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean4 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet3.equals(obj5);
        java.lang.String str7 = charSet3.toString();
        java.lang.String str8 = charSet3.toString();
        java.lang.Class<?> wildcardClass9 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0741");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean4 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet3.equals(obj5);
        java.lang.String str7 = charSet3.toString();
        java.lang.Class<?> wildcardClass8 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0742");
        java.lang.String[] strArray6 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[a-z]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[a-z]" };
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
            System.out.format("%n%s%n", "CharSet1.test0743");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str6 = charSet5.toString();
        java.lang.Class<?> wildcardClass7 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str6.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0744");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet1.contains('4');
        java.lang.Class<?> wildcardClass4 = charSet1.getClass();
        boolean boolean5 = charSet0.equals((java.lang.Object) charSet1);
        boolean boolean7 = charSet0.contains('a');
        boolean boolean9 = charSet0.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
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
            System.out.format("%n%s%n", "CharSet1.test0745");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str6 = charSet5.toString();
        java.lang.String str7 = charSet5.toString();
        java.lang.String str8 = charSet5.toString();
        java.lang.String str9 = charSet5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0746");
        java.lang.String[] strArray4 = new java.lang.String[] { "[h, i, !]", "[A-Z]", "[A-Z, a-z, [, ]]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean7 = charSet5.contains(' ');
        java.lang.Class<?> wildcardClass8 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0747");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.Class<?> wildcardClass3 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0748");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('#');
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[a-z]" + "'", str2.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0749");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.contains('#');
        boolean boolean6 = charSet0.contains('#');
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0750");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z]", "[h, i, !]", "hi!", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet9 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
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
            System.out.format("%n%s%n", "CharSet1.test0751");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet1.contains('4');
        java.lang.Class<?> wildcardClass4 = charSet1.getClass();
        boolean boolean5 = charSet0.equals((java.lang.Object) charSet1);
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9]" + "'", str6.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0752");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean4 = charSet0.equals((java.lang.Object) charSet3);
        boolean boolean6 = charSet3.contains('4');
        java.lang.String str7 = charSet3.toString();
        boolean boolean9 = charSet3.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0753");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('a');
        java.lang.String str6 = charSet2.toString();
        boolean boolean8 = charSet2.contains('4');
        java.lang.String str9 = charSet2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0754");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z, A-Z]", "[0-9, h, A-Z, a-z, i, !, [, ]]", "[A-Z]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean7 = charSet5.contains('4');
        boolean boolean9 = charSet5.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0755");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, ,,  , A-Z, a-z, [, i, !, ]]", "[0-9, ,,  , a-z, A-Z, [, ]]", "hi!" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean6 = charSet4.contains('4');
        boolean boolean8 = charSet4.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0756");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, ,,  , A-Z, a-z, [, i, !, ]]", "[0-9, ,,  , a-z, A-Z, [, ]]", "hi!" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean7 = charSet5.contains('a');
        java.lang.String str8 = charSet5.toString();
        java.lang.Class<?> wildcardClass9 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, h, ,,  , A-Z, a-z, [, i, !, ]]" + "'", str8.equals("[0-9, h, ,,  , A-Z, a-z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0757");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean7 = charSet5.contains('a');
        java.lang.String str8 = charSet5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0758");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[A-Z]" + "'", str3.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0759");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z]", "[h, i, !]", "hi!", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean9 = charSet7.equals((java.lang.Object) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0760");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0761");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains(' ');
        boolean boolean6 = charSet0.contains('#');
        boolean boolean8 = charSet0.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[a-z]" + "'", str2.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0762");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('a');
        java.lang.String str6 = charSet2.toString();
        java.lang.String str7 = charSet2.toString();
        java.lang.String str8 = charSet2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0763");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean7 = charSet5.contains('a');
        java.lang.String str8 = charSet5.toString();
        java.lang.String str9 = charSet5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[h, i, !]" + "'", str8.equals("[h, i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[h, i, !]" + "'", str9.equals("[h, i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0764");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet1.contains('4');
        java.lang.Class<?> wildcardClass4 = charSet1.getClass();
        boolean boolean5 = charSet0.equals((java.lang.Object) charSet1);
        boolean boolean7 = charSet0.contains('a');
        java.lang.String str8 = charSet0.toString();
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9]" + "'", str8.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0765");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.equals((java.lang.Object) 0.0d);
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0766");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0767");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains(' ');
        boolean boolean9 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0768");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0769");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        java.lang.Class<?> wildcardClass3 = charSet1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0770");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str4 = charSet3.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) str4);
        boolean boolean7 = charSet0.contains('4');
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9]" + "'", str4.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0771");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.Class<?> wildcardClass5 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0772");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('4');
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0773");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean4 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet3.equals(obj5);
        java.lang.String str7 = charSet3.toString();
        java.lang.String str8 = charSet3.toString();
        java.lang.String str9 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0774");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean3 = charSet1.contains(' ');
        boolean boolean5 = charSet1.contains(' ');
        java.lang.String str6 = charSet1.toString();
        java.lang.Class<?> wildcardClass7 = charSet1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0775");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = charSet0.equals(obj6);
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0776");
        java.lang.String[] strArray4 = new java.lang.String[] { "[h, i, !]", "[A-Z]", "[A-Z, a-z, [, ]]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str7 = charSet6.toString();
        java.lang.Class<?> wildcardClass8 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[h, ,,  , A-Z, a-z, [, i, !, ]]" + "'", str7.equals("[h, ,,  , A-Z, a-z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0777");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        java.lang.String str3 = charSet1.toString();
        boolean boolean5 = charSet1.contains('#');
        boolean boolean7 = charSet1.contains('4');
        java.lang.Class<?> wildcardClass8 = charSet1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0778");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains(' ');
        java.lang.String str6 = charSet3.toString();
        boolean boolean8 = charSet3.contains('#');
        java.lang.String str9 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str6.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str9.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0779");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, ,,  , A-Z, a-z, [, i, !, ]]", "[0-9, ,,  , a-z, A-Z, [, ]]", "hi!" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet9 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
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
            System.out.format("%n%s%n", "CharSet1.test0780");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains(' ');
        java.lang.Object obj7 = null;
        boolean boolean8 = charSet3.equals(obj7);
        java.lang.String str9 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0781");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z]", "[h, i, !]", "hi!", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.Class<?> wildcardClass8 = charSet7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0782");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        boolean boolean7 = charSet4.contains('4');
        java.lang.Class<?> wildcardClass8 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str5.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0783");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('#');
        boolean boolean6 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0784");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.Object obj1 = null;
        boolean boolean2 = charSet0.equals(obj1);
        java.lang.String str3 = charSet0.toString();
        java.lang.Class<?> wildcardClass4 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[A-Z]" + "'", str3.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0785");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str5 = charSet4.toString();
        java.lang.String str6 = charSet4.toString();
        boolean boolean8 = charSet4.contains('a');
        java.lang.Class<?> wildcardClass9 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str5.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str6.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0786");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains(' ');
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[A-Z]" + "'", str3.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0787");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str9 = charSet8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0788");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str3 = charSet2.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) str3);
        boolean boolean6 = charSet0.contains('4');
        boolean boolean8 = charSet0.contains('#');
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[0-9]" + "'", str3.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0789");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str6 = charSet5.toString();
        boolean boolean8 = charSet5.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str6.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0790");
        java.lang.String[] strArray5 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[h, i, !]", "[h, i, !]", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.String str8 = charSet7.toString();
        java.lang.String str9 = charSet7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str8.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str9.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0791");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str3 = charSet2.toString();
        java.lang.String str4 = charSet2.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean7 = charSet0.contains('a');
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[0-9]" + "'", str1.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9]" + "'", str8.equals("[0-9]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0792");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains(' ');
        boolean boolean7 = charSet0.contains('#');
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0793");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('#');
        java.lang.String str6 = charSet3.toString();
        java.lang.String str7 = charSet3.toString();
        java.lang.String str8 = charSet3.toString();
        java.lang.Class<?> wildcardClass9 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0794");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 10);
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0795");
        java.lang.String[] strArray4 = new java.lang.String[] { "[h, i, !]", "[A-Z]", "[A-Z, a-z, [, ]]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.Class<?> wildcardClass7 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0796");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('a');
        java.lang.String str6 = charSet2.toString();
        boolean boolean8 = charSet2.contains('#');
        java.lang.String str9 = charSet2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0797");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains(' ');
        boolean boolean6 = charSet0.equals((java.lang.Object) ' ');
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0798");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains('#');
        boolean boolean6 = charSet0.contains(' ');
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0799");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('a');
        java.lang.Class<?> wildcardClass7 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0800");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains(' ');
        java.lang.String str6 = charSet3.toString();
        java.lang.String str7 = charSet3.toString();
        java.lang.String str8 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0801");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('a');
        boolean boolean8 = charSet3.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0802");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        java.lang.String str3 = charSet1.toString();
        java.lang.String str4 = charSet1.toString();
        java.lang.String str5 = charSet1.toString();
        java.lang.String str6 = charSet1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0803");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('4');
        java.lang.String str7 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[A-Z]" + "'", str3.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0804");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.contains('4');
        java.lang.String str7 = charSet4.toString();
        boolean boolean9 = charSet4.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0805");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0806");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains('#');
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('a');
        java.lang.String str8 = charSet0.toString();
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0807");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = charSet0.equals(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0808");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('#');
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[a-z]" + "'", str2.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0809");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str5 = charSet4.toString();
        boolean boolean7 = charSet4.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str5.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0810");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean7 = charSet5.contains(' ');
        boolean boolean9 = charSet5.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0811");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z, A-Z]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass9 = charSet8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
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
            System.out.format("%n%s%n", "CharSet1.test0812");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('a');
        boolean boolean8 = charSet3.contains(' ');
        java.lang.String str9 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0813");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet0.equals(obj5);
        boolean boolean8 = charSet0.contains('4');
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[a-z]" + "'", str2.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
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
            System.out.format("%n%s%n", "CharSet1.test0814");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0815");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 10);
        boolean boolean7 = charSet0.contains(' ');
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0816");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.Class<?> wildcardClass5 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0817");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean7 = charSet3.contains('4');
        boolean boolean9 = charSet3.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str5.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0818");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('#');
        java.lang.String str6 = charSet3.toString();
        java.lang.String str7 = charSet3.toString();
        boolean boolean9 = charSet3.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0819");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str8 = charSet7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str8.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0820");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0821");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('a');
        java.lang.String str8 = charSet0.toString();
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0822");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean7 = charSet5.contains('4');
        java.lang.Class<?> wildcardClass8 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0823");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet0.equals(obj5);
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[a-z]" + "'", str2.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0824");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str3 = charSet2.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) str3);
        boolean boolean6 = charSet0.contains('4');
        java.lang.String str7 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[0-9]" + "'", str3.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0825");
        java.lang.String[] strArray6 = new java.lang.String[] { "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]", "", "[0-9, h, ,,  , A-Z, a-z, [, i, !, ]]", "[0-9, ,,  , A-Z, a-z, [, ]]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[h, ,,  , A-Z, a-z, [, i, !, ]]" };
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        java.lang.String str9 = charSet8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , h, a-z, A-Z, [, i, !, ]]" + "'", str9.equals("[0-9, ,,  , h, a-z, A-Z, [, i, !, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0826");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('4');
        boolean boolean7 = charSet3.contains('#');
        java.lang.String str8 = charSet3.toString();
        java.lang.String str9 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0827");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        boolean boolean4 = charSet1.equals((java.lang.Object) 10L);
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet1.equals(obj5);
        boolean boolean8 = charSet1.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0828");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0829");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains(' ');
        java.lang.String str6 = charSet0.toString();
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0830");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str6 = charSet5.toString();
        java.lang.Class<?> wildcardClass7 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[h, i, !]" + "'", str6.equals("[h, i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0831");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str7 = charSet6.toString();
        java.lang.Class<?> wildcardClass8 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0832");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        boolean boolean4 = charSet1.contains(' ');
        java.lang.String str5 = charSet1.toString();
        java.lang.String str6 = charSet1.toString();
        boolean boolean8 = charSet1.equals((java.lang.Object) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0833");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('#');
        boolean boolean7 = charSet3.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0834");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str4 = charSet3.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) str4);
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9]" + "'", str4.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0835");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean5 = charSet3.contains('4');
        boolean boolean7 = charSet3.contains(' ');
        java.lang.String str8 = charSet3.toString();
        java.lang.String str9 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0836");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        java.lang.Object obj3 = null;
        boolean boolean4 = charSet0.equals(obj3);
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0837");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean4 = charSet2.contains(' ');
        java.lang.String str5 = charSet2.toString();
        java.lang.String str6 = charSet2.toString();
        boolean boolean8 = charSet2.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0838");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains(' ');
        boolean boolean5 = charSet0.contains('#');
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z, A-Z]" + "'", str1.equals("[a-z, A-Z]"));
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
            System.out.format("%n%s%n", "CharSet1.test0839");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains(' ');
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[a-z]" + "'", str2.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0840");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str6 = charSet5.toString();
        java.lang.String str7 = charSet5.toString();
        java.lang.Class<?> wildcardClass8 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[h, i, !]" + "'", str6.equals("[h, i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[h, i, !]" + "'", str7.equals("[h, i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0841");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z]", "[h, i, !]", "hi!", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
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
            System.out.format("%n%s%n", "CharSet1.test0842");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        boolean boolean7 = charSet4.contains('4');
        java.lang.String str8 = charSet4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str5.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str8.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0843");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean6 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0844");
        java.lang.String[] strArray4 = new java.lang.String[] { "[h, i, !]", "[A-Z]", "[A-Z, a-z, [, ]]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0845");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        java.lang.Class<?> wildcardClass6 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str4.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str5.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0846");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('a');
        boolean boolean8 = charSet3.contains('#');
        java.lang.String str9 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str4.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str9.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0847");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.equals((java.lang.Object) (byte) 0);
        java.lang.String str6 = charSet3.toString();
        boolean boolean8 = charSet3.contains(' ');
        java.lang.String str9 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0848");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str7 = charSet6.toString();
        java.lang.Class<?> wildcardClass8 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[h, i, !]" + "'", str7.equals("[h, i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0849");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0850");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.equals((java.lang.Object) 0.0d);
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('4');
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0851");
        java.lang.String[] strArray5 = new java.lang.String[] { "[0-9]", "[a-z, A-Z]", "[]", "[0-9]", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        boolean boolean8 = charSet6.contains('4');
        java.lang.Class<?> wildcardClass9 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0852");
        java.lang.String[] strArray6 = new java.lang.String[] { "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]", "[0-9, ,,  , h, a-z, A-Z, [, ], i, !]", "[a-z, A-Z]", "[h, i, !]", "[h, i, !]", "[a-z]" };
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
            System.out.format("%n%s%n", "CharSet1.test0853");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0854");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean8 = charSet0.equals((java.lang.Object) charSet7);
        java.lang.Class<?> wildcardClass9 = charSet7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0855");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains('#');
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        boolean boolean7 = charSet5.contains('a');
        boolean boolean8 = charSet0.equals((java.lang.Object) charSet5);
        java.lang.String str9 = charSet5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z, A-Z]" + "'", str9.equals("[a-z, A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0856");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9, ,,  , A-Z, a-z, [, ]]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0857");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean7 = charSet5.contains('a');
        boolean boolean9 = charSet5.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0858");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet2.toString();
        java.lang.Class<?> wildcardClass5 = charSet2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0859");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('#');
        boolean boolean7 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[a-z]" + "'", str2.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0860");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) 10L);
        boolean boolean5 = charSet0.contains(' ');
        boolean boolean7 = charSet0.contains('4');
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[0-9]" + "'", str1.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9]" + "'", str8.equals("[0-9]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0861");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str5 = charSet4.toString();
        java.lang.String str6 = charSet4.toString();
        java.lang.Class<?> wildcardClass7 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str5.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str6.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0862");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z, A-Z]", "[0-9, h, A-Z, a-z, i, !, [, ]]", "[A-Z]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str6 = charSet5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , h, a-z, A-Z, [, ], i, !]" + "'", str6.equals("[0-9, ,,  , h, a-z, A-Z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0863");
        java.lang.String[] strArray6 = new java.lang.String[] { "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]", "[0-9, ,,  , h, a-z, A-Z, [, ], i, !]", "[a-z, A-Z]", "[h, i, !]", "[h, i, !]", "[a-z]" };
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
            System.out.format("%n%s%n", "CharSet1.test0864");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z, A-Z]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str7 = charSet6.toString();
        boolean boolean9 = charSet6.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str7.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0865");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean6 = charSet4.equals((java.lang.Object) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0866");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.contains('#');
        boolean boolean8 = charSet4.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0867");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str4 = charSet3.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) str4);
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9]" + "'", str4.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0868");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains('#');
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('a');
        java.lang.String str8 = charSet0.toString();
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0869");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('#');
        boolean boolean5 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String str6 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0870");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) 1L);
        boolean boolean6 = charSet0.contains('#');
        java.lang.Object obj7 = null;
        boolean boolean8 = charSet0.equals(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[a-z]" + "'", str2.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0871");
        java.lang.String[] strArray6 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[a-z]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        java.lang.String str8 = charSet7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[,,  , h, A-Z, a-z, [, ], i, !]" + "'", str8.equals("[,,  , h, A-Z, a-z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0872");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z, A-Z]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str5 = charSet4.toString();
        java.lang.String str6 = charSet4.toString();
        java.lang.String str7 = charSet4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str5.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str6.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str7.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0873");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0874");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z]", "[h, i, !]", "hi!", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean8 = charSet6.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0875");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains(' ');
        java.lang.String str6 = charSet3.toString();
        boolean boolean8 = charSet3.contains('a');
        java.lang.Class<?> wildcardClass9 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0876");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('a');
        boolean boolean8 = charSet3.contains('#');
        java.lang.Class<?> wildcardClass9 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str4.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0877");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9, ,,  , A-Z, a-z, [, ]]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0878");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9, ,,  , A-Z, a-z, [, ]]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass8 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0879");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains(' ');
        boolean boolean7 = charSet0.contains('a');
        boolean boolean9 = charSet0.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
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
            System.out.format("%n%s%n", "CharSet1.test0880");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str4 = charSet3.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) str4);
        boolean boolean7 = charSet0.contains(' ');
        boolean boolean9 = charSet0.equals((java.lang.Object) "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9]" + "'", str4.equals("[0-9]"));
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
            System.out.format("%n%s%n", "CharSet1.test0881");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z]", "[h, i, !]", "hi!", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean7 = charSet5.contains('a');
        java.lang.Object obj8 = null;
        boolean boolean9 = charSet5.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0882");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
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
            System.out.format("%n%s%n", "CharSet1.test0883");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z, A-Z]", "[0-9, h, A-Z, a-z, i, !, [, ]]", "[A-Z]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str7 = charSet6.toString();
        java.lang.Class<?> wildcardClass8 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , h, a-z, A-Z, [, ], i, !]" + "'", str7.equals("[0-9, ,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0884");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.contains('#');
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0885");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str6 = charSet5.toString();
        boolean boolean8 = charSet5.equals((java.lang.Object) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str6.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0886");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z, A-Z]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str8 = charSet7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str8.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0887");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains('#');
        boolean boolean6 = charSet0.contains(' ');
        boolean boolean8 = charSet0.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0888");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet1.contains('4');
        java.lang.Class<?> wildcardClass4 = charSet1.getClass();
        boolean boolean5 = charSet0.equals((java.lang.Object) charSet1);
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9]" + "'", str6.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9]" + "'", str7.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0889");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean4 = charSet2.contains(' ');
        java.lang.String str5 = charSet2.toString();
        boolean boolean7 = charSet2.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0890");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean6 = charSet4.contains(' ');
        java.lang.String str7 = charSet4.toString();
        java.lang.String str8 = charSet4.toString();
        java.lang.Class<?> wildcardClass9 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str7.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str8.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0891");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str3 = charSet2.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) str3);
        boolean boolean6 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[0-9]" + "'", str3.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0892");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean7 = charSet3.contains('#');
        java.lang.Class<?> wildcardClass8 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str5.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0893");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str3 = charSet2.toString();
        java.lang.String str4 = charSet2.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.equals((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[0-9]" + "'", str1.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9]" + "'", str6.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0894");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.contains(' ');
        boolean boolean6 = charSet0.contains('#');
        java.lang.String str7 = charSet0.toString();
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0895");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean3 = charSet1.contains('4');
        boolean boolean5 = charSet1.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0896");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        boolean boolean7 = charSet0.contains('4');
        boolean boolean9 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
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
            System.out.format("%n%s%n", "CharSet1.test0897");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.equals((java.lang.Object) 0.0d);
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('4');
        boolean boolean9 = charSet0.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0898");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.equals((java.lang.Object) 100);
        boolean boolean8 = charSet3.contains('a');
        java.lang.Class<?> wildcardClass9 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0899");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains(' ');
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('a');
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[A-Z]" + "'", str3.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0900");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str6 = charSet5.toString();
        boolean boolean8 = charSet5.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0901");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains(' ');
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('4');
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z, A-Z]" + "'", str1.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z, A-Z]" + "'", str4.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0902");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean4 = charSet2.contains(' ');
        boolean boolean6 = charSet2.contains('4');
        java.lang.Class<?> wildcardClass7 = charSet2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0903");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0904");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('a');
        java.lang.String str3 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0905");
        java.lang.String[] strArray4 = new java.lang.String[] { "[h, i, !]", "[A-Z]", "[A-Z, a-z, [, ]]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str6 = charSet5.toString();
        java.lang.Class<?> wildcardClass7 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[h, ,,  , A-Z, a-z, [, i, !, ]]" + "'", str6.equals("[h, ,,  , A-Z, a-z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0906");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String[] strArray5 = new java.lang.String[] { "[0-9, ,,  , A-Z, a-z, [, ]]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        boolean boolean9 = charSet0.equals((java.lang.Object) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0907");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('#');
        java.lang.String str6 = charSet3.toString();
        java.lang.String str7 = charSet3.toString();
        java.lang.String str8 = charSet3.toString();
        java.lang.String str9 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0908");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('#');
        boolean boolean7 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
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
            System.out.format("%n%s%n", "CharSet1.test0909");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0910");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) 10L);
        boolean boolean5 = charSet0.contains('#');
        boolean boolean7 = charSet0.contains(' ');
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0911");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('a');
        boolean boolean7 = charSet2.contains('a');
        boolean boolean9 = charSet2.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
            System.out.format("%n%s%n", "CharSet1.test0912");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, ,,  , A-Z, a-z, [, i, !, ]]", "[0-9, ,,  , a-z, A-Z, [, ]]", "hi!" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str7 = charSet6.toString();
        boolean boolean9 = charSet6.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, h, ,,  , A-Z, a-z, [, i, !, ]]" + "'", str7.equals("[0-9, h, ,,  , A-Z, a-z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0913");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str6 = charSet5.toString();
        boolean boolean8 = charSet5.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str6.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0914");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str8 = charSet7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str8.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0915");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('a');
        java.lang.Class<?> wildcardClass7 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0916");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str4 = charSet3.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) str4);
        boolean boolean7 = charSet0.contains('a');
        boolean boolean9 = charSet0.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9]" + "'", str4.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0917");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str9 = charSet8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str9.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0918");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = charSet3.equals((java.lang.Object) 100);
        java.lang.String str8 = charSet3.toString();
        java.lang.String str9 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0919");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        java.lang.String str3 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0920");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('#');
        boolean boolean7 = charSet3.contains('a');
        boolean boolean9 = charSet3.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0921");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('4');
        java.lang.String str6 = charSet3.toString();
        boolean boolean8 = charSet3.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0922");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('#');
        boolean boolean5 = charSet0.contains('a');
        boolean boolean7 = charSet0.contains(' ');
        java.lang.String str8 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9]" + "'", str8.equals("[0-9]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0923");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9, ,,  , A-Z, a-z, [, ]]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet9 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
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
            System.out.format("%n%s%n", "CharSet1.test0924");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains(' ');
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains(' ');
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0925");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('a');
        boolean boolean6 = charSet0.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0926");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.Object obj3 = null;
        boolean boolean4 = charSet2.equals(obj3);
        boolean boolean6 = charSet2.contains('a');
        boolean boolean8 = charSet2.contains('4');
        java.lang.Class<?> wildcardClass9 = charSet2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0927");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.equals((java.lang.Object) "[0-9, ,,  , h, a-z, A-Z, [, i, !, ]]");
        java.lang.Class<?> wildcardClass5 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0928");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        boolean boolean7 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0929");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 1);
        boolean boolean7 = charSet0.contains(' ');
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0930");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('4');
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0931");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('a');
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0932");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains(' ');
        boolean boolean6 = charSet0.equals((java.lang.Object) ' ');
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0933");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.Class<?> wildcardClass6 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0934");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.Class<?> wildcardClass6 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0935");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.Object obj1 = null;
        boolean boolean2 = charSet0.equals(obj1);
        boolean boolean4 = charSet0.contains(' ');
        java.lang.String str5 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0936");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.equals((java.lang.Object) "[0-9, ,,  , A-Z, a-z, [, ]]");
        boolean boolean8 = charSet3.contains('#');
        java.lang.Class<?> wildcardClass9 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0937");
        java.lang.String[] strArray4 = new java.lang.String[] { "[h, i, !]", "[A-Z]", "[A-Z, a-z, [, ]]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str6 = charSet5.toString();
        boolean boolean8 = charSet5.contains('#');
        java.lang.String str9 = charSet5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[h, ,,  , A-Z, a-z, [, i, !, ]]" + "'", str6.equals("[h, ,,  , A-Z, a-z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[h, ,,  , A-Z, a-z, [, i, !, ]]" + "'", str9.equals("[h, ,,  , A-Z, a-z, [, i, !, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0938");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        java.lang.String str4 = charSet0.toString();
        java.lang.Class<?> wildcardClass5 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0939");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z, A-Z]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean7 = charSet5.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0940");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, ,,  , A-Z, a-z, [, i, !, ]]", "[0-9, ,,  , a-z, A-Z, [, ]]", "hi!" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0941");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.contains('a');
        boolean boolean7 = charSet0.equals((java.lang.Object) 0.0f);
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0942");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        java.lang.String str6 = charSet4.toString();
        boolean boolean8 = charSet4.equals((java.lang.Object) "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]");
        java.lang.String str9 = charSet4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str5.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0943");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        boolean boolean4 = charSet0.contains(' ');
        boolean boolean6 = charSet0.contains(' ');
        boolean boolean8 = charSet0.contains('4');
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0944");
        java.lang.String[] strArray5 = new java.lang.String[] { "[0-9]", "[a-z, A-Z]", "[]", "[0-9]", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.String str8 = charSet7.toString();
        java.lang.String str9 = charSet7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str8.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str9.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0945");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('a');
        boolean boolean7 = charSet2.contains('a');
        boolean boolean9 = charSet2.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
            System.out.format("%n%s%n", "CharSet1.test0946");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str2 = charSet1.toString();
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean6 = charSet1.equals((java.lang.Object) charSet3);
        boolean boolean7 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.String str8 = charSet0.toString();
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[0-9]" + "'", str2.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z, A-Z]" + "'", str8.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0947");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        java.lang.String str3 = charSet1.toString();
        java.lang.String str4 = charSet1.toString();
        boolean boolean6 = charSet1.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0948");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean6 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.String str7 = charSet0.toString();
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0949");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.equals((java.lang.Object) 100);
        boolean boolean8 = charSet3.contains(' ');
        java.lang.Class<?> wildcardClass9 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0950");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str9 = charSet8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0951");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean8 = charSet6.contains('a');
        java.lang.String str9 = charSet6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str9.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0952");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        boolean boolean7 = charSet4.contains('#');
        boolean boolean9 = charSet4.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str5.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0953");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        java.lang.Object obj3 = null;
        boolean boolean4 = charSet0.equals(obj3);
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('a');
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0954");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('4');
        boolean boolean7 = charSet2.contains('#');
        java.lang.String str8 = charSet2.toString();
        java.lang.String str9 = charSet2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0955");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        boolean boolean4 = charSet1.equals((java.lang.Object) 10L);
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet1.equals(obj5);
        boolean boolean8 = charSet1.contains(' ');
        java.lang.Class<?> wildcardClass9 = charSet1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0956");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass5 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0957");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean8 = charSet6.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0958");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z]", "[A-Z, a-z, [, ]]", "[,,  , h, a-z, A-Z, [, ], i, !]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0959");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean7 = charSet5.contains('#');
        java.lang.Class<?> wildcardClass8 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0960");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean7 = charSet5.contains('a');
        java.lang.Object obj8 = null;
        boolean boolean9 = charSet5.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0961");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z]", "[A-Z, a-z, [, ]]", "[,,  , h, a-z, A-Z, [, ], i, !]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str6 = charSet5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str6.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0962");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean7 = charSet0.equals((java.lang.Object) charSet6);
        boolean boolean9 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0963");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains(' ');
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains(' ');
        boolean boolean8 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z, A-Z]" + "'", str1.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z, A-Z]" + "'", str4.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0964");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.contains('#');
        boolean boolean6 = charSet0.contains(' ');
        java.lang.String str7 = charSet0.toString();
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0965");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0966");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean6 = charSet4.contains('4');
        java.lang.Class<?> wildcardClass7 = charSet4.getClass();
        boolean boolean8 = charSet0.equals((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0967");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        java.lang.String str3 = charSet1.toString();
        boolean boolean5 = charSet1.contains('#');
        java.lang.String str6 = charSet1.toString();
        java.lang.String str7 = charSet1.toString();
        java.lang.String str8 = charSet1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0968");
        java.lang.String[] strArray6 = new java.lang.String[] { "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]", "", "[0-9, h, ,,  , A-Z, a-z, [, i, !, ]]", "[0-9, ,,  , A-Z, a-z, [, ]]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[h, ,,  , A-Z, a-z, [, i, !, ]]" };
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
            System.out.format("%n%s%n", "CharSet1.test0969");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        boolean boolean7 = charSet4.contains('4');
        java.lang.String str8 = charSet4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str5.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0970");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('4');
        java.lang.String str6 = charSet0.toString();
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0971");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.contains('a');
        boolean boolean7 = charSet0.contains('4');
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0972");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        boolean boolean7 = charSet0.contains('4');
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0973");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('4');
        java.lang.String str7 = charSet0.toString();
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0974");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        boolean boolean4 = charSet0.contains('a');
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0975");
        java.lang.String[] strArray4 = new java.lang.String[] { "[h, i, !]", "[A-Z]", "[A-Z, a-z, [, ]]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str6 = charSet5.toString();
        boolean boolean8 = charSet5.contains('#');
        java.lang.Class<?> wildcardClass9 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[h, ,,  , A-Z, a-z, [, i, !, ]]" + "'", str6.equals("[h, ,,  , A-Z, a-z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0976");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean7 = charSet4.equals((java.lang.Object) charSet6);
        java.lang.Class<?> wildcardClass8 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str5.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
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
            System.out.format("%n%s%n", "CharSet1.test0977");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.equals((java.lang.Object) (-1L));
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0978");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('4');
        boolean boolean7 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
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
            System.out.format("%n%s%n", "CharSet1.test0979");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('#');
        java.lang.String str6 = charSet2.toString();
        java.lang.String str7 = charSet2.toString();
        java.lang.Class<?> wildcardClass8 = charSet2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0980");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('a');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[A-Z]" + "'", str3.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0981");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.Object obj1 = null;
        boolean boolean2 = charSet0.equals(obj1);
        boolean boolean4 = charSet0.contains(' ');
        java.lang.Class<?> wildcardClass5 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0982");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean3 = charSet1.contains(' ');
        boolean boolean5 = charSet1.equals((java.lang.Object) "[0-9]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0983");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('#');
        boolean boolean8 = charSet0.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[a-z]" + "'", str2.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0984");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.equals((java.lang.Object) 0.0d);
        boolean boolean6 = charSet0.contains('a');
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0985");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z, A-Z]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass6 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0986");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) 10L);
        boolean boolean5 = charSet0.contains(' ');
        boolean boolean7 = charSet0.contains(' ');
        boolean boolean9 = charSet0.contains('a');
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
            System.out.format("%n%s%n", "CharSet1.test0987");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z]", "[A-Z, a-z, [, ]]", "[,,  , h, a-z, A-Z, [, ], i, !]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str5 = charSet4.toString();
        boolean boolean7 = charSet4.contains(' ');
        boolean boolean9 = charSet4.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str5.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0988");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('#');
        java.lang.String str7 = charSet3.toString();
        boolean boolean9 = charSet3.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0989");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z]", "[A-Z, a-z, [, ]]", "[,,  , h, a-z, A-Z, [, ], i, !]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean7 = charSet5.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0990");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = charSet0.equals(obj6);
        boolean boolean9 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
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
            System.out.format("%n%s%n", "CharSet1.test0991");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        boolean boolean9 = charSet7.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0992");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str6 = charSet5.toString();
        java.lang.String str7 = charSet5.toString();
        java.lang.String str8 = charSet5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0993");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean3 = charSet1.contains(' ');
        boolean boolean5 = charSet1.contains(' ');
        boolean boolean7 = charSet1.contains('a');
        java.lang.Class<?> wildcardClass8 = charSet1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0994");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean8 = charSet6.contains(' ');
        java.lang.String str9 = charSet6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0995");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9, ,,  , A-Z, a-z, [, ]]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str6 = charSet5.toString();
        boolean boolean8 = charSet5.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0996");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        java.lang.String str6 = charSet4.toString();
        java.lang.String str7 = charSet4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str5.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str6.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str7.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0997");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains(' ');
        boolean boolean9 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0998");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('4');
        java.lang.Object obj6 = null;
        boolean boolean7 = charSet3.equals(obj6);
        java.lang.String str8 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test0999");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z, A-Z]", "[0-9, h, A-Z, a-z, i, !, [, ]]", "[A-Z]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.test1000");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains(' ');
        boolean boolean5 = charSet0.contains('#');
        boolean boolean7 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z, A-Z]" + "'", str1.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }
}

