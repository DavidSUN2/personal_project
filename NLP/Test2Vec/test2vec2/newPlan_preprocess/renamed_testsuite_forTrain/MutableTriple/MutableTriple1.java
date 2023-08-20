
package MutableTriple;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableTriple1 {

    public static boolean debug = false;

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0501");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0502");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0503");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0504");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0505");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0506");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0507");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0508");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0509");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0510");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0511");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0512");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0513");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0514");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0515");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0516");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0517");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0518");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0519");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1,null,null)");
        objMutableTriple3.right = "(1.0,null,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0520");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0521");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0522");
        org.apache.commons.lang3.tuple.Triple<java.lang.Comparable<java.lang.String>, java.lang.CharSequence, java.lang.Comparable<java.lang.String>> strComparableTriple3 = org.apache.commons.lang3.tuple.Triple.of((java.lang.Comparable<java.lang.String>) "(null,(null,null,(null,,null)),)", (java.lang.CharSequence) "((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))", (java.lang.Comparable<java.lang.String>) "(null,hi!,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableTriple3);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0523");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0524");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,(null,null,null),null)", (java.lang.CharSequence) "(null,,)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1.0,null,hi!)");
        java.lang.Class<?> wildcardClass6 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0525");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0526");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0527");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0528");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0529");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0530");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0531");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0532");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0533");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable>();
        java.lang.Class<?> wildcardClass1 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0534");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0535");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.middle = "(null,null,(null,,null))";
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1.0,null,hi!)");
        java.lang.Object obj8 = objMutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0536");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0537");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0538");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0539");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0540");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.Comparable<java.lang.String>> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0541");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0542");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0543");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0544");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0545");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0546");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0547");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0548");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0549");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0550");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0551");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0552");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0553");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0554");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0555");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0556");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,,(null,,null))", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(1,null,null)");
        objMutableTriple3.right = "(-1,,(null,null,null))";
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0557");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0558");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0559");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple1.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple1.right;
        // The following exception was thrown during execution in test generation
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0560");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0561");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,null,(null,,null))", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("(null,,null)");
        objMutableTriple3.middle = "(1,null,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0562");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0563");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0564");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0565");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0566");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0567");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0568");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0569");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.Object obj5 = null;
        boolean boolean6 = objMutableTriple0.equals(obj5);
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        // The following exception was thrown during execution in test generation
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0570");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0571");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0572");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0573");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0574");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,hi!,(null,null,null))", (java.lang.CharSequence) "(null,hi!,)", (java.lang.CharSequence) "(null,(null,null,(null,,null)),)");
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0575");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "hi!";
        objMutableTriple3.middle = "(null,hi!,)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0576");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0577");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0578");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0579");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0580");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0581");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0582");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0583");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0584");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0585");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.CharSequence, java.lang.Comparable<java.lang.String>> genericDeclarationMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.CharSequence, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0586");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0587");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0588");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0589");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0590");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0591");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0592");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0593");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0594");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0595");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0596");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0597");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0598");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0599");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0600");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0601");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0602");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0603");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0604");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0605");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0606");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0607");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0608");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0609");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0610");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0611");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0612");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0613");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0614");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0615");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0616");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0617");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0618");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0619");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0620");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        objMutableTriple3.right = "(null,null,(null,,null))";
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,hi!,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0621");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0622");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0623");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0624");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0625");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0626");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Object> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Object>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0627");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj3 = objMutableTriple2.getLeft();
        objMutableTriple2.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple8 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple2, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> strMutableTriple9 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>("(null,null,(null,,null))", (java.lang.Comparable<java.lang.String>) "(null,null,(null,hi!,null))", (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0628");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.String str5 = objMutableTriple0.toString("(null,,null)");
        java.lang.String str6 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence7 = objMutableTriple0.right;
        // The following exception was thrown during execution in test generation
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0629");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0630");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "(null,,null)";
        objMutableTriple3.right = "(100.0,hi!,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0631");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.String, java.io.Serializable> strComparableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.String, java.io.Serializable>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0632");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0633");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0634");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.right = "(null,hi!,null)";
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objTriple5 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0635");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0636");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0637");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0638");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0639");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0640");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0641");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0642");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0643");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0644");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,(null,null,(null,hi!,null)),null)", (java.lang.CharSequence) "(null,hi!,null)");
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0645");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement, java.lang.CharSequence> genericDeclarationMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass1 = genericDeclarationMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0646");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0647");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0648");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0649");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0650");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.Object obj5 = objMutableTriple0.getLeft();
        // The following exception was thrown during execution in test generation
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0651");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0652");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0653");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0654");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.String, java.lang.String> strComparableMutableTriple3 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Comparable<java.lang.String>) "(null,(null,null,(null,,null)),)", "(null,(null,null,null),null)", "(null,(null,null,(null,,null)),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutableTriple3);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0655");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0656");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0657");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0658");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0659");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0660");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0661");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0662");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0663");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0664");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0665");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0666");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0667");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0668");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0669");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        // The following exception was thrown during execution in test generation
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0670");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0671");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0672");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0673");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0674");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0675");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0676");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0677");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0678");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0679");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0680");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0681");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0682");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0683");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0684");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0685");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0686");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0687");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0688");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0689");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0690");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0691");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0692");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0693");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0694");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0695");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0696");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0697");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0698");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0699");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0700");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0701");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0702");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0703");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0704");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0705");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0706");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0707");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0708");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0709");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0710");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0711");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0712");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0713");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0714");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0715");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0716");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0717");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        // The following exception was thrown during execution in test generation
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0718");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0719");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,(null,hi!,null))");
        objMutableTriple0.middle = "";
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0720");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,(null,null,null),null)", (java.lang.CharSequence) "(null,,)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,)" + "'", charSequence4.equals("(null,,)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0721");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0722");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0723");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0724");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0725");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0726");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0727");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0728");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0729");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0730");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.Object, java.lang.reflect.AnnotatedElement> genericDeclarationMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.Object, java.lang.reflect.AnnotatedElement>();
        java.lang.Class<?> wildcardClass1 = genericDeclarationMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0731");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0732");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0733");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0734");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0735");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0736");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0737");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0738");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0739");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0740");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0741");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0742");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0743");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0744");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0745");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0746");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,null,(null,,null))", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("(null,,null)");
        java.lang.String str6 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((null,null,(null,,null)),hi!,(null,,null))" + "'", str6.equals("((null,null,(null,,null)),hi!,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0747");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0748");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0749");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0750");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0751");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0752");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0753");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0754");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.CharSequence> strComparableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.CharSequence>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0755");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0756");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0757");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.middle = "(null,null,(null,,null))";
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1.0,null,hi!)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(null,(null,hi!,hi!),null)");
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0758");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0759");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0760");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable, java.lang.reflect.Type> objTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable, java.lang.reflect.Type>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0761");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0762");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0763");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0764");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0765");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0766");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0767");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0768");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0769");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0770");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0771");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0772");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = null;
        objMutableTriple3.setMiddle(charSequence4);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0773");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0774");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0775");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        objMutableTriple0.middle = "(1,(null,hi!,null),(null,,(null,,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0776");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0777");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0778");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0779");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0780");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0781");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0782");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0783");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 0L, (java.lang.CharSequence) "(null,(null,null,null),null)", (java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,null,(null,,null))" + "'", charSequence4.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0784");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0785");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0786");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0787");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0788");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0789");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0790");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0791");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        objMutableTriple3.right = "(1,null,(null,null,(null,,null)))";
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(null,hi!,hi!)");
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0792");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0793");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, (java.lang.CharSequence) "(null,(null,null,null),null)", (java.lang.CharSequence) "(null,(null,null,null),null)");
        java.lang.String str7 = objMutableTriple6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1.0,(null,(null,null,null),null),(null,(null,null,null),null))" + "'", str7.equals("(1.0,(null,(null,null,null),null),(null,(null,null,null),null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0794");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0795");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0796");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0797");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0798");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0799");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "";
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0800");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0801");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0802");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0803");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0804");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0805");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0806");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0807");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0808");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0809");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0810");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0811");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.Object obj4 = objMutableTriple3.left;
        objMutableTriple3.setMiddle((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100.0d + "'", obj4.equals(100.0d));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0812");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0813");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0814");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0815");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0816");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0817");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0818");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0819");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0820");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0821");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0822");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        objMutableTriple3.middle = "hi!";
        java.lang.String str7 = objMutableTriple3.toString("hi!");
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0823");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0824");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0825");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0826");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0827");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0828");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0829");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0830");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0831");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0832");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "");
        objMutableTriple3.right = "(null,,(null,,null))";
        objMutableTriple3.middle = "(1,null,(null,null,(null,,null)))";
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0833");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0834");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0835");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0836");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0837");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.String, java.lang.CharSequence> strMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.String, java.lang.CharSequence>("(1,(null,hi!,null),(null,null,(null,hi!,null)))", "(null,,(null,,null))", (java.lang.CharSequence) "((null,null,(null,,null)),(null,null,(null,,null)),null)");
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0838");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.Comparable<java.lang.String>, java.lang.CharSequence>("", (java.lang.Comparable<java.lang.String>) "(1,(null,hi!,null),(null,,(null,,null)))", (java.lang.CharSequence) "(null,(null,null,(null,,null)),null)");
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0839");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0840");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0841");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0842");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0843");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0844");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0845");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0846");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,null,(null,,null))", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.setLeft((java.lang.Object) "(null,hi!,(null,null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0847");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0848");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0849");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0850");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0851");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0852");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0853");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0854");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0855");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0856");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0857");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0858");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0859");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0860");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0861");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0862");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0863");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0864");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0865");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0866");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0867");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0868");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0869");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0870");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0871");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0872");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0873");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0874");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0875");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable, java.lang.reflect.GenericDeclaration> objMutableTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0876");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0877");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0878");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
        java.lang.Class<?> wildcardClass1 = serializableMutableTriple0.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.CharSequence, java.lang.Comparable<java.lang.String>> annotatedElementMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.CharSequence, java.lang.Comparable<java.lang.String>>((java.lang.reflect.AnnotatedElement) wildcardClass1, (java.lang.CharSequence) "(null,(null,hi!,hi!),null)", (java.lang.Comparable<java.lang.String>) "(100.0,hi!,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0879");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0880");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0881");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0882");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0883");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0884");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0885");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0886");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0887");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0888");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0889");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0890");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.middle = "(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))";
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0891");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0892");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0893");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0894");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0895");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0896");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0897");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0898");
        org.apache.commons.lang3.tuple.Triple<java.lang.CharSequence, java.lang.String, java.lang.CharSequence> charSequenceTriple3 = org.apache.commons.lang3.tuple.Triple.of((java.lang.CharSequence) "(null,(null,,null),null)", "(null,null,hi!)", (java.lang.CharSequence) "(null,(null,null,(null,,null)),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTriple3);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0899");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0900");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0901");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0902");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0903");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0904");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0905");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0906");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0907");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0908");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement, java.lang.CharSequence> objTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement, java.lang.CharSequence>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0909");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0910");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0911");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0912");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0913");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0914");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0915");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        java.lang.Object obj5 = objMutableTriple0.getLeft();
        // The following exception was thrown during execution in test generation
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0916");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0917");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0918");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0919");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0920");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0921");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0922");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0923");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0924");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0925");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0926");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0927");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0928");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0929");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0930");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,,(null,,null))", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(1,null,null)");
        objMutableTriple3.middle = "(null,hi!,(null,null,null))";
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0931");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0932");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0933");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0934");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Class<?>, java.lang.reflect.AnnotatedElement> objTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0935");
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objTriple1 = null;
        org.apache.commons.lang3.tuple.Triple<java.lang.CharSequence, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.String> charSequenceTriple3 = org.apache.commons.lang3.tuple.Triple.of((java.lang.CharSequence) "(null,(null,null,(null,hi!,null)),null)", objTriple1, "(1,(null,hi!,null),(null,,(null,,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTriple3);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0936");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0937");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0938");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0939");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0940");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0941");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0942");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0943");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0944");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0945");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0946");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0947");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0948");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0949");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0950");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0951");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0952");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0953");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0954");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0955");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0956");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0957");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0958");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0959");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,null,(null,,null))", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.setLeft((java.lang.Object) "(null,(null,null,null),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0960");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0961");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0962");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0963");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0964");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0965");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(1,(null,hi!,null),(null,null,(null,hi!,null)))", (java.lang.CharSequence) "((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))", (java.lang.CharSequence) "(1,null,null)");
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,,(null,,null))");
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0966");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0967");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "(,(null,null,(null,,null)),(null,hi!,null))";
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0968");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0969");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0970");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0971");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0972");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.Object, java.lang.Object> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.Object, java.lang.Object>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0973");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0974");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0975");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0976");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0977");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.Object obj4 = objMutableTriple3.left;
        objMutableTriple3.middle = "(1,null,(null,null,(null,,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100.0d + "'", obj4.equals(100.0d));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0978");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0979");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0980");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0981");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0982");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0983");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.middle = "(null,null,(null,,null))";
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1.0,null,hi!)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1,,null)");
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0984");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0985");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0986");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0987");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0988");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0989");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutableTriple3.getMiddle();
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(null,hi!,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0990");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0991");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0992");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.String, java.lang.CharSequence> charSequenceMutableTriple3 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.CharSequence) "(null,null,(1.0,null,(null,,null)))", "", (java.lang.CharSequence) "(1.0,hi!,(null,,null))");
        java.lang.Class<?> wildcardClass4 = charSequenceMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceMutableTriple3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0993");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0994");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0995");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0996");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0997");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0998");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test0999");
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple1.test1000");
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

