package MutableTriple;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableTriple0 {

    public static boolean debug = false;

    @Test
    public void MutableTriple0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0001");
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
    public void MutableTriple0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0002");
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
    public void MutableTriple0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0003");
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
    public void MutableTriple0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0004");
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
    public void MutableTriple0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0005");
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
    public void MutableTriple0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0006");
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
    public void MutableTriple0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0007");
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
    public void MutableTriple0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0008");
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
    public void MutableTriple0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0009");
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
    public void MutableTriple0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0010");
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
    public void MutableTriple0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0011");
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
    public void MutableTriple0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0012");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement, java.lang.Class<?>> objTripleMutableTriple2 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.AnnotatedElement, java.lang.Class<?>>();
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.io.Serializable, java.lang.Comparable<java.lang.String>> objTriple5 = org.apache.commons.lang3.tuple.Triple.of((java.lang.Object) objTripleMutableTriple2, (java.io.Serializable) 'a', (java.lang.Comparable<java.lang.String>) "(null,hi!,null)");
        org.apache.commons.lang3.tuple.Triple<java.lang.String, java.lang.Comparable<java.lang.String>, java.lang.Object> strTriple6 = org.apache.commons.lang3.tuple.Triple.of("hi!", (java.lang.Comparable<java.lang.String>) "(null,null,(null,,null))", (java.lang.Object) "(null,hi!,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objTriple5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTriple6);
    }

    @Test
    public void MutableTriple0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0013");
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
    public void MutableTriple0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0014");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "hi!");
        objMutableTriple3.right = "(null,null,null)";
    }

    @Test
    public void MutableTriple0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0015");
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
    public void MutableTriple0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0016");
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
    public void MutableTriple0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0017");
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
    public void MutableTriple0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0018");
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
    public void MutableTriple0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0019");
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
    public void MutableTriple0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0020");
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
    public void MutableTriple0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0021");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> genericDeclarationMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0022");
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
    public void MutableTriple0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0023");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        // The following exception was thrown during execution in MutableTriple generation
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
    public void MutableTriple0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0024");
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
    public void MutableTriple0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0025");
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
    public void MutableTriple0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0026");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getRight();
        objMutableTriple0.middle = "(null,null,(null,,null))";
        java.lang.Object obj4 = objMutableTriple0.left;
        // The following exception was thrown during execution in MutableTriple generation
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
    public void MutableTriple0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0027");
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
    public void MutableTriple0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0028");
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
    public void MutableTriple0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0029");
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
    public void MutableTriple0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0030");
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
    public void MutableTriple0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0031");
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
    public void MutableTriple0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0032");
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
    public void MutableTriple0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0033");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 100.0d, (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
    }

    @Test
    public void MutableTriple0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0034");
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
    public void MutableTriple0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0035");
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
    public void MutableTriple0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0036");
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
    public void MutableTriple0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0037");
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
    public void MutableTriple0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0038");
        java.lang.reflect.GenericDeclaration genericDeclaration2 = null;
        org.apache.commons.lang3.tuple.Triple<java.lang.String, java.lang.CharSequence, java.lang.reflect.GenericDeclaration> strTriple3 = org.apache.commons.lang3.tuple.Triple.of("", (java.lang.CharSequence) "(null,(null,null,null),null)", genericDeclaration2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTriple3);
    }

    @Test
    public void MutableTriple0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0039");
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
    public void MutableTriple0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0040");
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
    public void MutableTriple0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0041");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Object> genericDeclarationMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Object>();
    }

    @Test
    public void MutableTriple0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0042");
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
    public void MutableTriple0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0043");
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
    public void MutableTriple0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0044");
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
    public void MutableTriple0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0045");
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
    public void MutableTriple0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0046");
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
    public void MutableTriple0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0047");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, java.lang.String, java.lang.reflect.GenericDeclaration> wildcardClassMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, java.lang.String, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutableTriple0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0048");
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
    public void MutableTriple0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0049");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.CharSequence, java.lang.reflect.AnnotatedElement> objMutableTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.CharSequence, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void MutableTriple0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0050");
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
    public void MutableTriple0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0051");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.GenericDeclaration, java.lang.Class<?>> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.GenericDeclaration, java.lang.Class<?>>();
    }

    @Test
    public void MutableTriple0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0052");
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
    public void MutableTriple0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0053");
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
    public void MutableTriple0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0054");
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
    public void MutableTriple0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0055");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.CharSequence> typeMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.CharSequence>();
    }

    @Test
    public void MutableTriple0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0056");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void MutableTriple0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0057");
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
    public void MutableTriple0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0058");
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
    public void MutableTriple0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0059");
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
    public void MutableTriple0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0060");
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
    public void MutableTriple0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0061");
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
    public void MutableTriple0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0062");
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
    public void MutableTriple0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0063");
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
    public void MutableTriple0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0064");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> objTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void MutableTriple0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0065");
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
    public void MutableTriple0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0066");
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
    public void MutableTriple0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0067");
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
    public void MutableTriple0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0068");
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
    public void MutableTriple0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0069");
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
    public void MutableTriple0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0070");
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
    public void MutableTriple0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0071");
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
    public void MutableTriple0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0072");
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
    public void MutableTriple0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0073");
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
    public void MutableTriple0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0074");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0075");
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
    public void MutableTriple0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0076");
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
    public void MutableTriple0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0077");
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
    public void MutableTriple0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0078");
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
    public void MutableTriple0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0079");
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
    public void MutableTriple0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0080");
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
    public void MutableTriple0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0081");
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
    public void MutableTriple0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0082");
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
    public void MutableTriple0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0083");
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
    public void MutableTriple0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0084");
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
    public void MutableTriple0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0085");
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
    public void MutableTriple0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0086");
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
    public void MutableTriple0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0087");
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
    public void MutableTriple0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0088");
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
    public void MutableTriple0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0089");
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
    public void MutableTriple0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0090");
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
    public void MutableTriple0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0091");
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
    public void MutableTriple0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0092");
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
    public void MutableTriple0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0093");
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
    public void MutableTriple0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0094");
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
    public void MutableTriple0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0095");
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
    public void MutableTriple0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0096");
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
    public void MutableTriple0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0097");
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
    public void MutableTriple0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0098");
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
    public void MutableTriple0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0099");
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
    public void MutableTriple0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0100");
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
    public void MutableTriple0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0101");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.Class<?>, java.lang.Class<?>> strComparableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.Class<?>, java.lang.Class<?>>();
    }

    @Test
    public void MutableTriple0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0102");
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
    public void MutableTriple0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0103");
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
    public void MutableTriple0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0104");
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
    public void MutableTriple0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0105");
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
    public void MutableTriple0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0106");
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
    public void MutableTriple0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0107");
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
    public void MutableTriple0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0108");
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
    public void MutableTriple0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0109");
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
    public void MutableTriple0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0110");
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
    public void MutableTriple0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0111");
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
    public void MutableTriple0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0112");
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
    public void MutableTriple0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0113");
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
    public void MutableTriple0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0114");
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
    public void MutableTriple0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0115");
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
    public void MutableTriple0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0116");
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
    public void MutableTriple0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0117");
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
    public void MutableTriple0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0118");
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
    public void MutableTriple0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0119");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> charSequenceMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>();
    }

    @Test
    public void MutableTriple0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0120");
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
    public void MutableTriple0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0121");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,,(null,,null))", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(1,null,null)");
        java.lang.Object obj4 = objMutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "(null,,(null,,null))" + "'", obj4.equals("(null,,(null,,null))"));
    }

    @Test
    public void MutableTriple0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0122");
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
    public void MutableTriple0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0123");
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
    public void MutableTriple0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0124");
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
    public void MutableTriple0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0125");
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
    public void MutableTriple0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0126");
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
    public void MutableTriple0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0127");
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
    public void MutableTriple0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0128");
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
    public void MutableTriple0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0129");
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
    public void MutableTriple0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0130");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(1,null,null)");
        objMutableTriple3.setRight((java.lang.CharSequence) "(1.0,hi!,(null,,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableTriple0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0131");
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
    public void MutableTriple0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0132");
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
    public void MutableTriple0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0133");
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
    public void MutableTriple0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0134");
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
    public void MutableTriple0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0135");
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
    public void MutableTriple0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0136");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        objMutableTriple3.right = "(1,null,(null,,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableTriple0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0137");
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
    public void MutableTriple0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0138");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "";
        objMutableTriple0.left = "(null,null,(null,hi!,null))";
        java.lang.Class<?> wildcardClass7 = objMutableTriple0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableTriple0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0139");
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
    public void MutableTriple0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0140");
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
    public void MutableTriple0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0141");
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
    public void MutableTriple0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0142");
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
    public void MutableTriple0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0143");
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
    public void MutableTriple0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0144");
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
    public void MutableTriple0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0145");
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
    public void MutableTriple0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0146");
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
    public void MutableTriple0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0147");
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
    public void MutableTriple0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0148");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.right = "(null,null,(null,hi!,null))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0149");
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
    public void MutableTriple0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0150");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.CharSequence, java.lang.String> strComparableMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.CharSequence, java.lang.String>((java.lang.Comparable<java.lang.String>) "(null,hi!,null)", (java.lang.CharSequence) "(null,hi!,null)", "(null,,null)");
        java.lang.Class<?> wildcardClass4 = strComparableMutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableTriple0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0151");
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
    public void MutableTriple0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0152");
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
    public void MutableTriple0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0153");
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
    public void MutableTriple0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0154");
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
    public void MutableTriple0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0155");
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
    public void MutableTriple0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0156");
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
    public void MutableTriple0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0157");
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
    public void MutableTriple0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0158");
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
    public void MutableTriple0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0159");
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
    public void MutableTriple0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0160");
        java.io.Serializable serializable1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.io.Serializable, java.lang.String> strMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.io.Serializable, java.lang.String>("(null,hi!,null)", serializable1, "");
    }

    @Test
    public void MutableTriple0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0161");
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
    public void MutableTriple0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0162");
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
    public void MutableTriple0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0163");
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
    public void MutableTriple0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0164");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.reflect.GenericDeclaration> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutableTriple0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0165");
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
    public void MutableTriple0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0166");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "(null,,(null,,null))");
    }

    @Test
    public void MutableTriple0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0167");
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
    public void MutableTriple0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0168");
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
    public void MutableTriple0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0169");
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
    public void MutableTriple0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0170");
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
    public void MutableTriple0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0171");
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
    public void MutableTriple0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0172");
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
    public void MutableTriple0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0173");
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
    public void MutableTriple0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0174");
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
    public void MutableTriple0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0175");
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
    public void MutableTriple0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0176");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0177");
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
    public void MutableTriple0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0178");
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
    public void MutableTriple0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0179");
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
    public void MutableTriple0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0180");
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
    public void MutableTriple0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0181");
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
    public void MutableTriple0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0182");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.Object obj2 = objMutableTriple0.getLeft();
        java.lang.Object obj3 = objMutableTriple0.left;
        // The following exception was thrown during execution in MutableTriple generation
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
    public void MutableTriple0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0183");
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
    public void MutableTriple0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0184");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.Object, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> strComparableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.Object, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0185");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.left = "(null,null,null)";
        objMutableTriple3.middle = "(null,(null,null,null),null)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0186");
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
    public void MutableTriple0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0187");
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
    public void MutableTriple0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0188");
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
    public void MutableTriple0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0189");
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
    public void MutableTriple0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0190");
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
    public void MutableTriple0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0191");
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
    public void MutableTriple0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0192");
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
    public void MutableTriple0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0193");
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
    public void MutableTriple0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0194");
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
    public void MutableTriple0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0195");
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
    public void MutableTriple0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0196");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.String, java.lang.reflect.Type> typeMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.String, java.lang.reflect.Type>();
    }

    @Test
    public void MutableTriple0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0197");
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
    public void MutableTriple0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0198");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, java.lang.Object, java.lang.CharSequence> strComparableMutableTriple3 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Comparable<java.lang.String>) "(1.0,null,(null,,null))", (java.lang.Object) true, (java.lang.CharSequence) "(1,(null,hi!,null),(null,,(null,,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableMutableTriple3);
    }

    @Test
    public void MutableTriple0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0199");
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
    public void MutableTriple0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0200");
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
    public void MutableTriple0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0201");
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
    public void MutableTriple0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0202");
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
    public void MutableTriple0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0203");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        objMutableTriple1.right = "";
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.String> strComparableMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.String>((java.lang.Comparable<java.lang.String>) "(null,null,null)", (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, "");
        java.lang.Object obj8 = objMutableTriple1.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void MutableTriple0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0204");
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
    public void MutableTriple0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0205");
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
    public void MutableTriple0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0206");
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
    public void MutableTriple0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0207");
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
    public void MutableTriple0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0208");
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
    public void MutableTriple0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0209");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.io.Serializable, java.io.Serializable> typeMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.io.Serializable, java.io.Serializable>();
    }

    @Test
    public void MutableTriple0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0210");
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
    public void MutableTriple0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0211");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.getMiddle();
        objMutableTriple0.middle = "hi!";
        objMutableTriple0.right = "(null,null,null)";
        objMutableTriple0.middle = "(null,hi!,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0212");
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
    public void MutableTriple0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0213");
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
    public void MutableTriple0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0214");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        // The following exception was thrown during execution in MutableTriple generation
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
    public void MutableTriple0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0215");
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
    public void MutableTriple0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0216");
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
    public void MutableTriple0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0217");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,,(null,,null))", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(1,null,null)");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple4.setMiddle((java.lang.CharSequence) "");
        objMutableTriple3.setLeft((java.lang.Object) "");
    }

    @Test
    public void MutableTriple0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0218");
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
    public void MutableTriple0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0219");
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
    public void MutableTriple0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0220");
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
    public void MutableTriple0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0221");
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
    public void MutableTriple0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0222");
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
    public void MutableTriple0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0223");
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
    public void MutableTriple0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0224");
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
    public void MutableTriple0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0225");
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
    public void MutableTriple0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0226");
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
    public void MutableTriple0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0227");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.Object, java.io.Serializable> typeMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.Object, java.io.Serializable>();
    }

    @Test
    public void MutableTriple0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0228");
        org.apache.commons.lang3.tuple.Triple<java.lang.CharSequence, java.lang.Comparable<java.lang.String>, java.lang.CharSequence> charSequenceTriple3 = org.apache.commons.lang3.tuple.Triple.of((java.lang.CharSequence) "(1.0,hi!,(null,,null))", (java.lang.Comparable<java.lang.String>) "((null,,null),null,null)", (java.lang.CharSequence) "(1,null,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTriple3);
    }

    @Test
    public void MutableTriple0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0229");
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
    public void MutableTriple0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0230");
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
    public void MutableTriple0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0231");
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
    public void MutableTriple0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0232");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> wildcardClassMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) wildcardClassMutableTriple0, (java.lang.CharSequence) "", (java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
        objMutableTriple3.middle = "((null,,null),null,null)";
    }

    @Test
    public void MutableTriple0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0233");
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
    public void MutableTriple0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0234");
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
    public void MutableTriple0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0235");
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
    public void MutableTriple0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0236");
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
    public void MutableTriple0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0237");
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
    public void MutableTriple0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0238");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> strComparableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0239");
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
    public void MutableTriple0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0240");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> strMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.String, java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutableTriple0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0241");
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
    public void MutableTriple0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0242");
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
    public void MutableTriple0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0243");
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
    public void MutableTriple0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0244");
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
    public void MutableTriple0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0245");
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
    public void MutableTriple0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0246");
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
    public void MutableTriple0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0247");
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
    public void MutableTriple0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0248");
        org.apache.commons.lang3.tuple.Triple<java.lang.String, java.lang.String, java.lang.CharSequence> strTriple3 = org.apache.commons.lang3.tuple.Triple.of("(null,,(null,,null))", "(null,hi!,null)", (java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTriple3);
    }

    @Test
    public void MutableTriple0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0249");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        objMutableTriple3.right = "(1,null,(null,null,(null,,null)))";
        java.lang.String str6 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))" + "'", str6.equals("(,(null,null,(null,,null)),(1,null,(null,null,(null,,null))))"));
    }

    @Test
    public void MutableTriple0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0250");
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
    public void MutableTriple0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0251");
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
    public void MutableTriple0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0252");
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
    public void MutableTriple0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0253");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj1 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence2 = objMutableTriple0.getRight();
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj5 = objMutableTriple0.getLeft();
        java.lang.CharSequence charSequence6 = objMutableTriple0.middle;
        // The following exception was thrown during execution in MutableTriple generation
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
    public void MutableTriple0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0254");
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
    public void MutableTriple0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0255");
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
    public void MutableTriple0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0256");
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
    public void MutableTriple0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0257");
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
    public void MutableTriple0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0258");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.String, java.lang.reflect.AnnotatedElement> typeMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.String, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void MutableTriple0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0259");
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
    public void MutableTriple0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0260");
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
    public void MutableTriple0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0261");
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
    public void MutableTriple0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0262");
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
    public void MutableTriple0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0263");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        objMutableTriple3.middle = "(1.0,null,hi!)";
        objMutableTriple3.setMiddle((java.lang.CharSequence) "(null,hi!,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,,null)" + "'", charSequence4.equals("(null,,null)"));
    }

    @Test
    public void MutableTriple0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0264");
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
    public void MutableTriple0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0265");
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
    public void MutableTriple0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0266");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (byte) 1, (java.lang.CharSequence) "(null,hi!,null)", (java.lang.CharSequence) "(null,,(null,,null))");
        java.lang.String str4 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(1,(null,hi!,null),(null,,(null,,null)))" + "'", str4.equals("(1,(null,hi!,null),(null,,(null,,null)))"));
    }

    @Test
    public void MutableTriple0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0267");
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
    public void MutableTriple0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0268");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> typeMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutableTriple0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0269");
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
    public void MutableTriple0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0270");
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
    public void MutableTriple0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0271");
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
    public void MutableTriple0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0272");
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
    public void MutableTriple0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0273");
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
    public void MutableTriple0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0274");
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
    public void MutableTriple0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0275");
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
    public void MutableTriple0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0276");
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
    public void MutableTriple0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0277");
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
    public void MutableTriple0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0278");
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
    public void MutableTriple0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0279");
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
    public void MutableTriple0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0280");
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
    public void MutableTriple0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0281");
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
    public void MutableTriple0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0282");
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
    public void MutableTriple0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0283");
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
    public void MutableTriple0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0284");
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
    public void MutableTriple0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0285");
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
    public void MutableTriple0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0286");
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
    public void MutableTriple0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0287");
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
    public void MutableTriple0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0288");
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
    public void MutableTriple0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0289");
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
    public void MutableTriple0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0290");
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
    public void MutableTriple0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0291");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable, java.lang.Comparable<java.lang.String>> objMutableTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.io.Serializable, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void MutableTriple0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0292");
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
    public void MutableTriple0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0293");
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
    public void MutableTriple0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0294");
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
    public void MutableTriple0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0295");
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
    public void MutableTriple0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0296");
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
    public void MutableTriple0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0297");
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
    public void MutableTriple0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0298");
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
    public void MutableTriple0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0299");
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
    public void MutableTriple0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0300");
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
    public void MutableTriple0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0301");
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
    public void MutableTriple0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0302");
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
    public void MutableTriple0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0303");
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
    public void MutableTriple0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0304");
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
    public void MutableTriple0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0305");
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
    public void MutableTriple0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0306");
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
    public void MutableTriple0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0307");
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
    public void MutableTriple0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0308");
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
    public void MutableTriple0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0309");
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
    public void MutableTriple0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0310");
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
    public void MutableTriple0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0311");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.Comparable<java.lang.String>, java.lang.Object> charSequenceMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.Comparable<java.lang.String>, java.lang.Object>();
    }

    @Test
    public void MutableTriple0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0312");
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
    public void MutableTriple0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0313");
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
    public void MutableTriple0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0314");
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
    public void MutableTriple0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0315");
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
    public void MutableTriple0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0316");
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
    public void MutableTriple0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0317");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.Object, java.lang.reflect.GenericDeclaration> genericDeclarationMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.Object, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutableTriple0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0318");
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
    public void MutableTriple0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0319");
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
    public void MutableTriple0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0320");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.String str1 = objMutableTriple0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "(null,null,null)" + "'", str1.equals("(null,null,null)"));
    }

    @Test
    public void MutableTriple0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0321");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        objMutableTriple3.right = "(null,null,(null,,null))";
        objMutableTriple3.middle = "(100.0,hi!,hi!)";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableTriple0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0322");
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
    public void MutableTriple0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0323");
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
    public void MutableTriple0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0324");
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
    public void MutableTriple0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0325");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.reflect.Type, java.lang.reflect.Type> charSequenceMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.reflect.Type, java.lang.reflect.Type>();
    }

    @Test
    public void MutableTriple0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0326");
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
    public void MutableTriple0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0327");
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
    public void MutableTriple0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0328");
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
    public void MutableTriple0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0329");
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
    public void MutableTriple0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0330");
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
    public void MutableTriple0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0331");
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
    public void MutableTriple0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0332");
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
    public void MutableTriple0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0333");
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
    public void MutableTriple0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0334");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        objMutableTriple1.right = "";
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.String> strComparableMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.String>((java.lang.Comparable<java.lang.String>) "(null,null,null)", (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, "");
        objMutableTriple1.right = "(null,null,(1.0,null,(null,,null)))";
    }

    @Test
    public void MutableTriple0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0335");
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
    public void MutableTriple0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0336");
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
    public void MutableTriple0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0337");
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
    public void MutableTriple0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0338");
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
    public void MutableTriple0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0339");
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
    public void MutableTriple0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0340");
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
    public void MutableTriple0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0341");
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
    public void MutableTriple0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0342");
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
    public void MutableTriple0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0343");
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
    public void MutableTriple0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0344");
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
    public void MutableTriple0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0345");
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
    public void MutableTriple0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0346");
        org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> serializableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.io.Serializable, java.lang.reflect.AnnotatedElement, java.lang.reflect.Type>();
    }

    @Test
    public void MutableTriple0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0347");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 0L, (java.lang.CharSequence) "(null,(null,null,null),null)", (java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.Object obj4 = objMutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0L + "'", obj4.equals(0L));
    }

    @Test
    public void MutableTriple0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0348");
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
    public void MutableTriple0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0349");
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
    public void MutableTriple0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0350");
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
    public void MutableTriple0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0351");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(null,hi!,null)");
        objMutableTriple3.right = "(1,null,(null,null,(null,,null)))";
        java.lang.Object obj6 = objMutableTriple3.left;
        objMutableTriple3.setRight((java.lang.CharSequence) "(100.0,hi!,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
    }

    @Test
    public void MutableTriple0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0352");
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
    public void MutableTriple0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0353");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (-1L), (java.lang.CharSequence) "", (java.lang.CharSequence) "(null,null,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "" + "'", charSequence4.equals(""));
    }

    @Test
    public void MutableTriple0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0354");
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
    public void MutableTriple0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0355");
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
    public void MutableTriple0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0356");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objTriple4 = null;
        org.apache.commons.lang3.tuple.Triple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.CharSequence, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objTripleTriple5 = org.apache.commons.lang3.tuple.Triple.of((org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple0, (java.lang.CharSequence) "(null,(null,null,(null,,null)),null)", objTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objTripleTriple5);
    }

    @Test
    public void MutableTriple0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0357");
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
    public void MutableTriple0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0358");
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
    public void MutableTriple0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0359");
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
    public void MutableTriple0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0360");
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
    public void MutableTriple0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0361");
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
    public void MutableTriple0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0362");
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
    public void MutableTriple0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0363");
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
    public void MutableTriple0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0364");
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
    public void MutableTriple0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0365");
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
    public void MutableTriple0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0366");
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
    public void MutableTriple0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0367");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple1.setMiddle((java.lang.CharSequence) "");
        objMutableTriple1.right = "";
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.String> strComparableMutableTriple7 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.String>((java.lang.Comparable<java.lang.String>) "(null,null,null)", (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, "");
        java.lang.String str9 = objMutableTriple1.toString("(null,null,(null,hi!,null))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(null,null,(null,hi!,null))" + "'", str9.equals("(null,null,(null,hi!,null))"));
    }

    @Test
    public void MutableTriple0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0368");
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
    public void MutableTriple0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0369");
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
    public void MutableTriple0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0370");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> wildcardClassMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0371");
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
    public void MutableTriple0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0372");
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
    public void MutableTriple0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0373");
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
    public void MutableTriple0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0374");
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
    public void MutableTriple0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0375");
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
    public void MutableTriple0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0376");
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
    public void MutableTriple0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0377");
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
    public void MutableTriple0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0378");
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
    public void MutableTriple0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0379");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        objMutableTriple0.setRight((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = objMutableTriple0.right;
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence7 = objMutableTriple0.getRight();
        java.lang.CharSequence charSequence8 = objMutableTriple0.getMiddle();
        // The following exception was thrown during execution in MutableTriple generation
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
    public void MutableTriple0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0380");
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
    public void MutableTriple0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0381");
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
    public void MutableTriple0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0382");
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
    public void MutableTriple0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0383");
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
    public void MutableTriple0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0384");
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
    public void MutableTriple0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0385");
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
    public void MutableTriple0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0386");
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
    public void MutableTriple0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0387");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.middle = "hi!";
        java.lang.Object obj3 = objMutableTriple0.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void MutableTriple0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0388");
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
    public void MutableTriple0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0389");
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
    public void MutableTriple0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0390");
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
    public void MutableTriple0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0391");
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
    public void MutableTriple0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0392");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> wildcardClassMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>>();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) wildcardClassMutableTriple0, (java.lang.CharSequence) "", (java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,(null,null,(null,,null)),null)");
    }

    @Test
    public void MutableTriple0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0393");
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
    public void MutableTriple0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0394");
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
    public void MutableTriple0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0395");
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
    public void MutableTriple0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0396");
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
    public void MutableTriple0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0397");
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
    public void MutableTriple0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0398");
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
    public void MutableTriple0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0399");
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
    public void MutableTriple0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0400");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence4 = objMutableTriple3.right;
        java.lang.CharSequence charSequence5 = objMutableTriple3.getRight();
        java.lang.Object obj6 = objMutableTriple3.left;
        org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objTriple7 = null;
        // The following exception was thrown during execution in MutableTriple generation
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
    public void MutableTriple0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0401");
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
    public void MutableTriple0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0402");
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
    public void MutableTriple0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0403");
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
    public void MutableTriple0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0404");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = objMutableTriple0.equals((java.lang.Object) (-1.0f));
        java.lang.CharSequence charSequence3 = objMutableTriple0.middle;
        objMutableTriple0.setRight((java.lang.CharSequence) "(null,,null)");
        java.lang.CharSequence charSequence6 = objMutableTriple0.getMiddle();
        // The following exception was thrown during execution in MutableTriple generation
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
    public void MutableTriple0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0405");
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
    public void MutableTriple0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0406");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,(null,null,null),null)", (java.lang.CharSequence) "(null,,)");
        objMutableTriple3.right = "(1.0,null,(null,,null))";
    }

    @Test
    public void MutableTriple0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0407");
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
    public void MutableTriple0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0408");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        objMutableTriple0.setLeft((java.lang.Object) 1);
        objMutableTriple0.middle = "hi!";
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple8 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) objMutableTriple0, (java.lang.CharSequence) "(null,(null,null,(null,,null)),)", (java.lang.CharSequence) "(1,(null,hi!,null),(null,null,(null,hi!,null)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSequence1);
    }

    @Test
    public void MutableTriple0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0409");
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
    public void MutableTriple0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0410");
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
    public void MutableTriple0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0411");
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
    public void MutableTriple0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0412");
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
    public void MutableTriple0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0413");
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
    public void MutableTriple0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0414");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> wildcardClassMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Class<?>, java.lang.reflect.Type, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0415");
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
    public void MutableTriple0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0416");
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
    public void MutableTriple0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0417");
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
    public void MutableTriple0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0418");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 0L, (java.lang.CharSequence) "(null,(null,null,null),null)", (java.lang.CharSequence) "(null,null,(null,,null))");
        java.lang.CharSequence charSequence4 = objMutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "(null,(null,null,null),null)" + "'", charSequence4.equals("(null,(null,null,null),null)"));
    }

    @Test
    public void MutableTriple0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0419");
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
    public void MutableTriple0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0420");
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
    public void MutableTriple0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0421");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> charSequenceMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void MutableTriple0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0422");
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
    public void MutableTriple0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0423");
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
    public void MutableTriple0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0424");
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
    public void MutableTriple0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0425");
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
    public void MutableTriple0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0426");
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
    public void MutableTriple0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0427");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Object> objTripleMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.Object>();
    }

    @Test
    public void MutableTriple0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0428");
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
    public void MutableTriple0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0429");
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
    public void MutableTriple0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0430");
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
    public void MutableTriple0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0431");
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
    public void MutableTriple0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0432");
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
    public void MutableTriple0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0433");
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
    public void MutableTriple0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0434");
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
    public void MutableTriple0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0435");
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
    public void MutableTriple0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0436");
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
    public void MutableTriple0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0437");
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
    public void MutableTriple0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0438");
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
    public void MutableTriple0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0439");
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
    public void MutableTriple0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0440");
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
    public void MutableTriple0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0441");
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
    public void MutableTriple0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0442");
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
    public void MutableTriple0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0443");
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
    public void MutableTriple0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0444");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        objMutableTriple3.right = "(null,null,(null,,null))";
        objMutableTriple3.right = "(null,null,(1.0,null,(null,,null)))";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableTriple0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0445");
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
    public void MutableTriple0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0446");
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
    public void MutableTriple0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0447");
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
    public void MutableTriple0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0448");
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
    public void MutableTriple0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0449");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>(obj0, (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "");
        objMutableTriple3.right = "(null,,(null,,null))";
        java.lang.CharSequence charSequence6 = objMutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "(null,,(null,,null))" + "'", charSequence6.equals("(null,,(null,,null))"));
    }

    @Test
    public void MutableTriple0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0450");
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
    public void MutableTriple0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0451");
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
    public void MutableTriple0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0452");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) (-1L), (java.lang.CharSequence) "", (java.lang.CharSequence) "(null,null,null)");
        java.lang.String str4 = objMutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(-1,,(null,null,null))" + "'", str4.equals("(-1,,(null,null,null))"));
    }

    @Test
    public void MutableTriple0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0453");
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
    public void MutableTriple0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0454");
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
    public void MutableTriple0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0455");
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
    public void MutableTriple0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0456");
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
    public void MutableTriple0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0457");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.String str5 = objMutableTriple3.toString("hi!");
        objMutableTriple3.right = "(null,(null,null,(null,,null)),null)";
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,(null,,(null,,null)),null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableTriple0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0458");
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
    public void MutableTriple0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0459");
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
    public void MutableTriple0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0460");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "";
        objMutableTriple0.right = "(null,(null,null,(null,,null)),)";
    }

    @Test
    public void MutableTriple0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0461");
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
    public void MutableTriple0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0462");
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
    public void MutableTriple0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0463");
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
    public void MutableTriple0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0464");
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
    public void MutableTriple0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0465");
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
    public void MutableTriple0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0466");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement, java.lang.CharSequence>();
    }

    @Test
    public void MutableTriple0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0467");
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
    public void MutableTriple0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0468");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.io.Serializable, java.lang.reflect.GenericDeclaration> charSequenceMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.io.Serializable, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutableTriple0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0469");
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
    public void MutableTriple0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0470");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.Object, java.lang.Object> charSequenceMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.CharSequence, java.lang.Object, java.lang.Object>();
    }

    @Test
    public void MutableTriple0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0471");
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
    public void MutableTriple0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0472");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        objMutableTriple0.setMiddle((java.lang.CharSequence) "");
        objMutableTriple0.right = "";
        objMutableTriple0.left = "(null,null,(null,hi!,null))";
        java.lang.CharSequence charSequence7 = null;
        objMutableTriple0.setRight(charSequence7);
    }

    @Test
    public void MutableTriple0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0473");
        java.lang.CharSequence charSequence1 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) 1.0f, charSequence1, (java.lang.CharSequence) "(null,,null)");
        java.lang.Object obj4 = objMutableTriple3.left;
        objMutableTriple3.setRight((java.lang.CharSequence) "(null,(null,null,null),null)");
        objMutableTriple3.left = 100.0f;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
    }

    @Test
    public void MutableTriple0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0474");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> strComparableMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>>();
    }

    @Test
    public void MutableTriple0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0475");
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
    public void MutableTriple0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0476");
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
    public void MutableTriple0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0477");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence1 = objMutableTriple0.middle;
        java.lang.CharSequence charSequence2 = objMutableTriple0.getMiddle();
        java.lang.CharSequence charSequence3 = objMutableTriple0.getRight();
        java.lang.String str4 = objMutableTriple0.toString();
        java.lang.String str6 = objMutableTriple0.toString("(null,null,(1.0,null,(null,,null)))");
        java.lang.CharSequence charSequence7 = objMutableTriple0.getMiddle();
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
    public void MutableTriple0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0478");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple1 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = objMutableTriple1.getMiddle();
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = null;
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>> objMutableTriple4 = org.apache.commons.lang3.tuple.MutableTriple.of((java.lang.Object) (short) -1, (org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>) objMutableTriple1, objMutableTriple3);
        java.lang.CharSequence charSequence5 = objMutableTriple1.getRight();
        objMutableTriple1.setRight((java.lang.CharSequence) "(1.0,null,(null,,null))");
        java.lang.CharSequence charSequence8 = objMutableTriple1.middle;
        // The following exception was thrown during execution in MutableTriple generation
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
    public void MutableTriple0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0479");
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
    public void MutableTriple0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0480");
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
    public void MutableTriple0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0481");
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
    public void MutableTriple0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0482");
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
    public void MutableTriple0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0483");
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
    public void MutableTriple0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0484");
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
    public void MutableTriple0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0485");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type, java.lang.CharSequence> genericDeclarationMutableTriple0 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type, java.lang.CharSequence>();
    }

    @Test
    public void MutableTriple0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0486");
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
    public void MutableTriple0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0487");
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
    public void MutableTriple0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0488");
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
    public void MutableTriple0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0489");
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
    public void MutableTriple0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0490");
        org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence> objMutableTriple3 = new org.apache.commons.lang3.tuple.MutableTriple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>((java.lang.Object) "(null,,(null,,null))", (java.lang.CharSequence) "(null,null,(null,,null))", (java.lang.CharSequence) "(1,null,null)");
        org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration, java.lang.Object> objTripleMutableTriple4 = new org.apache.commons.lang3.tuple.MutableTriple<org.apache.commons.lang3.tuple.Triple<java.lang.Object, java.lang.CharSequence, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration, java.lang.Object>();
        objMutableTriple3.setLeft((java.lang.Object) objTripleMutableTriple4);
    }

    @Test
    public void MutableTriple0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0491");
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
    public void MutableTriple0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0492");
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
    public void MutableTriple0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0493");
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
    public void MutableTriple0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0494");
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
    public void MutableTriple0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0495");
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
    public void MutableTriple0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0496");
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
    public void MutableTriple0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0497");
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
    public void MutableTriple0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0498");
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
    public void MutableTriple0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0499");
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
    public void MutableTriple0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableTriple0.MutableTriple0500");
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

