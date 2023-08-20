package MutablePair;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutablePair0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test01");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.right = "";
        charSequenceMutablePair0.setLeft((java.lang.CharSequence) "hi!");
        charSequenceMutablePair0.right = "";
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test02");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.Object> charSequenceMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.Object>((java.lang.CharSequence) "", (java.lang.Object) "hi!");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test03");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str1 = charSequenceMutablePair0.right;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str3 = charSequenceMutablePair2.right;
        int int4 = charSequenceMutablePair0.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String>) charSequenceMutablePair2);
        boolean boolean6 = charSequenceMutablePair0.equals((java.lang.Object) 100);
        java.lang.String str8 = charSequenceMutablePair0.toString("");
        java.lang.CharSequence charSequence9 = charSequenceMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test04");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.right = "";
        java.lang.CharSequence charSequence3 = charSequenceMutablePair0.left;
        java.lang.String str4 = charSequenceMutablePair0.getRight();
        charSequenceMutablePair0.left = "";
        boolean boolean8 = charSequenceMutablePair0.equals((java.lang.Object) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test05");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str1 = charSequenceMutablePair0.getValue();
        charSequenceMutablePair0.setRight("");
        java.lang.String str5 = charSequenceMutablePair0.toString("hi!");
        java.lang.String str7 = charSequenceMutablePair0.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test06");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str1 = charSequenceMutablePair0.getValue();
        charSequenceMutablePair0.setRight("");
        java.lang.CharSequence charSequence4 = charSequenceMutablePair0.getKey();
        java.lang.CharSequence charSequence5 = charSequenceMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test07");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str1 = charSequenceMutablePair0.getValue();
        charSequenceMutablePair0.setRight("");
        charSequenceMutablePair0.left = "hi!";
        java.lang.String str6 = charSequenceMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test08");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.right = "";
        java.lang.CharSequence charSequence3 = charSequenceMutablePair0.left;
        java.lang.String str4 = charSequenceMutablePair0.right;
        java.lang.Class<?> wildcardClass5 = charSequenceMutablePair0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test09");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.right = "";
        java.lang.String str3 = charSequenceMutablePair0.getRight();
        java.lang.String str5 = charSequenceMutablePair0.setValue("hi!");
        java.lang.CharSequence charSequence6 = charSequenceMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test10");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str1 = charSequenceMutablePair0.right;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str3 = charSequenceMutablePair2.right;
        int int4 = charSequenceMutablePair0.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String>) charSequenceMutablePair2);
        java.lang.String str5 = charSequenceMutablePair0.getValue();
        java.lang.CharSequence charSequence6 = charSequenceMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test11");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.right = "";
        java.lang.CharSequence charSequence3 = charSequenceMutablePair0.left;
        java.lang.String str4 = charSequenceMutablePair0.getRight();
        charSequenceMutablePair0.left = "";
        charSequenceMutablePair0.setRight("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test12");
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.Object> objPair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Object) (short) 10, (java.lang.Object) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPair2);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test13");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str1 = charSequenceMutablePair0.getValue();
        charSequenceMutablePair0.setRight("");
        charSequenceMutablePair0.setRight("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test14");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>((java.lang.CharSequence) "", "");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test15");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.right = "";
        java.lang.String str3 = charSequenceMutablePair0.getRight();
        java.lang.String str5 = charSequenceMutablePair0.setValue("hi!");
        java.lang.String str7 = charSequenceMutablePair0.toString("");
        java.lang.String str9 = charSequenceMutablePair0.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test16");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str1 = charSequenceMutablePair0.getValue();
        charSequenceMutablePair0.setRight("");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair4 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str5 = charSequenceMutablePair4.getValue();
        java.lang.Object obj6 = null;
        boolean boolean7 = charSequenceMutablePair4.equals(obj6);
        java.lang.Class<?> wildcardClass8 = charSequenceMutablePair4.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableMutablePair9 = org.apache.commons.lang3.tuple.MutablePair.of((java.io.Serializable) charSequenceMutablePair0, (java.lang.reflect.AnnotatedElement) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableMutablePair9);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test17");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.right = "hi!";
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test18");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.right = "";
        java.lang.CharSequence charSequence3 = charSequenceMutablePair0.left;
        java.lang.String str4 = charSequenceMutablePair0.right;
        java.lang.String str5 = charSequenceMutablePair0.right;
        java.lang.String str6 = charSequenceMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test19");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str1 = charSequenceMutablePair0.getValue();
        java.lang.Object obj2 = null;
        boolean boolean3 = charSequenceMutablePair0.equals(obj2);
        java.lang.Class<?> wildcardClass4 = charSequenceMutablePair0.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str6 = charSequenceMutablePair5.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String>> genericDeclarationMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.reflect.GenericDeclaration) wildcardClass4, (org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String>) charSequenceMutablePair5);
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationMutablePair9 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.reflect.GenericDeclaration) wildcardClass4, (java.lang.Comparable<java.lang.String>) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationMutablePair9);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test20");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.right = "";
        java.lang.CharSequence charSequence3 = charSequenceMutablePair0.left;
        java.lang.String str4 = charSequenceMutablePair0.getRight();
        charSequenceMutablePair0.left = "";
        charSequenceMutablePair0.left = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test21");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str1 = charSequenceMutablePair0.right;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str3 = charSequenceMutablePair2.right;
        int int4 = charSequenceMutablePair0.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String>) charSequenceMutablePair2);
        charSequenceMutablePair0.right = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test22");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.right = "";
        java.lang.String str3 = charSequenceMutablePair0.getRight();
        java.lang.String str5 = charSequenceMutablePair0.setValue("hi!");
        java.lang.String str7 = charSequenceMutablePair0.toString("");
        java.lang.String str8 = charSequenceMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test23");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str1 = charSequenceMutablePair0.right;
        java.lang.String str3 = charSequenceMutablePair0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test24");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str1 = charSequenceMutablePair0.getValue();
        java.lang.String str2 = charSequenceMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null)" + "'", str2.equals("(null,null)"));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test25");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str1 = charSequenceMutablePair0.right;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str3 = charSequenceMutablePair2.right;
        int int4 = charSequenceMutablePair0.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String>) charSequenceMutablePair2);
        boolean boolean6 = charSequenceMutablePair0.equals((java.lang.Object) 100);
        java.lang.CharSequence charSequence7 = charSequenceMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test26");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.right = "";
        java.lang.CharSequence charSequence3 = charSequenceMutablePair0.left;
        java.lang.String str4 = charSequenceMutablePair0.getRight();
        charSequenceMutablePair0.setRight("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test27");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.right = "";
        java.lang.CharSequence charSequence3 = charSequenceMutablePair0.left;
        java.lang.String str4 = charSequenceMutablePair0.getRight();
        charSequenceMutablePair0.left = "";
        charSequenceMutablePair0.right = "hi!";
        java.lang.String str9 = charSequenceMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test28");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.setLeft((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test29");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str1 = charSequenceMutablePair0.right;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair2 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str3 = charSequenceMutablePair2.right;
        int int4 = charSequenceMutablePair0.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String>) charSequenceMutablePair2);
        boolean boolean6 = charSequenceMutablePair0.equals((java.lang.Object) 100);
        java.lang.String str7 = charSequenceMutablePair0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null)" + "'", str7.equals("(null,null)"));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test30");
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String> charSequencePair0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair1.right = "";
        java.lang.CharSequence charSequence4 = charSequenceMutablePair1.left;
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String>, org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String>> charSequencePairPair5 = org.apache.commons.lang3.tuple.Pair.of(charSequencePair0, (org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String>) charSequenceMutablePair1);
        charSequenceMutablePair1.right = "";
        charSequenceMutablePair1.setLeft((java.lang.CharSequence) "(null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePairPair5);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test31");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.right = "";
        java.lang.String str3 = charSequenceMutablePair0.getRight();
        java.lang.String str5 = charSequenceMutablePair0.toString("");
        java.lang.String str6 = charSequenceMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test32");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.right = "";
        java.lang.String str3 = charSequenceMutablePair0.getRight();
        java.lang.String str5 = charSequenceMutablePair0.toString("");
        java.lang.String str6 = charSequenceMutablePair0.getRight();
        java.lang.String str7 = charSequenceMutablePair0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test33");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.right = "";
        java.lang.CharSequence charSequence3 = charSequenceMutablePair0.left;
        java.lang.String str4 = charSequenceMutablePair0.getRight();
        java.lang.String str5 = charSequenceMutablePair0.getRight();
        java.lang.CharSequence charSequence6 = charSequenceMutablePair0.left;
        java.lang.CharSequence charSequence7 = charSequenceMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test34");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.lang.String> serializablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.io.Serializable) charSequenceMutablePair0, "");
        charSequenceMutablePair0.right = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializablePair2);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test35");
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String> charSequencePair0 = null;
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair1 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair1.right = "";
        java.lang.CharSequence charSequence4 = charSequenceMutablePair1.left;
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String>, org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String>> charSequencePairPair5 = org.apache.commons.lang3.tuple.Pair.of(charSequencePair0, (org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String>) charSequenceMutablePair1);
        charSequenceMutablePair1.setRight("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePairPair5);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test36");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str1 = charSequenceMutablePair0.getValue();
        java.lang.Object obj2 = null;
        boolean boolean3 = charSequenceMutablePair0.equals(obj2);
        java.lang.Class<?> wildcardClass4 = charSequenceMutablePair0.getClass();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair5 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str6 = charSequenceMutablePair5.getValue();
        org.apache.commons.lang3.tuple.MutablePair<java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String>> genericDeclarationMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of((java.lang.reflect.GenericDeclaration) wildcardClass4, (org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String>) charSequenceMutablePair5);
        java.lang.CharSequence charSequence8 = charSequenceMutablePair5.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationMutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test37");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.right = "";
        java.lang.String str4 = charSequenceMutablePair0.toString("");
        java.lang.CharSequence charSequence5 = charSequenceMutablePair0.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test38");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.right = "";
        java.lang.String str3 = charSequenceMutablePair0.getRight();
        java.lang.String str4 = charSequenceMutablePair0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test39");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.right = "";
        java.lang.CharSequence charSequence3 = charSequenceMutablePair0.left;
        java.lang.String str4 = charSequenceMutablePair0.getRight();
        charSequenceMutablePair0.left = "";
        java.lang.CharSequence charSequence7 = charSequenceMutablePair0.getKey();
        java.lang.CharSequence charSequence8 = charSequenceMutablePair0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test40");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        java.lang.String str1 = charSequenceMutablePair0.getValue();
        java.lang.String str3 = charSequenceMutablePair0.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutablePair0.test41");
        org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String> charSequenceMutablePair0 = new org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>();
        charSequenceMutablePair0.right = "";
        charSequenceMutablePair0.setLeft((java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceMutablePair0.right;
        org.apache.commons.lang3.tuple.MutablePair<org.apache.commons.lang3.tuple.MutablePair<java.lang.CharSequence, java.lang.String>, java.lang.CharSequence> charSequenceMutablePairMutablePair7 = org.apache.commons.lang3.tuple.MutablePair.of(charSequenceMutablePair0, (java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceMutablePairMutablePair7);
    }
}

