package CharSet;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CharSet1 {

    public static boolean debug = false;

    @Test
    public void CharSet0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0501");
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
    public void CharSet0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0502");
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
    public void CharSet0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0503");
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
    public void CharSet0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0504");
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
    public void CharSet0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0505");
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
    public void CharSet0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0506");
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
    public void CharSet0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0507");
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
    public void CharSet0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0508");
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
    public void CharSet0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0509");
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
    public void CharSet0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0510");
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
    public void CharSet0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0511");
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
    public void CharSet0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0512");
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
    public void CharSet0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0513");
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
    public void CharSet0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0514");
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
    public void CharSet0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0515");
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
    public void CharSet0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0516");
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
    public void CharSet0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0517");
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
    public void CharSet0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0518");
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
    public void CharSet0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0519");
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
    public void CharSet0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0520");
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
    public void CharSet0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0521");
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
    public void CharSet0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0522");
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
    public void CharSet0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0523");
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
    public void CharSet0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0524");
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
    public void CharSet0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0525");
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
    public void CharSet0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0526");
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
    public void CharSet0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0527");
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
    public void CharSet0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0528");
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
    public void CharSet0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0529");
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
    public void CharSet0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0530");
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
    public void CharSet0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0531");
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
    public void CharSet0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0532");
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
    public void CharSet0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0533");
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
    public void CharSet0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0534");
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
    public void CharSet0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0535");
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
    public void CharSet0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0536");
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
    public void CharSet0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0537");
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
    public void CharSet0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0538");
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
    public void CharSet0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0539");
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
    public void CharSet0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0540");
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
    public void CharSet0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0541");
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
    public void CharSet0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0542");
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
    public void CharSet0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0543");
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
    public void CharSet0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0544");
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
    public void CharSet0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0545");
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
    public void CharSet0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0546");
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
    public void CharSet0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0547");
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
    public void CharSet0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0548");
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
    public void CharSet0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0549");
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
    public void CharSet0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0550");
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
    public void CharSet0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0551");
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
    public void CharSet0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0552");
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
    public void CharSet0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0553");
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
    public void CharSet0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0554");
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
    public void CharSet0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0555");
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
    public void CharSet0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0556");
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
    public void CharSet0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0557");
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
    public void CharSet0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0558");
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
    public void CharSet0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0559");
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
    public void CharSet0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0560");
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
    public void CharSet0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0561");
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
    public void CharSet0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0562");
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
    public void CharSet0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0563");
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
    public void CharSet0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0564");
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
    public void CharSet0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0565");
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
    public void CharSet0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0566");
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
    public void CharSet0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0567");
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
    public void CharSet0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0568");
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
    public void CharSet0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0569");
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
    public void CharSet0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0570");
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
    public void CharSet0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0571");
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
    public void CharSet0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0572");
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
    public void CharSet0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0573");
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
    public void CharSet0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0574");
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
    public void CharSet0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0575");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.Class<?> wildcardClass1 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CharSet0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0576");
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
    public void CharSet0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0577");
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
    public void CharSet0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0578");
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
    public void CharSet0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0579");
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
    public void CharSet0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0580");
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
    public void CharSet0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0581");
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
    public void CharSet0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0582");
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
    public void CharSet0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0583");
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
    public void CharSet0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0584");
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
    public void CharSet0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0585");
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
    public void CharSet0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0586");
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
    public void CharSet0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0587");
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
    public void CharSet0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0588");
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
    public void CharSet0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0589");
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
    public void CharSet0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0590");
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
    public void CharSet0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0591");
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
    public void CharSet0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0592");
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
    public void CharSet0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0593");
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
    public void CharSet0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0594");
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
    public void CharSet0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0595");
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
    public void CharSet0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0596");
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
    public void CharSet0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0597");
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
    public void CharSet0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0598");
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
    public void CharSet0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0599");
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
    public void CharSet0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0600");
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
    public void CharSet0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0601");
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
    public void CharSet0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0602");
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
    public void CharSet0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0603");
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
    public void CharSet0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0604");
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
    public void CharSet0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0605");
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
    public void CharSet0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0606");
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
    public void CharSet0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0607");
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
    public void CharSet0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0608");
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
    public void CharSet0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0609");
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
    public void CharSet0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0610");
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
    public void CharSet0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0611");
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
    public void CharSet0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0612");
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
    public void CharSet0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0613");
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
    public void CharSet0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0614");
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
    public void CharSet0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0615");
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
    public void CharSet0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0616");
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
    public void CharSet0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0617");
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
    public void CharSet0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0618");
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
    public void CharSet0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0619");
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
    public void CharSet0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0620");
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
    public void CharSet0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0621");
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
    public void CharSet0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0622");
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
    public void CharSet0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0623");
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
    public void CharSet0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0624");
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
    public void CharSet0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0625");
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
    public void CharSet0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0626");
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
    public void CharSet0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0627");
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
    public void CharSet0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0628");
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
    public void CharSet0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0629");
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
    public void CharSet0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0630");
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
    public void CharSet0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0631");
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
    public void CharSet0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0632");
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
    public void CharSet0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0633");
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
    public void CharSet0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0634");
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
    public void CharSet0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0635");
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
    public void CharSet0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0636");
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
    public void CharSet0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0637");
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
    public void CharSet0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0638");
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
    public void CharSet0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0639");
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
    public void CharSet0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0640");
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
    public void CharSet0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0641");
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
    public void CharSet0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0642");
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
    public void CharSet0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0643");
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
    public void CharSet0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0644");
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
    public void CharSet0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0645");
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
    public void CharSet0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0646");
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
    public void CharSet0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0647");
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
    public void CharSet0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0648");
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
    public void CharSet0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0649");
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
    public void CharSet0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0650");
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
    public void CharSet0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0651");
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
    public void CharSet0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0652");
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
    public void CharSet0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0653");
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
    public void CharSet0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0654");
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
    public void CharSet0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0655");
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
    public void CharSet0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0656");
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
    public void CharSet0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0657");
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
    public void CharSet0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0658");
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
    public void CharSet0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0659");
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
    public void CharSet0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0660");
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
    public void CharSet0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0661");
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
    public void CharSet0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0662");
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
    public void CharSet0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0663");
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
    public void CharSet0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0664");
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
    public void CharSet0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0665");
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
    public void CharSet0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0666");
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
    public void CharSet0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0667");
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
    public void CharSet0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0668");
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
    public void CharSet0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0669");
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
    public void CharSet0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0670");
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
    public void CharSet0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0671");
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
    public void CharSet0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0672");
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
    public void CharSet0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0673");
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
    public void CharSet0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0674");
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
    public void CharSet0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0675");
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
    public void CharSet0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0676");
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
    public void CharSet0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0677");
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
    public void CharSet0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0678");
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
    public void CharSet0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0679");
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
    public void CharSet0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0680");
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
    public void CharSet0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0681");
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
    public void CharSet0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0682");
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
    public void CharSet0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0683");
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
    public void CharSet0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0684");
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
    public void CharSet0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0685");
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
    public void CharSet0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0686");
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
    public void CharSet0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0687");
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
    public void CharSet0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0688");
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
    public void CharSet0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0689");
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
    public void CharSet0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0690");
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
    public void CharSet0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0691");
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
    public void CharSet0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0692");
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
    public void CharSet0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0693");
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
    public void CharSet0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0694");
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
    public void CharSet0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0695");
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
    public void CharSet0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0696");
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
    public void CharSet0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0697");
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
    public void CharSet0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0698");
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
    public void CharSet0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0699");
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
    public void CharSet0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0700");
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
    public void CharSet0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0701");
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
    public void CharSet0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0702");
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
    public void CharSet0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0703");
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
    public void CharSet0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0704");
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
    public void CharSet0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0705");
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
    public void CharSet0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0706");
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
    public void CharSet0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0707");
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
    public void CharSet0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0708");
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
    public void CharSet0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0709");
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
    public void CharSet0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0710");
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
    public void CharSet0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0711");
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
    public void CharSet0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0712");
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
    public void CharSet0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0713");
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
    public void CharSet0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0714");
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
    public void CharSet0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0715");
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
    public void CharSet0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0716");
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
    public void CharSet0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0717");
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
    public void CharSet0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0718");
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
    public void CharSet0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0719");
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
    public void CharSet0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0720");
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
    public void CharSet0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0721");
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
    public void CharSet0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0722");
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
    public void CharSet0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0723");
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
    public void CharSet0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0724");
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
    public void CharSet0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0725");
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
    public void CharSet0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0726");
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
    public void CharSet0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0727");
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
    public void CharSet0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0728");
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
    public void CharSet0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0729");
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
    public void CharSet0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0730");
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
    public void CharSet0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0731");
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
    public void CharSet0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0732");
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
    public void CharSet0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0733");
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
    public void CharSet0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0734");
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
    public void CharSet0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0735");
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
    public void CharSet0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0736");
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
    public void CharSet0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0737");
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
    public void CharSet0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0738");
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
    public void CharSet0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0739");
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
    public void CharSet0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0740");
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
    public void CharSet0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0741");
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
    public void CharSet0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0742");
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
    public void CharSet0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0743");
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
    public void CharSet0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0744");
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
    public void CharSet0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0745");
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
    public void CharSet0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0746");
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
    public void CharSet0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0747");
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
    public void CharSet0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0748");
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
    public void CharSet0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0749");
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
    public void CharSet0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0750");
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
    public void CharSet0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0751");
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
    public void CharSet0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0752");
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
    public void CharSet0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0753");
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
    public void CharSet0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0754");
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
    public void CharSet0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0755");
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
    public void CharSet0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0756");
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
    public void CharSet0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0757");
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
    public void CharSet0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0758");
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
    public void CharSet0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0759");
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
    public void CharSet0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0760");
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
    public void CharSet0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0761");
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
    public void CharSet0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0762");
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
    public void CharSet0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0763");
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
    public void CharSet0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0764");
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
    public void CharSet0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0765");
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
    public void CharSet0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0766");
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
    public void CharSet0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0767");
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
    public void CharSet0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0768");
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
    public void CharSet0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0769");
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
    public void CharSet0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0770");
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
    public void CharSet0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0771");
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
    public void CharSet0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0772");
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
    public void CharSet0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0773");
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
    public void CharSet0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0774");
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
    public void CharSet0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0775");
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
    public void CharSet0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0776");
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
    public void CharSet0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0777");
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
    public void CharSet0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0778");
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
    public void CharSet0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0779");
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
    public void CharSet0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0780");
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
    public void CharSet0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0781");
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
    public void CharSet0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0782");
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
    public void CharSet0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0783");
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
    public void CharSet0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0784");
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
    public void CharSet0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0785");
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
    public void CharSet0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0786");
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
    public void CharSet0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0787");
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
    public void CharSet0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0788");
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
    public void CharSet0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0789");
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
    public void CharSet0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0790");
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
    public void CharSet0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0791");
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
    public void CharSet0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0792");
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
    public void CharSet0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0793");
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
    public void CharSet0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0794");
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
    public void CharSet0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0795");
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
    public void CharSet0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0796");
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
    public void CharSet0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0797");
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
    public void CharSet0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0798");
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
    public void CharSet0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0799");
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
    public void CharSet0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0800");
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
    public void CharSet0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0801");
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
    public void CharSet0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0802");
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
    public void CharSet0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0803");
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
    public void CharSet0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0804");
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
    public void CharSet0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0805");
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
    public void CharSet0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0806");
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
    public void CharSet0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0807");
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
    public void CharSet0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0808");
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
    public void CharSet0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0809");
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
    public void CharSet0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0810");
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
    public void CharSet0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0811");
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
    public void CharSet0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0812");
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
    public void CharSet0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0813");
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
    public void CharSet0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0814");
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
    public void CharSet0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0815");
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
    public void CharSet0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0816");
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
    public void CharSet0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0817");
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
    public void CharSet0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0818");
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
    public void CharSet0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0819");
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
    public void CharSet0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0820");
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
    public void CharSet0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0821");
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
    public void CharSet0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0822");
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
    public void CharSet0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0823");
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
    public void CharSet0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0824");
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
    public void CharSet0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0825");
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
    public void CharSet0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0826");
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
    public void CharSet0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0827");
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
    public void CharSet0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0828");
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
    public void CharSet0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0829");
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
    public void CharSet0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0830");
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
    public void CharSet0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0831");
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
    public void CharSet0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0832");
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
    public void CharSet0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0833");
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
    public void CharSet0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0834");
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
    public void CharSet0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0835");
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
    public void CharSet0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0836");
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
    public void CharSet0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0837");
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
    public void CharSet0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0838");
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
    public void CharSet0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0839");
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
    public void CharSet0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0840");
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
    public void CharSet0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0841");
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
    public void CharSet0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0842");
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
    public void CharSet0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0843");
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
    public void CharSet0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0844");
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
    public void CharSet0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0845");
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
    public void CharSet0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0846");
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
    public void CharSet0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0847");
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
    public void CharSet0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0848");
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
    public void CharSet0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0849");
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
    public void CharSet0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0850");
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
    public void CharSet0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0851");
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
    public void CharSet0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0852");
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
    public void CharSet0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0853");
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
    public void CharSet0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0854");
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
    public void CharSet0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0855");
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
    public void CharSet0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0856");
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
    public void CharSet0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0857");
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
    public void CharSet0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0858");
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
    public void CharSet0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0859");
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
    public void CharSet0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0860");
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
    public void CharSet0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0861");
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
    public void CharSet0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0862");
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
    public void CharSet0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0863");
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
    public void CharSet0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0864");
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
    public void CharSet0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0865");
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
    public void CharSet0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0866");
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
    public void CharSet0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0867");
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
    public void CharSet0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0868");
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
    public void CharSet0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0869");
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
    public void CharSet0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0870");
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
    public void CharSet0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0871");
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
    public void CharSet0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0872");
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
    public void CharSet0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0873");
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
    public void CharSet0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0874");
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
    public void CharSet0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0875");
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
    public void CharSet0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0876");
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
    public void CharSet0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0877");
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
    public void CharSet0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0878");
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
    public void CharSet0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0879");
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
    public void CharSet0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0880");
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
    public void CharSet0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0881");
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
    public void CharSet0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0882");
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
    public void CharSet0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0883");
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
    public void CharSet0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0884");
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
    public void CharSet0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0885");
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
    public void CharSet0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0886");
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
    public void CharSet0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0887");
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
    public void CharSet0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0888");
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
    public void CharSet0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0889");
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
    public void CharSet0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0890");
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
    public void CharSet0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0891");
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
    public void CharSet0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0892");
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
    public void CharSet0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0893");
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
    public void CharSet0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0894");
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
    public void CharSet0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0895");
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
    public void CharSet0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0896");
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
    public void CharSet0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0897");
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
    public void CharSet0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0898");
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
    public void CharSet0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0899");
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
    public void CharSet0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0900");
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
    public void CharSet0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0901");
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
    public void CharSet0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0902");
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
    public void CharSet0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0903");
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
    public void CharSet0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0904");
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
    public void CharSet0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0905");
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
    public void CharSet0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0906");
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
    public void CharSet0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0907");
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
    public void CharSet0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0908");
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
    public void CharSet0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0909");
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
    public void CharSet0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0910");
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
    public void CharSet0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0911");
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
    public void CharSet0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0912");
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
    public void CharSet0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0913");
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
    public void CharSet0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0914");
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
    public void CharSet0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0915");
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
    public void CharSet0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0916");
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
    public void CharSet0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0917");
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
    public void CharSet0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0918");
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
    public void CharSet0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0919");
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
    public void CharSet0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0920");
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
    public void CharSet0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0921");
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
    public void CharSet0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0922");
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
    public void CharSet0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0923");
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
    public void CharSet0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0924");
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
    public void CharSet0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0925");
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
    public void CharSet0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0926");
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
    public void CharSet0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0927");
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
    public void CharSet0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0928");
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
    public void CharSet0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0929");
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
    public void CharSet0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0930");
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
    public void CharSet0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0931");
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
    public void CharSet0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0932");
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
    public void CharSet0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0933");
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
    public void CharSet0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0934");
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
    public void CharSet0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0935");
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
    public void CharSet0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0936");
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
    public void CharSet0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0937");
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
    public void CharSet0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0938");
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
    public void CharSet0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0939");
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
    public void CharSet0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0940");
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
    public void CharSet0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0941");
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
    public void CharSet0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0942");
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
    public void CharSet0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0943");
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
    public void CharSet0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0944");
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
    public void CharSet0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0945");
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
    public void CharSet0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0946");
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
    public void CharSet0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0947");
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
    public void CharSet0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0948");
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
    public void CharSet0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0949");
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
    public void CharSet0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0950");
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
    public void CharSet0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0951");
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
    public void CharSet0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0952");
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
    public void CharSet0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0953");
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
    public void CharSet0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0954");
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
    public void CharSet0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0955");
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
    public void CharSet0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0956");
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
    public void CharSet0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0957");
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
    public void CharSet0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0958");
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
    public void CharSet0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0959");
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
    public void CharSet0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0960");
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
    public void CharSet0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0961");
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
    public void CharSet0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0962");
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
    public void CharSet0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0963");
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
    public void CharSet0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0964");
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
    public void CharSet0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0965");
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
    public void CharSet0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0966");
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
    public void CharSet0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0967");
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
    public void CharSet0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0968");
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
    public void CharSet0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0969");
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
    public void CharSet0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0970");
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
    public void CharSet0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0971");
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
    public void CharSet0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0972");
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
    public void CharSet0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0973");
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
    public void CharSet0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0974");
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
    public void CharSet0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0975");
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
    public void CharSet0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0976");
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
    public void CharSet0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0977");
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
    public void CharSet0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0978");
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
    public void CharSet0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0979");
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
    public void CharSet0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0980");
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
    public void CharSet0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0981");
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
    public void CharSet0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0982");
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
    public void CharSet0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0983");
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
    public void CharSet0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0984");
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
    public void CharSet0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0985");
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
    public void CharSet0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0986");
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
    public void CharSet0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0987");
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
    public void CharSet0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0988");
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
    public void CharSet0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0989");
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
    public void CharSet0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0990");
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
    public void CharSet0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0991");
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
    public void CharSet0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0992");
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
    public void CharSet0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0993");
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
    public void CharSet0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0994");
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
    public void CharSet0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0995");
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
    public void CharSet0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0996");
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
    public void CharSet0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0997");
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
    public void CharSet0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0998");
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
    public void CharSet0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet0999");
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
    public void CharSet1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet1.CharSet1000");
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

