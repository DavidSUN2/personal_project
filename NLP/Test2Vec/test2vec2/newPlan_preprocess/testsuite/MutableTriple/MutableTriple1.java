package MutableTriple;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableTriple1 {

    public static boolean debug = false;

    @Test
    public void MutableTriple0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0501");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutableTriple3.getMiddle();
        java.lang.String str7 = objMutableTriple3.toString();
        java.lang.CharSequence charSequence8 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1.0,hi!,(null,,null))" + "'", str7.equals("(1.0,hi!,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void MutableTriple0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0502");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence4 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,(1.0,null,(null,,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
    }

    @Test
    public void MutableTriple0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0503");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,hi!)");
        java.lang.Object obj5 = null;
        objMutableTriple0.left = obj5;
        java.lang.Object obj7 = objMutableTriple0.left;
        objMutableTriple0.middle = "(null,null,(null,hi!,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null,null)" + "'", str2.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutableTriple0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0504");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.Object obj5 = objMutableTriple0.getLeft();
        java.lang.Class<?> wildcardClass6 = objMutableTriple0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableTriple0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0505");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        java.lang.String str5 = objMutableTriple0.toString();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0506");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.Class<?> wildcardClass7 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableTriple0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0507");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutableTriple0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0508");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.getMiddle();
        objMutableTriple2.middle = "hi!";
        java.lang.CharSequence charSequence6 = objMutableTriple2.middle;
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple2);
        objMutableTriple2.setRight((java.lang.CharSequence) "(100.0,hi!,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void MutableTriple0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0509");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.String str5 = objMutableTriple0.toString("(null,,null)");
        objMutableTriple0.setLeft((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence9 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutableTriple0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0510");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutableTriple4.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple4.getRight();
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple4);
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0511");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str3 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        java.lang.String str6 = objMutableTriple0.toString("(null,hi!,null)");
        org.apache.commons.lang3.tuple.Triple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> objMutableTripleTriple9 = org.apache.commons.lang3.tuple.Triple.of(objMutableTriple0, (java.lang.Comparable<java.lang.String>) "(1.0,hi!,(null,,null))", (java.lang.Comparable<java.lang.String>) "(null,null,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null,null)" + "'", str3.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!,null)" + "'", str6.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTripleTriple9);
    }

    @Test
    public void MutableTriple0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0512");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.String str6 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.right;
        java.lang.Class<?> wildcardClass8 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!,null)" + "'", str6.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0513");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutableTriple0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0514");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "";
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "((null,,null),null,null)");
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "((null,,null),null,null)" + "'", charSequence8.equals("((null,,null),null,null)"));
    }

    @Test
    public void MutableTriple0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0515");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence8 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence9 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,,null)" + "'", charSequence9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0516");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.right = "(null,null,(null,,null))";
        java.lang.Object obj6 = objMutableTriple0.left;
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0517");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        java.lang.Class<?> wildcardClass9 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0518");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        objMutableTriple0.right = "(null,,null)";
        java.lang.Object obj8 = objMutableTriple0.getLeft();
        java.lang.Object obj9 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0519");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1,null,null)");
        objMutableTriple3.right = "(1.0,null,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableTriple0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0520");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.getMiddle();
        objMutableTriple2.middle = "hi!";
        java.lang.CharSequence charSequence6 = objMutableTriple2.middle;
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple2);
        java.lang.Object obj8 = objMutableTriple2.getLeft();
        java.lang.Object obj9 = objMutableTriple2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0521");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        java.lang.CharSequence charSequence5 = objMutableTriple3.getRight();
        java.lang.String str7 = objMutableTriple3.toString("(1.0,null,(null,,null))");
        java.lang.CharSequence charSequence8 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,,null)" + "'", charSequence5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1.0,null,(null,,null))" + "'", str7.equals("(1.0,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0522");
        org.apache.commons.lang3.tuple.Triple<java.lang.Comparable<java.lang.String>, java.lang.CharSequence, java.lang.Comparable<java.lang.String>> strComparableTriple3 = org.apache.commons.lang3.tuple.Triple.of((java.lang.Comparable<java.lang.String>) "(null,(null,null,(null,,null)),)", (java.lang.CharSequence) "((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))", (java.lang.Comparable<java.lang.String>) "(null,hi!,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableTriple3);
    }

    @Test
    public void MutableTriple0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0523");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        objMutableTriple0.middle = "(null,(null,null,(null,,null)),)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,(null,,null))" + "'", str5.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,,null)" + "'", charSequence6.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0524");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,(null,null,null),null)", (java.lang.CharSequence) "(null,,)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1.0,null,hi!)");
        java.lang.Class<?> wildcardClass6 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableTriple0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0525");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.Object obj5 = objMutableTriple3.left;
        java.lang.CharSequence charSequence6 = objMutableTriple3.getRight();
        java.lang.String str8 = objMutableTriple3.toString("(null,,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 1 + "'", obj5.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,,(null,,null))" + "'", charSequence6.equals("(null,,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,,null)" + "'", str8.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0526");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence4 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutableTriple0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0527");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.getMiddle();
        objMutableTriple2.middle = "hi!";
        java.lang.CharSequence charSequence6 = objMutableTriple2.middle;
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple2);
        java.lang.CharSequence charSequence8 = objMutableTriple2.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void MutableTriple0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0528");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.middle = "(1.0,null,hi!)";
        objMutableTriple3.middle = "(null,,null)";
        java.lang.CharSequence charSequence9 = objMutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,,null)" + "'", charSequence9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0529");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.middle = "(1.0,null,hi!)";
        java.lang.String str8 = objMutableTriple3.toString("(null,(null,,(null,,null)),null)");
        java.lang.Class<?> wildcardClass9 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(null,,(null,,null)),null)" + "'", str8.equals("(null,(null,,(null,,null)),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0530");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutableTriple4.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple4.getMiddle();
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple4);
        objMutableTriple4.middle = "(1.0,null,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableTriple0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0531");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean5 = objMutableTriple3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = objMutableTriple3.getLeft();
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple3);
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(1,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableTriple0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0532");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.String str5 = objMutableTriple1.toString();
        boolean boolean7 = objMutableTriple1.equals((java.lang.Object) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,null)" + "'", str5.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableTriple0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0533");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable>();
        java.lang.Class<?> wildcardClass1 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableTriple0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0534");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.Object obj5 = objMutableTriple3.left;
        java.lang.Object obj6 = objMutableTriple3.left;
        java.lang.Object obj7 = objMutableTriple3.left;
        java.lang.String str9 = objMutableTriple3.toString("(null,hi!,(null,null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 1 + "'", obj5.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) 1 + "'", obj6.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 1 + "'", obj7.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,hi!,(null,null,null))" + "'", str9.equals("(null,hi!,(null,null,null))"));
    }

    @Test
    public void MutableTriple0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0535");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.middle = "(null,null,(null,,null))";
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1.0,null,hi!)");
        java.lang.Object obj8 = objMutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
    }

    @Test
    public void MutableTriple0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0536");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.String str6 = objMutableTriple0.toString("(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))" + "'", str6.equals("(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))"));
    }

    @Test
    public void MutableTriple0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0537");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        java.lang.String str5 = objMutableTriple3.toString("(1.0,null,(null,,null))");
        java.lang.String str6 = objMutableTriple3.toString();
        java.lang.CharSequence charSequence7 = objMutableTriple3.getMiddle();
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1.0,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(1.0,null,(null,,null))" + "'", str5.equals("(1.0,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(,(null,null,(null,,null)),(null,hi!,null))" + "'", str6.equals("(,(null,null,(null,,null)),(null,hi!,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0538");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.String str6 = objMutableTriple0.toString();
        java.lang.String str7 = objMutableTriple0.toString();
        objMutableTriple0.setRight((java.lang.CharSequence) "(1,null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,,null)" + "'", str6.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,,null)" + "'", str7.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0539");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,,null)" + "'", charSequence8.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0540");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.Comparable<java.lang.String>> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void MutableTriple0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0541");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj3 = objMutableTriple0.getLeft();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,,(null,,null))" + "'", charSequence6.equals("(null,,(null,,null))"));
    }

    @Test
    public void MutableTriple0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0542");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "hi!");
        boolean boolean5 = objMutableTriple0.equals((java.lang.Object) "(1.0,hi!,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableTriple0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0543");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,hi!)");
        objMutableTriple0.middle = "(null,(null,null,null),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null,null)" + "'", str2.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0544");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj3 = objMutableTriple0.getLeft();
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence5 = objMutableTriple0.middle;
        objMutableTriple0.right = "(null,(1.0,hi!,(null,,null)),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutableTriple0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0545");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        objMutableTriple0.right = "(null,,null)";
        java.lang.String str9 = objMutableTriple0.toString("(null,(null,null,(null,,null)),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,(null,null,(null,,null)),)" + "'", str9.equals("(null,(null,null,(null,,null)),)"));
    }

    @Test
    public void MutableTriple0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0546");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(100.0,hi!,hi!)");
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(100.0,hi!,hi!)" + "'", charSequence8.equals("(100.0,hi!,hi!)"));
    }

    @Test
    public void MutableTriple0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0547");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        java.lang.String str8 = objMutableTriple0.toString("(null,null,null)");
        java.lang.String str9 = objMutableTriple0.toString();
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
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,null)" + "'", str8.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null,null)" + "'", str9.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0548");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str7 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1,null,(null,,null))" + "'", str7.equals("(1,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,,null)" + "'", charSequence8.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0549");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.getMiddle();
        objMutableTriple2.middle = "hi!";
        java.lang.CharSequence charSequence6 = objMutableTriple2.middle;
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple2);
        java.lang.String str9 = objMutableTriple0.toString("(null,hi!,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,hi!,null)" + "'", str9.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0550");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.middle;
        java.lang.CharSequence charSequence4 = null;
        objMutableTriple2.setMiddle(charSequence4);
        java.lang.String str7 = objMutableTriple2.toString("");
        boolean boolean8 = objMutableTriple0.equals((java.lang.Object) "");
        java.lang.CharSequence charSequence9 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0551");
        java.lang.reflect.Type type0 = null;
        java.io.Serializable serializable1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj3 = objMutableTriple2.getLeft();
        java.lang.CharSequence charSequence4 = objMutableTriple2.getRight();
        objMutableTriple2.left = "(null,,null)";
        java.lang.CharSequence charSequence7 = objMutableTriple2.getMiddle();
        java.lang.CharSequence charSequence8 = objMutableTriple2.middle;
        org.apache.commons.lang3.tuple.Triple<java.lang.reflect.Type, java.io.Serializable, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> typeTriple9 = org.apache.commons.lang3.tuple.Triple.of(type0, serializable1, objMutableTriple2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeTriple9);
    }

    @Test
    public void MutableTriple0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0552");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence5 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
    }

    @Test
    public void MutableTriple0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0553");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "hi!";
        java.lang.CharSequence charSequence7 = objMutableTriple3.middle;
        java.lang.CharSequence charSequence8 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void MutableTriple0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0554");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj4 = objMutableTriple3.left;
        java.lang.CharSequence charSequence5 = objMutableTriple3.getMiddle();
        objMutableTriple3.right = "((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutableTriple0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0555");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.getMiddle();
        objMutableTriple2.middle = "hi!";
        java.lang.CharSequence charSequence6 = objMutableTriple2.middle;
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple2);
        java.lang.CharSequence charSequence8 = objMutableTriple2.getMiddle();
        java.lang.String str9 = objMutableTriple2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,hi!,null)" + "'", str9.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0556");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,,(null,,null))", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(1,null,null)");
        objMutableTriple3.right = "(-1,,(null,null,null))";
    }

    @Test
    public void MutableTriple0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0557");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple1.getRight();
        java.lang.CharSequence charSequence7 = objMutableTriple1.right;
        java.lang.CharSequence charSequence8 = objMutableTriple1.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0558");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.left = "(null,null,null)";
        java.lang.CharSequence charSequence7 = objMutableTriple3.middle;
        java.lang.CharSequence charSequence8 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,,null)" + "'", charSequence8.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0559");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple1.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple1.right;
        // The following exception was thrown during execution in MutableTriple generation
        try {
            java.lang.Class<?> wildcardClass9 = charSequence8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0560");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "(null,(null,null,null),null)";
        objMutableTriple0.setRight((java.lang.CharSequence) "");
        java.lang.Object obj6 = null;
        objMutableTriple0.left = obj6;
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,(null,null,null),null)" + "'", charSequence8.equals("(null,(null,null,null),null)"));
    }

    @Test
    public void MutableTriple0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0561");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,null,(null,,null))", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("(null,,null)");
        objMutableTriple3.middle = "(1,null,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0562");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.right = "(null,hi!,null)";
        java.lang.Class<?> wildcardClass5 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableTriple0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0563");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        objMutableTriple0.middle = "(null,(null,,(null,,null)),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
    }

    @Test
    public void MutableTriple0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0564");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.Object obj5 = objMutableTriple0.left;
        objMutableTriple0.right = "(null,hi!,null)";
        java.lang.String str8 = objMutableTriple0.toString();
        java.lang.String str9 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,(null,hi!,null))" + "'", str8.equals("(null,null,(null,hi!,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null,(null,hi!,null))" + "'", str9.equals("(null,null,(null,hi!,null))"));
    }

    @Test
    public void MutableTriple0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0565");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str7 = objMutableTriple0.toString();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,hi!,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1,null,(null,,null))" + "'", str7.equals("(1,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0566");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        objMutableTriple0.right = "(null,,null)";
        java.lang.Class<?> wildcardClass8 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0567");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0568");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str3 = objMutableTriple0.toString();
        objMutableTriple0.right = "(null,hi!,hi!)";
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        java.lang.String str9 = objMutableTriple0.toString("(1.0,hi!,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null,null)" + "'", str3.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(1.0,hi!,(null,,null))" + "'", str9.equals("(1.0,hi!,(null,,null))"));
    }

    @Test
    public void MutableTriple0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0569");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.Object obj5 = null;
        boolean boolean6 = objMutableTriple0.equals(obj5);
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        // The following exception was thrown during execution in MutableTriple generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutableTriple0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0570");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.String str7 = objMutableTriple0.toString();
        objMutableTriple0.middle = "(null,null,(1.0,null,(null,,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,null)" + "'", str5.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null,null)" + "'", str7.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0571");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null,(null,,null))" + "'", charSequence9.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0572");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj4 = objMutableTriple3.left;
        java.lang.CharSequence charSequence5 = objMutableTriple3.getMiddle();
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(null,null,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutableTriple0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0573");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        objMutableTriple0.right = "hi!";
        java.lang.Object obj8 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0574");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,hi!,(null,null,null))", (java.lang.CharSequence) "(null,hi!,)", (java.lang.CharSequence) "(null,(null,null,(null,,null)),)");
    }

    @Test
    public void MutableTriple0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0575");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "hi!";
        objMutableTriple3.middle = "(null,hi!,)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0576");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,(null,null,(null,,null)),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutableTriple0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0577");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(1,null,null)", (java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.Object obj8 = null;
        boolean boolean9 = objMutableTriple0.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableTriple0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0578");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.Object obj5 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,null,(1.0,null,(null,,null)))");
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null,null)" + "'", str2.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0579");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.Class<?> wildcardClass5 = objMutableTriple0.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple8 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))", (java.lang.CharSequence) "(1.0,null,(null,,null))");
        java.lang.Object obj9 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0580");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
        java.lang.Object obj8 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0581");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        java.lang.String str7 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,(null,null,(null,,null)),null)" + "'", str7.equals("(null,(null,null,(null,,null)),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0582");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.String str6 = objMutableTriple3.toString("(null,null,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple3.getRight();
        java.lang.Object obj8 = objMutableTriple3.left;
        java.lang.Object obj9 = objMutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null,null)" + "'", str6.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,hi!,null)" + "'", charSequence7.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "" + "'", obj8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
    }

    @Test
    public void MutableTriple0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0583");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        java.lang.String str7 = objMutableTriple3.toString("");
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,(null,null,null),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableTriple0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0584");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.middle = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence7 = objMutableTriple3.middle;
        boolean boolean9 = objMutableTriple3.equals((java.lang.Object) "(null,null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableTriple0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0585");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.CharSequence, java.lang.Comparable<java.lang.String>> genericDeclarationMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.CharSequence, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void MutableTriple0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0586");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutableTriple0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0587");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0588");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.left = "(null,,null)";
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.String str8 = objMutableTriple0.toString("(null,null,null)");
        java.lang.CharSequence charSequence9 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,null)" + "'", str8.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0589");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,(null,,null),null)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,(null,,null),null)" + "'", charSequence8.equals("(null,(null,,null),null)"));
    }

    @Test
    public void MutableTriple0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0590");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.middle = "";
        java.lang.Object obj7 = objMutableTriple0.left;
        java.lang.String str8 = objMutableTriple0.toString();
        java.lang.Object obj9 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,,null)" + "'", str8.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0591");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,,null)" + "'", str4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutableTriple0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0592");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.String str3 = objMutableTriple0.toString("");
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple8 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        boolean boolean9 = objMutableTriple0.equals((java.lang.Object) "(null,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableTriple0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0593");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.Class<?> wildcardClass7 = objMutableTriple1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableTriple0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0594");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.left;
        java.lang.Object obj5 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void MutableTriple0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0595");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence8 = objMutableTriple7.getMiddle();
        java.lang.Object obj9 = objMutableTriple7.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0596");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.Object obj7 = objMutableTriple1.getLeft();
        java.lang.Object obj8 = objMutableTriple1.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0597");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        java.lang.Class<?> wildcardClass6 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableTriple0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0598");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        java.lang.Object obj7 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,(null,,null))" + "'", str5.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,,null)" + "'", charSequence6.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutableTriple0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0599");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        objMutableTriple0.middle = "(null,hi!,hi!)";
        objMutableTriple0.middle = "((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutableTriple0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0600");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        objMutableTriple0.middle = "";
        java.lang.Object obj7 = objMutableTriple0.left;
        objMutableTriple0.middle = "(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null,null)" + "'", str4.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutableTriple0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0601");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple1.getMiddle();
        java.lang.Object obj8 = objMutableTriple1.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0602");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.Object obj5 = objMutableTriple0.left;
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        java.lang.String str8 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,null)" + "'", str8.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0603");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutableTriple0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0604");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.middle = "(null,null,null)";
        objMutableTriple1.setMiddle((java.lang.CharSequence) "(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))");
        java.lang.Class<?> wildcardClass9 = objMutableTriple1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0605");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,(null,,null))" + "'", str5.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0606");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence4 = objMutableTriple3.middle;
        objMutableTriple3.setLeft((java.lang.Object) 1);
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple3);
        java.lang.Object obj8 = objMutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1 + "'", obj8.equals(1));
    }

    @Test
    public void MutableTriple0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0607");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutableTriple0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0608");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0609");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        objMutableTriple0.middle = "(null,hi!,hi!)";
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0610");
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objTriple0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.getMiddle();
        java.lang.CharSequence charSequence4 = objMutableTriple2.getRight();
        java.lang.Class<?> wildcardClass5 = objMutableTriple2.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> objTripleMutableTriple6 = org.apache.commons.lang3.tuple.MutableTriple.of(objTriple0, (java.lang.Comparable<java.lang.String>) "((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))", (java.lang.reflect.Type) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objTripleMutableTriple6);
    }

    @Test
    public void MutableTriple0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0611");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,(null,hi!,null))");
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "(null,(null,null,null),null)";
        java.lang.Object obj8 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,null,(null,hi!,null))" + "'", charSequence5.equals("(null,null,(null,hi!,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0612");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,(null,hi!,null))");
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        java.lang.Object obj6 = objMutableTriple0.left;
        java.lang.String str7 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,null,(null,hi!,null))" + "'", charSequence5.equals("(null,null,(null,hi!,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,(null,null,(null,hi!,null)),null)" + "'", str7.equals("(null,(null,null,(null,hi!,null)),null)"));
    }

    @Test
    public void MutableTriple0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0613");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        java.lang.String str7 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,(null,,null))" + "'", str5.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,,null)" + "'", charSequence6.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null,(null,,null))" + "'", str7.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0614");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        java.lang.Object obj6 = objMutableTriple0.left;
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.Object obj8 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0615");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,hi!,(null,null,null))");
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
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0616");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,null)");
        java.lang.String str6 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(null,null,null),null)" + "'", str6.equals("(null,(null,null,null),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,null)" + "'", charSequence7.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0617");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.middle = "";
        java.lang.Object obj7 = objMutableTriple0.left;
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,(1.0,hi!,(null,,null)),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutableTriple0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0618");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0619");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getRight();
        objMutableTriple1.setLeft((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass5 = objMutableTriple1.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.reflect.AnnotatedElement, java.lang.String> charSequenceMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.reflect.AnnotatedElement, java.lang.String>((java.lang.CharSequence) "((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))", (java.lang.reflect.AnnotatedElement) wildcardClass5, "(null,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableTriple0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0620");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        objMutableTriple3.right = "(null,null,(null,,null))";
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,hi!,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableTriple0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0621");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        objMutableTriple0.right = "(null,null,null)";
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        java.lang.Class<?> wildcardClass9 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0622");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.CharSequence charSequence5 = objMutableTriple3.getMiddle();
        java.lang.CharSequence charSequence6 = null;
        objMutableTriple3.setMiddle(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,null,(null,,null))" + "'", charSequence5.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0623");
        java.lang.Class<?> wildcardClass0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.Object, java.lang.String> annotatedElementMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.Object, java.lang.String>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, java.io.Serializable, java.lang.CharSequence> wildcardClassMutableTriple3 = org.apache.commons.lang3.tuple.MutableTriple.of(wildcardClass0, (java.io.Serializable) annotatedElementMutableTriple1, (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass4 = annotatedElementMutableTriple1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassMutableTriple3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableTriple0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0624");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.Object obj5 = null;
        boolean boolean6 = objMutableTriple0.equals(obj5);
        java.lang.String str8 = objMutableTriple0.toString("(null,(null,null,null),null)");
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(null,null,null),null)" + "'", str8.equals("(null,(null,null,null),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0625");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.String str8 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,,null)" + "'", str8.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0626");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Object> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Object>();
    }

    @Test
    public void MutableTriple0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0627");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj3 = objMutableTriple2.getLeft();
        objMutableTriple2.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple8 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple2, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> strMutableTriple9 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>("(null,null,(null,,null))", (java.lang.Comparable<java.lang.String>) "(null,null,(null,hi!,null))", (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void MutableTriple0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0628");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.String str5 = objMutableTriple0.toString("(null,,null)");
        java.lang.String str6 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence7 = objMutableTriple0.right;
        // The following exception was thrown during execution in MutableTriple generation
        try {
            java.lang.Class<?> wildcardClass8 = charSequence7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!,null)" + "'", str6.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0629");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        java.lang.CharSequence charSequence9 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,,null)" + "'", charSequence8.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0630");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "(null,,null)";
        objMutableTriple3.right = "(100.0,hi!,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0631");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.String, java.io.Serializable> strComparableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.String, java.io.Serializable>();
    }

    @Test
    public void MutableTriple0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0632");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.String str8 = objMutableTriple0.toString("(1.0,hi!,(null,,null))");
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,null)" + "'", str5.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(1.0,hi!,(null,,null))" + "'", str8.equals("(1.0,hi!,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0633");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.Object obj5 = objMutableTriple3.left;
        objMutableTriple3.right = "(null,null,(null,hi!,null))";
        objMutableTriple3.middle = "(1,(null,hi!,null),(null,null,(null,hi!,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 1 + "'", obj5.equals((byte) 1));
    }

    @Test
    public void MutableTriple0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0634");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.right = "(null,hi!,null)";
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objTriple5 = null;
        // The following exception was thrown during execution in MutableTriple generation
        try {
            int int6 = objMutableTriple0.compareTo(objTriple5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void MutableTriple0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0635");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean5 = objMutableTriple3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = objMutableTriple3.getLeft();
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple3);
        objMutableTriple0.right = "(null,,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableTriple0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0636");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,hi!,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void MutableTriple0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0637");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        java.lang.CharSequence charSequence6 = objMutableTriple3.middle;
        java.lang.String str8 = objMutableTriple3.toString("(null,null,(null,,null))");
        java.lang.CharSequence charSequence9 = objMutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,(null,,null))" + "'", str8.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,,null)" + "'", charSequence9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0638");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.String str5 = objMutableTriple0.toString();
        objMutableTriple0.right = "(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))";
        objMutableTriple0.middle = "(null,(null,null,(null,hi!,null)),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,hi!)" + "'", str5.equals("(null,null,hi!)"));
    }

    @Test
    public void MutableTriple0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0639");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.String str6 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence8 = null;
        objMutableTriple0.setRight(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!,null)" + "'", str6.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0640");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence7 = null;
        objMutableTriple0.setMiddle(charSequence7);
        java.lang.CharSequence charSequence9 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0641");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        java.lang.String str2 = objMutableTriple0.toString();
        java.lang.Object obj3 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null,null)" + "'", str2.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void MutableTriple0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0642");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence4 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        java.lang.String str6 = objMutableTriple0.toString();
        java.lang.Object obj7 = objMutableTriple0.left;
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence9 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!,null)" + "'", str6.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutableTriple0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0643");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,(null,null,null),null)");
        objMutableTriple0.middle = "(1,null,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutableTriple0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0644");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,(null,null,(null,hi!,null)),null)", (java.lang.CharSequence) "(null,hi!,null)");
    }

    @Test
    public void MutableTriple0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0645");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement, java.lang.CharSequence> genericDeclarationMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass1 = genericDeclarationMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableTriple0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0646");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.String str5 = objMutableTriple0.toString("(null,,null)");
        java.lang.String str6 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence7 = objMutableTriple0.right;
        objMutableTriple0.middle = "(null,hi!,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!,null)" + "'", str6.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0647");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getMiddle();
        java.lang.Object obj4 = objMutableTriple0.left;
        objMutableTriple0.right = "(null,null,(null,hi!,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutableTriple0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0648");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.String str8 = objMutableTriple0.toString();
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,,(null,,null))" + "'", str8.equals("(null,,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0649");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        objMutableTriple0.right = "(null,(null,,null),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutableTriple0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0650");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.Object obj5 = objMutableTriple0.getLeft();
        // The following exception was thrown during execution in MutableTriple generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null,null)" + "'", str2.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void MutableTriple0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0651");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.String str4 = objMutableTriple0.toString();
        objMutableTriple0.setRight((java.lang.CharSequence) "(,(null,null,(null,,null)),(null,hi!,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0652");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void MutableTriple0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0653");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        java.lang.String str6 = objMutableTriple0.toString("(1,(null,hi!,null),(null,null,(null,hi!,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(1,(null,hi!,null),(null,null,(null,hi!,null)))" + "'", str6.equals("(1,(null,hi!,null),(null,null,(null,hi!,null)))"));
    }

    @Test
    public void MutableTriple0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0654");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.String, java.lang.String> strComparableMutableTriple3 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Comparable<java.lang.String>) "(null,(null,null,(null,,null)),)", "(null,(null,null,null),null)", "(null,(null,null,(null,,null)),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutableTriple3);
    }

    @Test
    public void MutableTriple0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0655");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.String str3 = objMutableTriple0.toString("");
        java.lang.String str5 = objMutableTriple0.toString("(null,,(null,,null))");
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,(null,,null))" + "'", str5.equals("(null,,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0656");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence5 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
    }

    @Test
    public void MutableTriple0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0657");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        objMutableTriple0.right = "(1,null,null)";
        java.lang.CharSequence charSequence8 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(1,null,null)" + "'", charSequence8.equals("(1,null,null)"));
    }

    @Test
    public void MutableTriple0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0658");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "");
        objMutableTriple3.right = "(null,,(null,,null))";
        java.lang.Object obj6 = objMutableTriple3.getLeft();
        java.lang.CharSequence charSequence7 = objMutableTriple3.middle;
        java.lang.CharSequence charSequence8 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null,(null,,null))" + "'", charSequence8.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0659");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.left = "(null,,null)";
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        java.lang.Object obj6 = null;
        objMutableTriple0.left = obj6;
        objMutableTriple0.middle = "(1,(null,hi!,null),(null,,(null,,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutableTriple0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0660");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        java.lang.Object obj2 = objMutableTriple0.left;
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutableTriple0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0661");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.String str7 = objMutableTriple0.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,(null,,null))" + "'", str5.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableTriple0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0662");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "");
        java.lang.String str4 = objMutableTriple3.toString();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> charSequenceMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>();
        objMutableTriple3.setLeft((java.lang.Object) charSequenceMutableTriple5);
        objMutableTriple3.setRight((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,(null,null,(null,,null)),)" + "'", str4.equals("(null,(null,null,(null,,null)),)"));
    }

    @Test
    public void MutableTriple0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0663");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        java.lang.String str7 = objMutableTriple3.toString("");
        java.lang.String str8 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(1.0,null,(null,,null))" + "'", str8.equals("(1.0,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0664");
        java.lang.Class<?> wildcardClass1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.Object obj6 = objMutableTriple5.left;
        org.apache.commons.lang3.tuple.Triple<java.lang.CharSequence, java.lang.Class<?>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> charSequenceTriple7 = org.apache.commons.lang3.tuple.Triple.of((java.lang.CharSequence) "(null,null,hi!)", wildcardClass1, objMutableTriple5);
        objMutableTriple5.middle = "(1.0,null,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0d + "'", obj6.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTriple7);
    }

    @Test
    public void MutableTriple0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0665");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getMiddle();
        java.lang.Object obj4 = objMutableTriple0.left;
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(1,(null,hi!,null),(null,null,(null,hi!,null)))" + "'", charSequence8.equals("(1,(null,hi!,null),(null,null,(null,hi!,null)))"));
    }

    @Test
    public void MutableTriple0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0666");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        java.lang.String str5 = objMutableTriple3.toString("(1.0,null,(null,,null))");
        java.lang.String str6 = objMutableTriple3.toString();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple9 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple3, (java.lang.CharSequence) "(1,(null,hi!,null),(null,,(null,,null)))", (java.lang.CharSequence) "(1,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(1.0,null,(null,,null))" + "'", str5.equals("(1.0,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(,(null,null,(null,,null)),(null,hi!,null))" + "'", str6.equals("(,(null,null,(null,,null)),(null,hi!,null))"));
    }

    @Test
    public void MutableTriple0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0667");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.Object obj5 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null,null)" + "'", str2.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0668");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.left;
        java.lang.String str5 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,(null,null,(null,,null)),null)" + "'", str5.equals("(null,(null,null,(null,,null)),null)"));
    }

    @Test
    public void MutableTriple0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0669");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        // The following exception was thrown during execution in MutableTriple generation
        try {
            java.lang.Class<?> wildcardClass5 = charSequence4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutableTriple0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0670");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "(null,null,(null,,null))";
        objMutableTriple0.right = "(null,(null,null,(null,hi!,null)),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0671");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0672");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,(null,null,null),null)");
        java.lang.CharSequence charSequence8 = objMutableTriple0.getRight();
        java.lang.Object obj9 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0673");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence5 = objMutableTriple0.middle;
        objMutableTriple0.right = "(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))";
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
    }

    @Test
    public void MutableTriple0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0674");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.right = "(null,hi!,)";
        objMutableTriple0.right = "((null,,null),null,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void MutableTriple0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0675");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        objMutableTriple0.middle = "";
        objMutableTriple0.setMiddle((java.lang.CharSequence) "((null,,null),null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null,null)" + "'", str4.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0676");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutableTriple4.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple4.getMiddle();
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple4);
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0677");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutableTriple0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0678");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,hi!)");
        java.lang.String str7 = objMutableTriple0.toString("(null,(null,,null),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null,null)" + "'", str2.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,(null,,null),null)" + "'", str7.equals("(null,(null,,null),null)"));
    }

    @Test
    public void MutableTriple0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0679");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.Object obj5 = objMutableTriple0.left;
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence8 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutableTriple0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0680");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.String str6 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!,null)" + "'", str6.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0681");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str7 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null,(null,,null))" + "'", str7.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0682");
        java.lang.Class<?> wildcardClass0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.Object, java.lang.String> annotatedElementMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.Object, java.lang.String>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, java.io.Serializable, java.lang.CharSequence> wildcardClassMutableTriple3 = org.apache.commons.lang3.tuple.MutableTriple.of(wildcardClass0, (java.io.Serializable) annotatedElementMutableTriple1, (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass4 = wildcardClassMutableTriple3.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> serializableMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
        java.lang.Class<?> wildcardClass6 = serializableMutableTriple5.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.GenericDeclaration, java.lang.String> serializableMutableTriple8 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.GenericDeclaration, java.lang.String>((java.io.Serializable) wildcardClass4, (java.lang.reflect.GenericDeclaration) wildcardClass6, "(1,null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassMutableTriple3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableTriple0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0683");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.middle = "(null,null,(1.0,null,(null,,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void MutableTriple0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0684");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        boolean boolean6 = objMutableTriple1.equals((java.lang.Object) (byte) 0);
        java.lang.CharSequence charSequence7 = objMutableTriple1.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple1.right;
        java.lang.CharSequence charSequence9 = objMutableTriple1.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0685");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.Object obj3 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void MutableTriple0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0686");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "";
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        objMutableTriple0.middle = "(null,(null,,null),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
    }

    @Test
    public void MutableTriple0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0687");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple1.getMiddle();
        java.lang.CharSequence charSequence8 = objMutableTriple1.getRight();
        java.lang.Object obj9 = objMutableTriple1.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0688");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1,null,null)");
        java.lang.String str9 = objMutableTriple3.toString("(null,(null,,(null,,null)),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,(null,,(null,,null)),null)" + "'", str9.equals("(null,(null,,(null,,null)),null)"));
    }

    @Test
    public void MutableTriple0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0689");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        java.lang.String str5 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,null)" + "'", str5.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0690");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(1.0,hi!,(null,,null))");
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0691");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.Object obj5 = null;
        boolean boolean6 = objMutableTriple0.equals(obj5);
        java.lang.String str8 = objMutableTriple0.toString("(null,(null,null,null),null)");
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(null,null,null),null)" + "'", str8.equals("(null,(null,null,null),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0692");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.Object obj5 = null;
        boolean boolean6 = objMutableTriple0.equals(obj5);
        java.lang.Object obj7 = objMutableTriple0.left;
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0693");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.String str5 = objMutableTriple1.toString();
        objMutableTriple1.middle = "(1,null,(null,,null))";
        java.lang.CharSequence charSequence8 = objMutableTriple1.getMiddle();
        java.lang.CharSequence charSequence9 = objMutableTriple1.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(1,null,(null,,null))" + "'", charSequence8.equals("(1,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0694");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.Object obj6 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        objMutableTriple0.middle = "(null,hi!,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0695");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.right;
        java.lang.Object obj8 = null;
        boolean boolean9 = objMutableTriple0.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,)" + "'", charSequence7.equals("(null,,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableTriple0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0696");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "((null,,null),null,null)");
        java.lang.String str6 = objMutableTriple0.toString("(null,(1.0,hi!,(null,,null)),null)");
        java.lang.String str8 = objMutableTriple0.toString("(null,,)");
        java.lang.CharSequence charSequence9 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null,null)" + "'", str2.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(1.0,hi!,(null,,null)),null)" + "'", str6.equals("(null,(1.0,hi!,(null,,null)),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,,)" + "'", str8.equals("(null,,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "((null,,null),null,null)" + "'", charSequence9.equals("((null,,null),null,null)"));
    }

    @Test
    public void MutableTriple0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0697");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,(null,,null),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void MutableTriple0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0698");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence4 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "(,(null,null,(null,,null)),(null,hi!,null))");
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        objMutableTriple0.middle = "(null,hi!,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0699");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        objMutableTriple1.right = "(null,(null,,(null,,null)),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
    }

    @Test
    public void MutableTriple0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0700");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.right = "(null,null,(null,,null))";
        java.lang.Object obj6 = objMutableTriple0.left;
        java.lang.String str7 = objMutableTriple0.toString();
        objMutableTriple0.middle = "(null,null,(1.0,null,(null,,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1,null,(null,null,(null,,null)))" + "'", str7.equals("(1,null,(null,null,(null,,null)))"));
    }

    @Test
    public void MutableTriple0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0701");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "(null,,null)";
        java.lang.String str7 = objMutableTriple3.toString();
        objMutableTriple3.right = "(null,null,(null,null,(null,,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1.0,null,(null,,null))" + "'", str7.equals("(1.0,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0702");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "(null,(null,null,null),null)";
        objMutableTriple0.setRight((java.lang.CharSequence) "");
        java.lang.Object obj6 = null;
        objMutableTriple0.left = obj6;
        java.lang.Object obj8 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0703");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        java.lang.String str7 = objMutableTriple0.toString("(1,null,null)");
        java.lang.Class<?> wildcardClass8 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1,null,null)" + "'", str7.equals("(1,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0704");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1,null,null)");
        java.lang.CharSequence charSequence8 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(1,null,null)" + "'", charSequence8.equals("(1,null,null)"));
    }

    @Test
    public void MutableTriple0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0705");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.String str5 = objMutableTriple0.toString("(null,,null)");
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.String str8 = objMutableTriple0.toString("(1.0,hi!,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(1.0,hi!,(null,,null))" + "'", str8.equals("(1.0,hi!,(null,,null))"));
    }

    @Test
    public void MutableTriple0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0706");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.String str6 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,,null)" + "'", str6.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0707");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.right = "(null,null,null)";
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        objMutableTriple0.middle = "(null,null,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0708");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        java.lang.String str7 = objMutableTriple0.toString("");
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0709");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getMiddle();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "((null,,null),null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void MutableTriple0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0710");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getMiddle();
        java.lang.Object obj4 = objMutableTriple0.left;
        java.lang.CharSequence charSequence5 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutableTriple0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0711");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> wildcardClassMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) wildcardClassMutableTriple0, (java.lang.CharSequence) "", (java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
        java.lang.String str5 = objMutableTriple3.toString("(null,(null,null,(null,,null)),null)");
        java.lang.Class<?> wildcardClass6 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,(null,null,(null,,null)),null)" + "'", str5.equals("(null,(null,null,(null,,null)),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableTriple0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0712");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getRight();
        objMutableTriple1.middle = "(null,null,(null,,null))";
        java.lang.Object obj5 = objMutableTriple1.getLeft();
        java.lang.Class<?> wildcardClass6 = objMutableTriple1.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>, java.io.Serializable> objMutableTripleMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>, java.io.Serializable>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.Class<?>, java.lang.Object> strComparableMutableTriple8 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Comparable<java.lang.String>) "hi!", wildcardClass6, (java.lang.Object) objMutableTripleMutableTriple7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutableTriple8);
    }

    @Test
    public void MutableTriple0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0713");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.Object obj6 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        objMutableTriple0.middle = "(null,hi!,)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0714");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence8 = objMutableTriple7.getRight();
        java.lang.CharSequence charSequence9 = objMutableTriple7.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null,null)" + "'", charSequence8.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null,null)" + "'", charSequence9.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0715");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.right = "(null,null,(null,,null))";
        java.lang.Object obj6 = objMutableTriple0.left;
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
        java.lang.String str8 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(1,null,(null,null,(null,,null)))" + "'", str8.equals("(1,null,(null,null,(null,,null)))"));
    }

    @Test
    public void MutableTriple0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0716");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.String str6 = objMutableTriple3.toString("(null,null,(null,,null))");
        java.lang.Object obj7 = objMutableTriple3.left;
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,(null,null,(null,,null)),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null,(null,,null))" + "'", str6.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 1 + "'", obj7.equals((byte) 1));
    }

    @Test
    public void MutableTriple0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0717");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        // The following exception was thrown during execution in MutableTriple generation
        try {
            java.lang.Class<?> wildcardClass6 = charSequence5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void MutableTriple0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0718");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.String str9 = objMutableTriple0.toString("(null,hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,hi!,)" + "'", str9.equals("(null,hi!,)"));
    }

    @Test
    public void MutableTriple0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0719");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,(null,hi!,null))");
        objMutableTriple0.middle = "";
    }

    @Test
    public void MutableTriple0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0720");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,(null,null,null),null)", (java.lang.CharSequence) "(null,,)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,)" + "'", charSequence4.equals("(null,,)"));
    }

    @Test
    public void MutableTriple0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0721");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        java.lang.Class<?> wildcardClass6 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableTriple0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0722");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,hi!,null)");
        objMutableTriple1.middle = "hi!";
        java.lang.CharSequence charSequence9 = objMutableTriple1.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutableTriple0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0723");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0724");
        java.lang.Class<?> wildcardClass1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.Object obj6 = objMutableTriple5.left;
        org.apache.commons.lang3.tuple.Triple<java.lang.CharSequence, java.lang.Class<?>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> charSequenceTriple7 = org.apache.commons.lang3.tuple.Triple.of((java.lang.CharSequence) "(null,null,hi!)", wildcardClass1, objMutableTriple5);
        java.lang.Object obj8 = objMutableTriple5.left;
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0d + "'", obj6.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTriple7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100.0d + "'", obj8.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0725");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
    }

    @Test
    public void MutableTriple0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0726");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        java.lang.CharSequence charSequence6 = objMutableTriple3.middle;
        java.lang.CharSequence charSequence7 = objMutableTriple3.middle;
        java.lang.Class<?> wildcardClass8 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0727");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null,(null,,null))" + "'", charSequence8.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0728");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean5 = objMutableTriple3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = objMutableTriple3.getLeft();
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple3);
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence9 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutableTriple0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0729");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        objMutableTriple0.right = "(null,hi!,null)";
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,null,(null,hi!,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
    }

    @Test
    public void MutableTriple0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0730");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.Object, java.lang.reflect.AnnotatedElement> genericDeclarationMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.Object, java.lang.reflect.AnnotatedElement>();
        java.lang.Class<?> wildcardClass1 = genericDeclarationMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableTriple0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0731");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.middle = "";
        java.lang.Object obj7 = objMutableTriple0.left;
        java.lang.String str8 = objMutableTriple0.toString();
        java.lang.String str9 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,,null)" + "'", str8.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,,null)" + "'", str9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0732");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj4 = objMutableTriple3.left;
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,(null,null,null),null)");
        java.lang.CharSequence charSequence7 = objMutableTriple3.getMiddle();
        java.lang.String str8 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(1.0,null,(null,(null,null,null),null))" + "'", str8.equals("(1.0,null,(null,(null,null,null),null))"));
    }

    @Test
    public void MutableTriple0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0733");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "hi!");
        objMutableTriple0.middle = "(null,hi!,)";
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,hi!,)" + "'", charSequence7.equals("(null,hi!,)"));
    }

    @Test
    public void MutableTriple0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0734");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.String str5 = objMutableTriple0.toString("(null,,null)");
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
    }

    @Test
    public void MutableTriple0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0735");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.String str7 = objMutableTriple1.toString();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> charSequenceMutableTriple8 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
        objMutableTriple1.left = charSequenceMutableTriple8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null,(null,null,(null,,null)))" + "'", str7.equals("(null,null,(null,null,(null,,null)))"));
    }

    @Test
    public void MutableTriple0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0736");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.CharSequence charSequence5 = objMutableTriple1.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutableTriple0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0737");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.String str3 = objMutableTriple0.toString("");
        java.lang.String str5 = objMutableTriple0.toString("(null,,(null,,null))");
        objMutableTriple0.right = "((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))";
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,(null,,null))" + "'", str5.equals("(null,,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0738");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        boolean boolean7 = objMutableTriple0.equals((java.lang.Object) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,null)" + "'", str5.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableTriple0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0739");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence4 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,(null,null,(null,,null)))", (java.lang.CharSequence) "(null,hi!,hi!)");
        objMutableTriple0.right = "(null,(null,null,(null,hi!,null)),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutableTriple0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0740");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        objMutableTriple0.middle = "(null,(null,null,(null,hi!,null)),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0741");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutableTriple0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0742");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        java.lang.Object obj2 = objMutableTriple0.left;
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
    }

    @Test
    public void MutableTriple0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0743");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        objMutableTriple0.middle = "(1,null,(null,null,(null,,null)))";
        java.lang.Object obj7 = objMutableTriple0.left;
        java.lang.Object obj8 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0744");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        objMutableTriple0.middle = "(null,hi!,hi!)";
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        java.lang.String str8 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(null,hi!,hi!),null)" + "'", str8.equals("(null,(null,hi!,hi!),null)"));
    }

    @Test
    public void MutableTriple0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0745");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        java.lang.Object obj4 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null,null)" + "'", str2.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutableTriple0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0746");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,null,(null,,null))", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("(null,,null)");
        java.lang.String str6 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((null,null,(null,,null)),hi!,(null,,null))" + "'", str6.equals("((null,null,(null,,null)),hi!,(null,,null))"));
    }

    @Test
    public void MutableTriple0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0747");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.middle = "";
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        java.lang.Object obj8 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0748");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.middle = "(null,,(null,,null))";
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0749");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.Object obj7 = null;
        boolean boolean8 = objMutableTriple0.equals(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableTriple0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0750");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.right = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence7 = null;
        objMutableTriple0.middle = charSequence7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0751");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "((null,,null),null,null)");
        java.lang.String str6 = objMutableTriple0.toString("(null,(1.0,hi!,(null,,null)),null)");
        java.lang.String str8 = objMutableTriple0.toString("(null,,)");
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null,null)" + "'", str2.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(1.0,hi!,(null,,null)),null)" + "'", str6.equals("(null,(1.0,hi!,(null,,null)),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,,)" + "'", str8.equals("(null,,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0752");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        objMutableTriple0.right = "(null,null,(null,null,(null,,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
    }

    @Test
    public void MutableTriple0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0753");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.Object obj6 = objMutableTriple0.getLeft();
        java.lang.Object obj7 = objMutableTriple0.left;
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0754");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.CharSequence> strComparableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.CharSequence>();
    }

    @Test
    public void MutableTriple0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0755");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.String str7 = objMutableTriple1.toString();
        java.lang.Class<?> wildcardClass8 = objMutableTriple1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null,(null,null,(null,,null)))" + "'", str7.equals("(null,null,(null,null,(null,,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0756");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.middle = "(1.0,null,hi!)";
        java.lang.CharSequence charSequence7 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(1.0,null,hi!)" + "'", charSequence7.equals("(1.0,null,hi!)"));
    }

    @Test
    public void MutableTriple0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0757");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.middle = "(null,null,(null,,null))";
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1.0,null,hi!)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(null,(null,hi!,hi!),null)");
    }

    @Test
    public void MutableTriple0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0758");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.left;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,,(null,,null))", (java.lang.CharSequence) "(1,null,(null,,null))");
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null,(null,,null))" + "'", charSequence8.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0759");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.String str6 = objMutableTriple3.toString("(null,null,(null,,null))");
        java.lang.Object obj7 = objMutableTriple3.left;
        java.lang.Class<?> wildcardClass8 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null,(null,,null))" + "'", str6.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 1 + "'", obj7.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0760");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable, java.lang.reflect.Type> objTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable, java.lang.reflect.Type>();
    }

    @Test
    public void MutableTriple0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0761");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.middle;
        java.lang.CharSequence charSequence3 = objMutableTriple1.getMiddle();
        java.lang.CharSequence charSequence4 = objMutableTriple1.getRight();
        java.lang.String str5 = objMutableTriple1.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple1.getMiddle();
        objMutableTriple0.setLeft((java.lang.Object) objMutableTriple1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,null)" + "'", str5.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0762");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutableTriple4.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple4.getRight();
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple4);
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        java.lang.Object obj9 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0763");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.String str8 = objMutableTriple0.toString("(1.0,hi!,(null,,null))");
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,null)" + "'", str5.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(1.0,hi!,(null,,null))" + "'", str8.equals("(1.0,hi!,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0764");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0765");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.Object obj4 = objMutableTriple3.left;
        objMutableTriple3.right = "((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))";
        java.lang.CharSequence charSequence7 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100.0d + "'", obj4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
    }

    @Test
    public void MutableTriple0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0766");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        java.lang.String str8 = objMutableTriple0.toString("(null,null,null)");
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
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
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,null)" + "'", str8.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0767");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str3 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        java.lang.String str5 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null,null)" + "'", str3.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,null)" + "'", str5.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0768");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutableTriple4.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple4.getRight();
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple4);
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0769");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        java.lang.Object obj9 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,,null)" + "'", charSequence8.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0770");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.Object obj5 = objMutableTriple1.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void MutableTriple0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0771");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        objMutableTriple0.middle = "(1,null,(null,null,(null,,null)))";
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,(null,null,null),null)");
        java.lang.Object obj9 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0772");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = null;
        objMutableTriple3.setMiddle(charSequence4);
    }

    @Test
    public void MutableTriple0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0773");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        boolean boolean6 = objMutableTriple1.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = objMutableTriple1.toString();
        java.lang.CharSequence charSequence8 = objMutableTriple1.getRight();
        java.lang.String str9 = objMutableTriple1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,,null)" + "'", str7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,,null)" + "'", str9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0774");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.Object obj5 = objMutableTriple0.getLeft();
        java.lang.Object obj6 = objMutableTriple0.left;
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        java.lang.String str8 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1 + "'", obj5.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(1,null,null)" + "'", str8.equals("(1,null,null)"));
    }

    @Test
    public void MutableTriple0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0775");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        objMutableTriple0.middle = "(1,(null,hi!,null),(null,,(null,,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void MutableTriple0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0776");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.left = "(null,null,(null,,null))";
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj8 = objMutableTriple0.left;
        java.lang.CharSequence charSequence9 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "(null,null,(null,,null))" + "'", obj8.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null,(null,,null))" + "'", charSequence9.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0777");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.String str4 = objMutableTriple0.toString("(null,null,(null,,null))");
        objMutableTriple0.middle = "(,(null,null,(null,,null)),(null,hi!,null))";
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        objMutableTriple0.right = "(null,hi!,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null,(null,,null))" + "'", str4.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(,(null,null,(null,,null)),(null,hi!,null))" + "'", charSequence7.equals("(,(null,null,(null,,null)),(null,hi!,null))"));
    }

    @Test
    public void MutableTriple0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0778");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.Object obj6 = objMutableTriple0.left;
        objMutableTriple0.middle = "(null,null,(1.0,null,(null,,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutableTriple0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0779");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        objMutableTriple0.right = "hi!";
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0780");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "(null,null,(null,,null))";
        java.lang.String str9 = objMutableTriple0.toString("(null,(null,null,(null,,null)),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,(null,null,(null,,null)),null)" + "'", str9.equals("(null,(null,null,(null,,null)),null)"));
    }

    @Test
    public void MutableTriple0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0781");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "hi!";
        java.lang.CharSequence charSequence7 = objMutableTriple3.middle;
        java.lang.CharSequence charSequence8 = objMutableTriple3.getMiddle();
        java.lang.CharSequence charSequence9 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0782");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,,null)" + "'", charSequence9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0783");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 0L, (java.lang.CharSequence) "(null,(null,null,null),null)", (java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,null,(null,,null))" + "'", charSequence4.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0784");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void MutableTriple0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0785");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        objMutableTriple0.middle = "(null,hi!,hi!)";
        java.lang.CharSequence charSequence7 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0786");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.left = "(null,,null)";
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        java.lang.Object obj6 = null;
        objMutableTriple0.left = obj6;
        java.lang.Object obj8 = objMutableTriple0.getLeft();
        java.lang.String str9 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null,null)" + "'", str9.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0787");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.getMiddle();
        java.lang.Object obj4 = objMutableTriple2.left;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> strComparableMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>((java.lang.Comparable<java.lang.String>) "(1.0,null,hi!)", (java.lang.CharSequence) "(,(null,null,(null,,null)),(null,hi!,null))", (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple2);
        objMutableTriple2.setMiddle((java.lang.CharSequence) "(1,(null,hi!,null),(null,,(null,,null)))");
        java.lang.Object obj8 = objMutableTriple2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0788");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getMiddle();
        java.lang.Object obj4 = objMutableTriple0.left;
        objMutableTriple0.right = "(-1,,(null,null,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutableTriple0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0789");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.getRight();
        java.lang.Object obj6 = objMutableTriple1.left;
        objMutableTriple1.middle = "(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))";
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
    public void MutableTriple0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0790");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
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
    public void MutableTriple0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0791");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        objMutableTriple3.right = "(1,null,(null,null,(null,,null)))";
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(null,hi!,hi!)");
    }

    @Test
    public void MutableTriple0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0792");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        objMutableTriple0.setLeft((java.lang.Object) (-1L));
        objMutableTriple0.right = "(1,null,(null,,null))";
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(1,null,(null,,null))" + "'", charSequence9.equals("(1,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0793");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, (java.lang.CharSequence) "(null,(null,null,null),null)", (java.lang.CharSequence) "(null,(null,null,null),null)");
        java.lang.String str7 = objMutableTriple6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1.0,(null,(null,null,null),null),(null,(null,null,null),null))" + "'", str7.equals("(1.0,(null,(null,null,null),null),(null,(null,null,null),null))"));
    }

    @Test
    public void MutableTriple0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0794");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "";
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.Object obj6 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutableTriple0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0795");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getRight();
        java.lang.Object obj3 = objMutableTriple1.left;
        java.lang.CharSequence charSequence4 = objMutableTriple1.middle;
        java.lang.Class<?> wildcardClass6 = null;
        org.apache.commons.lang3.tuple.Triple<java.lang.String, java.lang.Class<?>, java.lang.CharSequence> strTriple8 = org.apache.commons.lang3.tuple.Triple.of("(null,,(null,,null))", wildcardClass6, (java.lang.CharSequence) "(null,null,(null,hi!,null))");
        org.apache.commons.lang3.tuple.Triple<java.lang.String, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable> strTriple9 = org.apache.commons.lang3.tuple.Triple.of("(1,(null,hi!,null),(null,,(null,,null)))", objMutableTriple1, (java.io.Serializable) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTriple8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTriple9);
    }

    @Test
    public void MutableTriple0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0796");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "(null,(null,,(null,,null)),null)";
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void MutableTriple0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0797");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.middle = "(null,null,(null,,null))";
        objMutableTriple3.right = "(null,hi!,null)";
        java.lang.CharSequence charSequence9 = objMutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,hi!,null)" + "'", charSequence9.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0798");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str3 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, java.lang.Object, java.lang.reflect.Type> wildcardClassMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, java.lang.Object, java.lang.reflect.Type>();
        boolean boolean6 = objMutableTriple0.equals((java.lang.Object) wildcardClassMutableTriple5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null,null)" + "'", str3.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void MutableTriple0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0799");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "";
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
    }

    @Test
    public void MutableTriple0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0800");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.String str6 = objMutableTriple0.toString("(null,hi!,null)");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,(1.0,hi!,(null,,null)),null)");
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!,null)" + "'", str6.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0801");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.Object obj5 = null;
        boolean boolean6 = objMutableTriple0.equals(obj5);
        java.lang.Class<?> wildcardClass7 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableTriple0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0802");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,hi!,null)");
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence9 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,(null,,null))" + "'", str5.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!,null)" + "'", charSequence8.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,hi!,null)" + "'", charSequence9.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0803");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.setLeft((java.lang.Object) 1.0f);
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutableTriple0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0804");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,,(null,,null))", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(1,null,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        objMutableTriple3.setRight((java.lang.CharSequence) "(1,(null,hi!,null),(null,,(null,,null)))");
        java.lang.Object obj7 = objMutableTriple3.getLeft();
        java.lang.CharSequence charSequence8 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,null,(null,,null))" + "'", charSequence4.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "(null,,(null,,null))" + "'", obj7.equals("(null,,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null,(null,,null))" + "'", charSequence8.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0805");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.String str5 = objMutableTriple0.toString("(null,,null)");
        java.lang.String str6 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence7 = objMutableTriple0.right;
        java.lang.Object obj8 = objMutableTriple0.left;
        java.lang.CharSequence charSequence9 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!,null)" + "'", str6.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutableTriple0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0806");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        objMutableTriple0.setLeft((java.lang.Object) (-1L));
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        java.lang.Object obj8 = objMutableTriple0.left;
        java.lang.CharSequence charSequence9 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1L) + "'", obj7.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1L) + "'", obj8.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null,(null,,null))" + "'", charSequence9.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0807");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.Object obj5 = objMutableTriple3.left;
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,hi!,null)");
        objMutableTriple3.middle = "(1.0,null,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 1 + "'", obj5.equals((byte) 1));
    }

    @Test
    public void MutableTriple0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0808");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(1,null,null)", (java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0809");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.middle;
        objMutableTriple2.setLeft((java.lang.Object) 1);
        java.lang.Object obj6 = objMutableTriple2.getLeft();
        java.lang.String str7 = objMutableTriple2.toString();
        boolean boolean8 = objMutableTriple0.equals((java.lang.Object) str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1,null,null)" + "'", str7.equals("(1,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableTriple0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0810");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence5 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,,null)" + "'", str4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
    }

    @Test
    public void MutableTriple0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0811");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.Object obj4 = objMutableTriple3.left;
        objMutableTriple3.setMiddle((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100.0d + "'", obj4.equals(100.0d));
    }

    @Test
    public void MutableTriple0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0812");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence5 = objMutableTriple0.middle;
        java.lang.Object obj6 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutableTriple0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0813");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0814");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        objMutableTriple0.right = "(null,(null,hi!,hi!),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void MutableTriple0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0815");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        objMutableTriple0.middle = "(null,hi!,hi!)";
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!,hi!)" + "'", charSequence8.equals("(null,hi!,hi!)"));
    }

    @Test
    public void MutableTriple0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0816");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj4 = objMutableTriple3.left;
        java.lang.CharSequence charSequence5 = objMutableTriple3.getMiddle();
        java.lang.CharSequence charSequence6 = objMutableTriple3.middle;
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(null,(1.0,hi!,(null,,null)),null)");
        java.lang.CharSequence charSequence9 = objMutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,,null)" + "'", charSequence9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0817");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, (java.lang.CharSequence) "(null,(null,null,null),null)", (java.lang.CharSequence) "(null,(null,null,null),null)");
        java.lang.CharSequence charSequence7 = objMutableTriple6.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple6.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,(null,null,null),null)" + "'", charSequence7.equals("(null,(null,null,null),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,(null,null,null),null)" + "'", charSequence8.equals("(null,(null,null,null),null)"));
    }

    @Test
    public void MutableTriple0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0818");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        objMutableTriple0.middle = "(1,null,(null,null,(null,,null)))";
        java.lang.Object obj7 = objMutableTriple0.left;
        objMutableTriple0.setRight((java.lang.CharSequence) "(1,null,(null,null,(null,,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutableTriple0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0819");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.String str7 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getRight();
        java.lang.String str9 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,,null)" + "'", str7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,,null)" + "'", str9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0820");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        java.lang.String str6 = objMutableTriple0.toString();
        java.lang.Object obj7 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null,hi!)" + "'", str6.equals("(null,null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutableTriple0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0821");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.Object obj6 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
    }

    @Test
    public void MutableTriple0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0822");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        objMutableTriple3.middle = "hi!";
        java.lang.String str7 = objMutableTriple3.toString("hi!");
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableTriple0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0823");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.String str7 = objMutableTriple0.toString("(1.0,hi!,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1.0,hi!,(null,,null))" + "'", str7.equals("(1.0,hi!,(null,,null))"));
    }

    @Test
    public void MutableTriple0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0824");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,hi!,null)");
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        java.lang.String str9 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,(null,,null))" + "'", str5.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!,null)" + "'", charSequence8.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,(null,hi!,null),(null,,null))" + "'", str9.equals("(null,(null,hi!,null),(null,,null))"));
    }

    @Test
    public void MutableTriple0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0825");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str3 = objMutableTriple0.toString();
        objMutableTriple0.right = "(null,hi!,hi!)";
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,(null,hi!,null),(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null,null)" + "'", str3.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0826");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple6.middle;
        java.lang.Object obj8 = objMutableTriple6.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,null)" + "'", charSequence7.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj8.toString(), "(null,null,(null,hi!,null))");
    }

    @Test
    public void MutableTriple0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0827");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.right = "(null,hi!,null)";
        java.lang.CharSequence charSequence5 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutableTriple0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0828");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,hi!)");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(1,null,(null,null,(null,,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null,null)" + "'", str2.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0829");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.String str5 = objMutableTriple1.toString();
        java.lang.Object obj6 = objMutableTriple1.left;
        java.lang.String str7 = objMutableTriple1.toString();
        java.lang.CharSequence charSequence8 = objMutableTriple1.middle;
        java.lang.String str9 = objMutableTriple1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,,null)" + "'", str7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,,null)" + "'", str9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0830");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutableTriple0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0831");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        objMutableTriple0.right = "(null,,null)";
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        java.lang.String str9 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null,(null,,null))" + "'", str9.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0832");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "");
        objMutableTriple3.right = "(null,,(null,,null))";
        objMutableTriple3.middle = "(1,null,(null,null,(null,,null)))";
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
    }

    @Test
    public void MutableTriple0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0833");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutableTriple0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0834");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.left = "(null,null,(null,,null))";
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.String str8 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((null,null,(null,,null)),(null,null,(null,,null)),null)" + "'", str8.equals("((null,null,(null,,null)),(null,null,(null,,null)),null)"));
    }

    @Test
    public void MutableTriple0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0835");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,(null,,null))" + "'", str5.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0836");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        java.lang.String str6 = objMutableTriple0.toString("(null,,(null,,null))");
        java.lang.Class<?> wildcardClass7 = objMutableTriple0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableTriple0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0837");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.String, java.lang.CharSequence> strMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.String, java.lang.CharSequence>("(1,(null,hi!,null),(null,null,(null,hi!,null)))", "(null,,(null,,null))", (java.lang.CharSequence) "((null,null,(null,,null)),(null,null,(null,,null)),null)");
    }

    @Test
    public void MutableTriple0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0838");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.Comparable<java.lang.String>, java.lang.CharSequence>("", (java.lang.Comparable<java.lang.String>) "(1,(null,hi!,null),(null,,(null,,null)))", (java.lang.CharSequence) "(null,(null,null,(null,,null)),null)");
    }

    @Test
    public void MutableTriple0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0839");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "(null,(null,,(null,,null)),null)";
        java.lang.String str6 = objMutableTriple0.toString("(1.0,hi!,(null,,null))");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple9 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(1,null,(null,,null))", (java.lang.CharSequence) "(,(null,null,(null,,null)),(null,hi!,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(1.0,hi!,(null,,null))" + "'", str6.equals("(1.0,hi!,(null,,null))"));
    }

    @Test
    public void MutableTriple0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0840");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null,null)" + "'", str4.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0841");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.String str5 = objMutableTriple0.toString("(null,,null)");
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "((null,null,(null,,null)),hi!,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
    }

    @Test
    public void MutableTriple0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0842");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        java.lang.Object obj4 = null;
        boolean boolean5 = objMutableTriple0.equals(obj4);
        java.lang.Object obj6 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutableTriple0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0843");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.String str3 = objMutableTriple0.toString("");
        objMutableTriple0.middle = "(1,null,(null,,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void MutableTriple0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0844");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.String str8 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(1,,null)" + "'", str8.equals("(1,,null)"));
    }

    @Test
    public void MutableTriple0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0845");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        java.lang.String str7 = objMutableTriple0.toString("hi!");
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        java.lang.Class<?> wildcardClass9 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0846");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,null,(null,,null))", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.setLeft((java.lang.Object) "(null,hi!,(null,null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0847");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str3 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence4 = objMutableTriple0.getMiddle();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(1.0,null,(null,(null,null,null),null))");
        java.lang.String str8 = objMutableTriple0.toString("(1.0,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null,null)" + "'", str3.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(1.0,null,(null,,null))" + "'", str8.equals("(1.0,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0848");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str3 = objMutableTriple0.toString();
        objMutableTriple0.right = "(null,hi!,hi!)";
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        java.lang.Object obj8 = null;
        objMutableTriple0.left = obj8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null,null)" + "'", str3.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0849");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        objMutableTriple1.setMiddle((java.lang.CharSequence) "(null,null,null)");
        java.lang.String str9 = objMutableTriple1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,(null,null,null),null)" + "'", str9.equals("(null,(null,null,null),null)"));
    }

    @Test
    public void MutableTriple0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0850");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.String str4 = objMutableTriple0.toString();
        objMutableTriple0.middle = "(1,(null,hi!,null),(null,,(null,,null)))";
        objMutableTriple0.setRight((java.lang.CharSequence) "(1.0,hi!,(null,,null))");
        java.lang.CharSequence charSequence9 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(1,(null,hi!,null),(null,,(null,,null)))" + "'", charSequence9.equals("(1,(null,hi!,null),(null,,(null,,null)))"));
    }

    @Test
    public void MutableTriple0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0851");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.middle = "(1.0,null,hi!)";
        java.lang.String str8 = objMutableTriple3.toString("(null,(null,,(null,,null)),null)");
        java.lang.Object obj9 = objMutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(null,,(null,,null)),null)" + "'", str8.equals("(null,(null,,(null,,null)),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
    }

    @Test
    public void MutableTriple0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0852");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.CharSequence charSequence5 = objMutableTriple3.getMiddle();
        objMutableTriple3.right = "(null,hi!,)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
    }

    @Test
    public void MutableTriple0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0853");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.Object obj5 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
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
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0854");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        java.lang.Object obj6 = objMutableTriple0.left;
        java.lang.String str8 = objMutableTriple0.toString("(null,,null)");
        java.lang.CharSequence charSequence9 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,,null)" + "'", str8.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0855");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0856");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.getRight();
        objMutableTriple1.setRight((java.lang.CharSequence) "(1.0,null,(null,,null))");
        java.lang.CharSequence charSequence8 = objMutableTriple1.middle;
        java.lang.CharSequence charSequence9 = objMutableTriple1.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(1.0,null,(null,,null))" + "'", charSequence9.equals("(1.0,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0857");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.left;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,,(null,,null))", (java.lang.CharSequence) "(1,null,(null,,null))");
        java.lang.String str9 = objMutableTriple0.toString("(null,,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,,null)" + "'", str9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0858");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.Object obj5 = objMutableTriple3.left;
        java.lang.Object obj6 = objMutableTriple3.left;
        java.lang.Object obj7 = objMutableTriple3.left;
        java.lang.CharSequence charSequence8 = objMutableTriple3.getMiddle();
        java.lang.Class<?> wildcardClass9 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 1 + "'", obj5.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) 1 + "'", obj6.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 1 + "'", obj7.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!,null)" + "'", charSequence8.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0859");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.Object obj5 = null;
        boolean boolean6 = objMutableTriple0.equals(obj5);
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.Class<?> wildcardClass8 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0860");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.Object obj4 = null;
        objMutableTriple0.left = obj4;
        java.lang.Object obj6 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutableTriple0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0861");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str3 = objMutableTriple0.toString();
        objMutableTriple0.right = "(null,hi!,hi!)";
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        java.lang.Object obj8 = objMutableTriple0.left;
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
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0862");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        java.lang.Object obj4 = objMutableTriple0.left;
        java.lang.CharSequence charSequence5 = objMutableTriple0.middle;
        objMutableTriple0.setRight((java.lang.CharSequence) "(1,(null,hi!,null),(null,,(null,,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutableTriple0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0863");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        boolean boolean6 = objMutableTriple1.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = objMutableTriple1.toString();
        java.lang.CharSequence charSequence8 = objMutableTriple1.getRight();
        java.lang.CharSequence charSequence9 = objMutableTriple1.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,,null)" + "'", str7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutableTriple0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0864");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.String str3 = objMutableTriple0.toString("");
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        java.lang.Object obj5 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void MutableTriple0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0865");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.getMiddle();
        java.lang.Object obj4 = objMutableTriple2.left;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> strComparableMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>((java.lang.Comparable<java.lang.String>) "(1.0,null,hi!)", (java.lang.CharSequence) "(,(null,null,(null,,null)),(null,hi!,null))", (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple2);
        objMutableTriple2.middle = "(null,hi!,(null,null,null))";
        objMutableTriple2.setMiddle((java.lang.CharSequence) "(1,null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutableTriple0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0866");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        objMutableTriple0.setRight((java.lang.CharSequence) "(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))");
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
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0867");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.CharSequence charSequence5 = objMutableTriple3.getMiddle();
        java.lang.CharSequence charSequence6 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
    }

    @Test
    public void MutableTriple0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0868");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        java.lang.Object obj2 = objMutableTriple0.left;
        objMutableTriple0.right = "(null,(null,,(null,,null)),null)";
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.Class<?> wildcardClass8 = objMutableTriple7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0869");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,null,null)");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(1.0,null,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0870");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        objMutableTriple0.right = "(null,(1.0,hi!,(null,,null)),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,(null,,null))" + "'", str5.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,,null)" + "'", charSequence6.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0871");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.Object obj5 = objMutableTriple3.left;
        objMutableTriple3.right = "(null,null,(null,hi!,null))";
        java.lang.Class<?> wildcardClass8 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 1 + "'", obj5.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0872");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.Object obj5 = null;
        boolean boolean6 = objMutableTriple0.equals(obj5);
        java.lang.Object obj7 = objMutableTriple0.left;
        java.lang.Object obj8 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0873");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.left = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "(null,(null,null,null),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
    }

    @Test
    public void MutableTriple0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0874");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.Object obj5 = null;
        boolean boolean6 = objMutableTriple0.equals(obj5);
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence8 = null;
        objMutableTriple0.setRight(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0875");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable, java.lang.reflect.GenericDeclaration> objMutableTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutableTriple0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0876");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj4 = objMutableTriple3.left;
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,(null,null,null),null)");
        java.lang.CharSequence charSequence7 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0877");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.String str5 = objMutableTriple1.toString();
        java.lang.Object obj6 = objMutableTriple1.left;
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = objMutableTriple1.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutableTriple0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0878");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
        java.lang.Class<?> wildcardClass1 = serializableMutableTriple0.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.CharSequence, java.lang.Comparable<java.lang.String>> annotatedElementMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((java.lang.reflect.AnnotatedElement) wildcardClass1, (java.lang.CharSequence) "(null,(null,hi!,hi!),null)", (java.lang.Comparable<java.lang.String>) "(100.0,hi!,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableTriple0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0879");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        objMutableTriple0.right = "(null,hi!,null)";
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!,null)" + "'", charSequence8.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0880");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.Object obj5 = objMutableTriple3.left;
        java.lang.Object obj6 = objMutableTriple3.left;
        java.lang.Object obj7 = objMutableTriple3.left;
        java.lang.CharSequence charSequence8 = objMutableTriple3.getMiddle();
        java.lang.Object obj9 = objMutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 1 + "'", obj5.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) 1 + "'", obj6.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 1 + "'", obj7.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!,null)" + "'", charSequence8.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 1 + "'", obj9.equals((byte) 1));
    }

    @Test
    public void MutableTriple0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0881");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.left = "(null,null,(null,,null))";
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        java.lang.String str9 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null,(null,,null))" + "'", charSequence8.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((null,null,(null,,null)),(null,null,(null,,null)),null)" + "'", str9.equals("((null,null,(null,,null)),(null,null,(null,,null)),null)"));
    }

    @Test
    public void MutableTriple0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0882");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "((null,null,(null,,null)),hi!,(null,,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void MutableTriple0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0883");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        boolean boolean6 = objMutableTriple1.equals((java.lang.Object) (byte) 0);
        objMutableTriple1.setMiddle((java.lang.CharSequence) "(1.0,null,(null,,null))");
        java.lang.Object obj9 = objMutableTriple1.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0884");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        objMutableTriple0.setRight((java.lang.CharSequence) "((null,,null),null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
    }

    @Test
    public void MutableTriple0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0885");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        java.lang.String str8 = objMutableTriple0.toString("(null,null,hi!)");
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,hi!)" + "'", str8.equals("(null,null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0886");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        java.lang.Object obj6 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null,null)" + "'", str4.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutableTriple0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0887");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.getMiddle();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "(null,null,(1.0,null,(null,,null)))");
        java.lang.String str9 = objMutableTriple1.toString("(null,(null,null,(null,hi!,null)),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,(null,null,(null,hi!,null)),null)" + "'", str9.equals("(null,(null,null,(null,hi!,null)),null)"));
    }

    @Test
    public void MutableTriple0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0888");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        java.lang.String str5 = objMutableTriple3.toString("(1.0,null,(null,,null))");
        java.lang.String str6 = objMutableTriple3.toString();
        java.lang.CharSequence charSequence7 = objMutableTriple3.getMiddle();
        java.lang.CharSequence charSequence8 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(1.0,null,(null,,null))" + "'", str5.equals("(1.0,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(,(null,null,(null,,null)),(null,hi!,null))" + "'", str6.equals("(,(null,null,(null,,null)),(null,hi!,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null,(null,,null))" + "'", charSequence8.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0889");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.CharSequence charSequence5 = objMutableTriple3.getMiddle();
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(,(null,null,(null,,null)),(null,hi!,null))");
        java.lang.CharSequence charSequence8 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,null,(null,,null))" + "'", charSequence5.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(,(null,null,(null,,null)),(null,hi!,null))" + "'", charSequence8.equals("(,(null,null,(null,,null)),(null,hi!,null))"));
    }

    @Test
    public void MutableTriple0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0890");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.middle = "(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))";
    }

    @Test
    public void MutableTriple0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0891");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple1.getMiddle();
        java.lang.Object obj8 = objMutableTriple1.left;
        java.lang.CharSequence charSequence9 = objMutableTriple1.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutableTriple0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0892");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0893");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "((null,null,(null,,null)),hi!,(null,,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0894");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        objMutableTriple3.middle = "(null,,)";
        java.lang.CharSequence charSequence7 = objMutableTriple3.middle;
        java.lang.CharSequence charSequence8 = objMutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,)" + "'", charSequence7.equals("(null,,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,,(null,,null))" + "'", charSequence8.equals("(null,,(null,,null))"));
    }

    @Test
    public void MutableTriple0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0895");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,hi!,null)");
        objMutableTriple1.right = "(1.0,hi!,(null,,null))";
        java.lang.String str9 = objMutableTriple1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null,(1.0,hi!,(null,,null)))" + "'", str9.equals("(null,null,(1.0,hi!,(null,,null)))"));
    }

    @Test
    public void MutableTriple0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0896");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.String, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> genericDeclarationMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.String, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) genericDeclarationMutableTriple0, (java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))", (java.lang.CharSequence) "(1,null,(null,null,(null,,null)))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.middle;
        java.lang.String str5 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(1,(null,hi!,null),(null,null,(null,hi!,null)))" + "'", charSequence4.equals("(1,(null,hi!,null),(null,null,(null,hi!,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((null,null,null),(1,(null,hi!,null),(null,null,(null,hi!,null))),(1,null,(null,null,(null,,null))))" + "'", str5.equals("((null,null,null),(1,(null,hi!,null),(null,null,(null,hi!,null))),(1,null,(null,null,(null,,null))))"));
    }

    @Test
    public void MutableTriple0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0897");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.Object obj5 = objMutableTriple0.left;
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
        java.lang.Object obj8 = objMutableTriple0.getLeft();
        java.lang.String str9 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null,null)" + "'", str9.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0898");
        org.apache.commons.lang3.tuple.Triple<java.lang.CharSequence, java.lang.String, java.lang.CharSequence> charSequenceTriple3 = org.apache.commons.lang3.tuple.Triple.of((java.lang.CharSequence) "(null,(null,,null),null)", "(null,null,hi!)", (java.lang.CharSequence) "(null,(null,null,(null,,null)),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTriple3);
    }

    @Test
    public void MutableTriple0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0899");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence9 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0900");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str3 = objMutableTriple0.toString();
        objMutableTriple0.right = "(null,hi!,hi!)";
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        java.lang.String str8 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null,null)" + "'", str3.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,(null,hi!,hi!))" + "'", str8.equals("(null,null,(null,hi!,hi!))"));
    }

    @Test
    public void MutableTriple0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0901");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.String str7 = objMutableTriple1.toString();
        java.lang.CharSequence charSequence8 = objMutableTriple1.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null,(null,null,(null,,null)))" + "'", str7.equals("(null,null,(null,null,(null,,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0902");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.Object obj5 = objMutableTriple0.getLeft();
        java.lang.Object obj6 = objMutableTriple0.left;
        java.lang.String str7 = objMutableTriple0.toString();
        java.lang.Object obj8 = objMutableTriple0.left;
        java.lang.String str9 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1 + "'", obj5.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1,null,null)" + "'", str7.equals("(1,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1 + "'", obj8.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(1,null,null)" + "'", str9.equals("(1,null,null)"));
    }

    @Test
    public void MutableTriple0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0903");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        objMutableTriple0.right = "(null,,null)";
        java.lang.String str9 = objMutableTriple0.toString("(null,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null,(null,,null))" + "'", str9.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0904");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.String str5 = objMutableTriple0.toString("(null,,null)");
        java.lang.Object obj6 = objMutableTriple0.getLeft();
        java.lang.Object obj7 = null;
        objMutableTriple0.left = obj7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutableTriple0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0905");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getRight();
        java.lang.String str5 = objMutableTriple0.toString("(1.0,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(1.0,null,(null,,null))" + "'", str5.equals("(1.0,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0906");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        java.lang.Object obj2 = objMutableTriple0.left;
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.String str5 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,hi!)" + "'", str5.equals("(null,null,hi!)"));
    }

    @Test
    public void MutableTriple0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0907");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,hi!)");
        java.lang.Object obj5 = null;
        objMutableTriple0.left = obj5;
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null,null)" + "'", str2.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0908");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement, java.lang.CharSequence> objTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement, java.lang.CharSequence>();
    }

    @Test
    public void MutableTriple0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0909");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj2 = objMutableTriple1.getLeft();
        java.lang.CharSequence charSequence3 = objMutableTriple1.getRight();
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj6 = objMutableTriple1.getLeft();
        java.lang.CharSequence charSequence7 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement> typeMutableTriple8 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable> charSequenceMutableTriple9 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.CharSequence) "(1,(null,hi!,null),(null,,(null,,null)))", (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, (java.io.Serializable) typeMutableTriple8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceMutableTriple9);
    }

    @Test
    public void MutableTriple0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0910");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        boolean boolean6 = objMutableTriple1.equals((java.lang.Object) (byte) 0);
        objMutableTriple1.setMiddle((java.lang.CharSequence) "(1.0,null,(null,,null))");
        java.lang.Object obj9 = objMutableTriple1.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0911");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.String str6 = objMutableTriple0.toString("hi!");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> serializableMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
        boolean boolean8 = objMutableTriple0.equals((java.lang.Object) serializableMutableTriple7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableTriple0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0912");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.Object obj4 = null;
        objMutableTriple0.left = obj4;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(,(null,null,(null,,null)),(null,hi!,null))");
        objMutableTriple0.right = "(100.0,hi!,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0913");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,(null,hi!,null),(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null,null)" + "'", str2.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutableTriple0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0914");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        java.lang.String str7 = objMutableTriple1.toString();
        java.lang.Object obj8 = objMutableTriple1.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,,null)" + "'", str7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0915");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        java.lang.Object obj5 = objMutableTriple0.getLeft();
        // The following exception was thrown during execution in MutableTriple generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void MutableTriple0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0916");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.right;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(,(null,null,(null,,null)),(null,hi!,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void MutableTriple0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0917");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj4 = objMutableTriple3.left;
        java.lang.CharSequence charSequence5 = objMutableTriple3.getMiddle();
        java.lang.Object obj6 = objMutableTriple3.left;
        java.lang.String str7 = objMutableTriple3.toString();
        java.lang.String str9 = objMutableTriple3.toString("(null,(null,null,(null,,null)),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1.0,null,(null,,null))" + "'", str7.equals("(1.0,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,(null,null,(null,,null)),)" + "'", str9.equals("(null,(null,null,(null,,null)),)"));
    }

    @Test
    public void MutableTriple0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0918");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        java.lang.String str7 = objMutableTriple0.toString("hi!");
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        java.lang.CharSequence charSequence9 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0919");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
        java.lang.String str9 = objMutableTriple0.toString("(null,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null,(null,,null))" + "'", str9.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0920");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "hi!");
        boolean boolean6 = objMutableTriple0.equals((java.lang.Object) "(null,null,(null,(null,,(null,,null)),null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableTriple0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0921");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean5 = objMutableTriple3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = objMutableTriple3.getLeft();
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple3);
        objMutableTriple3.middle = "(null,null,(null,(null,,(null,,null)),null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableTriple0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0922");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(1,null,null)");
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,,null)" + "'", charSequence9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0923");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence6 = null;
        objMutableTriple0.middle = charSequence6;
        java.lang.Object obj8 = objMutableTriple0.left;
        java.lang.CharSequence charSequence9 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0924");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence4 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "" + "'", charSequence4.equals(""));
    }

    @Test
    public void MutableTriple0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0925");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(1,null,(null,null,(null,,null)))";
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,(null,,null))" + "'", str5.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,,null)" + "'", charSequence6.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,,null)" + "'", charSequence9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0926");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.String str6 = objMutableTriple0.toString("(null,,)");
        objMutableTriple0.setRight((java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,,null)" + "'", str4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,,)" + "'", str6.equals("(null,,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(1,(null,hi!,null),(null,null,(null,hi!,null)))" + "'", charSequence9.equals("(1,(null,hi!,null),(null,null,(null,hi!,null)))"));
    }

    @Test
    public void MutableTriple0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0927");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0928");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.getRight();
        java.lang.Object obj6 = objMutableTriple1.left;
        objMutableTriple1.setMiddle((java.lang.CharSequence) "(1.0,null,(null,,null))");
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
    public void MutableTriple0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0929");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,null,(1.0,null,(null,,null)))");
        java.lang.CharSequence charSequence8 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null,(1.0,null,(null,,null)))" + "'", charSequence8.equals("(null,null,(1.0,null,(null,,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null,(1.0,null,(null,,null)))" + "'", charSequence9.equals("(null,null,(1.0,null,(null,,null)))"));
    }

    @Test
    public void MutableTriple0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0930");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,,(null,,null))", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(1,null,null)");
        objMutableTriple3.middle = "(null,hi!,(null,null,null))";
    }

    @Test
    public void MutableTriple0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0931");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.right;
        java.lang.Class<?> wildcardClass8 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,)" + "'", charSequence7.equals("(null,,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0932");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.Object obj8 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0933");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.Object obj4 = null;
        objMutableTriple0.left = obj4;
        objMutableTriple0.setRight((java.lang.CharSequence) "");
        java.lang.String str8 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,hi!,)" + "'", str8.equals("(null,hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutableTriple0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0934");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Class<?>, java.lang.reflect.AnnotatedElement> objTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void MutableTriple0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0935");
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objTriple1 = null;
        org.apache.commons.lang3.tuple.Triple<java.lang.CharSequence, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.String> charSequenceTriple3 = org.apache.commons.lang3.tuple.Triple.of((java.lang.CharSequence) "(null,(null,null,(null,hi!,null)),null)", objTriple1, "(1,(null,hi!,null),(null,,(null,,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTriple3);
    }

    @Test
    public void MutableTriple0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0936");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.String str4 = objMutableTriple0.toString("(null,null,(null,,null))");
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,,(null,,null))";
        java.lang.Object obj8 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null,(null,,null))" + "'", str4.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0937");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.Object obj5 = objMutableTriple3.getLeft();
        java.lang.String str7 = objMutableTriple3.toString("(-1,,(null,null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d + "'", obj5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(-1,,(null,null,null))" + "'", str7.equals("(-1,,(null,null,null))"));
    }

    @Test
    public void MutableTriple0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0938");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        java.lang.String str8 = objMutableTriple0.toString();
        java.lang.Class<?> wildcardClass9 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,(null,hi!,null))" + "'", str8.equals("(null,null,(null,hi!,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0939");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, (java.lang.CharSequence) "(null,(null,null,null),null)", (java.lang.CharSequence) "(null,(null,null,null),null)");
        java.lang.String str8 = objMutableTriple6.toString("");
        java.lang.CharSequence charSequence9 = objMutableTriple6.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,(null,null,null),null)" + "'", charSequence9.equals("(null,(null,null,null),null)"));
    }

    @Test
    public void MutableTriple0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0940");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        boolean boolean5 = objMutableTriple0.equals((java.lang.Object) 1L);
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence8 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0941");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,null,null)");
        objMutableTriple0.middle = "(null,(1.0,hi!,(null,,null)),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0942");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence4 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence5 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0943");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        java.lang.String str5 = objMutableTriple0.toString("(1,(null,hi!,null),(null,,(null,,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null,null)" + "'", str2.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(1,(null,hi!,null),(null,,(null,,null)))" + "'", str5.equals("(1,(null,hi!,null),(null,,(null,,null)))"));
    }

    @Test
    public void MutableTriple0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0944");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "hi!");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = objMutableTriple3.getMiddle();
        java.lang.String str9 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(1.0,,(null,,null))" + "'", str9.equals("(1.0,,(null,,null))"));
    }

    @Test
    public void MutableTriple0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0945");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        java.lang.Object obj2 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString("(1.0,hi!,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(1.0,hi!,(null,,null))" + "'", str4.equals("(1.0,hi!,(null,,null))"));
    }

    @Test
    public void MutableTriple0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0946");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.right = "(null,null,(null,,null))";
        java.lang.Object obj6 = objMutableTriple0.left;
        java.lang.String str7 = objMutableTriple0.toString();
        java.lang.Class<?> wildcardClass8 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1,null,(null,null,(null,,null)))" + "'", str7.equals("(1,null,(null,null,(null,,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0947");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.String str8 = objMutableTriple0.toString("(null,null,(null,null,(null,,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,(null,null,(null,,null)))" + "'", str8.equals("(null,null,(null,null,(null,,null)))"));
    }

    @Test
    public void MutableTriple0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0948");
        java.lang.reflect.AnnotatedElement annotatedElement0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.getRight();
        java.lang.CharSequence charSequence4 = objMutableTriple2.getRight();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Object> annotatedElementMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Object>();
        boolean boolean6 = objMutableTriple2.equals((java.lang.Object) annotatedElementMutableTriple5);
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.String, java.lang.Object> annotatedElementMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.String, java.lang.Object>(annotatedElement0, "(null,,)", (java.lang.Object) boolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void MutableTriple0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0949");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.String str5 = objMutableTriple3.toString();
        java.lang.Object obj6 = objMutableTriple3.left;
        java.lang.CharSequence charSequence7 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(1,(null,hi!,null),(null,,(null,,null)))" + "'", str5.equals("(1,(null,hi!,null),(null,,(null,,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) 1 + "'", obj6.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,(null,,null))" + "'", charSequence7.equals("(null,,(null,,null))"));
    }

    @Test
    public void MutableTriple0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0950");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.right;
        java.lang.CharSequence charSequence6 = objMutableTriple1.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0951");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.String str5 = objMutableTriple3.toString();
        java.lang.Object obj6 = objMutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(100.0,hi!,hi!)" + "'", str5.equals("(100.0,hi!,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0d + "'", obj6.equals(100.0d));
    }

    @Test
    public void MutableTriple0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0952");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str3 = objMutableTriple0.toString();
        objMutableTriple0.right = "(null,hi!,hi!)";
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
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
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0953");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        java.lang.String str7 = objMutableTriple6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((null,null,(null,hi!,null)),(null,null,null),(null,null,null))" + "'", str7.equals("((null,null,(null,hi!,null)),(null,null,null),(null,null,null))"));
    }

    @Test
    public void MutableTriple0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0954");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getRight();
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,,null)" + "'", charSequence8.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0955");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        java.lang.String str7 = objMutableTriple1.toString();
        objMutableTriple1.right = "(null,(null,null,null),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,,null)" + "'", str7.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0956");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str3 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence4 = objMutableTriple0.getMiddle();
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null,null)" + "'", str3.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,null)" + "'", str5.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0957");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        java.lang.String str9 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null,hi!)" + "'", str9.equals("(null,null,hi!)"));
    }

    @Test
    public void MutableTriple0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0958");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj3 = objMutableTriple0.getLeft();
        java.lang.Object obj4 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutableTriple0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0959");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,null,(null,,null))", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.setLeft((java.lang.Object) "(null,(null,null,null),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0960");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,(null,null,null),null)");
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0961");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        java.lang.String str7 = objMutableTriple0.toString("");
        objMutableTriple0.right = "(null,(null,hi!,null),(null,,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableTriple0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0962");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence4 = objMutableTriple3.middle;
        objMutableTriple3.setLeft((java.lang.Object) 1);
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple3);
        objMutableTriple3.middle = "(1.0,hi!,(null,,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void MutableTriple0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0963");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> wildcardClassMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) wildcardClassMutableTriple0, (java.lang.CharSequence) "", (java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
        java.lang.String str5 = objMutableTriple3.toString("(null,(null,null,(null,,null)),null)");
        java.lang.Object obj6 = objMutableTriple3.left;
        java.lang.Class<?> wildcardClass7 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,(null,null,(null,,null)),null)" + "'", str5.equals("(null,(null,null,(null,,null)),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj6.toString(), "(null,null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableTriple0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0964");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj4 = objMutableTriple3.left;
        java.lang.CharSequence charSequence5 = objMutableTriple3.getRight();
        java.lang.Object obj6 = objMutableTriple3.left;
        java.lang.CharSequence charSequence7 = objMutableTriple3.getRight();
        java.lang.Object obj8 = objMutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,,null)" + "'", charSequence5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
    }

    @Test
    public void MutableTriple0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0965");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(1,(null,hi!,null),(null,null,(null,hi!,null)))", (java.lang.CharSequence) "((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))", (java.lang.CharSequence) "(1,null,null)");
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,,(null,,null))");
    }

    @Test
    public void MutableTriple0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0966");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type, java.io.Serializable> annotatedElementMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type, java.io.Serializable>();
        java.lang.Class<?> wildcardClass8 = annotatedElementMutableTriple7.getClass();
        objMutableTriple0.left = annotatedElementMutableTriple7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(1,null,null)" + "'", str5.equals("(1,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0967");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "(,(null,null,(null,,null)),(null,hi!,null))";
    }

    @Test
    public void MutableTriple0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0968");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.Object obj5 = objMutableTriple3.left;
        java.lang.Object obj6 = objMutableTriple3.left;
        objMutableTriple3.right = "(1.0,null,(null,,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 1 + "'", obj5.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) 1 + "'", obj6.equals((byte) 1));
    }

    @Test
    public void MutableTriple0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0969");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "(null,,null)";
        java.lang.String str7 = objMutableTriple3.toString();
        objMutableTriple3.right = "(null,(null,null,(null,hi!,null)),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1.0,null,(null,,null))" + "'", str7.equals("(1.0,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0970");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str3 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,(null,hi!,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null,null)" + "'", str3.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutableTriple0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0971");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        java.lang.String str6 = objMutableTriple3.toString();
        java.lang.String str7 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(1.0,null,(null,,null))" + "'", str6.equals("(1.0,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1.0,null,(null,,null))" + "'", str7.equals("(1.0,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0972");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.Object, java.lang.Object> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.Object, java.lang.Object>();
    }

    @Test
    public void MutableTriple0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0973");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        objMutableTriple3.setLeft((java.lang.Object) "((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))");
        java.lang.Object obj7 = objMutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,null,(null,,null))" + "'", charSequence4.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))" + "'", obj7.equals("((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))"));
    }

    @Test
    public void MutableTriple0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0974");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "(null,,null)";
        java.lang.CharSequence charSequence7 = objMutableTriple3.right;
        java.lang.CharSequence charSequence8 = objMutableTriple3.middle;
        java.lang.CharSequence charSequence9 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,,null)" + "'", charSequence9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0975");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.right = "(null,null,(null,,null))";
        java.lang.Object obj6 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
    }

    @Test
    public void MutableTriple0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0976");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0977");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.Object obj4 = objMutableTriple3.left;
        objMutableTriple3.middle = "(1,null,(null,null,(null,,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100.0d + "'", obj4.equals(100.0d));
    }

    @Test
    public void MutableTriple0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0978");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "(null,,null)";
        java.lang.String str7 = objMutableTriple3.toString();
        java.lang.Object obj8 = objMutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1.0,null,(null,,null))" + "'", str7.equals("(1.0,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
    }

    @Test
    public void MutableTriple0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0979");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.Object obj5 = objMutableTriple0.left;
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0980");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "(null,,null)";
        java.lang.CharSequence charSequence7 = objMutableTriple3.right;
        java.lang.CharSequence charSequence8 = objMutableTriple3.right;
        java.lang.Object obj9 = objMutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,,null)" + "'", charSequence8.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
    }

    @Test
    public void MutableTriple0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0981");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.Object obj4 = objMutableTriple3.left;
        objMutableTriple3.right = "((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))";
        java.lang.Class<?> wildcardClass7 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100.0d + "'", obj4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableTriple0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0982");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,hi!,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple1.right;
        java.lang.Object obj8 = objMutableTriple1.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,hi!,null)" + "'", charSequence7.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0983");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.middle = "(null,null,(null,,null))";
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1.0,null,hi!)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1,,null)");
    }

    @Test
    public void MutableTriple0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0984");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,null)");
        java.lang.String str6 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(null,null,null),null)" + "'", str6.equals("(null,(null,null,null),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,null)" + "'", charSequence7.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0985");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.right = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence7 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0986");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        java.lang.String str5 = objMutableTriple3.toString("(1.0,null,(null,,null))");
        java.lang.String str6 = objMutableTriple3.toString();
        java.lang.CharSequence charSequence7 = objMutableTriple3.getMiddle();
        java.lang.CharSequence charSequence8 = objMutableTriple3.getRight();
        java.lang.CharSequence charSequence9 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(1.0,null,(null,,null))" + "'", str5.equals("(1.0,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(,(null,null,(null,,null)),(null,hi!,null))" + "'", str6.equals("(,(null,null,(null,,null)),(null,hi!,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!,null)" + "'", charSequence8.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null,(null,,null))" + "'", charSequence9.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0987");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence4 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "(,(null,null,(null,,null)),(null,hi!,null))");
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        objMutableTriple0.right = "(1,(null,hi!,null),(null,null,(null,hi!,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0988");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "hi!");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = objMutableTriple3.getMiddle();
        java.lang.CharSequence charSequence9 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,,null)" + "'", charSequence9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0989");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutableTriple3.getMiddle();
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(null,hi!,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
    }

    @Test
    public void MutableTriple0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0990");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        objMutableTriple0.right = "(null,,null)";
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutableTriple0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0991");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        objMutableTriple0.right = "(null,(null,hi!,hi!),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0992");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.String, java.lang.CharSequence> charSequenceMutableTriple3 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.CharSequence) "(null,null,(1.0,null,(null,,null)))", "", (java.lang.CharSequence) "(1.0,hi!,(null,,null))");
        java.lang.Class<?> wildcardClass4 = charSequenceMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceMutableTriple3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableTriple0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0993");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.String str4 = objMutableTriple0.toString();
        objMutableTriple0.middle = "((null,null,(null,,null)),hi!,(null,,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,,null)" + "'", str4.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0994");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.Object obj6 = objMutableTriple0.left;
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0995");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, (java.lang.CharSequence) "(null,(null,null,null),null)", (java.lang.CharSequence) "(null,(null,null,null),null)");
        java.lang.CharSequence charSequence7 = objMutableTriple6.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple6.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,(null,null,null),null)" + "'", charSequence7.equals("(null,(null,null,null),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,(null,null,null),null)" + "'", charSequence8.equals("(null,(null,null,null),null)"));
    }

    @Test
    public void MutableTriple0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0996");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.Object obj5 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "" + "'", charSequence4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void MutableTriple0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0997");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0998");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.Object obj5 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void MutableTriple0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple0999");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.right;
        objMutableTriple1.right = "(null,(null,null,(null,,null)),)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutableTriple1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.MutableTriple1000");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        java.lang.String str7 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence8 = null;
        objMutableTriple0.right = charSequence8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,(null,,null))" + "'", str5.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,,null)" + "'", charSequence6.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null,(null,,null))" + "'", str7.equals("(null,null,(null,,null))"));
    }
}

