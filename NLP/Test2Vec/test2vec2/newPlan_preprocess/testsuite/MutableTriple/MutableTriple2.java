package MutableTriple;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableTriple2 {

    public static boolean debug = false;

    @Test
    public void MutableTriple1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1001");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        objMutableTriple0.middle = "(null,null,null)";
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1002");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj5 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutableTriple1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1003");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.Object obj5 = objMutableTriple3.left;
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,hi!,null)");
        java.lang.CharSequence charSequence8 = objMutableTriple3.right;
        java.lang.CharSequence charSequence9 = objMutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 1 + "'", obj5.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!,null)" + "'", charSequence8.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,hi!,null)" + "'", charSequence9.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1004");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.String, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> genericDeclarationMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.String, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) genericDeclarationMutableTriple0, (java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))", (java.lang.CharSequence) "(1,null,(null,null,(null,,null)))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(1,(null,hi!,null),(null,null,(null,hi!,null)))" + "'", charSequence4.equals("(1,(null,hi!,null),(null,null,(null,hi!,null)))"));
    }

    @Test
    public void MutableTriple1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1005");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.middle = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence7 = objMutableTriple3.middle;
        java.lang.CharSequence charSequence8 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,,null)" + "'", charSequence8.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1006");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,(null,null,null),null)");
        objMutableTriple7.setMiddle((java.lang.CharSequence) "(1.0,(null,(null,null,null),null),(null,(null,null,null),null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutableTriple1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1007");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.Object obj6 = objMutableTriple0.left;
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.String str8 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,hi!)" + "'", str8.equals("(null,null,hi!)"));
    }

    @Test
    public void MutableTriple1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1008");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.right = "(null,null,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void MutableTriple1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1009");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence4 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null,null)" + "'", str2.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutableTriple1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1010");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj3 = objMutableTriple2.getLeft();
        java.lang.Object obj4 = objMutableTriple2.getLeft();
        java.lang.Object obj5 = objMutableTriple2.left;
        java.lang.String str6 = objMutableTriple2.toString();
        java.lang.Object obj7 = objMutableTriple2.getLeft();
        java.lang.CharSequence charSequence8 = objMutableTriple2.middle;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> strMutableTriple9 = org.apache.commons.lang3.tuple.MutableTriple.of("hi!", (java.lang.Comparable<java.lang.String>) "(null,,null)", objMutableTriple2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null,null)" + "'", str6.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMutableTriple9);
    }

    @Test
    public void MutableTriple1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1011");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.left = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "(null,null,(null,,null))" + "'", obj7.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void MutableTriple1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1012");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) charSequence4, (java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))", (java.lang.CharSequence) "(null,(1.0,hi!,(null,,null)),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null,null)" + "'", str2.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutableTriple1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1013");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "(null,null,(null,,null))";
        java.lang.Object obj8 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1 + "'", obj8.equals(1));
    }

    @Test
    public void MutableTriple1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1014");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.Object obj5 = objMutableTriple0.getLeft();
        java.lang.Object obj6 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null,null)" + "'", str4.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutableTriple1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1015");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple9 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,,null)", (java.lang.CharSequence) "(1,null,(null,null,(null,,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
    }

    @Test
    public void MutableTriple1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1016");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
        java.lang.Object obj8 = objMutableTriple0.getLeft();
        java.lang.Class<?> wildcardClass9 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1 + "'", obj8.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1017");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1,null,(null,null,(null,,null)))");
        objMutableTriple3.middle = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableTriple1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1018");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj4 = objMutableTriple3.left;
        java.lang.CharSequence charSequence5 = objMutableTriple3.getMiddle();
        java.lang.Object obj6 = objMutableTriple3.left;
        java.lang.CharSequence charSequence7 = objMutableTriple3.middle;
        objMutableTriple3.middle = "(1,null,(null,null,(null,,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1019");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence5 = objMutableTriple0.middle;
        java.lang.String str6 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null,null)" + "'", str4.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null,null)" + "'", str6.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1020");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1021");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.left = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        objMutableTriple0.middle = "((null,null,null),(1,(null,hi!,null),(null,null,(null,hi!,null))),(1,null,(null,null,(null,,null))))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
    }

    @Test
    public void MutableTriple1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1022");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.getMiddle();
        java.lang.Object obj4 = objMutableTriple2.left;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> strComparableMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>((java.lang.Comparable<java.lang.String>) "(1.0,null,hi!)", (java.lang.CharSequence) "(,(null,null,(null,,null)),(null,hi!,null))", (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple2);
        objMutableTriple2.middle = "(null,hi!,(null,null,null))";
        java.lang.CharSequence charSequence8 = objMutableTriple2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1023");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        objMutableTriple3.right = "(1,null,(null,null,(null,,null)))";
        java.lang.CharSequence charSequence6 = objMutableTriple3.getMiddle();
        java.lang.String str7 = objMutableTriple3.toString();
        objMutableTriple3.setRight((java.lang.CharSequence) "(1,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null,(null,,null))" + "'", charSequence6.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))" + "'", str7.equals("(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))"));
    }

    @Test
    public void MutableTriple1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1024");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.Object obj5 = objMutableTriple0.left;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,(null,hi!,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void MutableTriple1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1025");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        objMutableTriple0.middle = "((null,null,(null,hi!,null)),(null,null,null),(null,null,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1026");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj4 = objMutableTriple3.left;
        java.lang.CharSequence charSequence5 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,,null)" + "'", charSequence5.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1027");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        java.lang.String str5 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,null)" + "'", str5.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1028");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        java.lang.Object obj2 = objMutableTriple0.left;
        objMutableTriple0.right = "(null,(null,,(null,,null)),null)";
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,(null,(null,,(null,,null)),null))" + "'", str5.equals("(null,null,(null,(null,,(null,,null)),null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,(null,,(null,,null)),null)" + "'", charSequence6.equals("(null,(null,,(null,,null)),null)"));
    }

    @Test
    public void MutableTriple1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1029");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        objMutableTriple0.right = "(null,(null,null,(null,,null)),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
    }

    @Test
    public void MutableTriple1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1030");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str3 = objMutableTriple0.toString();
        objMutableTriple0.right = "(null,hi!,hi!)";
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.Object obj7 = objMutableTriple0.left;
        java.lang.Class<?> wildcardClass8 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null,null)" + "'", str3.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1031");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        java.lang.Object obj4 = objMutableTriple0.left;
        java.lang.CharSequence charSequence5 = objMutableTriple0.middle;
        objMutableTriple0.middle = "(null,(null,,null),null)";
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!,null)" + "'", charSequence8.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1032");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        objMutableTriple3.middle = "hi!";
        java.lang.String str7 = objMutableTriple3.toString("hi!");
        java.lang.Class<?> wildcardClass8 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1033");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.right;
        java.lang.Object obj6 = objMutableTriple1.left;
        objMutableTriple1.setMiddle((java.lang.CharSequence) "(null,(null,,(null,,null)),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutableTriple1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1034");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        objMutableTriple0.middle = "(null,null,null)";
        java.lang.String str7 = objMutableTriple0.toString();
        java.lang.Object obj8 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,(null,null,null),null)" + "'", str7.equals("(null,(null,null,null),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1035");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        java.lang.Object obj2 = objMutableTriple0.left;
        objMutableTriple0.right = "(null,null,(null,hi!,null))";
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,null,(null,hi!,null))" + "'", charSequence5.equals("(null,null,(null,hi!,null))"));
    }

    @Test
    public void MutableTriple1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1036");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void MutableTriple1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1037");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,(null,null,(null,,null)))");
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null,(null,null,(null,,null)))" + "'", charSequence6.equals("(null,null,(null,null,(null,,null)))"));
    }

    @Test
    public void MutableTriple1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1038");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.left = "(null,null,(null,,null))";
        java.lang.Class<?> wildcardClass6 = objMutableTriple0.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.String, java.lang.Comparable<java.lang.String>> typeMutableTriple9 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.String, java.lang.Comparable<java.lang.String>>((java.lang.reflect.Type) wildcardClass6, "", (java.lang.Comparable<java.lang.String>) "(1.0,hi!,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableTriple1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1039");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.String str3 = objMutableTriple0.toString("");
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1040");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.left = "(null,null,(null,,null))";
        java.lang.Object obj6 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "(null,null,(null,,null))" + "'", obj6.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1041");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1,null,null)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1,(null,hi!,null),(null,,(null,,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableTriple1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1042");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.middle = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence7 = objMutableTriple3.middle;
        objMutableTriple3.middle = "(null,(null,,null),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1043");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
    }

    @Test
    public void MutableTriple1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1044");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.left = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        objMutableTriple0.right = "(null,,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1045");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.Object obj6 = objMutableTriple0.getLeft();
        // The following exception was thrown during execution in MutableTriple generation
        try {
            java.lang.Class<?> wildcardClass7 = obj6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutableTriple1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1046");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.right = "(null,null,(null,,null))";
        java.lang.Object obj6 = objMutableTriple0.left;
        java.lang.String str7 = objMutableTriple0.toString();
        java.lang.Object obj8 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1,null,(null,null,(null,,null)))" + "'", str7.equals("(1,null,(null,null,(null,,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1 + "'", obj8.equals(1));
    }

    @Test
    public void MutableTriple1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1047");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj2 = objMutableTriple1.getLeft();
        java.lang.CharSequence charSequence3 = objMutableTriple1.getRight();
        objMutableTriple1.left = "(null,,null)";
        java.lang.CharSequence charSequence6 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.Triple<java.lang.String, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> strTriple8 = org.apache.commons.lang3.tuple.Triple.of("(,(null,null,(null,,null)),(null,hi!,null))", objMutableTriple1, (java.lang.Comparable<java.lang.String>) "(1.0,,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTriple8);
    }

    @Test
    public void MutableTriple1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1048");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) charSequence3, (java.lang.CharSequence) "(1.0,null,hi!)", (java.lang.CharSequence) "(null,hi!,)");
        java.lang.String str8 = objMutableTriple6.toString("(null,null,(1.0,null,(null,,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null,null)" + "'", str2.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,(1.0,null,(null,,null)))" + "'", str8.equals("(null,null,(1.0,null,(null,,null)))"));
    }

    @Test
    public void MutableTriple1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1049");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        java.lang.String str6 = objMutableTriple0.toString("(null,,(null,,null))");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,hi!,)");
        java.lang.Class<?> wildcardClass9 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,,(null,,null))" + "'", str6.equals("(null,,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1050");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.Type, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.Type, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1051");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        objMutableTriple3.middle = "hi!";
        java.lang.String str7 = objMutableTriple3.toString("(,(null,null,(null,,null)),(null,hi!,null))");
        objMutableTriple3.middle = "(null,(null,hi!,null),(null,,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,(null,null,(null,,null)),(null,hi!,null))" + "'", str7.equals("(,(null,null,(null,,null)),(null,hi!,null))"));
    }

    @Test
    public void MutableTriple1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1052");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,(null,hi!,null))");
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        java.lang.Object obj6 = objMutableTriple0.left;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,hi!,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,null,(null,hi!,null))" + "'", charSequence5.equals("(null,null,(null,hi!,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutableTriple1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1053");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,null,(null,,null))", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Object> annotatedElementMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Object>();
        boolean boolean6 = objMutableTriple3.equals((java.lang.Object) annotatedElementMutableTriple5);
        java.lang.CharSequence charSequence7 = objMutableTriple3.getRight();
        java.lang.String str8 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((null,null,(null,,null)),hi!,(null,,null))" + "'", str8.equals("((null,null,(null,,null)),hi!,(null,,null))"));
    }

    @Test
    public void MutableTriple1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1054");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.Object obj5 = objMutableTriple3.getLeft();
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1,(null,hi!,null),(null,,(null,,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d + "'", obj5.equals(100.0d));
    }

    @Test
    public void MutableTriple1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1055");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null,null)" + "'", charSequence6.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutableTriple1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1056");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj5 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence7 = objMutableTriple0.right;
        objMutableTriple0.right = "(-1,,(null,null,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1057");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.right = "(null,null,null)";
        objMutableTriple0.middle = "(,(null,null,(null,,null)),(null,hi!,null))";
        objMutableTriple0.middle = "(1.0,null,(null,(null,null,null),null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1058");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str6 = objMutableTriple0.toString();
        java.lang.Object obj7 = objMutableTriple0.left;
        java.lang.String str8 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null,(null,,null))" + "'", str6.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,(null,,null))" + "'", str8.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1059");
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objTriple0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.middle;
        objMutableTriple1.setLeft((java.lang.Object) 1);
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = objMutableTriple1.getClass();
        org.apache.commons.lang3.tuple.Triple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> objTripleTriple9 = org.apache.commons.lang3.tuple.Triple.of(objTriple0, (java.lang.reflect.AnnotatedElement) wildcardClass7, (java.lang.Comparable<java.lang.String>) "(null,(null,null,null),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objTripleTriple9);
    }

    @Test
    public void MutableTriple1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1060");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
    }

    @Test
    public void MutableTriple1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1061");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.left;
        java.lang.CharSequence charSequence5 = objMutableTriple3.right;
        objMutableTriple3.setRight((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
    }

    @Test
    public void MutableTriple1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1062");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getMiddle();
        java.lang.String str4 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null,null)" + "'", str4.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1063");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.middle;
        java.lang.CharSequence charSequence4 = null;
        objMutableTriple2.setMiddle(charSequence4);
        java.lang.String str7 = objMutableTriple2.toString("");
        boolean boolean8 = objMutableTriple0.equals((java.lang.Object) "");
        java.lang.String str9 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null,null)" + "'", str9.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1064");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.setLeft((java.lang.Object) 1.0f);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        java.lang.Object obj6 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,(null,null,(null,hi!,null)),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
    }

    @Test
    public void MutableTriple1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1065");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,(null,hi!,null),(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
    }

    @Test
    public void MutableTriple1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1066");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.String str6 = objMutableTriple0.toString("(null,null,(1.0,null,(null,,null)))");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null,null)" + "'", str4.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null,(1.0,null,(null,,null)))" + "'", str6.equals("(null,null,(1.0,null,(null,,null)))"));
    }

    @Test
    public void MutableTriple1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1067");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutableTriple1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1068");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>, java.lang.Object> annotatedElementMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>, java.lang.Object>();
    }

    @Test
    public void MutableTriple1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1069");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutableTriple4.getMiddle();
        java.lang.String str6 = objMutableTriple4.toString();
        objMutableTriple4.right = "(null,null,hi!)";
        int int9 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null,null)" + "'", str6.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableTriple1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1070");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        boolean boolean5 = objMutableTriple0.equals((java.lang.Object) "(1,null,(null,,null))");
        java.lang.Object obj6 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutableTriple1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1071");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,null,(1.0,null,(null,,null)))", (java.lang.CharSequence) "(null,null,hi!)");
    }

    @Test
    public void MutableTriple1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1072");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.reflect.Type, java.lang.Class<?>> typeMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.reflect.Type, java.lang.Class<?>>();
    }

    @Test
    public void MutableTriple1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1073");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.String str6 = objMutableTriple3.toString("(null,null,(null,,null))");
        java.lang.CharSequence charSequence7 = objMutableTriple3.right;
        java.lang.CharSequence charSequence8 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null,(null,,null))" + "'", str6.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,(null,,null))" + "'", charSequence7.equals("(null,,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!,null)" + "'", charSequence8.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1074");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.Object, java.lang.Comparable<java.lang.String>> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.Object, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void MutableTriple1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1075");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.Class<?>, java.lang.reflect.AnnotatedElement> annotatedElementMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.getRight();
        java.lang.Object obj4 = objMutableTriple2.left;
        java.lang.Class<?> wildcardClass5 = objMutableTriple2.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.Object, java.lang.reflect.Type> objMutableTriple6 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) annotatedElementMutableTriple0, (java.lang.Object) 1.0f, (java.lang.reflect.Type) wildcardClass5);
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple9 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, (java.lang.CharSequence) "(null,(null,,null),null)", (java.lang.CharSequence) "(null,(1.0,hi!,(null,,null)),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple6);
    }

    @Test
    public void MutableTriple1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1076");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        java.lang.String str7 = objMutableTriple0.toString("hi!");
        java.lang.Object obj8 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1077");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.GenericDeclaration, java.lang.CharSequence> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.GenericDeclaration, java.lang.CharSequence>();
    }

    @Test
    public void MutableTriple1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1078");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.Object obj8 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(1,null,null)" + "'", str5.equals("(1,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1 + "'", obj8.equals(1));
    }

    @Test
    public void MutableTriple1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1079");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getRight();
        java.lang.Object obj5 = objMutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "" + "'", charSequence4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void MutableTriple1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1080");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        java.lang.Object obj2 = objMutableTriple0.left;
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,(null,hi!,hi!),null)", (java.lang.CharSequence) "(1,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void MutableTriple1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1081");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        java.lang.String str5 = objMutableTriple3.toString("(1.0,null,(null,,null))");
        java.lang.String str6 = objMutableTriple3.toString();
        objMutableTriple3.setMiddle((java.lang.CharSequence) "((null,null,(null,hi!,null)),(null,null,null),(null,null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(1.0,null,(null,,null))" + "'", str5.equals("(1.0,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(,(null,null,(null,,null)),(null,hi!,null))" + "'", str6.equals("(,(null,null,(null,,null)),(null,hi!,null))"));
    }

    @Test
    public void MutableTriple1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1082");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "(null,(null,null,null),null)";
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,(null,null,null),null)" + "'", charSequence4.equals("(null,(null,null,null),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1083");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.String str5 = objMutableTriple0.toString("(null,,(null,,null))");
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        java.lang.CharSequence charSequence7 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,(null,,null))" + "'", str5.equals("(null,,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1084");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.setLeft((java.lang.Object) 1.0f);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,hi!,null)" + "'", charSequence6.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1085");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>, java.io.Serializable> objTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>, java.io.Serializable>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getRight();
        objMutableTriple1.middle = "(null,null,(null,,null))";
        java.lang.Object obj5 = objMutableTriple1.left;
        java.lang.Class<?> wildcardClass6 = objMutableTriple1.getClass();
        org.apache.commons.lang3.tuple.Triple<java.io.Serializable, java.lang.reflect.Type, java.lang.String> serializableTriple8 = org.apache.commons.lang3.tuple.Triple.of((java.io.Serializable) objTripleMutableTriple0, (java.lang.reflect.Type) wildcardClass6, "((null,null,(null,,null)),(null,null,(null,,null)),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableTriple8);
    }

    @Test
    public void MutableTriple1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1086");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,null,(1.0,null,(null,,null)))");
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1087");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.String str7 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,hi!,null)" + "'", str7.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple2.MutableTriple1088");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean5 = objMutableTriple3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = objMutableTriple3.getLeft();
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple3);
        objMutableTriple0.middle = "((null,null,(null,hi!,null)),(null,null,null),(null,null,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }
}

