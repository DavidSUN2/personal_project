
package CharSet;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CharSet2 {

    public static boolean debug = false;

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1001");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str3 = charSet2.toString();
        java.lang.Class<?> wildcardClass4 = charSet2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1002");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9, ,,  , A-Z, a-z, [, ]]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass7 = charSet6.getClass();
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
            System.out.format("%n%s%n", "CharSet2.test1003");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains(' ');
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('a');
        java.lang.String str8 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1004");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.contains('#');
        boolean boolean6 = charSet0.contains('#');
        boolean boolean8 = charSet0.contains('4');
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
            System.out.format("%n%s%n", "CharSet2.test1005");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        boolean boolean4 = charSet0.contains('#');
        java.lang.String str5 = charSet0.toString();
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1006");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        boolean boolean7 = charSet4.contains('#');
        java.lang.String str8 = charSet4.toString();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1007");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('4');
        java.lang.String str6 = charSet3.toString();
        boolean boolean8 = charSet3.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1008");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z]", "[h, i, !]", "hi!", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str7 = charSet6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[h, ,,  , a-z, A-Z, [, ], i, !]" + "'", str7.equals("[h, ,,  , a-z, A-Z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1009");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        java.lang.String str6 = charSet3.toString();
        boolean boolean8 = charSet3.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str4.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str5.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str6.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1010");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str4 = charSet3.toString();
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean6 = charSet3.equals((java.lang.Object) charSet5);
        java.lang.String str7 = charSet5.toString();
        boolean boolean8 = charSet0.equals((java.lang.Object) str7);
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1011");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.contains(' ');
        java.lang.Class<?> wildcardClass7 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1012");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z]", "[h, i, !]", "hi!", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str9 = charSet8.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[h, ,,  , a-z, A-Z, [, ], i, !]" + "'", str9.equals("[h, ,,  , a-z, A-Z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1013");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        boolean boolean4 = charSet1.contains(' ');
        java.lang.String str5 = charSet1.toString();
        java.lang.String str6 = charSet1.toString();
        boolean boolean8 = charSet1.contains('a');
        java.lang.String str9 = charSet1.toString();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1014");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('#');
        java.lang.String str5 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1015");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) 10L);
        boolean boolean5 = charSet0.contains('4');
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[0-9]" + "'", str1.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1016");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains(' ');
        boolean boolean5 = charSet0.contains(' ');
        java.lang.String str6 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z, A-Z]" + "'", str1.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z, A-Z]" + "'", str6.equals("[a-z, A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1017");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet4.equals(obj5);
        java.lang.Class<?> wildcardClass7 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
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
            System.out.format("%n%s%n", "CharSet2.test1018");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet2.test1019");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains(' ');
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains(' ');
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1020");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('#');
        boolean boolean7 = charSet0.contains('a');
        java.lang.String str8 = charSet0.toString();
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1021");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('4');
        java.lang.String str7 = charSet0.toString();
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1022");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('4');
        java.lang.String str6 = charSet3.toString();
        boolean boolean8 = charSet3.contains('4');
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
            System.out.format("%n%s%n", "CharSet2.test1023");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1024");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean3 = charSet1.contains(' ');
        boolean boolean5 = charSet1.contains(' ');
        boolean boolean7 = charSet1.contains('a');
        boolean boolean9 = charSet1.contains('#');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1025");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z]", "[A-Z, a-z, [, ]]", "[,,  , h, a-z, A-Z, [, ], i, !]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
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
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1026");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str3 = charSet2.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) str3);
        boolean boolean6 = charSet0.contains('4');
        boolean boolean8 = charSet0.contains(' ');
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
            System.out.format("%n%s%n", "CharSet2.test1027");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z, A-Z]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str5 = charSet4.toString();
        java.lang.String str6 = charSet4.toString();
        boolean boolean8 = charSet4.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str5.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str6.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1028");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1029");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, ,,  , A-Z, a-z, [, i, !, ]]", "[0-9, ,,  , a-z, A-Z, [, ]]", "hi!" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
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
            System.out.format("%n%s%n", "CharSet2.test1030");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('#');
        boolean boolean6 = charSet0.contains('4');
        java.lang.String str7 = charSet0.toString();
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
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1031");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains('4');
        java.lang.String str5 = charSet0.toString();
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
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1032");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet4.equals(obj5);
        boolean boolean8 = charSet4.contains(' ');
        java.lang.Class<?> wildcardClass9 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
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
            System.out.format("%n%s%n", "CharSet2.test1033");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        boolean boolean4 = charSet1.contains(' ');
        boolean boolean6 = charSet1.contains('a');
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
            System.out.format("%n%s%n", "CharSet2.test1034");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 1);
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
            System.out.format("%n%s%n", "CharSet2.test1035");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean5 = charSet3.contains('4');
        boolean boolean7 = charSet3.contains('a');
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
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1036");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.contains(' ');
        boolean boolean6 = charSet0.contains('a');
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
        java.lang.String str9 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1037");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean6 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.String str7 = charSet3.toString();
        java.lang.Class<?> wildcardClass8 = charSet3.getClass();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1038");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        boolean boolean8 = charSet6.contains(' ');
        java.lang.Class<?> wildcardClass9 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSet2.test1039");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('a');
        java.lang.String str6 = charSet3.toString();
        boolean boolean8 = charSet3.contains('4');
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
            System.out.format("%n%s%n", "CharSet2.test1040");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('#');
        boolean boolean5 = charSet0.contains('4');
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
            System.out.format("%n%s%n", "CharSet2.test1041");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z, A-Z]" + "'", str1.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[a-z, A-Z]" + "'", str2.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z, A-Z]" + "'", str3.equals("[a-z, A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1042");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        boolean boolean7 = charSet4.contains('4');
        boolean boolean9 = charSet4.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1043");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z]", "[A-Z, a-z, [, ]]", "[,,  , h, a-z, A-Z, [, ], i, !]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str5 = charSet4.toString();
        boolean boolean7 = charSet4.contains('4');
        java.lang.String str8 = charSet4.toString();
        java.lang.String str9 = charSet4.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str9.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1044");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
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
            System.out.format("%n%s%n", "CharSet2.test1045");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        boolean boolean4 = charSet1.contains(' ');
        java.lang.String str5 = charSet1.toString();
        java.lang.String str6 = charSet1.toString();
        boolean boolean8 = charSet1.contains('4');
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1046");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1047");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('4');
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1048");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        boolean boolean4 = charSet0.contains('#');
        boolean boolean6 = charSet0.contains('#');
        boolean boolean8 = charSet0.contains('a');
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
            System.out.format("%n%s%n", "CharSet2.test1049");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) 10L);
        boolean boolean5 = charSet0.contains('#');
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9]" + "'", str7.equals("[0-9]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1050");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z, A-Z]", "[0-9, h, A-Z, a-z, i, !, [, ]]", "[A-Z]", "[A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet2.test1051");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains('#');
        boolean boolean6 = charSet0.contains(' ');
        boolean boolean8 = charSet0.contains('4');
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
            System.out.format("%n%s%n", "CharSet2.test1052");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str3 = charSet2.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) str3);
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.equals((java.lang.Object) (-1L));
        boolean boolean9 = charSet0.contains(' ');
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1053");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z]", "[A-Z, a-z, [, ]]", "[,,  , h, a-z, A-Z, [, ], i, !]" };
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
            System.out.format("%n%s%n", "CharSet2.test1054");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) (short) -1);
        java.lang.String str4 = charSet0.toString();
        java.lang.Class<?> wildcardClass5 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1055");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z, A-Z]", "[0-9, h, A-Z, a-z, i, !, [, ]]", "[A-Z]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean7 = charSet5.contains('4');
        boolean boolean9 = charSet5.contains('4');
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
            System.out.format("%n%s%n", "CharSet2.test1056");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str5 = charSet4.toString();
        boolean boolean7 = charSet4.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str5.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1057");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.Class<?> wildcardClass3 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[0-9]" + "'", str1.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[0-9]" + "'", str2.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1058");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1059");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[a-z]" + "'", str2.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1060");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains('#');
        boolean boolean6 = charSet0.contains(' ');
        java.lang.Object obj7 = null;
        boolean boolean8 = charSet0.equals(obj7);
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
            System.out.format("%n%s%n", "CharSet2.test1061");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains(' ');
        boolean boolean7 = charSet3.contains(' ');
        java.lang.String str8 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str8.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1062");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str3 = charSet2.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) str3);
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1063");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.contains('#');
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1064");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains(' ');
        boolean boolean7 = charSet0.contains('4');
        java.lang.String str8 = charSet0.toString();
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1065");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('#');
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1066");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('a');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet0.equals(obj5);
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1067");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        java.lang.Object obj3 = null;
        boolean boolean4 = charSet0.equals(obj3);
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains(' ');
        java.lang.String str8 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1068");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str6 = charSet5.toString();
        boolean boolean8 = charSet5.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[h, i, !]" + "'", str6.equals("[h, i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1069");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str7 = charSet6.toString();
        boolean boolean9 = charSet6.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[h, i, !]" + "'", str7.equals("[h, i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1070");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        java.lang.Object obj3 = null;
        boolean boolean4 = charSet0.equals(obj3);
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1071");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str3 = charSet2.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) str3);
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.equals((java.lang.Object) "[0-9, h, A-Z, a-z, i, !, [, ]]");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1072");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('#');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1073");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean4 = charSet2.contains(' ');
        boolean boolean6 = charSet2.contains('#');
        java.lang.String str7 = charSet2.toString();
        java.lang.Class<?> wildcardClass8 = charSet2.getClass();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1074");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('4');
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1075");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('4');
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
            System.out.format("%n%s%n", "CharSet2.test1076");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains(' ');
        boolean boolean7 = charSet0.contains('4');
        boolean boolean9 = charSet0.contains(' ');
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
            System.out.format("%n%s%n", "CharSet2.test1077");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('a');
        boolean boolean7 = charSet0.contains('4');
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
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1078");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean3 = charSet1.contains('4');
        java.lang.String str4 = charSet1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1079");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
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
            System.out.format("%n%s%n", "CharSet2.test1080");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean4 = charSet2.contains(' ');
        java.lang.String str5 = charSet2.toString();
        java.lang.String str6 = charSet2.toString();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1081");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean4 = charSet0.equals((java.lang.Object) charSet3);
        boolean boolean6 = charSet3.contains('a');
        boolean boolean8 = charSet3.contains('#');
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
            System.out.format("%n%s%n", "CharSet2.test1082");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) 10L);
        boolean boolean5 = charSet0.contains('#');
        boolean boolean7 = charSet0.contains(' ');
        boolean boolean9 = charSet0.equals((java.lang.Object) "[h, ,,  , A-Z, a-z, [, i, !, ]]");
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
            System.out.format("%n%s%n", "CharSet2.test1083");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.Class<?> wildcardClass9 = charSet8.getClass();
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
            System.out.format("%n%s%n", "CharSet2.test1084");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.contains('#');
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
            System.out.format("%n%s%n", "CharSet2.test1085");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str3 = charSet2.toString();
        boolean boolean5 = charSet2.contains(' ');
        java.lang.Class<?> wildcardClass6 = charSet2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1086");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains(' ');
        java.lang.String str6 = charSet3.toString();
        java.lang.String str7 = charSet3.toString();
        boolean boolean9 = charSet3.contains('4');
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
            System.out.format("%n%s%n", "CharSet2.test1087");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet2.test1088");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.contains(' ');
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1089");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.contains('4');
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
            System.out.format("%n%s%n", "CharSet2.test1090");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('4');
        java.lang.String str6 = charSet2.toString();
        boolean boolean8 = charSet2.contains('4');
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
            System.out.format("%n%s%n", "CharSet2.test1091");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1092");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) (short) -1);
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('a');
        java.lang.String str7 = charSet0.toString();
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1093");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('a');
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1094");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1095");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, ,,  , A-Z, a-z, [, i, !, ]]", "[0-9, ,,  , a-z, A-Z, [, ]]", "hi!" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean7 = charSet5.contains(' ');
        java.lang.String str8 = charSet5.toString();
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
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1096");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z]", "[h, i, !]", "hi!", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean8 = charSet6.contains('4');
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
            System.out.format("%n%s%n", "CharSet2.test1097");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean4 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet3.equals(obj5);
        java.lang.String str7 = charSet3.toString();
        boolean boolean9 = charSet3.contains('a');
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
            System.out.format("%n%s%n", "CharSet2.test1098");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 1);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1099");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str8 = charSet7.toString();
        java.lang.Class<?> wildcardClass9 = charSet7.getClass();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1100");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
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
            System.out.format("%n%s%n", "CharSet2.test1101");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('#');
        boolean boolean5 = charSet0.contains('a');
        boolean boolean7 = charSet0.contains('4');
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1102");
        java.lang.String[] strArray5 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[h, i, !]", "[h, i, !]", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.Class<?> wildcardClass8 = charSet7.getClass();
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
            System.out.format("%n%s%n", "CharSet2.test1103");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[h, i, !]" + "'", str7.equals("[h, i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[h, i, !]" + "'", str8.equals("[h, i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1104");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1105");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        boolean boolean4 = charSet0.contains('#');
        boolean boolean6 = charSet0.contains(' ');
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
            System.out.format("%n%s%n", "CharSet2.test1106");
        java.lang.String[] strArray4 = new java.lang.String[] { "[h, i, !]", "[A-Z]", "[A-Z, a-z, [, ]]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        boolean boolean7 = charSet5.equals((java.lang.Object) charSet6);
        java.lang.String str8 = charSet5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[h, ,,  , A-Z, a-z, [, i, !, ]]" + "'", str8.equals("[h, ,,  , A-Z, a-z, [, i, !, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1107");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9, ,,  , A-Z, a-z, [, ]]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean9 = charSet7.contains(' ');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1108");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean7 = charSet3.contains('4');
        java.lang.String str8 = charSet3.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1109");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z]", "[A-Z, a-z, [, ]]", "[,,  , h, a-z, A-Z, [, ], i, !]" };
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
            System.out.format("%n%s%n", "CharSet2.test1110");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean4 = charSet0.equals((java.lang.Object) charSet3);
        boolean boolean6 = charSet3.contains('a');
        boolean boolean8 = charSet3.contains('4');
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
            System.out.format("%n%s%n", "CharSet2.test1111");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str6 = charSet5.toString();
        java.lang.String str7 = charSet5.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1112");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z]", "[A-Z, a-z, [, ]]", "[,,  , h, a-z, A-Z, [, ], i, !]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str5 = charSet4.toString();
        boolean boolean7 = charSet4.contains(' ');
        boolean boolean9 = charSet4.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str5.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1113");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = charSet3.equals((java.lang.Object) 100);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean9 = charSet3.equals((java.lang.Object) charSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1114");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str3 = charSet2.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) str3);
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.equals((java.lang.Object) (-1L));
        boolean boolean9 = charSet0.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1115");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1116");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet2.test1117");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.equals((java.lang.Object) (-1L));
        boolean boolean8 = charSet0.contains('4');
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
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1118");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('#');
        boolean boolean7 = charSet0.contains('4');
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1119");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = charSet0.equals(obj6);
        java.lang.Class<?> wildcardClass8 = obj6.getClass();
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
            System.out.format("%n%s%n", "CharSet2.test1120");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) 10L);
        boolean boolean5 = charSet0.contains('a');
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
            System.out.format("%n%s%n", "CharSet2.test1121");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str7 = charSet6.toString();
        java.lang.String str8 = charSet6.toString();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1122");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) 1L);
        boolean boolean6 = charSet0.contains('#');
        boolean boolean8 = charSet0.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1123");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.contains(' ');
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
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1124");
        java.lang.String[] strArray4 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "", "[h, ,,  , A-Z, a-z, [, i, !, ]]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1125");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1126");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean7 = charSet0.equals((java.lang.Object) charSet6);
        java.lang.Class<?> wildcardClass8 = charSet6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1127");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z]", "[h, i, !]", "hi!", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean7 = charSet5.contains('a');
        boolean boolean9 = charSet5.contains('#');
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
            System.out.format("%n%s%n", "CharSet2.test1128");
        java.lang.String[] strArray4 = new java.lang.String[] { "[h, i, !]", "[A-Z]", "[A-Z, a-z, [, ]]", "[A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet2.test1129");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1130");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean4 = charSet2.contains(' ');
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean6 = charSet2.equals((java.lang.Object) charSet5);
        boolean boolean7 = charSet0.equals((java.lang.Object) boolean6);
        boolean boolean9 = charSet0.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
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
            System.out.format("%n%s%n", "CharSet2.test1131");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('#');
        boolean boolean7 = charSet2.contains(' ');
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
            System.out.format("%n%s%n", "CharSet2.test1132");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[A-Z]" + "'", str5.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1133");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.contains('4');
        boolean boolean8 = charSet4.equals((java.lang.Object) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1134");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('4');
        boolean boolean7 = charSet2.contains('#');
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
            System.out.format("%n%s%n", "CharSet2.test1135");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        java.lang.String str6 = charSet3.toString();
        java.lang.String str7 = charSet3.toString();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet2.test1136");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.contains('4');
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
}

