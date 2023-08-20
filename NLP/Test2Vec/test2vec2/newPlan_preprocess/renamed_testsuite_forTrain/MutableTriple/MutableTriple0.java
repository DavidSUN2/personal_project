
package MutableTriple;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableTriple0 {

    public static boolean debug = false;

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0001");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence6 = objMutableTriple5.middle;
        objMutableTriple5.setLeft((java.lang.Object) 1);
        int int9 = objMutableTriple1.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0002");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        boolean boolean6 = objMutableTriple1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple9 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple1, (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0003");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        objMutableTriple1.left = (byte) 10;
        java.lang.Class<?> wildcardClass9 = objMutableTriple1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0004");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.Class<?> wildcardClass4 = objMutableTriple0.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>, java.lang.Object> annotatedElementMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.reflect.AnnotatedElement) wildcardClass4, (java.lang.Comparable<java.lang.String>) "", (java.lang.Object) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0005");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.middle;
        java.lang.CharSequence charSequence4 = null;
        objMutableTriple2.setMiddle(charSequence4);
        java.lang.Class<?> wildcardClass6 = objMutableTriple2.getClass();
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.Comparable<java.lang.String>, java.lang.Class<?>> objTriple7 = org.apache.commons.lang3.tuple.Triple.of((java.lang.Object) objMutableTriple0, (java.lang.Comparable<java.lang.String>) "(null,,null)", wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objTriple7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0006");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        boolean boolean6 = objMutableTriple1.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = objMutableTriple1.toString();
        objMutableTriple1.setLeft((java.lang.Object) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,,null)" + "'", str7.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0007");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.middle;
        java.lang.CharSequence charSequence3 = null;
        objMutableTriple1.setMiddle(charSequence3);
        objMutableTriple1.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = objMutableTriple1.right;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.CharSequence> strMutableTriple9 = org.apache.commons.lang3.tuple.MutableTriple.of("(null,hi!,null)", objMutableTriple1, (java.lang.CharSequence) "(null,,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMutableTriple9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0008");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        objMutableTriple1.left = (byte) 10;
        java.lang.CharSequence charSequence9 = objMutableTriple1.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0009");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0010");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence4 = objMutableTriple3.middle;
        objMutableTriple3.setLeft((java.lang.Object) 1);
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple3);
        java.lang.String str9 = objMutableTriple0.toString("(null,hi!,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,hi!,null)" + "'", str9.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0011");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        java.lang.String str7 = objMutableTriple1.toString();
        java.lang.String str8 = objMutableTriple1.toString();
        java.lang.Class<?> wildcardClass9 = objMutableTriple1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,,null)" + "'", str7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,,null)" + "'", str8.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0012");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement, java.lang.Class<?>> objTripleMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement, java.lang.Class<?>>();
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.io.Serializable, java.lang.Comparable<java.lang.String>> objTriple5 = org.apache.commons.lang3.tuple.Triple.of((java.lang.Object) objTripleMutableTriple2, (java.io.Serializable) 'a', (java.lang.Comparable<java.lang.String>) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.Triple<java.lang.String, java.lang.Comparable<java.lang.String>, java.lang.Object> strTriple6 = org.apache.commons.lang3.tuple.Triple.of("hi!", (java.lang.Comparable<java.lang.String>) "(null,null,(null,,null))", (java.lang.Object) "(null,hi!,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objTriple5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTriple6);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0013");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple4.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = objMutableTriple4.right;
        int int8 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple4);
        java.lang.Object obj9 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0014");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "hi!");
        objMutableTriple3.right = "(null,null,null)";
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0015");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence6 = objMutableTriple5.getMiddle();
        objMutableTriple5.middle = "hi!";
        int int9 = objMutableTriple1.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0016");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.getMiddle();
        objMutableTriple2.middle = "hi!";
        java.lang.CharSequence charSequence6 = objMutableTriple2.middle;
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple2);
        objMutableTriple2.setMiddle((java.lang.CharSequence) "(null,null,(null,,null))");
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
            System.out.format("%n%s%n", "MutableTriple0.test0017");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "(null,null,null)");
        objMutableTriple7.right = "(null,,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0018");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.middle;
        java.lang.CharSequence charSequence3 = null;
        objMutableTriple1.setMiddle(charSequence3);
        java.lang.Class<?> wildcardClass5 = objMutableTriple1.getClass();
        org.apache.commons.lang3.tuple.Triple<java.lang.String, java.lang.Class<?>, java.lang.CharSequence> strTriple7 = org.apache.commons.lang3.tuple.Triple.of("hi!", wildcardClass5, (java.lang.CharSequence) "(null,,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTriple7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0019");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple1.middle;
        objMutableTriple1.right = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0020");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutableTriple4.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple4.getRight();
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple4);
        objMutableTriple0.right = "(null,,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0021");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> genericDeclarationMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0022");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple4.middle = "hi!";
        java.lang.CharSequence charSequence7 = objMutableTriple4.right;
        java.lang.CharSequence charSequence8 = objMutableTriple4.getRight();
        objMutableTriple3.setLeft((java.lang.Object) objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0023");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = charSequence1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0024");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.String str5 = objMutableTriple0.toString("(null,,null)");
        objMutableTriple0.setLeft((java.lang.Object) (-1.0f));
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0025");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement, java.lang.Class<?>> objTripleMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement, java.lang.Class<?>>();
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.io.Serializable, java.lang.Comparable<java.lang.String>> objTriple5 = org.apache.commons.lang3.tuple.Triple.of((java.lang.Object) objTripleMutableTriple2, (java.io.Serializable) 'a', (java.lang.Comparable<java.lang.String>) "(null,hi!,null)");
        boolean boolean6 = objMutableTriple0.equals((java.lang.Object) objTriple5);
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple9 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "(null,,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objTriple5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0026");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.left;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0027");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.String, java.lang.CharSequence> objTriple8 = org.apache.commons.lang3.tuple.Triple.of((java.lang.Object) objMutableTriple3, "(null,null,(null,,null))", (java.lang.CharSequence) "(null,,null)");
        java.lang.String str9 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objTriple8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(1.0,hi!,(null,,null))" + "'", str9.equals("(1.0,hi!,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0028");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        objMutableTriple0.setLeft((java.lang.Object) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0029");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple1.middle;
        java.lang.Class<?> wildcardClass8 = charSequence7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0030");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.String str5 = objMutableTriple0.toString("(null,,null)");
        objMutableTriple0.setLeft((java.lang.Object) (-1.0f));
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0031");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        boolean boolean6 = objMutableTriple1.equals((java.lang.Object) (byte) 0);
        objMutableTriple1.middle = "hi!";
        java.lang.CharSequence charSequence9 = objMutableTriple1.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0032");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.CharSequence charSequence7 = objMutableTriple1.middle;
        objMutableTriple1.middle = "(null,null,(null,,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0033");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0034");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.CharSequence charSequence7 = objMutableTriple1.middle;
        java.lang.String str9 = objMutableTriple1.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0035");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence4 = objMutableTriple3.middle;
        objMutableTriple3.setLeft((java.lang.Object) 1);
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple3);
        java.lang.CharSequence charSequence8 = null;
        objMutableTriple0.right = charSequence8;
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
            System.out.format("%n%s%n", "MutableTriple0.test0036");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0037");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        java.lang.Class<?> wildcardClass9 = charSequence8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,,null)" + "'", charSequence8.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0038");
        java.lang.reflect.GenericDeclaration genericDeclaration2 = null;
        org.apache.commons.lang3.tuple.Triple<java.lang.String, java.lang.CharSequence, java.lang.reflect.GenericDeclaration> strTriple3 = org.apache.commons.lang3.tuple.Triple.of("", (java.lang.CharSequence) "(null,(null,null,null),null)", genericDeclaration2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTriple3);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0039");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.Class<?> wildcardClass4 = objMutableTriple0.getClass();
        java.lang.CharSequence charSequence6 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) wildcardClass4, (java.lang.CharSequence) "(null,null,(null,,null))", charSequence6);
        java.lang.Class<?> wildcardClass8 = objMutableTriple7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0040");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.right = "(null,null,null)";
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        objMutableTriple0.middle = "(1.0,hi!,(null,,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0041");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Object> genericDeclarationMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Object>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0042");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        boolean boolean6 = objMutableTriple1.equals((java.lang.Object) (byte) 0);
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = objMutableTriple1.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0043");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple4.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = objMutableTriple4.right;
        int int8 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple4);
        java.lang.Class<?> wildcardClass9 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0044");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "(null,,null)";
        java.lang.String str8 = objMutableTriple3.toString("(null,null,(null,hi!,null))");
        java.lang.CharSequence charSequence9 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,(null,hi!,null))" + "'", str8.equals("(null,null,(null,hi!,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0045");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        java.lang.String str7 = objMutableTriple3.toString("");
        objMutableTriple3.middle = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0046");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str7 = objMutableTriple0.toString();
        objMutableTriple0.middle = "(null,,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null,(null,,null))" + "'", str7.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0047");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, java.lang.String, java.lang.reflect.GenericDeclaration> wildcardClassMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, java.lang.String, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0048");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.Type, java.io.Serializable> objMutableTripleMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.Type, java.io.Serializable>();
        objMutableTriple0.setLeft((java.lang.Object) objMutableTripleMutableTriple6);
        java.lang.Object obj8 = null;
        objMutableTriple0.left = obj8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0049");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.CharSequence, java.lang.reflect.AnnotatedElement> objMutableTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.CharSequence, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0050");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.String str8 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,,(null,,null))" + "'", str8.equals("(null,,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,,null)" + "'", charSequence9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0051");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.GenericDeclaration, java.lang.Class<?>> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.GenericDeclaration, java.lang.Class<?>>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0052");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.left = "(null,,null)";
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.String str8 = objMutableTriple0.toString("(null,null,null)");
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
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
            System.out.format("%n%s%n", "MutableTriple0.test0053");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.getMiddle();
        objMutableTriple2.middle = "hi!";
        java.lang.CharSequence charSequence6 = objMutableTriple2.middle;
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple2);
        boolean boolean9 = objMutableTriple2.equals((java.lang.Object) 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0054");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0055");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.CharSequence> typeMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.CharSequence>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0056");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0057");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence9 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null,null)" + "'", charSequence9.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0058");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.Class<?> wildcardClass7 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0059");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        java.lang.String str7 = objMutableTriple0.toString("");
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0060");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.Object obj5 = objMutableTriple0.left;
        objMutableTriple0.right = "(null,hi!,null)";
        java.lang.String str8 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,(null,hi!,null))" + "'", str8.equals("(null,null,(null,hi!,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,hi!,null)" + "'", charSequence9.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0061");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.left = "(null,,null)";
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        objMutableTriple0.right = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null,(null,,null))" + "'", charSequence9.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0062");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        java.lang.String str7 = objMutableTriple3.toString("");
        java.lang.CharSequence charSequence8 = objMutableTriple3.right;
        java.lang.CharSequence charSequence9 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,,null)" + "'", charSequence8.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,,null)" + "'", charSequence9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0063");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "");
        java.lang.Object obj4 = objMutableTriple3.left;
        java.lang.Class<?> wildcardClass5 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0064");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> objTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0065");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,null)");
        java.lang.Class<?> wildcardClass9 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0066");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0067");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        java.lang.Object obj8 = objMutableTriple7.getLeft();
        boolean boolean9 = objMutableTriple3.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "" + "'", obj8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0068");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,null)");
        java.lang.String str6 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        java.lang.Object obj8 = null;
        objMutableTriple0.left = obj8;
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
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0069");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "hi!";
        java.lang.CharSequence charSequence7 = objMutableTriple3.middle;
        java.lang.String str8 = objMutableTriple3.toString();
        java.lang.String str9 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(1.0,null,hi!)" + "'", str8.equals("(1.0,null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(1.0,null,hi!)" + "'", str9.equals("(1.0,null,hi!)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0070");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.middle = "hi!";
        java.lang.Class<?> wildcardClass6 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0071");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        java.lang.Class<?> wildcardClass7 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0072");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple5.middle = "hi!";
        java.lang.CharSequence charSequence8 = objMutableTriple5.right;
        objMutableTriple0.left = objMutableTriple5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0073");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        objMutableTriple0.setRight((java.lang.CharSequence) "(1,null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0074");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0075");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        java.lang.String str5 = objMutableTriple0.toString();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple8 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) str5, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "(null,,(null,,null))");
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
            System.out.format("%n%s%n", "MutableTriple0.test0076");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.Type, java.io.Serializable> objMutableTripleMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.Type, java.io.Serializable>();
        objMutableTriple0.setLeft((java.lang.Object) objMutableTripleMutableTriple6);
        java.lang.Class<?> wildcardClass8 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0077");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "hi!";
        java.lang.CharSequence charSequence7 = objMutableTriple3.middle;
        java.lang.String str8 = objMutableTriple3.toString();
        java.lang.Class<?> wildcardClass9 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(1.0,null,hi!)" + "'", str8.equals("(1.0,null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0078");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.String str5 = objMutableTriple0.toString("(null,,null)");
        java.lang.String str6 = objMutableTriple0.toString();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence9 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!,null)" + "'", str6.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null,(null,,null))" + "'", charSequence9.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0079");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence4 = objMutableTriple3.middle;
        objMutableTriple3.setLeft((java.lang.Object) 1);
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple3);
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,null)");
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
            System.out.format("%n%s%n", "MutableTriple0.test0080");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement, java.lang.Class<?>> objTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement, java.lang.Class<?>>();
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.io.Serializable, java.lang.Comparable<java.lang.String>> objTriple3 = org.apache.commons.lang3.tuple.Triple.of((java.lang.Object) objTripleMutableTriple0, (java.io.Serializable) 'a', (java.lang.Comparable<java.lang.String>) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> serializableMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
        java.lang.Class<?> wildcardClass6 = serializableMutableTriple5.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> serializableMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>((java.io.Serializable) "(null,hi!,null)", (java.lang.Comparable<java.lang.String>) "(1.0,hi!,(null,,null))", (java.lang.reflect.Type) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objTriple3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0081");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "hi!";
        java.lang.Object obj7 = objMutableTriple3.left;
        java.lang.Object obj8 = objMutableTriple3.getLeft();
        java.lang.CharSequence charSequence9 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0082");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.getMiddle();
        objMutableTriple2.middle = "hi!";
        java.lang.CharSequence charSequence6 = objMutableTriple2.middle;
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple2);
        java.lang.Object obj8 = objMutableTriple0.left;
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
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0083");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.Object obj7 = objMutableTriple1.left;
        java.lang.String str9 = objMutableTriple1.toString("(null,,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,,null)" + "'", str9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0084");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        java.lang.String str7 = objMutableTriple3.toString("");
        java.lang.CharSequence charSequence8 = objMutableTriple3.right;
        java.lang.CharSequence charSequence9 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,,null)" + "'", charSequence8.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0085");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        boolean boolean6 = objMutableTriple1.equals((java.lang.Object) (byte) 0);
        objMutableTriple1.setMiddle((java.lang.CharSequence) "(1,null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0086");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,(null,hi!,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0087");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "hi!";
        java.lang.Object obj7 = objMutableTriple3.left;
        java.lang.CharSequence charSequence8 = null;
        objMutableTriple3.middle = charSequence8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0088");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        java.lang.String str9 = objMutableTriple0.toString("(1.0,hi!,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(1.0,hi!,(null,,null))" + "'", str9.equals("(1.0,hi!,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0089");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement, java.lang.Class<?>> objTripleMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement, java.lang.Class<?>>();
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.io.Serializable, java.lang.Comparable<java.lang.String>> objTriple5 = org.apache.commons.lang3.tuple.Triple.of((java.lang.Object) objTripleMutableTriple2, (java.io.Serializable) 'a', (java.lang.Comparable<java.lang.String>) "(null,hi!,null)");
        boolean boolean6 = objMutableTriple0.equals((java.lang.Object) objTriple5);
        java.lang.Class<?> wildcardClass7 = objTriple5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objTriple5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0090");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        java.lang.String str9 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,,null)" + "'", charSequence8.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,,(null,,null))" + "'", str9.equals("(null,,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0091");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence8 = objMutableTriple7.getMiddle();
        java.lang.CharSequence charSequence9 = objMutableTriple7.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null,null)" + "'", charSequence9.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0092");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj3 = objMutableTriple0.getLeft();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,(null,null,null),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0093");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        java.lang.Class<?> wildcardClass7 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0094");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        java.lang.Class<?> wildcardClass4 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0095");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.left = "(null,,null)";
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.String str8 = objMutableTriple0.toString("(null,,(null,,null))");
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,,(null,,null))" + "'", str8.equals("(null,,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "(null,,null)" + "'", obj9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0096");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.getRight();
        objMutableTriple1.setRight((java.lang.CharSequence) "(1.0,null,(null,,null))");
        objMutableTriple1.middle = "(null,null,null)";
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
            System.out.format("%n%s%n", "MutableTriple0.test0097");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,(null,null,null),null)");
        objMutableTriple7.middle = "(null,hi!,(null,null,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0098");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        objMutableTriple0.right = "hi!";
        java.lang.Class<?> wildcardClass9 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0099");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        java.lang.Object obj8 = null;
        objMutableTriple0.left = obj8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0100");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.getRight();
        objMutableTriple1.setRight((java.lang.CharSequence) "(1.0,null,(null,,null))");
        java.lang.String str8 = objMutableTriple1.toString();
        java.lang.CharSequence charSequence9 = objMutableTriple1.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,(1.0,null,(null,,null)))" + "'", str8.equals("(null,null,(1.0,null,(null,,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(1.0,null,(null,,null))" + "'", charSequence9.equals("(1.0,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0101");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.Class<?>, java.lang.Class<?>> strComparableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.Class<?>, java.lang.Class<?>>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0102");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,,null)", (java.lang.CharSequence) "(1,null,null)", (java.lang.CharSequence) "");
        java.lang.Object obj8 = objMutableTriple7.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "(null,,null)" + "'", obj8.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0103");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.String str6 = objMutableTriple0.toString("(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
        objMutableTriple0.left = objMutableTriple7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!,null)" + "'", str6.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0104");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        java.lang.String str7 = objMutableTriple0.toString("");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,,null)");
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
            System.out.format("%n%s%n", "MutableTriple0.test0105");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.Type, java.io.Serializable> objMutableTripleMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.Type, java.io.Serializable>();
        objMutableTriple0.setLeft((java.lang.Object) objMutableTripleMutableTriple6);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0106");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        java.lang.String str7 = objMutableTriple0.toString("");
        java.lang.CharSequence charSequence8 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0107");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.Object obj5 = objMutableTriple0.left;
        objMutableTriple0.right = "(null,hi!,null)";
        java.lang.String str8 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,(null,hi!,null))" + "'", str8.equals("(null,null,(null,hi!,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,hi!,null)" + "'", charSequence9.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0108");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        java.lang.CharSequence charSequence6 = objMutableTriple3.middle;
        java.lang.CharSequence charSequence7 = null;
        objMutableTriple3.middle = charSequence7;
        java.lang.Object obj9 = objMutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0109");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,hi!,null)");
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,(null,,null))" + "'", str5.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!,null)" + "'", charSequence8.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0110");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,(null,,null))");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence8 = objMutableTriple7.getMiddle();
        objMutableTriple0.setLeft((java.lang.Object) objMutableTriple7);
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
            System.out.format("%n%s%n", "MutableTriple0.test0111");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        objMutableTriple0.right = "(1,null,null)";
        objMutableTriple0.right = "(null,(null,null,null),null)";
        java.lang.CharSequence charSequence9 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0112");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.String, java.lang.CharSequence> objTriple8 = org.apache.commons.lang3.tuple.Triple.of((java.lang.Object) objMutableTriple3, "(null,null,(null,,null))", (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence9 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objTriple8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0113");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence3, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str7 = objMutableTriple5.toString("hi!");
        java.lang.String str8 = objMutableTriple5.toString();
        boolean boolean9 = objMutableTriple0.equals((java.lang.Object) str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(1.0,null,(null,,null))" + "'", str8.equals("(1.0,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0114");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0115");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        java.lang.String str7 = objMutableTriple1.toString();
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,,null)" + "'", str7.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0116");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        boolean boolean5 = objMutableTriple0.equals((java.lang.Object) 1L);
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,null)");
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
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0117");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        objMutableTriple6.right = "(null,,)";
        java.lang.Class<?> wildcardClass9 = objMutableTriple6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0118");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        java.lang.String str7 = objMutableTriple3.toString("");
        java.lang.CharSequence charSequence8 = objMutableTriple3.right;
        java.lang.Object obj9 = objMutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,,null)" + "'", charSequence8.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0119");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> charSequenceMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0120");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(1,null,null)", (java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.Class<?> wildcardClass8 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0121");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,,(null,,null))", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(1,null,null)");
        java.lang.Object obj4 = objMutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "(null,,(null,,null))" + "'", obj4.equals("(null,,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0122");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.right = "(null,null,(null,,null))";
        java.lang.Object obj6 = objMutableTriple0.left;
        java.lang.String str7 = objMutableTriple0.toString();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
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
            System.out.format("%n%s%n", "MutableTriple0.test0123");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.right = "(null,null,null)";
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.String str8 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,hi!,hi!)" + "'", str8.equals("(null,hi!,hi!)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0124");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.middle;
        java.lang.CharSequence charSequence4 = null;
        objMutableTriple2.setMiddle(charSequence4);
        objMutableTriple2.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence8 = objMutableTriple2.right;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.String, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> strComparableMutableTriple9 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Comparable<java.lang.String>) "(1,null,(null,null,(null,,null)))", "(1.0,null,hi!)", objMutableTriple2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutableTriple9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0125");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        java.lang.CharSequence charSequence5 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,,null)" + "'", charSequence5.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0126");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        objMutableTriple0.right = "hi!";
        java.lang.String str8 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,hi!)" + "'", str8.equals("(null,null,hi!)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0127");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "(null,,null)";
        java.lang.String str8 = objMutableTriple3.toString("(null,null,(null,hi!,null))");
        java.lang.CharSequence charSequence9 = objMutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,(null,hi!,null))" + "'", str8.equals("(null,null,(null,hi!,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,,null)" + "'", charSequence9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0128");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.middle = "(null,null,(null,,null))";
        objMutableTriple3.setRight((java.lang.CharSequence) "(1.0,null,hi!)");
        java.lang.Object obj9 = objMutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0129");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "hi!";
        java.lang.CharSequence charSequence7 = objMutableTriple3.middle;
        java.lang.CharSequence charSequence8 = objMutableTriple3.getRight();
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
            System.out.format("%n%s%n", "MutableTriple0.test0130");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1,null,null)");
        objMutableTriple3.setRight((java.lang.CharSequence) "(1.0,hi!,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0131");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.getRight();
        objMutableTriple2.setLeft((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass6 = objMutableTriple2.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>((java.lang.Comparable<java.lang.String>) "(null,,(null,,null))", (java.lang.Comparable<java.lang.String>) "(null,,(null,,null))", (java.lang.reflect.Type) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0132");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.String str8 = objMutableTriple0.toString();
        java.lang.Object obj9 = objMutableTriple0.left;
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
            System.out.format("%n%s%n", "MutableTriple0.test0133");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(1.0,hi!,(null,,null))");
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,hi!,null)" + "'", charSequence9.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0134");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        boolean boolean6 = objMutableTriple1.equals((java.lang.Object) (byte) 0);
        java.lang.CharSequence charSequence7 = objMutableTriple1.getRight();
        java.lang.String str8 = objMutableTriple1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,,null)" + "'", str8.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0135");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(1,null,null)" + "'", str5.equals("(1,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0136");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        objMutableTriple3.right = "(1,null,(null,,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0137");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.String str7 = objMutableTriple0.toString("(null,hi!,(null,null,null))");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(1.0,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,hi!,(null,null,null))" + "'", str7.equals("(null,hi!,(null,null,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0138");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "";
        objMutableTriple0.left = "(null,null,(null,hi!,null))";
        java.lang.Class<?> wildcardClass7 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0139");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        objMutableTriple0.middle = "";
        java.lang.String str7 = objMutableTriple0.toString();
        java.lang.String str9 = objMutableTriple0.toString("(null,null,(null,hi!,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null,null)" + "'", str4.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,,null)" + "'", str7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null,(null,hi!,null))" + "'", str9.equals("(null,null,(null,hi!,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0140");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.CharSequence, java.lang.String> strComparableMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.CharSequence, java.lang.String>((java.lang.Comparable<java.lang.String>) "(null,hi!,null)", (java.lang.CharSequence) "(null,hi!,null)", "(null,,null)");
        objMutableTriple0.left = "(null,,null)";
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "(null,,null)" + "'", obj9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0141");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass6 = objMutableTriple3.getClass();
        org.apache.commons.lang3.tuple.Triple<java.lang.Class<?>, java.lang.CharSequence, java.lang.CharSequence> wildcardClassTriple9 = org.apache.commons.lang3.tuple.Triple.of(wildcardClass6, (java.lang.CharSequence) "(null,null,hi!)", (java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassTriple9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0142");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getRight();
        objMutableTriple1.setLeft((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass5 = objMutableTriple1.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(1,null,(null,,null))", (java.lang.reflect.GenericDeclaration) wildcardClass5, (java.lang.Comparable<java.lang.String>) "(1.0,hi!,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0143");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence4 = objMutableTriple3.middle;
        objMutableTriple3.setLeft((java.lang.Object) 1);
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple3);
        java.lang.Class<?> wildcardClass8 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0144");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple4.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = objMutableTriple4.right;
        int int8 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple4);
        java.lang.CharSequence charSequence9 = objMutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0145");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        objMutableTriple0.middle = "(1.0,null,(null,,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0146");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.Object obj5 = objMutableTriple3.left;
        objMutableTriple3.right = "(null,null,(null,hi!,null))";
        java.lang.CharSequence charSequence8 = objMutableTriple3.right;
        java.lang.CharSequence charSequence9 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 1 + "'", obj5.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null,(null,hi!,null))" + "'", charSequence8.equals("(null,null,(null,hi!,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,hi!,null)" + "'", charSequence9.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0147");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.middle = "(null,null,null)";
        java.lang.Object obj7 = null;
        objMutableTriple1.left = obj7;
        java.lang.CharSequence charSequence9 = objMutableTriple1.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0148");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.right = "(null,null,(null,hi!,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0149");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.middle = "(null,null,null)";
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
            System.out.format("%n%s%n", "MutableTriple0.test0150");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.CharSequence, java.lang.String> strComparableMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.CharSequence, java.lang.String>((java.lang.Comparable<java.lang.String>) "(null,hi!,null)", (java.lang.CharSequence) "(null,hi!,null)", "(null,,null)");
        java.lang.Class<?> wildcardClass4 = strComparableMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0151");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.Type, java.io.Serializable> objMutableTripleMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.Type, java.io.Serializable>();
        objMutableTriple0.setLeft((java.lang.Object) objMutableTripleMutableTriple6);
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,hi!,(null,null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0152");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        objMutableTriple0.right = "(null,hi!,hi!)";
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0153");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        objMutableTriple6.right = "(null,,)";
        java.lang.Object obj9 = objMutableTriple6.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "(null,null,(null,hi!,null))");
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0154");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "hi!";
        java.lang.Object obj7 = objMutableTriple3.left;
        java.lang.CharSequence charSequence8 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0155");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.String str7 = objMutableTriple0.toString("(null,hi!,(null,null,null))");
        java.lang.Object obj8 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,hi!,(null,null,null))" + "'", str7.equals("(null,hi!,(null,null,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0156");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.middle = "(null,null,(null,,null))";
        objMutableTriple3.right = "(null,hi!,null)";
        java.lang.CharSequence charSequence9 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,hi!,null)" + "'", charSequence9.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0157");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str3 = objMutableTriple0.toString();
        java.lang.String str4 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null,null)" + "'", str3.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null,null)" + "'", str4.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0158");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        java.lang.String str7 = objMutableTriple0.toString("hi!");
        java.lang.Class<?> wildcardClass8 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0159");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        objMutableTriple0.right = "(1,null,null)";
        java.lang.Object obj7 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0160");
        java.io.Serializable serializable1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.io.Serializable, java.lang.String> strMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.io.Serializable, java.lang.String>("(null,hi!,null)", serializable1, "");
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0161");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        objMutableTriple0.left = "(1.0,null,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0162");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,,null)");
        java.lang.String str8 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(null,,null),null)" + "'", str8.equals("(null,(null,,null),null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0163");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.left = "(null,,null)";
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        java.lang.Object obj6 = null;
        objMutableTriple0.left = obj6;
        java.lang.String str9 = objMutableTriple0.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0164");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.reflect.GenericDeclaration> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0165");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,,null)", (java.lang.CharSequence) "(1,null,null)", (java.lang.CharSequence) "");
        java.lang.String str9 = objMutableTriple7.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0166");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,,(null,,null))");
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0167");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        boolean boolean6 = objMutableTriple1.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = objMutableTriple1.toString();
        java.lang.Object obj8 = objMutableTriple1.getLeft();
        java.lang.CharSequence charSequence9 = objMutableTriple1.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,,null)" + "'", str7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0168");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.String str6 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.String str9 = objMutableTriple0.toString("(null,null,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!,null)" + "'", str6.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null,hi!)" + "'", str9.equals("(null,null,hi!)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0169");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,,null)" + "'", charSequence8.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,,null)" + "'", charSequence9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0170");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.String str6 = objMutableTriple0.toString("(null,hi!,null)");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(1.0,hi!,(null,,null))");
        java.lang.String str9 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!,null)" + "'", str6.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,(1.0,hi!,(null,,null)),null)" + "'", str9.equals("(null,(1.0,hi!,(null,,null)),null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0171");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        java.lang.String str9 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,,(null,,null))" + "'", str9.equals("(null,,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0172");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple4.setMiddle((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = objMutableTriple4.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.CharSequence, java.lang.reflect.Type> strMutableTriple8 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.CharSequence, java.lang.reflect.Type>("(null,,(null,,null))", (java.lang.CharSequence) "(null,,(null,,null))", (java.lang.reflect.Type) wildcardClass7);
        org.apache.commons.lang3.tuple.Triple<java.lang.String, java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strTriple9 = org.apache.commons.lang3.tuple.Triple.of("(null,null,null)", (java.lang.Comparable<java.lang.String>) "(null,,(null,,null))", (java.lang.reflect.GenericDeclaration) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTriple9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0173");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutableTriple4.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple4.getRight();
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple4);
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.Class<?>, java.lang.reflect.Type> strComparableMutableTriple8 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.Class<?>, java.lang.reflect.Type>();
        boolean boolean9 = objMutableTriple0.equals((java.lang.Object) strComparableMutableTriple8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0174");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj4 = objMutableTriple3.left;
        java.lang.CharSequence charSequence5 = objMutableTriple3.getMiddle();
        java.lang.Object obj6 = objMutableTriple3.left;
        objMutableTriple3.setRight((java.lang.CharSequence) "((null,,null),null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0175");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.getRight();
        objMutableTriple1.setRight((java.lang.CharSequence) "(1.0,null,(null,,null))");
        java.lang.Class<?> wildcardClass8 = objMutableTriple1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0176");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0177");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.Object obj4 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0178");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.getRight();
        objMutableTriple1.setRight((java.lang.CharSequence) "(1.0,null,(null,,null))");
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,null,hi!)");
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
            System.out.format("%n%s%n", "MutableTriple0.test0179");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        java.lang.String str7 = objMutableTriple0.toString("");
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence9 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0180");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        java.lang.String str8 = objMutableTriple0.toString("hi!");
        java.lang.String str9 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null,hi!)" + "'", str9.equals("(null,null,hi!)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0181");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        boolean boolean6 = objMutableTriple1.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = objMutableTriple1.toString();
        objMutableTriple1.right = "(,(null,null,(null,,null)),(null,hi!,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,,null)" + "'", str7.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0182");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = obj3.getClass();
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
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0183");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.String str5 = objMutableTriple3.toString();
        java.lang.Object obj6 = objMutableTriple3.left;
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(1,(null,hi!,null),(null,,(null,,null)))" + "'", str5.equals("(1,(null,hi!,null),(null,,(null,,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) 1 + "'", obj6.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0184");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.Object, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> strComparableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.Object, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0185");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.left = "(null,null,null)";
        objMutableTriple3.middle = "(null,(null,null,null),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0186");
        java.lang.reflect.Type type0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.middle;
        java.lang.CharSequence charSequence4 = objMutableTriple2.getMiddle();
        java.lang.CharSequence charSequence5 = objMutableTriple2.middle;
        java.lang.Object obj6 = null;
        boolean boolean7 = objMutableTriple2.equals(obj6);
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.CharSequence, java.io.Serializable> typeMutableTriple8 = org.apache.commons.lang3.tuple.MutableTriple.of(type0, (java.lang.CharSequence) "((null,,null),null,null)", (java.io.Serializable) boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeMutableTriple8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0187");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        java.lang.CharSequence charSequence6 = objMutableTriple3.middle;
        java.lang.CharSequence charSequence7 = null;
        objMutableTriple3.middle = charSequence7;
        java.lang.CharSequence charSequence9 = objMutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,,null)" + "'", charSequence9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0188");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.String str6 = objMutableTriple0.toString("(null,,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,,)" + "'", str6.equals("(null,,)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0189");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.String str6 = objMutableTriple3.toString("(null,null,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple3.getMiddle();
        java.lang.CharSequence charSequence8 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null,null)" + "'", str6.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null,(null,,null))" + "'", charSequence8.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0190");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.right = "(null,null,null)";
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence8 = null;
        objMutableTriple0.setMiddle(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0191");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        java.lang.Object obj6 = objMutableTriple0.left;
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0192");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.Object obj5 = objMutableTriple3.left;
        objMutableTriple3.right = "(null,null,(null,hi!,null))";
        java.lang.CharSequence charSequence8 = objMutableTriple3.right;
        java.lang.String str9 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 1 + "'", obj5.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null,(null,hi!,null))" + "'", charSequence8.equals("(null,null,(null,hi!,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(1,(null,hi!,null),(null,null,(null,hi!,null)))" + "'", str9.equals("(1,(null,hi!,null),(null,null,(null,hi!,null)))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0193");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        objMutableTriple0.right = "(null,,null)";
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0194");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence4 = objMutableTriple3.middle;
        objMutableTriple3.setLeft((java.lang.Object) 1);
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple3);
        java.lang.Object obj8 = null;
        objMutableTriple3.setLeft(obj8);
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
            System.out.format("%n%s%n", "MutableTriple0.test0195");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        boolean boolean6 = objMutableTriple1.equals((java.lang.Object) (byte) 0);
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = objMutableTriple1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0196");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.String, java.lang.reflect.Type> typeMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.String, java.lang.reflect.Type>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0197");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,hi!,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0198");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.Object, java.lang.CharSequence> strComparableMutableTriple3 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Comparable<java.lang.String>) "(1.0,null,(null,,null))", (java.lang.Object) true, (java.lang.CharSequence) "(1,(null,hi!,null),(null,,(null,,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutableTriple3);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0199");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        objMutableTriple0.right = "(1.0,null,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0200");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutableTriple4.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple4.getRight();
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple4);
        java.lang.Class<?> wildcardClass8 = objMutableTriple4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0201");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,null)");
        java.lang.String str6 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
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
            System.out.format("%n%s%n", "MutableTriple0.test0202");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "";
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        boolean boolean7 = objMutableTriple0.equals((java.lang.Object) (byte) 1);
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0203");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        objMutableTriple1.right = "";
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.String> strComparableMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.String>((java.lang.Comparable<java.lang.String>) "(null,null,null)", (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, "");
        java.lang.Object obj8 = objMutableTriple1.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0204");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0205");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        java.lang.String str7 = objMutableTriple0.toString("");
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        java.lang.String str9 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null,null)" + "'", str9.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0206");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.getRight();
        java.lang.Object obj6 = objMutableTriple1.left;
        java.lang.Object obj7 = objMutableTriple1.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0207");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0208");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0209");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.io.Serializable, java.io.Serializable> typeMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.io.Serializable, java.io.Serializable>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0210");
        java.lang.Class<?> wildcardClass1 = null;
        org.apache.commons.lang3.tuple.Triple<java.lang.String, java.lang.Class<?>, java.lang.CharSequence> strTriple3 = org.apache.commons.lang3.tuple.Triple.of("(null,,(null,,null))", wildcardClass1, (java.lang.CharSequence) "(null,null,(null,hi!,null))");
        java.lang.Class<?> wildcardClass4 = strTriple3.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement5 = null;
        org.apache.commons.lang3.tuple.Triple<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> genericDeclarationTriple7 = org.apache.commons.lang3.tuple.Triple.of((java.lang.reflect.GenericDeclaration) wildcardClass4, annotatedElement5, (java.lang.Comparable<java.lang.String>) "(null,null,(1.0,null,(null,,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTriple3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationTriple7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0211");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.right = "(null,null,null)";
        objMutableTriple0.middle = "(null,hi!,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0212");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.String str5 = objMutableTriple1.toString();
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,hi!,(null,null,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0213");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence4 = objMutableTriple3.middle;
        objMutableTriple3.setLeft((java.lang.Object) 1);
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple3);
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(null,null,(null,,null))");
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
            System.out.format("%n%s%n", "MutableTriple0.test0214");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = charSequence3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0215");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        java.lang.CharSequence charSequence7 = objMutableTriple0.right;
        objMutableTriple0.right = "(1,null,(null,null,(null,,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0216");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.String, java.lang.CharSequence> objTriple8 = org.apache.commons.lang3.tuple.Triple.of((java.lang.Object) objMutableTriple3, "(null,null,(null,,null))", (java.lang.CharSequence) "(null,,null)");
        java.lang.Class<?> wildcardClass9 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objTriple8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0217");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,,(null,,null))", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(1,null,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple4.setMiddle((java.lang.CharSequence) "");
        objMutableTriple3.setLeft((java.lang.Object) "");
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0218");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple1.getMiddle();
        java.lang.CharSequence charSequence8 = objMutableTriple1.getRight();
        java.lang.CharSequence charSequence9 = objMutableTriple1.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0219");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj4 = objMutableTriple3.left;
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,(null,null,null),null)");
        java.lang.CharSequence charSequence7 = objMutableTriple3.getMiddle();
        java.lang.CharSequence charSequence8 = objMutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,(null,null,null),null)" + "'", charSequence8.equals("(null,(null,null,null),null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0220");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.String str6 = objMutableTriple3.toString("(null,null,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple3.getRight();
        java.lang.Object obj8 = objMutableTriple3.left;
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null,null)" + "'", str6.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,hi!,null)" + "'", charSequence7.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "" + "'", obj8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0221");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
        java.lang.Object obj9 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0222");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence7 = null;
        objMutableTriple0.setMiddle(charSequence7);
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,hi!,null)" + "'", charSequence9.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0223");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.left = "(null,null,(null,,null))";
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj8 = objMutableTriple0.left;
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "(null,null,(null,,null))" + "'", obj8.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "(null,null,(null,,null))" + "'", obj9.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0224");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.Object obj5 = null;
        boolean boolean6 = objMutableTriple0.equals(obj5);
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
        java.lang.String str8 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence9 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(null,null,(null,,null)),null)" + "'", str8.equals("(null,(null,null,(null,,null)),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null,(null,,null))" + "'", charSequence9.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0225");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "(null,null,(null,,null))";
        objMutableTriple0.right = "(null,null,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0226");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,hi!,null)");
        objMutableTriple1.middle = "hi!";
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
            System.out.format("%n%s%n", "MutableTriple0.test0227");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.Object, java.io.Serializable> typeMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.Object, java.io.Serializable>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0228");
        org.apache.commons.lang3.tuple.Triple<java.lang.CharSequence, java.lang.Comparable<java.lang.String>, java.lang.CharSequence> charSequenceTriple3 = org.apache.commons.lang3.tuple.Triple.of((java.lang.CharSequence) "(1.0,hi!,(null,,null))", (java.lang.Comparable<java.lang.String>) "((null,,null),null,null)", (java.lang.CharSequence) "(1,null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTriple3);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0229");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        java.lang.String str8 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,hi!)" + "'", str8.equals("(null,null,hi!)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0230");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.CharSequence, java.lang.String> strComparableMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.CharSequence, java.lang.String>((java.lang.Comparable<java.lang.String>) "(null,hi!,null)", (java.lang.CharSequence) "(null,hi!,null)", "(null,,null)");
        objMutableTriple0.left = "(null,,null)";
        java.lang.CharSequence charSequence9 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0231");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        java.lang.String str5 = objMutableTriple3.toString("(1.0,null,(null,,null))");
        java.lang.String str6 = objMutableTriple3.toString();
        java.lang.CharSequence charSequence7 = objMutableTriple3.getMiddle();
        java.lang.Object obj8 = null;
        boolean boolean9 = objMutableTriple3.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(1.0,null,(null,,null))" + "'", str5.equals("(1.0,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(,(null,null,(null,,null)),(null,hi!,null))" + "'", str6.equals("(,(null,null,(null,,null)),(null,hi!,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0232");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> wildcardClassMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) wildcardClassMutableTriple0, (java.lang.CharSequence) "", (java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
        objMutableTriple3.middle = "((null,,null),null,null)";
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0233");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence6 = null;
        objMutableTriple0.middle = charSequence6;
        objMutableTriple0.right = "(null,null,(1.0,null,(null,,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0234");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.Object obj4 = objMutableTriple3.left;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj6 = objMutableTriple5.getLeft();
        objMutableTriple5.setRight((java.lang.CharSequence) "(null,hi!,null)");
        boolean boolean9 = objMutableTriple3.equals((java.lang.Object) objMutableTriple5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100.0d + "'", obj4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0235");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence5 = objMutableTriple0.middle;
        objMutableTriple0.right = "(1.0,null,hi!)";
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
            System.out.format("%n%s%n", "MutableTriple0.test0236");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.String str6 = objMutableTriple3.toString("(null,null,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple3.getRight();
        java.lang.Object obj8 = objMutableTriple3.left;
        java.lang.CharSequence charSequence9 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null,null)" + "'", str6.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,hi!,null)" + "'", charSequence7.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "" + "'", obj8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,hi!,null)" + "'", charSequence9.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0237");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.getRight();
        objMutableTriple1.setRight((java.lang.CharSequence) "(1.0,null,(null,,null))");
        java.lang.String str8 = objMutableTriple1.toString();
        java.lang.CharSequence charSequence9 = objMutableTriple1.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,(1.0,null,(null,,null)))" + "'", str8.equals("(null,null,(1.0,null,(null,,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(1.0,null,(null,,null))" + "'", charSequence9.equals("(1.0,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0238");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> strComparableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0239");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "hi!";
        java.lang.Object obj7 = objMutableTriple3.left;
        java.lang.Object obj8 = objMutableTriple3.getLeft();
        java.lang.String str9 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(1.0,null,hi!)" + "'", str9.equals("(1.0,null,hi!)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0240");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> strMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0241");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass6 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0242");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.Class<?> wildcardClass4 = objMutableTriple0.getClass();
        java.lang.reflect.Type type5 = null;
        org.apache.commons.lang3.tuple.Triple<java.lang.Class<?>, java.lang.reflect.Type, java.lang.String> wildcardClassTriple7 = org.apache.commons.lang3.tuple.Triple.of(wildcardClass4, type5, "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassTriple7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0243");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.left;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,,(null,,null))", (java.lang.CharSequence) "(1,null,(null,,null))");
        objMutableTriple0.right = "(null,(1.0,hi!,(null,,null)),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0244");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence5 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
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
            System.out.format("%n%s%n", "MutableTriple0.test0245");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, (java.lang.CharSequence) "(null,(null,null,null),null)", (java.lang.CharSequence) "(null,(null,null,null),null)");
        java.lang.String str8 = objMutableTriple6.toString("");
        java.lang.CharSequence charSequence9 = objMutableTriple6.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,(null,null,null),null)" + "'", charSequence9.equals("(null,(null,null,null),null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0246");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.String str6 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.String str9 = objMutableTriple0.toString("((null,,null),null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!,null)" + "'", str6.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((null,,null),null,null)" + "'", str9.equals("((null,,null),null,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0247");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "";
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0248");
        org.apache.commons.lang3.tuple.Triple<java.lang.String, java.lang.String, java.lang.CharSequence> strTriple3 = org.apache.commons.lang3.tuple.Triple.of("(null,,(null,,null))", "(null,hi!,null)", (java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTriple3);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0249");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        objMutableTriple3.right = "(1,null,(null,null,(null,,null)))";
        java.lang.String str6 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))" + "'", str6.equals("(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0250");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        java.lang.String str7 = objMutableTriple1.toString();
        java.lang.String str8 = objMutableTriple1.toString();
        java.lang.Object obj9 = objMutableTriple1.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,,null)" + "'", str7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,,null)" + "'", str8.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0251");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.String str6 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,(null,,null),null)";
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
            System.out.format("%n%s%n", "MutableTriple0.test0252");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.middle = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence7 = objMutableTriple3.middle;
        objMutableTriple3.right = "(1,(null,hi!,null),(null,null,(null,hi!,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0253");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj5 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = charSequence6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0254");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple1.getRight();
        java.lang.Object obj7 = objMutableTriple1.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0255");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.String str5 = objMutableTriple0.toString("(null,,null)");
        java.lang.String str6 = objMutableTriple0.toString();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(1,null,(null,null,(null,,null)))");
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!,null)" + "'", str6.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0256");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        java.lang.Class<?> wildcardClass9 = charSequence8.getClass();
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
            System.out.format("%n%s%n", "MutableTriple0.test0257");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.String str8 = objMutableTriple0.toString("(1.0,hi!,(null,,null))");
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
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
            System.out.format("%n%s%n", "MutableTriple0.test0258");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.String, java.lang.reflect.AnnotatedElement> typeMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.String, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0259");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        objMutableTriple0.right = "(null,null,(null,hi!,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0260");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.Class<?> wildcardClass6 = objMutableTriple0.getClass();
        org.apache.commons.lang3.tuple.Triple<java.lang.reflect.AnnotatedElement, java.lang.CharSequence, java.lang.CharSequence> annotatedElementTriple9 = org.apache.commons.lang3.tuple.Triple.of((java.lang.reflect.AnnotatedElement) wildcardClass6, (java.lang.CharSequence) "(1,null,null)", (java.lang.CharSequence) "(null,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementTriple9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0261");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "hi!");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0262");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        objMutableTriple0.right = "(null,null,null)";
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0263");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.middle = "(1.0,null,hi!)";
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(null,hi!,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0264");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.CharSequence, java.lang.String> strComparableMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.CharSequence, java.lang.String>((java.lang.Comparable<java.lang.String>) "(null,hi!,null)", (java.lang.CharSequence) "(null,hi!,null)", "(null,,null)");
        objMutableTriple0.left = "(null,,null)";
        java.lang.CharSequence charSequence9 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0265");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.Object obj5 = objMutableTriple3.left;
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,hi!,null)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1.0,hi!,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 1 + "'", obj5.equals((byte) 1));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0266");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.String str4 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(1,(null,hi!,null),(null,,(null,,null)))" + "'", str4.equals("(1,(null,hi!,null),(null,,(null,,null)))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0267");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.Object obj5 = null;
        boolean boolean6 = objMutableTriple0.equals(obj5);
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null,(null,,null))" + "'", charSequence8.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0268");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> typeMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0269");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.right = "(null,null,null)";
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass8 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0270");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence7 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0271");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.left = "(null,null,(null,,null))";
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null,(null,,null))" + "'", charSequence8.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0272");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.Object obj5 = objMutableTriple0.left;
        java.lang.Class<?> wildcardClass6 = objMutableTriple0.getClass();
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> genericDeclarationMutableTriple9 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>((java.lang.reflect.GenericDeclaration) wildcardClass6, strComparable7, (java.lang.Comparable<java.lang.String>) "(null,(null,null,(null,,null)),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0273");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence7 = null;
        objMutableTriple0.setMiddle(charSequence7);
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,hi!,null)" + "'", charSequence9.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0274");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(1,null,(null,null,(null,,null)))";
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,(null,,null))" + "'", str5.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,,null)" + "'", charSequence6.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0275");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        java.lang.Object obj2 = objMutableTriple0.left;
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0276");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        objMutableTriple0.right = "(null,hi!,null)";
        objMutableTriple0.setRight((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0277");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.left = "(null,,null)";
        java.lang.Class<?> wildcardClass5 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0278");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.middle;
        java.lang.CharSequence charSequence4 = null;
        objMutableTriple2.setMiddle(charSequence4);
        java.lang.String str7 = objMutableTriple2.toString("");
        boolean boolean8 = objMutableTriple0.equals((java.lang.Object) "");
        java.lang.CharSequence charSequence9 = objMutableTriple0.getMiddle();
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
            System.out.format("%n%s%n", "MutableTriple0.test0279");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        objMutableTriple0.right = "(null,,null)";
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,hi!,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0280");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.right = "(null,null,null)";
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.Object obj8 = objMutableTriple0.getLeft();
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0281");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.right = "(null,null,(null,,null))";
        java.lang.Object obj6 = objMutableTriple0.left;
        java.lang.String str7 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence8 = null;
        objMutableTriple0.middle = charSequence8;
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
            System.out.format("%n%s%n", "MutableTriple0.test0282");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        java.lang.String str6 = objMutableTriple3.toString("(null,null,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple3.getMiddle();
        java.lang.Class<?> wildcardClass8 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null,null)" + "'", str6.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0283");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        java.lang.String str7 = objMutableTriple1.toString();
        java.lang.CharSequence charSequence8 = objMutableTriple1.middle;
        java.lang.Object obj9 = objMutableTriple1.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,,null)" + "'", str7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0284");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!,null)" + "'", charSequence8.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0285");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,null)");
        java.lang.String str6 = objMutableTriple0.toString();
        objMutableTriple0.right = "(null,(1.0,hi!,(null,,null)),null)";
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,(null,null,null),null)" + "'", str6.equals("(null,(null,null,null),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0286");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        java.lang.Object obj8 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
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
            System.out.format("%n%s%n", "MutableTriple0.test0287");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.Object obj5 = null;
        boolean boolean6 = objMutableTriple0.equals(obj5);
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
        java.lang.String str8 = objMutableTriple0.toString();
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(null,null,(null,,null)),null)" + "'", str8.equals("(null,(null,null,(null,,null)),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0288");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.left = "(null,,null)";
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.String str7 = objMutableTriple0.toString();
        java.lang.String str9 = objMutableTriple0.toString("(null,,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((null,,null),null,null)" + "'", str7.equals("((null,,null),null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,,(null,,null))" + "'", str9.equals("(null,,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0289");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str3 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        java.lang.String str6 = objMutableTriple0.toString("(null,hi!,null)");
        objMutableTriple0.middle = "hi!";
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
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0290");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        java.lang.Object obj6 = objMutableTriple0.left;
        java.lang.String str8 = objMutableTriple0.toString("(null,,null)");
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
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
            System.out.format("%n%s%n", "MutableTriple0.test0291");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable, java.lang.Comparable<java.lang.String>> objMutableTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0292");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.String str5 = objMutableTriple0.toString("(null,,null)");
        objMutableTriple0.setLeft((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1.0f) + "'", obj8.equals((-1.0f)));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0293");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,(null,,null))" + "'", str5.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0294");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        java.lang.CharSequence charSequence6 = null;
        objMutableTriple0.middle = charSequence6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0295");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.String str5 = objMutableTriple0.toString("(null,,null)");
        objMutableTriple0.setLeft((java.lang.Object) (-1.0f));
        objMutableTriple0.right = "(null,(1.0,hi!,(null,,null)),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0296");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str3 = objMutableTriple0.toString();
        objMutableTriple0.right = "(null,hi!,hi!)";
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence7 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(null,null,null)" + "'", str3.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,hi!,hi!)" + "'", charSequence7.equals("(null,hi!,hi!)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0297");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,hi!,(null,null,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(1,null,null)" + "'", str5.equals("(1,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0298");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,hi!,null)");
        objMutableTriple1.right = "(1.0,hi!,(null,,null))";
        java.lang.CharSequence charSequence9 = objMutableTriple1.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(1.0,hi!,(null,,null))" + "'", charSequence9.equals("(1.0,hi!,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0299");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        java.lang.CharSequence charSequence5 = objMutableTriple3.getRight();
        java.lang.String str7 = objMutableTriple3.toString("(1.0,null,(null,,null))");
        java.lang.Class<?> wildcardClass8 = objMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,,null)" + "'", charSequence5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1.0,null,(null,,null))" + "'", str7.equals("(1.0,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0300");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple1.getMiddle();
        java.lang.CharSequence charSequence8 = objMutableTriple1.middle;
        java.lang.CharSequence charSequence9 = objMutableTriple1.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0301");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj4 = objMutableTriple3.left;
        java.lang.CharSequence charSequence5 = objMutableTriple3.getMiddle();
        objMutableTriple3.setMiddle((java.lang.CharSequence) "((null,,null),null,null)");
        java.lang.CharSequence charSequence8 = objMutableTriple3.getMiddle();
        java.lang.CharSequence charSequence9 = objMutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "((null,,null),null,null)" + "'", charSequence8.equals("((null,,null),null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,,null)" + "'", charSequence9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0302");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        objMutableTriple0.right = "(null,,null)";
        java.lang.String str8 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,(null,,null))" + "'", str8.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,,null)" + "'", charSequence9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0303");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.Object obj5 = objMutableTriple3.left;
        objMutableTriple3.right = "(null,null,(null,hi!,null))";
        java.lang.CharSequence charSequence8 = objMutableTriple3.right;
        java.lang.CharSequence charSequence9 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 1 + "'", obj5.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null,(null,hi!,null))" + "'", charSequence8.equals("(null,null,(null,hi!,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,hi!,null)" + "'", charSequence9.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0304");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutableTriple4.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple4.getRight();
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple4);
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(100.0,hi!,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0305");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(1,null,(null,null,(null,,null)))";
        java.lang.Object obj9 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,(null,,null))" + "'", str5.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,,null)" + "'", charSequence6.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0306");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0307");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        java.lang.CharSequence charSequence5 = objMutableTriple3.getRight();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple8 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple3, (java.lang.CharSequence) "((null,,null),null,null)", (java.lang.CharSequence) "(1.0,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,,null)" + "'", charSequence5.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0308");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.getMiddle();
        objMutableTriple2.middle = "hi!";
        java.lang.CharSequence charSequence6 = objMutableTriple2.middle;
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple2);
        objMutableTriple2.setRight((java.lang.CharSequence) "(1,null,(null,,null))");
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
            System.out.format("%n%s%n", "MutableTriple0.test0309");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.Class<?> wildcardClass5 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0310");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.left = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.Class<?> wildcardClass7 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0311");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.Comparable<java.lang.String>, java.lang.Object> charSequenceMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.Comparable<java.lang.String>, java.lang.Object>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0312");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        boolean boolean6 = objMutableTriple1.equals((java.lang.Object) (byte) 0);
        java.lang.CharSequence charSequence7 = objMutableTriple1.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple1.middle;
        java.lang.Object obj9 = objMutableTriple1.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0313");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.setRight((java.lang.CharSequence) "(1,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0314");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutableTriple4.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple4.getRight();
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple4);
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        java.lang.CharSequence charSequence9 = objMutableTriple0.getMiddle();
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
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0315");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.Object obj5 = objMutableTriple0.left;
        objMutableTriple0.middle = "((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0316");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        objMutableTriple0.middle = "";
        java.lang.String str8 = objMutableTriple0.toString("(null,hi!,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null,null)" + "'", str4.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,hi!,hi!)" + "'", str8.equals("(null,hi!,hi!)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0317");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.Object, java.lang.reflect.GenericDeclaration> genericDeclarationMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.Object, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0318");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.setLeft((java.lang.Object) 1.0f);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        java.lang.String str7 = objMutableTriple0.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0319");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence4 = objMutableTriple3.middle;
        objMutableTriple3.setLeft((java.lang.Object) 1);
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple3);
        objMutableTriple3.right = "((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))";
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
            System.out.format("%n%s%n", "MutableTriple0.test0320");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.String str1 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "(null,null,null)" + "'", str1.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0321");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        objMutableTriple3.right = "(null,null,(null,,null))";
        objMutableTriple3.middle = "(100.0,hi!,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0322");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence9 = objMutableTriple0.middle;
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
            System.out.format("%n%s%n", "MutableTriple0.test0323");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,hi!,null)");
        objMutableTriple1.right = "(1.0,hi!,(null,,null))";
        java.lang.CharSequence charSequence9 = objMutableTriple1.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0324");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        boolean boolean6 = objMutableTriple1.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = objMutableTriple1.toString();
        objMutableTriple1.right = "(null,(1.0,hi!,(null,,null)),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,,null)" + "'", str7.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0325");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.reflect.Type, java.lang.reflect.Type> charSequenceMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.reflect.Type, java.lang.reflect.Type>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0326");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.String str5 = objMutableTriple1.toString();
        objMutableTriple1.middle = "(1,null,(null,,null))";
        objMutableTriple1.middle = "((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0327");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.middle = "(null,null,null)";
        java.lang.String str7 = objMutableTriple1.toString();
        java.lang.CharSequence charSequence8 = objMutableTriple1.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,(null,null,null),null)" + "'", str7.equals("(null,(null,null,null),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0328");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) (short) 10);
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
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0329");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        java.lang.Object obj4 = null;
        boolean boolean5 = objMutableTriple0.equals(obj4);
        java.lang.Object obj6 = objMutableTriple0.left;
        objMutableTriple0.middle = "(null,null,(1.0,null,(null,,null)))";
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
            System.out.format("%n%s%n", "MutableTriple0.test0330");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getMiddle();
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
            System.out.format("%n%s%n", "MutableTriple0.test0331");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.right = "(null,null,null)";
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        java.lang.String str7 = objMutableTriple0.toString();
        objMutableTriple0.right = "((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null,null)" + "'", charSequence6.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,hi!,(null,null,null))" + "'", str7.equals("(null,hi!,(null,null,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0332");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str7 = objMutableTriple0.toString();
        java.lang.Class<?> wildcardClass8 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null,(null,,null))" + "'", str7.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0333");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.Type, java.io.Serializable> objMutableTripleMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.Type, java.io.Serializable>();
        objMutableTriple0.setLeft((java.lang.Object) objMutableTripleMutableTriple6);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0334");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        objMutableTriple1.right = "";
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.String> strComparableMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.String>((java.lang.Comparable<java.lang.String>) "(null,null,null)", (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, "");
        objMutableTriple1.right = "(null,null,(1.0,null,(null,,null)))";
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0335");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,hi!,null)");
        java.lang.Object obj8 = objMutableTriple0.getLeft();
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,(null,,null))" + "'", str5.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0336");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.getRight();
        java.lang.Object obj6 = objMutableTriple1.left;
        java.lang.CharSequence charSequence7 = objMutableTriple1.getMiddle();
        objMutableTriple1.right = "(100.0,hi!,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0337");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.right = "(null,null,null)";
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        objMutableTriple0.setRight((java.lang.CharSequence) "(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null,null)" + "'", charSequence6.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0338");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0339");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.String str5 = objMutableTriple0.toString("(null,,null)");
        java.lang.String str6 = objMutableTriple0.toString();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj9 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!,null)" + "'", str6.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0340");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        boolean boolean6 = objMutableTriple1.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = objMutableTriple1.toString();
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,hi!,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,,null)" + "'", str7.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0341");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.String str5 = objMutableTriple1.toString();
        java.lang.Object obj6 = objMutableTriple1.left;
        java.lang.String str7 = objMutableTriple1.toString();
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,,null)" + "'", str7.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0342");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(1.0,null,(null,,null)))";
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.reflect.AnnotatedElement> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.reflect.AnnotatedElement>();
        objMutableTriple0.left = objMutableTriple6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0343");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutableTriple4.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple4.getMiddle();
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple4);
        objMutableTriple0.middle = "(1.0,null,(null,,null))";
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
            System.out.format("%n%s%n", "MutableTriple0.test0344");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence8 = objMutableTriple7.getRight();
        java.lang.Object obj9 = objMutableTriple7.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null,null)" + "'", charSequence8.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0345");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.left = "(null,,null)";
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.String str8 = objMutableTriple0.toString("(,(null,null,(null,,null)),(null,hi!,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(,(null,null,(null,,null)),(null,hi!,null))" + "'", str8.equals("(,(null,null,(null,,null)),(null,hi!,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0346");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.AnnotatedElement, java.lang.reflect.Type>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0347");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 0L, (java.lang.CharSequence) "(null,(null,null,null),null)", (java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0L + "'", obj4.equals(0L));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0348");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.Object obj5 = null;
        boolean boolean6 = objMutableTriple0.equals(obj5);
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
        java.lang.String str8 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(null,null,(null,,null)),null)" + "'", str8.equals("(null,(null,null,(null,,null)),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0349");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0350");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.String str6 = objMutableTriple0.toString("(null,hi!,null)");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(1.0,hi!,(null,,null))");
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
            System.out.format("%n%s%n", "MutableTriple0.test0351");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        objMutableTriple3.right = "(1,null,(null,null,(null,,null)))";
        java.lang.Object obj6 = objMutableTriple3.left;
        objMutableTriple3.setRight((java.lang.CharSequence) "(100.0,hi!,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0352");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        java.lang.Object obj4 = null;
        boolean boolean5 = objMutableTriple0.equals(obj4);
        java.lang.Object obj6 = objMutableTriple0.left;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(1,(null,hi!,null),(null,,(null,,null)))");
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0353");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (-1L), (java.lang.CharSequence) "", (java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "" + "'", charSequence4.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0354");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,(null,hi!,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,(null,,null))" + "'", str5.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0355");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.CharSequence charSequence7 = objMutableTriple1.middle;
        java.lang.CharSequence charSequence8 = objMutableTriple1.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0356");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objTriple4 = null;
        org.apache.commons.lang3.tuple.Triple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.CharSequence, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objTripleTriple5 = org.apache.commons.lang3.tuple.Triple.of((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple0, (java.lang.CharSequence) "(null,(null,null,(null,,null)),null)", objTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objTripleTriple5);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0357");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(1,null,null)");
        java.lang.CharSequence charSequence9 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(1,null,null)" + "'", charSequence9.equals("(1,null,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0358");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
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
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0359");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.left = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        java.lang.Class<?> wildcardClass8 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "(null,null,(null,,null))" + "'", obj7.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0360");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.String str4 = objMutableTriple0.toString("(null,null,(null,,null))");
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,,(null,,null))";
        objMutableTriple0.middle = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null,(null,,null))" + "'", str4.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0361");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        java.lang.String str7 = objMutableTriple0.toString();
        objMutableTriple0.right = "(null,null,hi!)";
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
            System.out.format("%n%s%n", "MutableTriple0.test0362");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.Object obj5 = null;
        boolean boolean6 = objMutableTriple0.equals(obj5);
        java.lang.Object obj7 = objMutableTriple0.left;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(100.0,hi!,hi!)");
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
            System.out.format("%n%s%n", "MutableTriple0.test0363");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.String str6 = objMutableTriple0.toString("(null,null,(1.0,null,(null,,null)))");
        objMutableTriple0.right = "hi!";
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
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0364");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple4.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = objMutableTriple4.right;
        int int8 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple4);
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0365");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(1.0,null,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0366");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.Class<?> wildcardClass5 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0367");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        objMutableTriple1.right = "";
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.String> strComparableMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.String>((java.lang.Comparable<java.lang.String>) "(null,null,null)", (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, "");
        java.lang.String str9 = objMutableTriple1.toString("(null,null,(null,hi!,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null,(null,hi!,null))" + "'", str9.equals("(null,null,(null,hi!,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0368");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.Object obj5 = objMutableTriple3.left;
        objMutableTriple3.right = "(null,null,(null,hi!,null))";
        java.lang.CharSequence charSequence8 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 1 + "'", obj5.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!,null)" + "'", charSequence8.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0369");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.Object obj6 = objMutableTriple0.getLeft();
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        java.lang.String str9 = objMutableTriple0.toString("(null,hi!,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1 + "'", obj7.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,hi!,null)" + "'", str9.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0370");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> wildcardClassMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0371");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple1.middle;
        java.lang.CharSequence charSequence8 = objMutableTriple1.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0372");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.Class<?> wildcardClass5 = objMutableTriple4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0373");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        objMutableTriple1.right = "";
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.String> strComparableMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.String>((java.lang.Comparable<java.lang.String>) "(null,null,null)", (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, "");
        java.lang.String str8 = objMutableTriple1.toString();
        java.lang.Object obj9 = objMutableTriple1.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,,)" + "'", str8.equals("(null,,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0374");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getRight();
        java.lang.Object obj3 = objMutableTriple1.left;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.String> charSequenceMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.String>((java.lang.CharSequence) "(null,null,null)", objMutableTriple1, "(null,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0375");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        java.lang.String str7 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null,(null,hi!,null))" + "'", str7.equals("(null,null,(null,hi!,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0376");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence5 = objMutableTriple4.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple4.getMiddle();
        int int7 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple4);
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,hi!,(null,null,null))");
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
            System.out.format("%n%s%n", "MutableTriple0.test0377");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getRight();
        objMutableTriple1.setLeft((java.lang.Object) 1.0f);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,hi!,null)");
        java.lang.Class<?> wildcardClass7 = objMutableTriple1.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.reflect.GenericDeclaration, java.lang.String> strMutableTriple9 = org.apache.commons.lang3.tuple.MutableTriple.of("(null,null,hi!)", (java.lang.reflect.GenericDeclaration) wildcardClass7, "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strMutableTriple9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0378");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.Object obj5 = objMutableTriple3.left;
        objMutableTriple3.right = "(null,null,(null,hi!,null))";
        objMutableTriple3.setRight((java.lang.CharSequence) "(1.0,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 1 + "'", obj5.equals((byte) 1));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0379");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = charSequence8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0380");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(1,null,null)", (java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.CharSequence charSequence8 = objMutableTriple7.getMiddle();
        java.lang.CharSequence charSequence9 = objMutableTriple7.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(1,null,null)" + "'", charSequence8.equals("(1,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(1,null,null)" + "'", charSequence9.equals("(1,null,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0381");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.middle = "";
        java.lang.Object obj7 = objMutableTriple0.left;
        objMutableTriple0.setRight((java.lang.CharSequence) "(,(null,null,(null,,null)),(null,hi!,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0382");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.String str5 = objMutableTriple0.toString();
        objMutableTriple0.right = "(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))";
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,hi!)" + "'", str5.equals("(null,null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0383");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        java.lang.Class<?> wildcardClass6 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0384");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str7 = objMutableTriple0.toString();
        objMutableTriple0.right = "(1,null,(null,,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,null,(null,,null))" + "'", str7.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0385");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        objMutableTriple1.setMiddle((java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence9 = objMutableTriple1.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0386");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj3 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        java.lang.Object obj5 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0387");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        java.lang.Object obj3 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0388");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        objMutableTriple0.right = "(1.0,hi!,(null,,null))";
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
            System.out.format("%n%s%n", "MutableTriple0.test0389");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.String str5 = objMutableTriple0.toString("");
        java.lang.String str7 = objMutableTriple0.toString("");
        java.lang.Class<?> wildcardClass8 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0390");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        java.lang.CharSequence charSequence5 = objMutableTriple3.getRight();
        objMutableTriple3.right = "(null,(1.0,hi!,(null,,null)),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,,null)" + "'", charSequence5.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0391");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        boolean boolean5 = objMutableTriple0.equals((java.lang.Object) 1L);
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
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
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0392");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> wildcardClassMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) wildcardClassMutableTriple0, (java.lang.CharSequence) "", (java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,(null,null,(null,,null)),null)");
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0393");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
        java.lang.Class<?> wildcardClass1 = serializableMutableTriple0.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.middle;
        java.lang.CharSequence charSequence4 = objMutableTriple2.getMiddle();
        java.lang.CharSequence charSequence5 = objMutableTriple2.getRight();
        java.lang.String str7 = objMutableTriple2.toString("(1,(null,hi!,null),(null,,(null,,null)))");
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        org.apache.commons.lang3.tuple.Triple<java.lang.reflect.Type, java.lang.Object, java.lang.Comparable<java.lang.String>> typeTriple9 = org.apache.commons.lang3.tuple.Triple.of((java.lang.reflect.Type) wildcardClass1, (java.lang.Object) objMutableTriple2, strComparable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1,(null,hi!,null),(null,,(null,,null)))" + "'", str7.equals("(1,(null,hi!,null),(null,,(null,,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeTriple9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0394");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean5 = objMutableTriple3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = objMutableTriple3.getLeft();
        objMutableTriple0.left = obj6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0395");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,,(null,,null))";
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
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0396");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.left;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,,(null,,null))", (java.lang.CharSequence) "(1,null,(null,,null))");
        objMutableTriple7.setRight((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0397");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0398");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.CharSequence charSequence7 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0399");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "(null,null,null)");
        objMutableTriple7.setMiddle((java.lang.CharSequence) "(null,(null,null,(null,,null)),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0400");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        java.lang.CharSequence charSequence5 = objMutableTriple3.getRight();
        java.lang.Object obj6 = objMutableTriple3.left;
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objTriple7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = objMutableTriple3.compareTo(objTriple7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,,null)" + "'", charSequence5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0401");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "(null,,null)";
        java.lang.CharSequence charSequence7 = objMutableTriple3.right;
        java.lang.CharSequence charSequence8 = objMutableTriple3.right;
        java.lang.CharSequence charSequence9 = objMutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,,null)" + "'", charSequence8.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,,null)" + "'", charSequence9.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0402");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,hi!,null)");
        objMutableTriple1.right = "(1.0,hi!,(null,,null))";
        java.lang.CharSequence charSequence9 = objMutableTriple1.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0403");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.String str5 = objMutableTriple0.toString("(null,,null)");
        java.lang.String str6 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence7 = objMutableTriple0.right;
        objMutableTriple0.right = "";
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
            System.out.format("%n%s%n", "MutableTriple0.test0404");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = charSequence6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0405");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,,(null,,null))", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(1,null,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.String str5 = objMutableTriple3.toString();
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,null,(null,,null))" + "'", charSequence4.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))" + "'", str5.equals("((null,,(null,,null)),(null,null,(null,,null)),(1,null,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0406");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,(null,null,null),null)", (java.lang.CharSequence) "(null,,)");
        objMutableTriple3.right = "(1.0,null,(null,,null))";
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0407");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple4.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = objMutableTriple4.right;
        int int8 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple4);
        java.lang.CharSequence charSequence9 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0408");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.middle = "hi!";
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple8 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,(null,null,(null,,null)),)", (java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0409");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        objMutableTriple0.right = "(null,hi!,null)";
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1 + "'", obj4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0410");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.Object obj5 = objMutableTriple3.left;
        objMutableTriple3.right = "(null,null,(null,hi!,null))";
        java.lang.CharSequence charSequence8 = objMutableTriple3.getMiddle();
        java.lang.CharSequence charSequence9 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 1 + "'", obj5.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,hi!,null)" + "'", charSequence8.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null,(null,hi!,null))" + "'", charSequence9.equals("(null,null,(null,hi!,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0411");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "";
        java.lang.String str4 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,,null)" + "'", str4.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0412");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(1,null,(null,null,(null,,null)))");
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,)");
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
            System.out.format("%n%s%n", "MutableTriple0.test0413");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) (short) 100);
        java.lang.Object obj9 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 100 + "'", obj9.equals((short) 100));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0414");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> wildcardClassMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0415");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.middle = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence6 = objMutableTriple3.getMiddle();
        java.lang.CharSequence charSequence7 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null,(null,,null))" + "'", charSequence6.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0416");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.String str6 = objMutableTriple0.toString("(null,null,(1.0,null,(null,,null)))");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0417");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.middle = "(null,null,(null,,null))";
        objMutableTriple3.setRight((java.lang.CharSequence) "(1.0,null,hi!)");
        java.lang.CharSequence charSequence9 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null,(null,,null))" + "'", charSequence9.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0418");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 0L, (java.lang.CharSequence) "(null,(null,null,null),null)", (java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,(null,null,null),null)" + "'", charSequence4.equals("(null,(null,null,null),null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0419");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.getRight();
        objMutableTriple1.setRight((java.lang.CharSequence) "(1.0,null,(null,,null))");
        java.lang.String str8 = objMutableTriple1.toString();
        java.lang.String str9 = objMutableTriple1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,(1.0,null,(null,,null)))" + "'", str8.equals("(null,null,(1.0,null,(null,,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null,(1.0,null,(null,,null)))" + "'", str9.equals("(null,null,(1.0,null,(null,,null)))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0420");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.right = "(null,null,(null,,null))";
        java.lang.Object obj6 = objMutableTriple0.left;
        java.lang.String str7 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getRight();
        java.lang.Class<?> wildcardClass9 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1 + "'", obj6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(1,null,(null,null,(null,,null)))" + "'", str7.equals("(1,null,(null,null,(null,,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null,(null,,null))" + "'", charSequence8.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0421");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> charSequenceMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0422");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.right = "(null,null,null)";
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        java.lang.String str7 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null,null)" + "'", charSequence6.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,hi!,(null,null,null))" + "'", str7.equals("(null,hi!,(null,null,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0423");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        objMutableTriple0.right = "(null,null,null)";
        java.lang.String str8 = objMutableTriple0.toString();
        java.lang.String str9 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,hi!,(null,null,null))" + "'", str8.equals("(null,hi!,(null,null,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,hi!,(null,null,null))" + "'", str9.equals("(null,hi!,(null,null,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0424");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str7 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getRight();
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
            System.out.format("%n%s%n", "MutableTriple0.test0425");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,,null)", (java.lang.CharSequence) "(1,null,null)", (java.lang.CharSequence) "");
        java.lang.String str9 = objMutableTriple7.toString("(null,null,(1.0,null,(null,,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null,(1.0,null,(null,,null)))" + "'", str9.equals("(null,null,(1.0,null,(null,,null)))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0426");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple1.middle;
        java.lang.CharSequence charSequence8 = objMutableTriple1.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0427");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Object> objTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Object>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0428");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.right = "(null,,null)";
        java.lang.CharSequence charSequence7 = objMutableTriple3.right;
        java.lang.String str9 = objMutableTriple3.toString("(null,hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,hi!,)" + "'", str9.equals("(null,hi!,)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0429");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        java.lang.CharSequence charSequence7 = objMutableTriple1.getMiddle();
        objMutableTriple1.setLeft((java.lang.Object) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0430");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        objMutableTriple0.middle = "(null,,null)";
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.Object obj8 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0431");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.left = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        java.lang.String str8 = objMutableTriple0.toString("(1.0,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(1.0,null,(null,,null))" + "'", str8.equals("(1.0,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0432");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.String str4 = objMutableTriple0.toString("(null,null,(null,,null))");
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,,(null,,null))";
        java.lang.String str8 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null,(null,,null))" + "'", str4.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(null,,(null,,null)),null)" + "'", str8.equals("(null,(null,,(null,,null)),null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0433");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.left = "(null,,null)";
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        java.lang.Object obj6 = null;
        objMutableTriple0.left = obj6;
        java.lang.Object obj8 = objMutableTriple0.getLeft();
        java.lang.Object obj9 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
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
            System.out.format("%n%s%n", "MutableTriple0.test0434");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0435");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.right;
        java.lang.Class<?> wildcardClass6 = objMutableTriple1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0436");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.Object obj4 = null;
        objMutableTriple0.left = obj4;
        objMutableTriple0.setLeft((java.lang.Object) "(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))");
        java.lang.Object obj8 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))" + "'", obj8.equals("(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0437");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple1.middle = "";
        java.lang.String str7 = objMutableTriple1.toString();
        java.lang.String str8 = objMutableTriple1.toString();
        java.lang.Object obj9 = objMutableTriple1.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,,null)" + "'", str7.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,,null)" + "'", str8.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0438");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getMiddle();
        java.lang.String str7 = objMutableTriple0.toString("(null,(null,,null),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "(null,null,(null,,null))" + "'", charSequence5.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,(null,,null),null)" + "'", str7.equals("(null,(null,,null),null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0439");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        objMutableTriple0.right = "(null,null,null)";
        java.lang.String str8 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,hi!,(null,null,null))" + "'", str8.equals("(null,hi!,(null,null,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null,null)" + "'", charSequence9.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0440");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0441");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.Object obj5 = null;
        boolean boolean6 = objMutableTriple0.equals(obj5);
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null,(null,,null))" + "'", charSequence8.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0442");
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objTriple0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj2 = objMutableTriple1.getLeft();
        java.lang.CharSequence charSequence3 = objMutableTriple1.getRight();
        objMutableTriple1.left = "(null,,null)";
        java.lang.Object obj6 = objMutableTriple1.left;
        org.apache.commons.lang3.tuple.Triple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Object, java.lang.String> objTripleTriple8 = org.apache.commons.lang3.tuple.Triple.of(objTriple0, (java.lang.Object) objMutableTriple1, "(null,null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "(null,,null)" + "'", obj6.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objTripleTriple8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0443");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        java.lang.Object obj5 = objMutableTriple0.left;
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0444");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        objMutableTriple3.right = "(null,null,(null,,null))";
        objMutableTriple3.right = "(null,null,(1.0,null,(null,,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0445");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "";
        java.lang.CharSequence charSequence4 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        boolean boolean9 = objMutableTriple0.equals((java.lang.Object) "(1,null,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0446");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence4 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "(,(null,null,(null,,null)),(null,hi!,null))");
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence8 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(,(null,null,(null,,null)),(null,hi!,null))" + "'", charSequence8.equals("(,(null,null,(null,,null)),(null,hi!,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0447");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj4 = objMutableTriple3.left;
        java.lang.CharSequence charSequence5 = objMutableTriple3.getMiddle();
        java.lang.CharSequence charSequence6 = objMutableTriple3.middle;
        java.lang.CharSequence charSequence7 = objMutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,,null)" + "'", charSequence7.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0448");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.String str6 = objMutableTriple3.toString("(null,null,(null,,null))");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null,(null,,null))" + "'", str6.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0449");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "");
        objMutableTriple3.right = "(null,,(null,,null))";
        java.lang.CharSequence charSequence6 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,,(null,,null))" + "'", charSequence6.equals("(null,,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0450");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.Object obj5 = objMutableTriple0.getLeft();
        objMutableTriple0.middle = "(null,,null)";
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
            System.out.format("%n%s%n", "MutableTriple0.test0451");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,hi!,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple1.right;
        java.lang.String str8 = objMutableTriple1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,hi!,null)" + "'", charSequence7.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,null,(null,hi!,null))" + "'", str8.equals("(null,null,(null,hi!,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0452");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (-1L), (java.lang.CharSequence) "", (java.lang.CharSequence) "(null,null,null)");
        java.lang.String str4 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(-1,,(null,null,null))" + "'", str4.equals("(-1,,(null,null,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0453");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Object, java.lang.Comparable<java.lang.String>> objTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Object, java.lang.Comparable<java.lang.String>>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence3 = objMutableTriple2.getRight();
        objMutableTriple2.middle = "(null,null,(null,,null))";
        java.lang.Object obj6 = objMutableTriple2.left;
        java.lang.Class<?> wildcardClass7 = objMutableTriple2.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.String, java.lang.Class<?>> objMutableTriple8 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) objTripleMutableTriple0, "(null,null,(null,,null))", wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0454");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence8 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple9 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) charSequence6, (java.lang.CharSequence) "(100.0,hi!,hi!)", charSequence8);
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
            System.out.format("%n%s%n", "MutableTriple0.test0455");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.String str5 = objMutableTriple1.toString();
        java.io.Serializable serializable7 = null;
        org.apache.commons.lang3.tuple.Triple<java.io.Serializable, java.lang.Comparable<java.lang.String>, java.io.Serializable> serializableTriple8 = org.apache.commons.lang3.tuple.Triple.of((java.io.Serializable) objMutableTriple1, (java.lang.Comparable<java.lang.String>) "(null,null,(null,,null))", serializable7);
        java.lang.Object obj9 = objMutableTriple1.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,null)" + "'", str5.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableTriple8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0456");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "hi!");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = objMutableTriple3.getMiddle();
        java.lang.CharSequence charSequence9 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0457");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        objMutableTriple3.right = "(null,(null,null,(null,,null)),null)";
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,(null,,(null,,null)),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0458");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence4 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        objMutableTriple0.right = "(null,null,null)";
        java.lang.Object obj8 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0459");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.Object obj4 = objMutableTriple3.left;
        java.lang.CharSequence charSequence5 = objMutableTriple3.right;
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(null,,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100.0d + "'", obj4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0460");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "";
        objMutableTriple0.right = "(null,(null,null,(null,,null)),)";
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0461");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,)");
        objMutableTriple0.middle = "(null,null,(null,,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0462");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.right;
        java.lang.String str7 = objMutableTriple0.toString();
        java.lang.Object obj8 = null;
        boolean boolean9 = objMutableTriple0.equals(obj8);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0463");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.String str2 = objMutableTriple0.toString();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,hi!)");
        java.lang.Object obj5 = null;
        objMutableTriple0.left = obj5;
        java.lang.Object obj7 = objMutableTriple0.left;
        java.lang.CharSequence charSequence8 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "(null,null,null)" + "'", str2.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0464");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple0.toString();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,hi!,null)");
        java.lang.Object obj8 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,null,(null,,null))" + "'", str5.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0465");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        int int4 = objMutableTriple0.compareTo((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1);
        objMutableTriple0.middle = "";
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,(null,,null),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0466");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement, java.lang.CharSequence>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0467");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.middle = "(null,null,(null,,null))";
        java.lang.CharSequence charSequence7 = objMutableTriple3.middle;
        java.lang.CharSequence charSequence8 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null,(null,,null))" + "'", charSequence8.equals("(null,null,(null,,null))"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0468");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.io.Serializable, java.lang.reflect.GenericDeclaration> charSequenceMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.io.Serializable, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0469");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.middle = "(null,null,null)";
        java.lang.Object obj7 = null;
        objMutableTriple1.left = obj7;
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
            System.out.format("%n%s%n", "MutableTriple0.test0470");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.Object, java.lang.Object> charSequenceMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.Object, java.lang.Object>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0471");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple2.setMiddle((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass5 = objMutableTriple2.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.Class<?>> objMutableTriple6 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) "(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))", (java.lang.CharSequence) "(null,hi!,)", wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple6);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0472");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "";
        objMutableTriple0.left = "(null,null,(null,hi!,null))";
        java.lang.CharSequence charSequence7 = null;
        objMutableTriple0.setRight(charSequence7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0473");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj4 = objMutableTriple3.left;
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,(null,null,null),null)");
        objMutableTriple3.left = 100.0f;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0474");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> strComparableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0475");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(1,null,null)", (java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        java.lang.Class<?> wildcardClass9 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0476");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.String str5 = objMutableTriple3.toString();
        java.lang.Object obj6 = objMutableTriple3.left;
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,(null,null,(null,,null)),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(1,(null,hi!,null),(null,,(null,,null)))" + "'", str5.equals("(1,(null,hi!,null),(null,,(null,,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) 1 + "'", obj6.equals((byte) 1));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0477");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.String str6 = objMutableTriple0.toString("(null,null,(1.0,null,(null,,null)))");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
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
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null,null)" + "'", str4.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,null,(1.0,null,(null,,null)))" + "'", str6.equals("(null,null,(1.0,null,(null,,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0478");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.getRight();
        objMutableTriple1.setRight((java.lang.CharSequence) "(1.0,null,(null,,null))");
        java.lang.CharSequence charSequence8 = objMutableTriple1.middle;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = charSequence8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0479");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "";
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        boolean boolean7 = objMutableTriple0.equals((java.lang.Object) (byte) 1);
        objMutableTriple0.right = "(null,null,null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0480");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.Object obj5 = null;
        boolean boolean6 = objMutableTriple0.equals(obj5);
        java.lang.Object obj7 = objMutableTriple0.getLeft();
        objMutableTriple0.middle = "((null,,null),null,null)";
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
            System.out.format("%n%s%n", "MutableTriple0.test0481");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.right = "(null,null,null)";
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence7 = objMutableTriple0.middle;
        java.lang.Object obj8 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,null,null)" + "'", charSequence6.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0482");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = null;
        objMutableTriple0.setMiddle(charSequence2);
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.String str6 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.Object obj8 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(null,hi!,null)" + "'", str6.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0483");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple6 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,null,null)", (java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence7 = objMutableTriple6.middle;
        java.lang.CharSequence charSequence8 = objMutableTriple6.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,null)" + "'", charSequence7.equals("(null,null,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "(null,null,null)" + "'", charSequence8.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0484");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,null,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple8 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,null,null)", (java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))", (java.lang.CharSequence) "(100.0,hi!,hi!)");
        java.lang.Object obj9 = objMutableTriple8.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "(null,null,null)" + "'", obj9.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0485");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type, java.lang.CharSequence> genericDeclarationMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type, java.lang.CharSequence>();
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0486");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.CharSequence charSequence5 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence6 = objMutableTriple0.getRight();
        objMutableTriple0.left = "(null,hi!,null)";
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
            System.out.format("%n%s%n", "MutableTriple0.test0487");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        java.lang.Object obj5 = null;
        boolean boolean6 = objMutableTriple0.equals(obj5);
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
        java.lang.Object obj8 = objMutableTriple0.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,null,(null,,null))" + "'", charSequence7.equals("(null,null,(null,,null))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0488");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0489");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        java.lang.String str5 = objMutableTriple0.toString("(null,,null)");
        objMutableTriple0.setLeft((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence8 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(null,,null)" + "'", str5.equals("(null,,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0490");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,,(null,,null))", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(1,null,null)");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration, java.lang.Object> objTripleMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration, java.lang.Object>();
        objMutableTriple3.setLeft((java.lang.Object) objTripleMutableTriple4);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0491");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.String str5 = objMutableTriple3.toString();
        java.lang.Object obj6 = objMutableTriple3.left;
        java.lang.Object obj7 = objMutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(1,(null,hi!,null),(null,,(null,,null)))" + "'", str5.equals("(1,(null,hi!,null),(null,,(null,,null)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) 1 + "'", obj6.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 1 + "'", obj7.equals((byte) 1));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0492");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.middle = "(null,null,null)";
        java.lang.String str7 = objMutableTriple1.toString();
        java.lang.CharSequence charSequence8 = objMutableTriple1.right;
        java.lang.CharSequence charSequence9 = objMutableTriple1.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(null,(null,null,null),null)" + "'", str7.equals("(null,(null,null,null),null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(null,null,null)" + "'", charSequence9.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0493");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.String str4 = objMutableTriple0.toString();
        objMutableTriple0.middle = "(1,(null,hi!,null),(null,,(null,,null)))";
        java.lang.Class<?> wildcardClass7 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0494");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        objMutableTriple1.setRight((java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.Object obj7 = objMutableTriple1.left;
        objMutableTriple1.right = "(null,null,(1.0,null,(null,,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objMutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0495");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence3, (java.lang.CharSequence) "(null,,null)");
        boolean boolean6 = objMutableTriple0.equals((java.lang.Object) charSequence3);
        java.lang.String str8 = objMutableTriple0.toString("(null,(1.0,hi!,(null,,null)),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,(1.0,hi!,(null,,null)),null)" + "'", str8.equals("(null,(1.0,hi!,(null,,null)),null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0496");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString("(null,hi!,null)");
        java.lang.Class<?> wildcardClass5 = objMutableTriple0.getClass();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple8 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))", (java.lang.CharSequence) "(1.0,null,(null,,null))");
        java.lang.CharSequence charSequence9 = objMutableTriple0.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,hi!,null)" + "'", str4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0497");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence3 = objMutableTriple0.right;
        java.lang.CharSequence charSequence4 = objMutableTriple0.right;
        objMutableTriple0.right = "(1,null,null)";
        java.lang.String str8 = objMutableTriple0.toString("(1.0,null,hi!)");
        java.lang.CharSequence charSequence9 = objMutableTriple0.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(1.0,null,hi!)" + "'", str8.equals("(1.0,null,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "(1,null,null)" + "'", charSequence9.equals("(1,null,null)"));
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0498");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple5 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence3, (java.lang.CharSequence) "(null,,null)");
        boolean boolean6 = objMutableTriple0.equals((java.lang.Object) charSequence3);
        java.lang.Object obj7 = null;
        boolean boolean8 = objMutableTriple0.equals(obj7);
        java.lang.Object obj9 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void MutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.test0499");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.getLeft();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj4, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence8 = objMutableTriple7.getMiddle();
        java.lang.Object obj9 = objMutableTriple7.getLeft();
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
            System.out.format("%n%s%n", "MutableTriple0.test0500");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        java.lang.Object obj5 = objMutableTriple3.left;
        java.lang.Object obj6 = objMutableTriple3.left;
        java.lang.CharSequence charSequence7 = objMutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,hi!,null)" + "'", charSequence4.equals("(null,hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 1 + "'", obj5.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) 1 + "'", obj6.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "(null,hi!,null)" + "'", charSequence7.equals("(null,hi!,null)"));
    }
}

