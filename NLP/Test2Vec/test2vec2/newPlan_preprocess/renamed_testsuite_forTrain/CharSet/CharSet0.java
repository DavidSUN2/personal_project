
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
            System.out.format("%n%s%n", "CharSet0.test0001");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
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
            System.out.format("%n%s%n", "CharSet0.test0002");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean7 = charSet5.equals((java.lang.Object) (-1));
        boolean boolean9 = charSet5.equals((java.lang.Object) 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
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
            System.out.format("%n%s%n", "CharSet0.test0003");
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
            System.out.format("%n%s%n", "CharSet0.test0004");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0005");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
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
            System.out.format("%n%s%n", "CharSet0.test0006");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
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
            System.out.format("%n%s%n", "CharSet0.test0007");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean8 = charSet6.equals((java.lang.Object) (byte) 0);
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
            System.out.format("%n%s%n", "CharSet0.test0008");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean7 = charSet0.equals((java.lang.Object) charSet6);
        boolean boolean9 = charSet0.equals((java.lang.Object) "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0009");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.Class<?> wildcardClass7 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0010");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean7 = charSet5.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass8 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
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
            System.out.format("%n%s%n", "CharSet0.test0011");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.String str7 = charSet6.toString();
        java.lang.Class<?> wildcardClass8 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z, a-z, [, ]]" + "'", str7.equals("[A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0012");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
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
            System.out.format("%n%s%n", "CharSet0.test0013");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        java.lang.Class<?> wildcardClass2 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[0-9]" + "'", str1.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0014");
        java.lang.String[] strArray0 = null;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSet1);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0015");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str4 = charSet3.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) str4);
        boolean boolean7 = charSet0.contains('a');
        boolean boolean9 = charSet0.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0016");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0017");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass4 = charSet3.getClass();
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
            System.out.format("%n%s%n", "CharSet0.test0018");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.Class<?> wildcardClass4 = charSet2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0019");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass5 = charSet4.getClass();
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
            System.out.format("%n%s%n", "CharSet0.test0020");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str5 = charSet4.toString();
        boolean boolean6 = charSet2.equals((java.lang.Object) charSet4);
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
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9]" + "'", str5.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0021");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean8 = charSet6.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0022");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
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
            System.out.format("%n%s%n", "CharSet0.test0023");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0024");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0025");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "[0-9]", "[A-Z]", "[a-z]" };
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
            System.out.format("%n%s%n", "CharSet0.test0026");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str7 = charSet6.toString();
        java.lang.Class<?> wildcardClass8 = charSet6.getClass();
        boolean boolean9 = charSet5.equals((java.lang.Object) charSet6);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0027");
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
            System.out.format("%n%s%n", "CharSet0.test0028");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0029");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass4 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0030");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('4');
        java.lang.String str7 = charSet3.toString();
        boolean boolean9 = charSet3.equals((java.lang.Object) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0031");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0032");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0033");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean7 = charSet5.equals((java.lang.Object) (-1));
        boolean boolean9 = charSet5.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
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
            System.out.format("%n%s%n", "CharSet0.test0034");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet1.contains('4');
        java.lang.Class<?> wildcardClass4 = charSet1.getClass();
        boolean boolean5 = charSet0.equals((java.lang.Object) charSet1);
        boolean boolean7 = charSet1.contains(' ');
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
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0035");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0036");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.Class<?> wildcardClass4 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0037");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0038");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.equals((java.lang.Object) 10L);
        boolean boolean8 = charSet4.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0039");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean7 = charSet5.contains('a');
        boolean boolean9 = charSet5.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
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
            System.out.format("%n%s%n", "CharSet0.test0040");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[h, i, !]" + "'", str8.equals("[h, i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[h, i, !]" + "'", str9.equals("[h, i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0041");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
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
            System.out.format("%n%s%n", "CharSet0.test0042");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean7 = charSet0.equals((java.lang.Object) charSet6);
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
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
            System.out.format("%n%s%n", "CharSet0.test0043");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean7 = charSet5.contains('a');
        boolean boolean9 = charSet5.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
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
            System.out.format("%n%s%n", "CharSet0.test0044");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "[0-9]", "[A-Z]", "[a-z]" };
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
            System.out.format("%n%s%n", "CharSet0.test0045");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0046");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains(' ');
        java.lang.Class<?> wildcardClass5 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[a-z]" + "'", str2.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0047");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.Class<?> wildcardClass4 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0048");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str7 = charSet6.toString();
        java.lang.String str8 = charSet6.toString();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0049");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('a');
        java.lang.String str7 = charSet3.toString();
        boolean boolean8 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0050");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean8 = charSet6.equals((java.lang.Object) 1);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0051");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean7 = charSet0.equals((java.lang.Object) charSet6);
        boolean boolean9 = charSet0.contains('#');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0052");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.Class<?> wildcardClass3 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[a-z]" + "'", str2.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0053");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0054");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        boolean boolean4 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0055");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        boolean boolean9 = charSet7.equals((java.lang.Object) charSet8);
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
            System.out.format("%n%s%n", "CharSet0.test0056");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.Class<?> wildcardClass5 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
            System.out.format("%n%s%n", "CharSet0.test0057");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str2 = charSet1.toString();
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean6 = charSet1.equals((java.lang.Object) charSet3);
        boolean boolean7 = charSet0.equals((java.lang.Object) charSet3);
        boolean boolean9 = charSet3.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0058");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        java.lang.Class<?> wildcardClass5 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0059");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet1.contains('4');
        java.lang.Class<?> wildcardClass4 = charSet1.getClass();
        boolean boolean5 = charSet0.equals((java.lang.Object) charSet1);
        boolean boolean7 = charSet1.contains('#');
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
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0060");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass4 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0061");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str5.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0062");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0063");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean8 = charSet6.equals((java.lang.Object) 1);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0064");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean8 = charSet6.equals((java.lang.Object) 10L);
        boolean boolean9 = charSet5.equals((java.lang.Object) charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0065");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "[0-9]", "[A-Z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        boolean boolean9 = charSet7.contains(' ');
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
            System.out.format("%n%s%n", "CharSet0.test0066");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "[0-9]", "[A-Z]", "[a-z]" };
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
            System.out.format("%n%s%n", "CharSet0.test0067");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('a');
        java.lang.String str7 = charSet3.toString();
        boolean boolean8 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.Class<?> wildcardClass9 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
            System.out.format("%n%s%n", "CharSet0.test0068");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "[0-9]", "[A-Z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        java.lang.Class<?> wildcardClass9 = charSet8.getClass();
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
            System.out.format("%n%s%n", "CharSet0.test0069");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0070");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('4');
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0071");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('4');
        java.lang.String str7 = charSet3.toString();
        boolean boolean9 = charSet3.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0072");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('a');
        java.lang.String str7 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0073");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0074");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        boolean boolean8 = charSet6.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0075");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0076");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.Class<?> wildcardClass6 = charSet5.getClass();
        boolean boolean7 = charSet4.equals((java.lang.Object) wildcardClass6);
        java.lang.String str8 = charSet4.toString();
        java.lang.Class<?> wildcardClass9 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str8.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0077");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str2 = charSet1.toString();
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean6 = charSet1.equals((java.lang.Object) charSet3);
        boolean boolean7 = charSet0.equals((java.lang.Object) charSet3);
        boolean boolean9 = charSet3.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0078");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str4 = charSet3.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) str4);
        java.lang.String str6 = charSet0.toString();
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0079");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains(' ');
        boolean boolean7 = charSet0.contains('4');
        boolean boolean9 = charSet0.equals((java.lang.Object) '4');
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
            System.out.format("%n%s%n", "CharSet0.test0080");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0081");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str2 = charSet1.toString();
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean4 = charSet1.equals((java.lang.Object) charSet3);
        boolean boolean6 = charSet1.equals((java.lang.Object) 1);
        boolean boolean8 = charSet1.contains('#');
        boolean boolean9 = charSet0.equals((java.lang.Object) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0082");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet1.contains('4');
        java.lang.Class<?> wildcardClass4 = charSet1.getClass();
        boolean boolean5 = charSet0.equals((java.lang.Object) charSet1);
        java.lang.String str6 = charSet1.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0083");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0084");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0085");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('4');
        boolean boolean7 = charSet3.contains('#');
        java.lang.Class<?> wildcardClass8 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
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
            System.out.format("%n%s%n", "CharSet0.test0086");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
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
            System.out.format("%n%s%n", "CharSet0.test0087");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('a');
        java.lang.String str6 = charSet2.toString();
        boolean boolean8 = charSet2.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0088");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0089");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean7 = charSet5.contains('a');
        java.lang.Class<?> wildcardClass8 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
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
            System.out.format("%n%s%n", "CharSet0.test0090");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0091");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        boolean boolean7 = charSet0.contains(' ');
        boolean boolean9 = charSet0.contains(' ');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0092");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str5 = charSet4.toString();
        boolean boolean6 = charSet2.equals((java.lang.Object) charSet4);
        java.lang.Class<?> wildcardClass7 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9]" + "'", str5.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0093");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0094");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.equals((java.lang.Object) 0.0d);
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains(' ');
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0095");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass6 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
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
            System.out.format("%n%s%n", "CharSet0.test0096");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
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
            System.out.format("%n%s%n", "CharSet0.test0097");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str3 = charSet2.toString();
        java.lang.String str4 = charSet2.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.Class<?> wildcardClass6 = charSet2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0098");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str4 = charSet3.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) str4);
        boolean boolean7 = charSet0.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0099");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 1);
        boolean boolean7 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0100");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.Class<?> wildcardClass2 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0101");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str2 = charSet1.toString();
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean6 = charSet1.equals((java.lang.Object) charSet3);
        boolean boolean7 = charSet0.equals((java.lang.Object) charSet3);
        boolean boolean9 = charSet0.equals((java.lang.Object) 0L);
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
            System.out.format("%n%s%n", "CharSet0.test0102");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.String str7 = charSet6.toString();
        java.lang.String str8 = charSet6.toString();
        java.lang.String str9 = charSet6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z, a-z, [, ]]" + "'", str7.equals("[A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z, a-z, [, ]]" + "'", str8.equals("[A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z, a-z, [, ]]" + "'", str9.equals("[A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0103");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass6 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
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
            System.out.format("%n%s%n", "CharSet0.test0104");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0105");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.Class<?> wildcardClass6 = charSet5.getClass();
        boolean boolean7 = charSet4.equals((java.lang.Object) wildcardClass6);
        java.lang.String str8 = charSet4.toString();
        java.lang.String str9 = charSet4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str8.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str9.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0106");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0107");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean7 = charSet5.contains('#');
        boolean boolean8 = charSet0.equals((java.lang.Object) charSet5);
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0108");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('a');
        boolean boolean9 = charSet0.equals((java.lang.Object) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0109");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str5 = charSet4.toString();
        boolean boolean6 = charSet2.equals((java.lang.Object) charSet4);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str8 = charSet7.toString();
        boolean boolean9 = charSet4.equals((java.lang.Object) str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9]" + "'", str5.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9]" + "'", str8.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0110");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0111");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('a');
        boolean boolean9 = charSet0.contains('#');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0112");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.String str1 = charSet0.toString();
        java.lang.String[] strArray4 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str6 = charSet5.toString();
        java.lang.Class<?> wildcardClass7 = charSet5.getClass();
        boolean boolean8 = charSet0.equals((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z, A-Z]" + "'", str1.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
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
            System.out.format("%n%s%n", "CharSet0.test0113");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('#');
        java.lang.String str9 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0114");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0115");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "[0-9]", "[A-Z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        boolean boolean9 = charSet7.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0116");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('4');
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0117");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "[0-9]", "[A-Z]", "[a-z]" };
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
            System.out.format("%n%s%n", "CharSet0.test0118");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "[0-9]", "[A-Z]", "[a-z]" };
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
            System.out.format("%n%s%n", "CharSet0.test0119");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('#');
        boolean boolean7 = charSet2.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0120");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.equals((java.lang.Object) 0.0d);
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains(' ');
        boolean boolean9 = charSet0.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0121");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0122");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('4');
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0123");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        boolean boolean8 = charSet6.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0124");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str5 = charSet4.toString();
        boolean boolean6 = charSet2.equals((java.lang.Object) charSet4);
        boolean boolean8 = charSet2.equals((java.lang.Object) false);
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
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9]" + "'", str5.equals("[0-9]"));
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
            System.out.format("%n%s%n", "CharSet0.test0125");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet9 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
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
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0126");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        java.lang.Class<?> wildcardClass6 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str5.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0127");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.equals((java.lang.Object) 0.0d);
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains(' ');
        boolean boolean9 = charSet0.contains(' ');
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
            System.out.format("%n%s%n", "CharSet0.test0128");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass4 = charSet3.getClass();
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
            System.out.format("%n%s%n", "CharSet0.test0129");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 1);
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
            System.out.format("%n%s%n", "CharSet0.test0130");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass5 = charSet4.getClass();
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
            System.out.format("%n%s%n", "CharSet0.test0131");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
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
            System.out.format("%n%s%n", "CharSet0.test0132");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains(' ');
        boolean boolean7 = charSet0.contains('#');
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
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
            System.out.format("%n%s%n", "CharSet0.test0133");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean8 = charSet0.equals((java.lang.Object) charSet7);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0134");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass8 = charSet7.getClass();
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
            System.out.format("%n%s%n", "CharSet0.test0135");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean8 = charSet6.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0136");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 1);
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0137");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('a');
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0138");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z, a-z, [, ]]" + "'", str8.equals("[A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z, a-z, [, ]]" + "'", str9.equals("[A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0139");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str5 = charSet4.toString();
        boolean boolean6 = charSet2.equals((java.lang.Object) charSet4);
        java.lang.String str7 = charSet4.toString();
        boolean boolean9 = charSet4.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9]" + "'", str5.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9]" + "'", str7.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0140");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('#');
        java.lang.Class<?> wildcardClass6 = charSet2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0141");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet1.contains('4');
        java.lang.Class<?> wildcardClass4 = charSet1.getClass();
        boolean boolean5 = charSet0.equals((java.lang.Object) charSet1);
        boolean boolean7 = charSet1.contains('a');
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
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0142");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('4');
        java.lang.String str7 = charSet3.toString();
        boolean boolean9 = charSet3.contains('4');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0143");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.contains('a');
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
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
            System.out.format("%n%s%n", "CharSet0.test0144");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean7 = charSet5.contains('#');
        boolean boolean8 = charSet0.equals((java.lang.Object) charSet5);
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
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0145");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        boolean boolean4 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0146");
        java.lang.String[] strArray5 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[h, i, !]", "[h, i, !]", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.Class<?> wildcardClass7 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0147");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 1);
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean9 = charSet0.equals((java.lang.Object) charSet8);
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
        org.junit.Assert.assertNotNull(charSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0148");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
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
            System.out.format("%n%s%n", "CharSet0.test0149");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        boolean boolean4 = charSet0.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0150");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
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
            System.out.format("%n%s%n", "CharSet0.test0151");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean8 = charSet0.equals((java.lang.Object) charSet7);
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
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
            System.out.format("%n%s%n", "CharSet0.test0152");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0153");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('a');
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0154");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean7 = charSet3.contains('4');
        boolean boolean9 = charSet3.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0155");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean6 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.Class<?> wildcardClass7 = charSet3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0156");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0157");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0158");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean8 = charSet6.contains(' ');
        boolean boolean9 = charSet2.equals((java.lang.Object) boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0159");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains(' ');
        boolean boolean6 = charSet0.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0160");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0161");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0162");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str4 = charSet3.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) str4);
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains('4');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0163");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        java.lang.Class<?> wildcardClass6 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str5.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0164");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.contains('a');
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
            System.out.format("%n%s%n", "CharSet0.test0165");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 1);
        boolean boolean7 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0166");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
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
            System.out.format("%n%s%n", "CharSet0.test0167");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str5 = charSet4.toString();
        boolean boolean6 = charSet2.equals((java.lang.Object) charSet4);
        boolean boolean8 = charSet4.contains('4');
        java.lang.String str9 = charSet4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9]" + "'", str5.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9]" + "'", str9.equals("[0-9]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0168");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean3 = charSet1.contains(' ');
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str5 = charSet4.toString();
        java.lang.String str6 = charSet4.toString();
        java.lang.String str7 = charSet4.toString();
        boolean boolean8 = charSet1.equals((java.lang.Object) charSet4);
        java.lang.String str9 = charSet4.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0169");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass6 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
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
            System.out.format("%n%s%n", "CharSet0.test0170");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str2 = charSet1.toString();
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean6 = charSet1.equals((java.lang.Object) charSet3);
        boolean boolean7 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.Class<?> wildcardClass8 = charSet3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0171");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean7 = charSet3.contains('4');
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0172");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.equals((java.lang.Object) (-1L));
        boolean boolean8 = charSet0.equals((java.lang.Object) "[0-9]");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0173");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
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
            System.out.format("%n%s%n", "CharSet0.test0174");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains(' ');
        boolean boolean7 = charSet0.contains('4');
        java.lang.String str8 = charSet0.toString();
        java.lang.String str9 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0175");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('a');
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0176");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet9 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSet0.test0177");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str7 = charSet6.toString();
        boolean boolean9 = charSet6.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0178");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean8 = charSet6.contains('#');
        java.lang.String str9 = charSet6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[h, i, !]" + "'", str9.equals("[h, i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0179");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.Class<?> wildcardClass8 = strArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0180");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0181");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str6.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0182");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('a');
        java.lang.String str7 = charSet3.toString();
        boolean boolean8 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.String str9 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[A-Z]" + "'", str4.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0183");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean4 = charSet2.contains(' ');
        java.lang.Class<?> wildcardClass5 = charSet2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0184");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.String str1 = charSet0.toString();
        java.lang.Class<?> wildcardClass2 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z, A-Z]" + "'", str1.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0185");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0186");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('a');
        java.lang.String str6 = charSet3.toString();
        java.lang.Class<?> wildcardClass7 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0187");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.equals((java.lang.Object) (-1L));
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0188");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.contains('a');
        boolean boolean7 = charSet0.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0189");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('4');
        boolean boolean7 = charSet3.contains('#');
        java.lang.String str8 = charSet3.toString();
        java.lang.Class<?> wildcardClass9 = charSet3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0190");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean6 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0191");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str9 = charSet8.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0192");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0193");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.equals((java.lang.Object) 0.0d);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean7 = charSet5.contains(' ');
        boolean boolean8 = charSet0.equals((java.lang.Object) boolean7);
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0194");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('4');
        boolean boolean8 = charSet0.contains('4');
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0195");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        boolean boolean7 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0196");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean8 = charSet6.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0197");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('4');
        java.lang.String str7 = charSet3.toString();
        java.lang.String str8 = charSet3.toString();
        java.lang.Class<?> wildcardClass9 = charSet3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0198");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains(' ');
        boolean boolean6 = charSet0.equals((java.lang.Object) ' ');
        java.lang.String str7 = charSet0.toString();
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0199");
        java.lang.String[] strArray5 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[h, i, !]", "[h, i, !]", "[a-z, A-Z]" };
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
            System.out.format("%n%s%n", "CharSet0.test0200");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 1);
        boolean boolean7 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0201");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('4');
        boolean boolean8 = charSet0.contains('4');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0202");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        boolean boolean7 = charSet0.contains(' ');
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0203");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('4');
        boolean boolean8 = charSet0.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0204");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.contains(' ');
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
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
            System.out.format("%n%s%n", "CharSet0.test0205");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('a');
        java.lang.String str6 = charSet2.toString();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0206");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0207");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.equals((java.lang.Object) (-1L));
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0208");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str6 = charSet5.toString();
        java.lang.Class<?> wildcardClass7 = charSet5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0209");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('4');
        java.lang.Class<?> wildcardClass6 = charSet2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0210");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('#');
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
            System.out.format("%n%s%n", "CharSet0.test0211");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.Object obj1 = null;
        boolean boolean2 = charSet0.equals(obj1);
        java.lang.String str3 = charSet0.toString();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str6 = charSet5.toString();
        boolean boolean8 = charSet5.equals((java.lang.Object) 10L);
        boolean boolean9 = charSet0.equals((java.lang.Object) boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[A-Z]" + "'", str3.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0212");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('4');
        boolean boolean8 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0213");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.contains('#');
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.equals((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0214");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
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
            System.out.format("%n%s%n", "CharSet0.test0215");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.equals((java.lang.Object) (-1L));
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
            System.out.format("%n%s%n", "CharSet0.test0216");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
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
            System.out.format("%n%s%n", "CharSet0.test0217");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.contains('#');
        boolean boolean6 = charSet0.contains(' ');
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0218");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.Class<?> wildcardClass3 = charSet2.getClass();
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
            System.out.format("%n%s%n", "CharSet0.test0219");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) 1L);
        boolean boolean6 = charSet0.contains('#');
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0220");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.equals((java.lang.Object) (-1L));
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0221");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('a');
        java.lang.String str6 = charSet2.toString();
        boolean boolean8 = charSet2.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0222");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.equals((java.lang.Object) 0.0d);
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
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
            System.out.format("%n%s%n", "CharSet0.test0223");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.contains('a');
        boolean boolean7 = charSet0.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0224");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[a-z]" + "'", str7.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0225");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('4');
        boolean boolean7 = charSet3.contains('#');
        boolean boolean9 = charSet3.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0226");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.equals((java.lang.Object) 10L);
        boolean boolean8 = charSet4.contains('a');
        java.lang.Class<?> wildcardClass9 = charSet4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0227");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet9 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
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
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0228");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0229");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean6 = charSet0.equals((java.lang.Object) charSet3);
        boolean boolean8 = charSet3.contains('a');
        java.lang.String str9 = charSet3.toString();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0230");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0231");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass5 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0232");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass5 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[a-z]" + "'", str2.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0233");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
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
            System.out.format("%n%s%n", "CharSet0.test0234");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean4 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet3.equals(obj5);
        java.lang.Class<?> wildcardClass7 = charSet3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0235");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('a');
        java.lang.Class<?> wildcardClass6 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0236");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean9 = charSet7.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0237");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains(' ');
        boolean boolean7 = charSet0.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0238");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        boolean boolean4 = charSet0.contains(' ');
        boolean boolean6 = charSet0.contains(' ');
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
            System.out.format("%n%s%n", "CharSet0.test0239");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str5 = charSet4.toString();
        boolean boolean6 = charSet2.equals((java.lang.Object) charSet4);
        boolean boolean8 = charSet2.equals((java.lang.Object) 100L);
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
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9]" + "'", str5.equals("[0-9]"));
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
            System.out.format("%n%s%n", "CharSet0.test0240");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.Class<?> wildcardClass3 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0241");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean7 = charSet5.equals((java.lang.Object) (-1));
        java.lang.String str8 = charSet5.toString();
        java.lang.Class<?> wildcardClass9 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[h, i, !]" + "'", str8.equals("[h, i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0242");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) 1L);
        java.lang.String str5 = charSet0.toString();
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0243");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean3 = charSet1.contains(' ');
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str5 = charSet4.toString();
        java.lang.String str6 = charSet4.toString();
        java.lang.String str7 = charSet4.toString();
        boolean boolean8 = charSet1.equals((java.lang.Object) charSet4);
        java.lang.String str9 = charSet1.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0244");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('4');
        java.lang.String str7 = charSet3.toString();
        boolean boolean9 = charSet3.contains('#');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0245");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet2.toString();
        boolean boolean6 = charSet2.contains('4');
        java.lang.String str7 = charSet2.toString();
        boolean boolean9 = charSet2.contains(' ');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0246");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('4');
        java.lang.Class<?> wildcardClass6 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0247");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        boolean boolean9 = charSet7.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0248");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.equals((java.lang.Object) (byte) 0);
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
            System.out.format("%n%s%n", "CharSet0.test0249");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean7 = charSet5.contains('a');
        java.lang.Object obj8 = null;
        boolean boolean9 = charSet5.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
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
            System.out.format("%n%s%n", "CharSet0.test0250");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains('#');
        java.lang.Class<?> wildcardClass5 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0251");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str4 = charSet3.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) str4);
        boolean boolean7 = charSet0.contains('a');
        boolean boolean9 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0252");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass6 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0253");
        java.lang.String[] strArray5 = new java.lang.String[] { "[0-9]", "[a-z, A-Z]", "[]", "[0-9]", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.String str9 = charSet8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSet0.test0254");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean7 = charSet5.equals((java.lang.Object) (-1));
        boolean boolean9 = charSet5.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
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
            System.out.format("%n%s%n", "CharSet0.test0255");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean7 = charSet5.contains('4');
        java.lang.Class<?> wildcardClass8 = charSet5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0256");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str7 = charSet6.toString();
        java.lang.String str8 = charSet6.toString();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0257");
        java.lang.String[] strArray5 = new java.lang.String[] { "[0-9]", "[a-z, A-Z]", "[]", "[0-9]", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.Class<?> wildcardClass7 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0258");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
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
            System.out.format("%n%s%n", "CharSet0.test0259");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str6 = charSet5.toString();
        java.lang.String str7 = charSet5.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0260");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.Class<?> wildcardClass7 = charSet6.getClass();
        boolean boolean8 = charSet2.equals((java.lang.Object) charSet6);
        java.lang.Class<?> wildcardClass9 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
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
            System.out.format("%n%s%n", "CharSet0.test0261");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        java.lang.String str6 = charSet4.toString();
        java.lang.Class<?> wildcardClass7 = charSet4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0262");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean9 = charSet7.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0263");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        boolean boolean7 = charSet0.contains(' ');
        boolean boolean9 = charSet0.contains('#');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0264");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0265");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        boolean boolean7 = charSet0.contains('a');
        boolean boolean9 = charSet0.contains('4');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0266");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        boolean boolean4 = charSet1.contains(' ');
        java.lang.String str5 = charSet1.toString();
        boolean boolean7 = charSet1.contains(' ');
        java.lang.Class<?> wildcardClass8 = charSet1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0267");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.Class<?> wildcardClass7 = strArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0268");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean7 = charSet4.equals((java.lang.Object) charSet6);
        boolean boolean9 = charSet4.contains('#');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0269");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.contains('#');
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('4');
        boolean boolean9 = charSet0.contains(' ');
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
            System.out.format("%n%s%n", "CharSet0.test0270");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.equals((java.lang.Object) (-1L));
        boolean boolean8 = charSet0.equals((java.lang.Object) "[0-9]");
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
            System.out.format("%n%s%n", "CharSet0.test0271");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0272");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean7 = charSet5.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0273");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains(' ');
        boolean boolean7 = charSet3.contains('#');
        java.lang.Class<?> wildcardClass8 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
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
            System.out.format("%n%s%n", "CharSet0.test0274");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = charSet3.equals((java.lang.Object) 100);
        boolean boolean9 = charSet3.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
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
            System.out.format("%n%s%n", "CharSet0.test0275");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.equals((java.lang.Object) 10L);
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
            System.out.format("%n%s%n", "CharSet0.test0276");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.Class<?> wildcardClass8 = charSet7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0277");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean6 = charSet4.contains(' ');
        java.lang.String str7 = charSet4.toString();
        java.lang.Class<?> wildcardClass8 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str7.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0278");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str7 = charSet6.toString();
        boolean boolean9 = charSet6.contains(' ');
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
            System.out.format("%n%s%n", "CharSet0.test0279");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean9 = charSet7.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0280");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str2 = charSet1.toString();
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean6 = charSet1.equals((java.lang.Object) charSet3);
        boolean boolean7 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.String str8 = charSet3.toString();
        java.lang.String str9 = charSet3.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0281");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 1);
        java.lang.Object obj6 = null;
        boolean boolean7 = charSet0.equals(obj6);
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
            System.out.format("%n%s%n", "CharSet0.test0282");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0283");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.contains(' ');
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
            System.out.format("%n%s%n", "CharSet0.test0284");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean5 = charSet3.contains('4');
        boolean boolean7 = charSet3.contains(' ');
        boolean boolean9 = charSet3.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0285");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean7 = charSet5.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0286");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0287");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.Object obj1 = null;
        boolean boolean2 = charSet0.equals(obj1);
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
            System.out.format("%n%s%n", "CharSet0.test0288");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.contains('a');
        boolean boolean8 = charSet0.contains('4');
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
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0289");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 1);
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0290");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('#');
        boolean boolean5 = charSet0.equals((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
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
            System.out.format("%n%s%n", "CharSet0.test0291");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str3 = charSet2.toString();
        java.lang.String str4 = charSet2.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean7 = charSet0.contains('4');
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0292");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.equals((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass7 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0293");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str3 = charSet2.toString();
        java.lang.String str4 = charSet2.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0294");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = charSet3.contains('4');
        java.lang.String str8 = charSet3.toString();
        java.lang.Class<?> wildcardClass9 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
            System.out.format("%n%s%n", "CharSet0.test0295");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.contains('#');
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('4');
        boolean boolean9 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0296");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        boolean boolean4 = charSet0.contains('#');
        boolean boolean6 = charSet0.contains('4');
        boolean boolean8 = charSet0.contains(' ');
        java.lang.String str9 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0297");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str6 = charSet5.toString();
        boolean boolean8 = charSet5.contains(' ');
        java.lang.String str9 = charSet5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[h, i, !]" + "'", str6.equals("[h, i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[h, i, !]" + "'", str9.equals("[h, i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0298");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.contains('#');
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('4');
        java.lang.String str8 = charSet0.toString();
        java.lang.String str9 = charSet0.toString();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0299");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.contains('a');
        java.lang.String str7 = charSet0.toString();
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
            System.out.format("%n%s%n", "CharSet0.test0300");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        java.lang.String str4 = charSet0.toString();
        java.lang.Class<?> wildcardClass5 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0301");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        java.lang.Class<?> wildcardClass8 = charSet7.getClass();
        boolean boolean9 = charSet0.equals((java.lang.Object) charSet7);
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
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0302");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.Class<?> wildcardClass6 = charSet5.getClass();
        boolean boolean7 = charSet4.equals((java.lang.Object) wildcardClass6);
        boolean boolean9 = charSet4.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0303");
        java.lang.String[] strArray5 = new java.lang.String[] { "[0-9]", "[a-z, A-Z]", "[]", "[0-9]", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.Class<?> wildcardClass9 = charSet8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSet0.test0304");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.Class<?> wildcardClass5 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0305");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = charSet3.equals((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass8 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
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
            System.out.format("%n%s%n", "CharSet0.test0306");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet4.equals(obj5);
        java.lang.String str7 = charSet4.toString();
        java.lang.Class<?> wildcardClass8 = charSet4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0307");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.String str9 = charSet8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z, a-z, [, ]]" + "'", str9.equals("[A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0308");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        boolean boolean4 = charSet0.contains(' ');
        boolean boolean6 = charSet0.contains(' ');
        boolean boolean8 = charSet0.contains('#');
        java.lang.String str9 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0309");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains(' ');
        java.lang.Class<?> wildcardClass6 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0310");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        java.lang.String str6 = charSet4.toString();
        boolean boolean8 = charSet4.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0311");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str7 = charSet6.toString();
        java.lang.Object obj8 = null;
        boolean boolean9 = charSet6.equals(obj8);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0312");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean7 = charSet5.contains('#');
        java.lang.Object obj8 = null;
        boolean boolean9 = charSet5.equals(obj8);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0313");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0314");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.equals((java.lang.Object) 10L);
        boolean boolean8 = charSet4.contains(' ');
        java.lang.Class<?> wildcardClass9 = charSet4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0315");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "[0-9]", "[A-Z]", "[a-z]" };
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, h, A-Z, a-z, i, !, [, ]]" + "'", str9.equals("[0-9, h, A-Z, a-z, i, !, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0316");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        boolean boolean7 = charSet0.contains('#');
        boolean boolean9 = charSet0.contains('4');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0317");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.equals((java.lang.Object) 0.0d);
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains(' ');
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
            System.out.format("%n%s%n", "CharSet0.test0318");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.contains('#');
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.equals((java.lang.Object) 0.0d);
        java.lang.String str8 = charSet0.toString();
        java.lang.String str9 = charSet0.toString();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0319");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[h, i, !]" + "'", str9.equals("[h, i, !]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0320");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.String str1 = charSet0.toString();
        java.lang.String[] strArray4 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str6 = charSet5.toString();
        java.lang.Class<?> wildcardClass7 = charSet5.getClass();
        boolean boolean8 = charSet0.equals((java.lang.Object) wildcardClass7);
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z, A-Z]" + "'", str1.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str6.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z, A-Z]" + "'", str9.equals("[a-z, A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0321");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        boolean boolean7 = charSet0.contains('#');
        boolean boolean9 = charSet0.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0322");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0323");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('4');
        java.lang.String str7 = charSet3.toString();
        java.lang.Class<?> wildcardClass8 = charSet3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0324");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str6 = charSet5.toString();
        java.lang.Class<?> wildcardClass7 = charSet5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0325");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean7 = charSet5.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0326");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0327");
        java.lang.String[] strArray3 = new java.lang.String[] { "[a-z, A-Z]", "[,,  , h, a-z, A-Z, [, ], i, !]", "[A-Z]" };
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
            System.out.format("%n%s%n", "CharSet0.test0328");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.contains(' ');
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0329");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Class<?> wildcardClass5 = charSet4.getClass();
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
            System.out.format("%n%s%n", "CharSet0.test0330");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean8 = charSet6.contains('#');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0331");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.contains(' ');
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0332");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.Class<?> wildcardClass7 = charSet6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0333");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean7 = charSet4.equals((java.lang.Object) charSet6);
        boolean boolean9 = charSet6.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0334");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        java.lang.String str6 = charSet4.toString();
        boolean boolean8 = charSet4.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0335");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean9 = charSet7.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0336");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str5 = charSet4.toString();
        boolean boolean6 = charSet2.equals((java.lang.Object) charSet4);
        java.lang.String str7 = charSet4.toString();
        java.lang.String str8 = charSet4.toString();
        java.lang.Class<?> wildcardClass9 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9]" + "'", str5.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9]" + "'", str7.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9]" + "'", str8.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0337");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.contains(' ');
        boolean boolean6 = charSet0.contains('a');
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0338");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains(' ');
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
            System.out.format("%n%s%n", "CharSet0.test0339");
        java.lang.String[] strArray5 = new java.lang.String[] { "[0-9]", "[a-z, A-Z]", "[]", "[0-9]", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSet0.test0340");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 10);
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.equals((java.lang.Object) 0L);
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
            System.out.format("%n%s%n", "CharSet0.test0341");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        java.lang.String str3 = charSet0.toString();
        java.lang.Class<?> wildcardClass4 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0342");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        boolean boolean7 = charSet0.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0343");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0344");
        java.lang.String[] strArray4 = new java.lang.String[] { "[h, i, !]", "[A-Z]", "[A-Z, a-z, [, ]]", "[A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0345");
        java.lang.String[] strArray5 = new java.lang.String[] { "[0-9]", "[a-z, A-Z]", "[]", "[0-9]", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet9 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSet0.test0346");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.String str7 = charSet6.toString();
        java.lang.String str8 = charSet6.toString();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str7.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str8.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0347");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('#');
        java.lang.String str6 = charSet2.toString();
        boolean boolean8 = charSet2.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0348");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0349");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains(' ');
        boolean boolean7 = charSet0.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0350");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
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
            System.out.format("%n%s%n", "CharSet0.test0351");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z]" + "'", str5.equals("[a-z]"));
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
            System.out.format("%n%s%n", "CharSet0.test0352");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean3 = charSet1.contains(' ');
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
            System.out.format("%n%s%n", "CharSet0.test0353");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.contains(' ');
        boolean boolean6 = charSet0.contains('a');
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0354");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains(' ');
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
            System.out.format("%n%s%n", "CharSet0.test0355");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean7 = charSet5.contains('#');
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0356");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        boolean boolean7 = charSet0.contains('4');
        boolean boolean9 = charSet0.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0357");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 1);
        boolean boolean7 = charSet0.contains(' ');
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
            System.out.format("%n%s%n", "CharSet0.test0358");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('a');
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z]" + "'", str6.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0359");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0360");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        boolean boolean4 = charSet0.contains('#');
        boolean boolean6 = charSet0.contains('4');
        boolean boolean8 = charSet0.contains('4');
        java.lang.String str9 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0361");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.contains('#');
        boolean boolean8 = charSet4.contains('#');
        java.lang.Class<?> wildcardClass9 = charSet4.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0362");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.equals((java.lang.Object) (-1L));
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
            System.out.format("%n%s%n", "CharSet0.test0363");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Object obj7 = null;
        boolean boolean8 = charSet6.equals(obj7);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0364");
        java.lang.String[] strArray4 = new java.lang.String[] { "[h, i, !]", "[A-Z]", "[A-Z, a-z, [, ]]", "[A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0365");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('4');
        boolean boolean7 = charSet2.contains('#');
        java.lang.String str8 = charSet2.toString();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0366");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('4');
        boolean boolean7 = charSet3.contains('4');
        java.lang.String str8 = charSet3.toString();
        java.lang.String str9 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0367");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('a');
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
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0368");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) 1L);
        boolean boolean6 = charSet0.contains('4');
        java.lang.String str7 = charSet0.toString();
        boolean boolean9 = charSet0.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0369");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean7 = charSet5.contains('#');
        boolean boolean8 = charSet0.equals((java.lang.Object) charSet5);
        java.lang.String str9 = charSet5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0370");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean3 = charSet1.contains(' ');
        boolean boolean5 = charSet1.equals((java.lang.Object) 0.0d);
        java.lang.String str6 = charSet1.toString();
        java.lang.String str7 = charSet1.toString();
        java.lang.Class<?> wildcardClass8 = charSet1.getClass();
        boolean boolean9 = charSet0.equals((java.lang.Object) wildcardClass8);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0371");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('a');
        java.lang.String str6 = charSet3.toString();
        java.lang.String str7 = charSet3.toString();
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
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0372");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.Class<?> wildcardClass4 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0373");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0374");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0375");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 10);
        boolean boolean7 = charSet0.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0376");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0377");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        boolean boolean4 = charSet1.contains(' ');
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
            System.out.format("%n%s%n", "CharSet0.test0378");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains(' ');
        boolean boolean7 = charSet0.contains('a');
        boolean boolean9 = charSet0.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0379");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        boolean boolean2 = charSet0.contains('a');
        java.lang.String str3 = charSet0.toString();
        java.lang.Class<?> wildcardClass4 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z, A-Z]" + "'", str3.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0380");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        java.lang.Class<?> wildcardClass4 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[A-Z]" + "'", str1.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[A-Z]" + "'", str2.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[A-Z]" + "'", str3.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0381");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z, a-z, [, ]]" + "'", str8.equals("[A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0382");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean4 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.Class<?> wildcardClass5 = charSet3.getClass();
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
            System.out.format("%n%s%n", "CharSet0.test0383");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.String str7 = charSet6.toString();
        boolean boolean9 = charSet6.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0384");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains(' ');
        java.lang.String str6 = charSet3.toString();
        java.lang.Class<?> wildcardClass7 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str6.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0385");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) (short) -1);
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0386");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "[0-9]", "[A-Z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        java.lang.String str8 = charSet7.toString();
        java.lang.Class<?> wildcardClass9 = charSet7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, h, A-Z, a-z, i, !, [, ]]" + "'", str8.equals("[0-9, h, A-Z, a-z, i, !, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0387");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        java.lang.Object obj3 = null;
        boolean boolean4 = charSet0.equals(obj3);
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
            System.out.format("%n%s%n", "CharSet0.test0388");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
            System.out.format("%n%s%n", "CharSet0.test0389");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        boolean boolean7 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0390");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str7.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0391");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Object obj7 = null;
        boolean boolean8 = charSet6.equals(obj7);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0392");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.contains('#');
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.equals((java.lang.Object) 0.0d);
        java.lang.String str8 = charSet0.toString();
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0393");
        java.lang.String[] strArray5 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[h, i, !]", "[h, i, !]", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0394");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains(' ');
        boolean boolean7 = charSet3.contains('#');
        boolean boolean9 = charSet3.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
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
            System.out.format("%n%s%n", "CharSet0.test0395");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str3 = charSet2.toString();
        java.lang.String str4 = charSet2.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean7 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0396");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str8 = charSet7.toString();
        java.lang.Class<?> wildcardClass9 = charSet7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[h, i, !]" + "'", str8.equals("[h, i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0397");
        java.lang.String[] strArray5 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[h, i, !]", "[h, i, !]", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.String str9 = charSet8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSet0.test0398");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.Object obj3 = null;
        boolean boolean4 = charSet2.equals(obj3);
        boolean boolean6 = charSet2.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0399");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str6 = charSet5.toString();
        boolean boolean8 = charSet5.contains(' ');
        java.lang.Class<?> wildcardClass9 = charSet5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[h, i, !]" + "'", str6.equals("[h, i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0400");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean8 = charSet6.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0401");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains(' ');
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0402");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str4 = charSet3.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) str4);
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0403");
        java.lang.String[] strArray5 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[h, i, !]", "[h, i, !]", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet9 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSet0.test0404");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean7 = charSet5.contains('4');
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0405");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.equals((java.lang.Object) (byte) 0);
        java.lang.String str6 = charSet3.toString();
        boolean boolean8 = charSet3.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0406");
        java.lang.String[] strArray5 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[h, i, !]", "[h, i, !]", "[a-z, A-Z]" };
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0407");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
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
            System.out.format("%n%s%n", "CharSet0.test0408");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean7 = charSet0.equals((java.lang.Object) charSet6);
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
        org.junit.Assert.assertNotNull(charSet6);
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
            System.out.format("%n%s%n", "CharSet0.test0409");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        java.lang.String str3 = charSet1.toString();
        boolean boolean5 = charSet1.contains('a');
        java.lang.Class<?> wildcardClass6 = charSet1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0410");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean7 = charSet5.contains('4');
        boolean boolean9 = charSet5.equals((java.lang.Object) ' ');
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
            System.out.format("%n%s%n", "CharSet0.test0411");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        java.lang.String str6 = charSet4.toString();
        boolean boolean8 = charSet4.contains(' ');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0412");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains(' ');
        boolean boolean8 = charSet0.contains('4');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0413");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains(' ');
        boolean boolean8 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0414");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 10);
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
            System.out.format("%n%s%n", "CharSet0.test0415");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        boolean boolean2 = charSet0.contains('a');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z, A-Z]" + "'", str3.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z, A-Z]" + "'", str4.equals("[a-z, A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0416");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean5 = charSet0.equals((java.lang.Object) strArray3);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0417");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str3 = charSet2.toString();
        java.lang.String str4 = charSet2.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean7 = charSet0.contains('a');
        boolean boolean9 = charSet0.contains(' ');
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
            System.out.format("%n%s%n", "CharSet0.test0418");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, ,,  , A-Z, a-z, [, i, !, ]]", "[0-9, ,,  , a-z, A-Z, [, ]]", "hi!" };
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
            System.out.format("%n%s%n", "CharSet0.test0419");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
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
            System.out.format("%n%s%n", "CharSet0.test0420");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0421");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str2 = charSet1.toString();
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean6 = charSet1.equals((java.lang.Object) charSet3);
        boolean boolean7 = charSet0.equals((java.lang.Object) charSet3);
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0422");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('4');
        java.lang.String str6 = charSet2.toString();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0423");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('a');
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('#');
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0424");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet0.toString();
        java.lang.Class<?> wildcardClass5 = charSet0.getClass();
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
            System.out.format("%n%s%n", "CharSet0.test0425");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 10);
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
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
            System.out.format("%n%s%n", "CharSet0.test0426");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 10);
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
            System.out.format("%n%s%n", "CharSet0.test0427");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 10);
        boolean boolean7 = charSet0.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0428");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
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
            System.out.format("%n%s%n", "CharSet0.test0429");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.contains('#');
        boolean boolean8 = charSet4.contains('#');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0430");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('#');
        boolean boolean7 = charSet2.contains('4');
        java.lang.String str8 = charSet2.toString();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[A-Z]" + "'", str8.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0431");
        java.lang.String[] strArray3 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[A-Z]" };
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
            System.out.format("%n%s%n", "CharSet0.test0432");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str3 = charSet2.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) str3);
        java.lang.Class<?> wildcardClass5 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0433");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0434");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.equals((java.lang.Object) 0.0d);
        java.lang.String str5 = charSet0.toString();
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains(' ');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0435");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('#');
        java.lang.String str6 = charSet2.toString();
        boolean boolean8 = charSet2.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0436");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean3 = charSet1.contains(' ');
        java.lang.String str4 = charSet1.toString();
        java.lang.Class<?> wildcardClass5 = charSet1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0437");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains(' ');
        boolean boolean5 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0438");
        java.lang.String[] strArray5 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[h, i, !]", "[h, i, !]", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.String str7 = charSet6.toString();
        java.lang.String str8 = charSet6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str7.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str8.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0439");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        boolean boolean9 = charSet3.equals((java.lang.Object) charSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0440");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.Class<?> wildcardClass9 = charSet8.getClass();
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
            System.out.format("%n%s%n", "CharSet0.test0441");
        java.lang.String[] strArray5 = new java.lang.String[] { "[A-Z]", "[A-Z]", "[A-Z]", "[a-z]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSet0.test0442");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 10);
        java.lang.String str6 = charSet0.toString();
        java.lang.String str7 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[A-Z]" + "'", str7.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0443");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[,,  , h, a-z, A-Z, [, ], i, !]" + "'", str7.equals("[,,  , h, a-z, A-Z, [, ], i, !]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0444");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet0.toString();
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0445");
        java.lang.String[] strArray5 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[h, i, !]", "[h, i, !]", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSet0.test0446");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0447");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str5 = charSet4.toString();
        boolean boolean6 = charSet2.equals((java.lang.Object) charSet4);
        boolean boolean8 = charSet2.equals((java.lang.Object) 100L);
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
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9]" + "'", str5.equals("[0-9]"));
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
            System.out.format("%n%s%n", "CharSet0.test0448");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains(' ');
        boolean boolean7 = charSet0.contains('4');
        java.lang.Object obj8 = null;
        boolean boolean9 = charSet0.equals(obj8);
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
            System.out.format("%n%s%n", "CharSet0.test0449");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
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
            System.out.format("%n%s%n", "CharSet0.test0450");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains(' ');
        boolean boolean5 = charSet0.contains('#');
        boolean boolean7 = charSet0.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z, A-Z]" + "'", str1.equals("[a-z, A-Z]"));
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
            System.out.format("%n%s%n", "CharSet0.test0451");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str6 = charSet5.toString();
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean8 = charSet5.equals((java.lang.Object) charSet7);
        boolean boolean9 = charSet0.equals((java.lang.Object) charSet5);
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0452");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        java.lang.Object obj3 = null;
        boolean boolean4 = charSet0.equals(obj3);
        java.lang.String str5 = charSet0.toString();
        boolean boolean7 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0453");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) 10L);
        boolean boolean5 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0454");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('a');
        java.lang.String str7 = charSet3.toString();
        boolean boolean9 = charSet3.contains('4');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0455");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('a');
        boolean boolean7 = charSet2.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0456");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains(' ');
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
            System.out.format("%n%s%n", "CharSet0.test0457");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        boolean boolean4 = charSet1.contains(' ');
        java.lang.String str5 = charSet1.toString();
        java.lang.Class<?> wildcardClass6 = charSet1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0458");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
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
            System.out.format("%n%s%n", "CharSet0.test0459");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        boolean boolean4 = charSet0.contains(' ');
        java.lang.String str5 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0460");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str5.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0461");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet0.equals((java.lang.Object) 10);
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
            System.out.format("%n%s%n", "CharSet0.test0462");
        java.lang.String[] strArray4 = new java.lang.String[] { "[h, i, !]", "[A-Z]", "[A-Z, a-z, [, ]]", "[A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0463");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str4 = charSet3.toString();
        java.lang.String str5 = charSet3.toString();
        boolean boolean6 = charSet0.equals((java.lang.Object) charSet3);
        boolean boolean8 = charSet3.contains('a');
        java.lang.Class<?> wildcardClass9 = charSet3.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0464");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        java.lang.String str6 = charSet5.toString();
        boolean boolean8 = charSet5.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0465");
        java.lang.String[] strArray4 = new java.lang.String[] { "[h, i, !]", "[A-Z]", "[A-Z, a-z, [, ]]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean7 = charSet5.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0466");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains(' ');
        java.lang.String str6 = charSet0.toString();
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0467");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.equals((java.lang.Object) (byte) 0);
        boolean boolean7 = charSet3.contains('4');
        java.lang.String str8 = charSet3.toString();
        java.lang.String str9 = charSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str8.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0468");
        java.lang.String[] strArray4 = new java.lang.String[] { "[h, i, !]", "[A-Z]", "[A-Z, a-z, [, ]]", "[A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0469");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z]", "[h, i, !]", "hi!", "[a-z, A-Z]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean7 = charSet5.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0470");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.equals((java.lang.Object) 100);
        boolean boolean8 = charSet3.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str9.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0471");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.Object obj5 = null;
        boolean boolean6 = charSet4.equals(obj5);
        java.lang.String str7 = charSet4.toString();
        boolean boolean9 = charSet4.contains('a');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0472");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean5 = charSet3.contains('4');
        boolean boolean7 = charSet3.contains(' ');
        boolean boolean9 = charSet3.contains('4');
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0473");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) 10L);
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
            System.out.format("%n%s%n", "CharSet0.test0474");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0475");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) 1L);
        boolean boolean6 = charSet0.contains('4');
        java.lang.String str7 = charSet0.toString();
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0476");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.equals((java.lang.Object) 10L);
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str4 = charSet3.toString();
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean6 = charSet3.equals((java.lang.Object) charSet5);
        java.lang.String str7 = charSet5.toString();
        boolean boolean8 = charSet0.equals((java.lang.Object) str7);
        java.lang.String str9 = charSet0.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[A-Z]" + "'", str9.equals("[A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0477");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        java.lang.String str2 = charSet1.toString();
        boolean boolean4 = charSet1.equals((java.lang.Object) 10L);
        java.lang.String str5 = charSet1.toString();
        java.lang.Class<?> wildcardClass6 = charSet1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0478");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean6 = charSet4.contains('#');
        java.lang.String str7 = charSet4.toString();
        java.lang.Class<?> wildcardClass8 = charSet4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0479");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean5 = charSet3.contains('4');
        boolean boolean7 = charSet3.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0480");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
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
            System.out.format("%n%s%n", "CharSet0.test0481");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.equals((java.lang.Object) (-1L));
        boolean boolean8 = charSet0.contains('#');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0482");
        java.lang.String[] strArray5 = new java.lang.String[] { "[h, i, !]", "[0-9, ,,  , a-z, A-Z, [, ]]", "[h, i, !]", "[h, i, !]", "[a-z, A-Z]" };
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]" + "'", str8.equals("[0-9, h, ,,  , a-z, A-Z, [, i, !, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0483");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains(' ');
        boolean boolean4 = charSet0.contains(' ');
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
            System.out.format("%n%s%n", "CharSet0.test0484");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "[a-z]", "[0-9, ,,  , A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray3);
        boolean boolean6 = charSet4.contains(' ');
        boolean boolean8 = charSet4.contains('a');
        java.lang.String str9 = charSet4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0-9, ,,  , a-z, A-Z, [, ]]" + "'", str9.equals("[0-9, ,,  , a-z, A-Z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0485");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean6 = charSet4.contains('#');
        boolean boolean8 = charSet4.contains('a');
        boolean boolean9 = charSet3.equals((java.lang.Object) charSet4);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0486");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('#');
        java.lang.Class<?> wildcardClass7 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9, ,,  , A-Z, a-z, [, ]]" + "'", str4.equals("[0-9, ,,  , A-Z, a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0487");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('#');
        java.lang.String str6 = charSet2.toString();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[A-Z]" + "'", str6.equals("[A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0488");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        java.lang.String str4 = charSet2.toString();
        boolean boolean6 = charSet2.contains('4');
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
            System.out.format("%n%s%n", "CharSet0.test0489");
        java.lang.String[] strArray2 = new java.lang.String[] { "[A-Z, a-z, [, ]]", "[0-9]" };
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
            System.out.format("%n%s%n", "CharSet0.test0490");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str4 = charSet3.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) str4);
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0491");
        java.lang.String[] strArray2 = new java.lang.String[] { "[a-z, A-Z]", "[h, i, !]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        boolean boolean7 = charSet5.contains('#');
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0492");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        boolean boolean2 = charSet0.contains('#');
        boolean boolean4 = charSet0.contains('#');
        boolean boolean6 = charSet0.contains('4');
        boolean boolean8 = charSet0.contains('#');
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
            System.out.format("%n%s%n", "CharSet0.test0493");
        java.lang.String[] strArray2 = new java.lang.String[] { "[0-9]", "[A-Z, a-z, [, ]]" };
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
            System.out.format("%n%s%n", "CharSet0.test0494");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.contains('a');
        boolean boolean5 = charSet0.contains(' ');
        boolean boolean7 = charSet0.contains('#');
        java.lang.String str8 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
            System.out.format("%n%s%n", "CharSet0.test0495");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        boolean boolean4 = charSet0.equals((java.lang.Object) 1L);
        boolean boolean6 = charSet0.contains('4');
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0496");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('a');
        boolean boolean4 = charSet0.contains('4');
        boolean boolean6 = charSet0.equals((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass7 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
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
            System.out.format("%n%s%n", "CharSet0.test0497");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.String str1 = charSet0.toString();
        org.apache.commons.lang3.CharSet charSet2 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean3 = charSet0.equals((java.lang.Object) charSet2);
        boolean boolean5 = charSet2.contains('a');
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
            System.out.format("%n%s%n", "CharSet0.test0498");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        boolean boolean3 = charSet1.contains(' ');
        boolean boolean5 = charSet1.contains(' ');
        java.lang.Class<?> wildcardClass6 = charSet1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
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
            System.out.format("%n%s%n", "CharSet0.test0499");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.contains('4');
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('a');
        java.lang.String str7 = charSet0.toString();
        java.lang.String str8 = charSet0.toString();
        java.lang.Class<?> wildcardClass9 = charSet0.getClass();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z]" + "'", str8.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test0500");
        java.lang.String[] strArray4 = new java.lang.String[] { "[a-z, A-Z]", "[0-9, h, A-Z, a-z, i, !, [, ]]", "[A-Z]", "[A-Z, a-z, [, ]]" };
        org.apache.commons.lang3.CharSet charSet5 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray4);
        boolean boolean9 = charSet7.equals((java.lang.Object) "[0-9]");
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
}

