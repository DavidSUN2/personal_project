package ImmutableTriple;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ImmutableTriple2 {

    public static boolean debug = false;

    @Test
    public void ImmutableTriple1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1001");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple5 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass3, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass6 = strComparableImmutableTriple5.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple8 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.reflect.GenericDeclaration) wildcardClass6, (java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,)");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple8.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "(hi!,class java.lang.Object,)" + "'", strComparable9.equals("(hi!,class java.lang.Object,)"));
    }

    @Test
    public void ImmutableTriple1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1002");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
    }

    @Test
    public void ImmutableTriple1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1003");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.reflect.GenericDeclaration genericDeclaration4 = strComparableImmutableTriple3.middle;
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple3.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple3.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple3.right;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable5.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable7.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable8.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
    }

    @Test
    public void ImmutableTriple1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1004");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1005");
        java.lang.reflect.GenericDeclaration genericDeclaration2 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)", genericDeclaration2, (java.lang.Comparable<java.lang.String>) "(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))");
        java.lang.Class<?> wildcardClass5 = strComparableImmutableTriple4.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple7 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", (java.lang.reflect.GenericDeclaration) wildcardClass5, (java.lang.Comparable<java.lang.String>) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple7.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple7.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))" + "'", strComparable8.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1006");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1007");
        java.lang.Object obj2 = new java.lang.Object();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Object, java.lang.Object, java.lang.Object> objImmutableTriple4 = org.apache.commons.lang3.tuple.ImmutableTriple.of((java.lang.Object) 100.0d, obj2, (java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass5 = objImmutableTriple4.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.String, java.lang.Class<?>, java.lang.Comparable<java.lang.String>> strImmutableTriple7 = org.apache.commons.lang3.tuple.ImmutableTriple.of("hi!", wildcardClass5, (java.lang.Comparable<java.lang.String>) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objImmutableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutableTriple7);
    }

    @Test
    public void ImmutableTriple1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1008");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.Class<?> wildcardClass9 = strComparableImmutableTriple4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1009");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.String str6 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Class<?> wildcardClass9 = strComparableImmutableTriple4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str6.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1010");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.String str6 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.right;
        java.lang.String str9 = strComparableImmutableTriple4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str6.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str9.equals("(hi!,class java.lang.Object,)"));
    }

    @Test
    public void ImmutableTriple1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1011");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.String str7 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.Class<?> wildcardClass9 = strComparableImmutableTriple4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str7.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1012");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.reflect.GenericDeclaration genericDeclaration4 = strComparableImmutableTriple3.middle;
        java.lang.String str6 = strComparableImmutableTriple3.toString("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple3.left;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))" + "'", str6.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable7.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable8.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
    }

    @Test
    public void ImmutableTriple1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1013");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1014");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.String str7 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str7.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
    }

    @Test
    public void ImmutableTriple1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1015");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.apache.commons.lang3.tuple.Triple<java.lang.reflect.GenericDeclaration, java.lang.String, java.lang.reflect.GenericDeclaration> genericDeclarationTriple6 = org.apache.commons.lang3.tuple.Triple.of((java.lang.reflect.GenericDeclaration) wildcardClass2, "", (java.lang.reflect.GenericDeclaration) wildcardClass5);
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.String, java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> strImmutableTriple8 = org.apache.commons.lang3.tuple.ImmutableTriple.of("((hi!,class java.lang.Object,hi!),class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,hi!))", (java.lang.reflect.AnnotatedElement) wildcardClass5, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass9 = strImmutableTriple8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationTriple6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutableTriple8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1016");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1017");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1018");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,)");
        java.lang.String str5 = strComparableImmutableTriple3.toString("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.Object obj6 = null;
        boolean boolean7 = strComparableImmutableTriple3.equals(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", str5.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ImmutableTriple1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1019");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.String str6 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str6.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1020");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1021");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))");
        java.lang.String str5 = strComparableImmutableTriple3.toString("hi!");
        java.lang.String str7 = strComparableImmutableTriple3.toString("(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))" + "'", str7.equals("(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable8.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
    }

    @Test
    public void ImmutableTriple1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1022");
        org.apache.commons.lang3.tuple.Triple<java.lang.CharSequence, java.lang.Object, java.lang.CharSequence> charSequenceTriple3 = org.apache.commons.lang3.tuple.Triple.of((java.lang.CharSequence) "((hi!,class java.lang.Object,hi!),class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,hi!))", (java.lang.Object) true, (java.lang.CharSequence) "((hi!,class java.lang.Object,hi!),class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTriple3);
    }

    @Test
    public void ImmutableTriple1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1023");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        boolean boolean7 = strComparableImmutableTriple4.equals((java.lang.Object) 0L);
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1024");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.reflect.GenericDeclaration genericDeclaration4 = strComparableImmutableTriple3.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable5.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
    }

    @Test
    public void ImmutableTriple1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1025");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1026");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.String str8 = strComparableImmutableTriple4.toString("hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1027");
        org.apache.commons.lang3.tuple.Triple<java.lang.String, java.lang.CharSequence, java.lang.CharSequence> strTriple4 = org.apache.commons.lang3.tuple.Triple.of("hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass5 = strTriple4.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple7 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))", (java.lang.reflect.GenericDeclaration) wildcardClass5, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple7.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple7.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))" + "'", strComparable9.equals("(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))"));
    }

    @Test
    public void ImmutableTriple1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1028");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1029");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1030");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1031");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.String str9 = strComparableImmutableTriple4.toString("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)" + "'", str9.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)"));
    }

    @Test
    public void ImmutableTriple1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1032");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
    }

    @Test
    public void ImmutableTriple1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1033");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1034");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
    }

    @Test
    public void ImmutableTriple1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1035");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.reflect.GenericDeclaration genericDeclaration4 = strComparableImmutableTriple3.middle;
        java.lang.String str6 = strComparableImmutableTriple3.toString("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple3.left;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))" + "'", str6.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable7.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable8.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
    }

    @Test
    public void ImmutableTriple1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1036");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.String str7 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str7.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1037");
        org.apache.commons.lang3.tuple.Triple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableTriple0 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple6 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass4, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple6.middle;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple6.getRight();
        org.apache.commons.lang3.tuple.Triple<org.apache.commons.lang3.tuple.Triple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>, java.lang.CharSequence, org.apache.commons.lang3.tuple.Triple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> strComparableTripleTriple9 = org.apache.commons.lang3.tuple.Triple.of(strComparableTriple0, (java.lang.CharSequence) "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))", (org.apache.commons.lang3.tuple.Triple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>) strComparableImmutableTriple6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableTripleTriple9);
    }

    @Test
    public void ImmutableTriple1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1038");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.String str7 = strComparableImmutableTriple4.toString("(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.Class<?> wildcardClass9 = strComparable8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))" + "'", str7.equals("(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1039");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        java.lang.Class<?> wildcardClass9 = strComparableImmutableTriple4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1040");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1041");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableImmutableTriple3.left;
        java.lang.Class<?> wildcardClass5 = strComparableImmutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable4 + "' != '" + "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable4.equals("((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ImmutableTriple1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1042");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
    }

    @Test
    public void ImmutableTriple1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1043");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1044");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.String str7 = strComparableImmutableTriple4.toString("(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))");
        java.lang.String str9 = strComparableImmutableTriple4.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))" + "'", str7.equals("(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutableTriple1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1045");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.apache.commons.lang3.tuple.Triple<java.lang.reflect.Type, java.io.Serializable, java.lang.reflect.Type> typeTriple6 = org.apache.commons.lang3.tuple.Triple.of((java.lang.reflect.Type) wildcardClass2, (java.io.Serializable) 0, (java.lang.reflect.Type) wildcardClass5);
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple8 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))");
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple8.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeTriple6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1046");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.reflect.GenericDeclaration genericDeclaration4 = strComparableImmutableTriple3.middle;
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple3.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple3.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple3.middle;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable5.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable8.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
    }

    @Test
    public void ImmutableTriple1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1047");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1048");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1049");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1050");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple3.toString("");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple3.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple3.left;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable6.equals("((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable7.equals("((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable8.equals("((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))"));
    }

    @Test
    public void ImmutableTriple1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1051");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.apache.commons.lang3.tuple.Triple<java.lang.reflect.Type, java.io.Serializable, java.lang.reflect.Type> typeTriple6 = org.apache.commons.lang3.tuple.Triple.of((java.lang.reflect.Type) wildcardClass2, (java.io.Serializable) 0, (java.lang.reflect.Type) wildcardClass5);
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple8 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple8.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeTriple6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable9.equals("((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))"));
    }

    @Test
    public void ImmutableTriple1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1052");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.reflect.GenericDeclaration genericDeclaration4 = strComparableImmutableTriple3.middle;
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple3.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple3.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple3.right;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable5.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable7.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration8);
    }

    @Test
    public void ImmutableTriple1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1053");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.apache.commons.lang3.tuple.Triple<java.lang.reflect.Type, java.io.Serializable, java.lang.reflect.Type> typeTriple6 = org.apache.commons.lang3.tuple.Triple.of((java.lang.reflect.Type) wildcardClass2, (java.io.Serializable) 0, (java.lang.reflect.Type) wildcardClass5);
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple8 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple8.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeTriple6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable9.equals("((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))"));
    }

    @Test
    public void ImmutableTriple1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1054");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1055");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        java.lang.Class<?> wildcardClass9 = genericDeclaration8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1056");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple3.toString("");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple3.getRight();
        java.lang.String str8 = strComparableImmutableTriple3.toString("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", str8.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1057");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.Class<?> wildcardClass9 = strComparable8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1058");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1059");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        java.lang.Class<?> wildcardClass9 = genericDeclaration8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1060");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1061");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1062");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1063");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1064");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        boolean boolean7 = strComparableImmutableTriple4.equals((java.lang.Object) 0L);
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.String str9 = strComparableImmutableTriple4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str9.equals("(hi!,class java.lang.Object,)"));
    }

    @Test
    public void ImmutableTriple1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1065");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1066");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1067");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.reflect.GenericDeclaration genericDeclaration4 = strComparableImmutableTriple3.middle;
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple3.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple3.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple3.left;
        java.lang.String str8 = strComparableImmutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable5.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable7.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))" + "'", str8.equals("((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))"));
    }

    @Test
    public void ImmutableTriple1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1068");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableImmutableTriple3.getRight();
        java.lang.String str6 = strComparableImmutableTriple3.toString("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable4 + "' != '" + "" + "'", strComparable4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))" + "'", str6.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))"));
    }

    @Test
    public void ImmutableTriple1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1069");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.String str6 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str6.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1070");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple5 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass3, (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.io.Serializable, java.io.Serializable> strComparableImmutableTriple7 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.io.Serializable, java.io.Serializable>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,)", (java.io.Serializable) strComparableImmutableTriple5, (java.io.Serializable) 100.0f);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple5.left;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple5.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1071");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Class<?>, java.lang.CharSequence, java.lang.Comparable<java.lang.String>> wildcardClassImmutableTriple4 = org.apache.commons.lang3.tuple.ImmutableTriple.of(wildcardClass1, (java.lang.CharSequence) "hi!", strComparable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassImmutableTriple4);
    }

    @Test
    public void ImmutableTriple1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1072");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1073");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.reflect.GenericDeclaration genericDeclaration4 = strComparableImmutableTriple3.middle;
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple3.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple3.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple3.right;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable5.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable7.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration8);
    }

    @Test
    public void ImmutableTriple1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1074");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))");
        java.lang.String str5 = strComparableImmutableTriple3.toString("hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1075");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.right;
        java.lang.String str7 = strComparableImmutableTriple4.toString();
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str7.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1076");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1077");
        org.apache.commons.lang3.tuple.Triple<java.lang.CharSequence, java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceTriple3 = org.apache.commons.lang3.tuple.Triple.of((java.lang.CharSequence) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)", (java.lang.CharSequence) "((hi!,class java.lang.Object,hi!),class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,hi!))", (java.lang.Comparable<java.lang.String>) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTriple3);
    }

    @Test
    public void ImmutableTriple1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1078");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1079");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1080");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1081");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1082");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1083");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.String str6 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        java.lang.String str9 = strComparableImmutableTriple4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str6.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str9.equals("(hi!,class java.lang.Object,)"));
    }

    @Test
    public void ImmutableTriple1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1084");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1085");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getLeft();
        java.lang.String str9 = strComparableImmutableTriple4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str9.equals("(hi!,class java.lang.Object,)"));
    }

    @Test
    public void ImmutableTriple1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1086");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1087");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.String str9 = strComparableImmutableTriple4.toString("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))" + "'", str9.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))"));
    }

    @Test
    public void ImmutableTriple1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1088");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.reflect.GenericDeclaration genericDeclaration4 = strComparableImmutableTriple3.middle;
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple3.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple3.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple3.right;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable5.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable7.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable8.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
    }

    @Test
    public void ImmutableTriple1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1089");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1090");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.String str6 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str6.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1091");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
    }

    @Test
    public void ImmutableTriple1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1092");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.String str7 = strComparableImmutableTriple4.toString("");
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1093");
        org.apache.commons.lang3.tuple.Triple<java.lang.String, java.lang.CharSequence, java.lang.CharSequence> strTriple3 = org.apache.commons.lang3.tuple.Triple.of("hi!", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass4 = strTriple3.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.reflect.Type, java.lang.CharSequence, java.lang.String> typeImmutableTriple7 = org.apache.commons.lang3.tuple.ImmutableTriple.of((java.lang.reflect.Type) wildcardClass4, (java.lang.CharSequence) "(hi!,null,(hi!,class java.lang.Object,(hi!,class java.lang.Object,)))", "(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTriple3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeImmutableTriple7);
    }

    @Test
    public void ImmutableTriple1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1094");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        java.lang.Class<?> wildcardClass9 = strComparableImmutableTriple4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1095");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1096");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1097");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1098");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
    }

    @Test
    public void ImmutableTriple1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1099");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1100");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1101");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1102");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
    }

    @Test
    public void ImmutableTriple1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1103");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1104");
        java.lang.reflect.GenericDeclaration genericDeclaration3 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple5 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration3, (java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))");
        java.lang.Class<?> wildcardClass6 = strComparableImmutableTriple5.getClass();
        org.apache.commons.lang3.tuple.Triple<java.lang.CharSequence, java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> charSequenceTriple7 = org.apache.commons.lang3.tuple.Triple.of((java.lang.CharSequence) "(hi!,class java.lang.Object,hi!)", (java.lang.Comparable<java.lang.String>) "", (java.lang.reflect.Type) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTriple7);
    }

    @Test
    public void ImmutableTriple1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1105");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.String str7 = strComparableImmutableTriple4.toString("((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))" + "'", str7.equals("((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1106");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
    }

    @Test
    public void ImmutableTriple1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1107");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.String str6 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str6.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1108");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.reflect.GenericDeclaration genericDeclaration4 = strComparableImmutableTriple3.middle;
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple3.right;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple3.left;
        java.lang.String str8 = strComparableImmutableTriple3.toString("((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable5.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable6.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))" + "'", str8.equals("((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable9.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
    }

    @Test
    public void ImmutableTriple1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1109");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1110");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.String str7 = strComparableImmutableTriple4.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1111");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str6 = strComparableImmutableTriple4.toString("hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1112");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.right;
        java.lang.String str7 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        java.lang.Class<?> wildcardClass9 = strComparableImmutableTriple4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str7.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1113");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1114");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Class<?> wildcardClass9 = strComparableImmutableTriple4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1115");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.String str7 = strComparableImmutableTriple4.toString("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))");
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", str7.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1116");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1117");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1118");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1119");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        org.apache.commons.lang3.tuple.Triple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableTriple7 = null;
        // The following exception was thrown during execution in ImmutableTriple generation
        try {
            int int8 = strComparableImmutableTriple4.compareTo(strComparableTriple7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
    }

    @Test
    public void ImmutableTriple1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1120");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Class<?> wildcardClass9 = strComparableImmutableTriple4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1121");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.String str9 = strComparableImmutableTriple4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str9.equals("(hi!,class java.lang.Object,)"));
    }

    @Test
    public void ImmutableTriple1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1122");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.String str6 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str6.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
    }

    @Test
    public void ImmutableTriple1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1123");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,)");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableImmutableTriple3.left;
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple3.right;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple3.right;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable4 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable4.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", strComparable5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", strComparable6.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration7);
    }

    @Test
    public void ImmutableTriple1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1124");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
    }

    @Test
    public void ImmutableTriple1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1125");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.String str6 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.String str9 = strComparableImmutableTriple4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str6.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str9.equals("(hi!,class java.lang.Object,)"));
    }

    @Test
    public void ImmutableTriple1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1126");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str6 = strComparableImmutableTriple4.toString("hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1127");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1128");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1129");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,)");
        java.lang.String str5 = strComparableImmutableTriple3.toString("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", str5.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", strComparable6.equals("(hi!,class java.lang.Object,)"));
    }

    @Test
    public void ImmutableTriple1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1130");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str6 = strComparableImmutableTriple4.toString("hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1131");
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple6 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass4, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple6.getRight();
        org.apache.commons.lang3.tuple.Triple<java.lang.String, java.lang.CharSequence, java.io.Serializable> strTriple8 = org.apache.commons.lang3.tuple.Triple.of("(hi!,class java.lang.Object,)", (java.lang.CharSequence) "hi!", (java.io.Serializable) strComparableImmutableTriple6);
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple6.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTriple8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1132");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.apache.commons.lang3.tuple.Triple<java.lang.reflect.Type, java.io.Serializable, java.lang.reflect.Type> typeTriple7 = org.apache.commons.lang3.tuple.Triple.of((java.lang.reflect.Type) wildcardClass3, (java.io.Serializable) 0, (java.lang.reflect.Type) wildcardClass6);
        org.apache.commons.lang3.tuple.Triple<java.lang.String, java.lang.CharSequence, java.lang.reflect.GenericDeclaration> strTriple8 = org.apache.commons.lang3.tuple.Triple.of("(((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,)),null,(hi!,class java.lang.Object,(hi!,class java.lang.Object,)))", (java.lang.CharSequence) "(hi!,class java.lang.Object,hi!)", (java.lang.reflect.GenericDeclaration) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeTriple7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTriple8);
    }

    @Test
    public void ImmutableTriple1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1133");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.String str6 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str6.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1134");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.apache.commons.lang3.tuple.Triple<java.lang.reflect.GenericDeclaration, java.lang.String, java.lang.reflect.GenericDeclaration> genericDeclarationTriple6 = org.apache.commons.lang3.tuple.Triple.of((java.lang.reflect.GenericDeclaration) wildcardClass2, "", (java.lang.reflect.GenericDeclaration) wildcardClass5);
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple8 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str9 = strComparableImmutableTriple8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationTriple6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(,class java.lang.Object,)" + "'", str9.equals("(,class java.lang.Object,)"));
    }

    @Test
    public void ImmutableTriple1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1135");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1136");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1137");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.left;
        java.lang.String str7 = strComparableImmutableTriple4.toString();
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.String str9 = strComparableImmutableTriple4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str7.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str9.equals("(hi!,class java.lang.Object,)"));
    }

    @Test
    public void ImmutableTriple1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1138");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1139");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.getLeft();
        java.lang.String str7 = strComparableImmutableTriple4.toString("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", str7.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
    }

    @Test
    public void ImmutableTriple1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1140");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1141");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
    }

    @Test
    public void ImmutableTriple1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1142");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple3.toString("");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple3.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple3.middle;
        java.lang.String str8 = strComparableImmutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable6.equals("((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,)),null,)" + "'", str8.equals("(((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,)),null,)"));
    }

    @Test
    public void ImmutableTriple1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1143");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.String str6 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str6.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1144");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.String str8 = strComparableImmutableTriple4.toString("(hi!,class java.lang.Object,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,hi!)" + "'", str8.equals("(hi!,class java.lang.Object,hi!)"));
    }

    @Test
    public void ImmutableTriple1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1145");
        java.lang.reflect.GenericDeclaration genericDeclaration2 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)", genericDeclaration2, (java.lang.Comparable<java.lang.String>) "(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))");
        java.lang.Class<?> wildcardClass5 = strComparableImmutableTriple4.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple7 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", (java.lang.reflect.GenericDeclaration) wildcardClass5, (java.lang.Comparable<java.lang.String>) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple7.getRight();
        java.lang.String str9 = strComparableImmutableTriple7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))" + "'", strComparable8.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)))" + "'", str9.equals("((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)))"));
    }

    @Test
    public void ImmutableTriple1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1146");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.String str7 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str7.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1147");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableImmutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable4 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable4.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
    }

    @Test
    public void ImmutableTriple1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1148");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple5 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass3, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.Type type6 = null;
        org.apache.commons.lang3.tuple.Triple<java.lang.String, java.lang.reflect.Type, java.lang.reflect.Type> strTriple7 = org.apache.commons.lang3.tuple.Triple.of("((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))", (java.lang.reflect.Type) wildcardClass3, type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTriple7);
    }

    @Test
    public void ImmutableTriple1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1149");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableImmutableTriple3.getLeft();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple3.getLeft();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple3.left;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple3.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable4 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)" + "'", strComparable4.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)" + "'", strComparable5.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)" + "'", strComparable6.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration8);
    }

    @Test
    public void ImmutableTriple1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1150");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.String str7 = strComparableImmutableTriple4.toString("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))");
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", str7.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1151");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Class<?> wildcardClass9 = strComparableImmutableTriple4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1152");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1153");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1154");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1155");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1156");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.CharSequence, java.lang.String, java.lang.Object> charSequenceImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.CharSequence, java.lang.String, java.lang.Object>((java.lang.CharSequence) "hi!", "hi!", (java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass5 = charSequenceImmutableTriple4.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple7 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,)", (java.lang.reflect.GenericDeclaration) wildcardClass5, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple7.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", strComparable8.equals("(hi!,class java.lang.Object,)"));
    }

    @Test
    public void ImmutableTriple1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1157");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.String str4 = strComparableImmutableTriple3.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple3.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))" + "'", str4.equals("((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration6);
    }

    @Test
    public void ImmutableTriple1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1158");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.apache.commons.lang3.tuple.Triple<java.lang.reflect.GenericDeclaration, java.lang.String, java.lang.reflect.GenericDeclaration> genericDeclarationTriple6 = org.apache.commons.lang3.tuple.Triple.of((java.lang.reflect.GenericDeclaration) wildcardClass2, "", (java.lang.reflect.GenericDeclaration) wildcardClass5);
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple8 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass9 = strComparableImmutableTriple8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationTriple6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1159");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.right;
        java.lang.String str7 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str7.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1160");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.String, java.lang.CharSequence> strComparableImmutableTriple3 = org.apache.commons.lang3.tuple.ImmutableTriple.of((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))", "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)", (java.lang.CharSequence) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))");
        java.lang.Class<?> wildcardClass4 = strComparableImmutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutableTriple3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ImmutableTriple1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1161");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1162");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.String str6 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str6.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1163");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.Object obj8 = null;
        boolean boolean9 = strComparableImmutableTriple4.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ImmutableTriple1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1164");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str6 = strComparableImmutableTriple4.toString("hi!");
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
    }

    @Test
    public void ImmutableTriple1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1165");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.String str7 = strComparableImmutableTriple4.toString("");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1166");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.String str4 = strComparableImmutableTriple3.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple3.middle;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))" + "'", str4.equals("((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable6.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
    }

    @Test
    public void ImmutableTriple1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1167");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ImmutableTriple1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1168");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1169");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.String str6 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str6.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1170");
        org.apache.commons.lang3.tuple.Triple<java.lang.Comparable<java.lang.String>, java.lang.String, java.lang.Comparable<java.lang.String>> strComparableTriple4 = org.apache.commons.lang3.tuple.Triple.of((java.lang.Comparable<java.lang.String>) "hi!", "(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))", (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class java.lang.Object,)");
        java.lang.Class<?> wildcardClass5 = strComparableTriple4.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple7 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)", (java.lang.reflect.GenericDeclaration) wildcardClass5, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = strComparableImmutableTriple7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableTriple4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)" + "'", str8.equals("(((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)"));
    }

    @Test
    public void ImmutableTriple1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1171");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1172");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1173");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1174");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableImmutableTriple3.getLeft();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple3.getLeft();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple3.left;
        java.lang.Class<?> wildcardClass7 = strComparable6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable4 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)" + "'", strComparable4.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)" + "'", strComparable5.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)" + "'", strComparable6.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ImmutableTriple1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1175");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.String str6 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str6.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1176");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
    }

    @Test
    public void ImmutableTriple1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1177");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1178");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.String str6 = strComparableImmutableTriple4.toString();
        java.lang.String str8 = strComparableImmutableTriple4.toString("((hi!,class java.lang.Object,),class java.lang.Object,)");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str6.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,class java.lang.Object,),class java.lang.Object,)" + "'", str8.equals("((hi!,class java.lang.Object,),class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1179");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
    }

    @Test
    public void ImmutableTriple1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1180");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1181");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
    }

    @Test
    public void ImmutableTriple1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1182");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.String str6 = strComparableImmutableTriple4.toString();
        java.lang.String str8 = strComparableImmutableTriple4.toString("((hi!,class java.lang.Object,),class java.lang.Object,)");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str6.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,class java.lang.Object,),class java.lang.Object,)" + "'", str8.equals("((hi!,class java.lang.Object,),class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1183");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        java.lang.String str9 = strComparableImmutableTriple4.toString("((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)))" + "'", str9.equals("((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)))"));
    }

    @Test
    public void ImmutableTriple1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1184");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1185");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1186");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1187");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(strComparable0, genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)");
        java.lang.reflect.GenericDeclaration genericDeclaration4 = strComparableImmutableTriple3.middle;
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)" + "'", strComparable5.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)"));
    }

    @Test
    public void ImmutableTriple1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1188");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.String str5 = strComparableImmutableTriple3.toString("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)" + "'", str5.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable6.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
    }

    @Test
    public void ImmutableTriple1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1189");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.reflect.GenericDeclaration genericDeclaration4 = strComparableImmutableTriple3.middle;
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple3.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple3.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple3.middle;
        java.lang.String str8 = strComparableImmutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable5.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))" + "'", str8.equals("((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))"));
    }

    @Test
    public void ImmutableTriple1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1190");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
    }

    @Test
    public void ImmutableTriple1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1191");
        org.apache.commons.lang3.tuple.Triple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableTriple2 = null;
        org.apache.commons.lang3.tuple.Triple<java.lang.Comparable<java.lang.String>, java.lang.String, org.apache.commons.lang3.tuple.Triple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> strComparableTriple3 = org.apache.commons.lang3.tuple.Triple.of((java.lang.Comparable<java.lang.String>) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)", "(hi!,null,(hi!,class java.lang.Object,(hi!,class java.lang.Object,)))", strComparableTriple2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableTriple3);
    }

    @Test
    public void ImmutableTriple1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1192");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.left;
        java.lang.String str7 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str7.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
    }

    @Test
    public void ImmutableTriple1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1193");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.reflect.GenericDeclaration genericDeclaration4 = strComparableImmutableTriple3.middle;
        java.lang.String str5 = strComparableImmutableTriple3.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))" + "'", str5.equals("((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable6.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
    }

    @Test
    public void ImmutableTriple1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1194");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1195");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1196");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        java.lang.Class<?> wildcardClass9 = genericDeclaration8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1197");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.reflect.GenericDeclaration genericDeclaration4 = strComparableImmutableTriple3.middle;
        java.lang.String str6 = strComparableImmutableTriple3.toString("hi!");
        java.lang.Class<?> wildcardClass7 = strComparableImmutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ImmutableTriple1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1198");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getLeft();
        java.lang.Class<?> wildcardClass9 = strComparable8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1199");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.String str7 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        java.lang.Class<?> wildcardClass9 = genericDeclaration8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str7.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1200");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.String str9 = strComparableImmutableTriple4.toString("(hi!,null,(hi!,class java.lang.Object,(hi!,class java.lang.Object,)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,null,(hi!,class java.lang.Object,(hi!,class java.lang.Object,)))" + "'", str9.equals("(hi!,null,(hi!,class java.lang.Object,(hi!,class java.lang.Object,)))"));
    }

    @Test
    public void ImmutableTriple1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1201");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Class<?> wildcardClass9 = strComparableImmutableTriple4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1202");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.reflect.GenericDeclaration genericDeclaration4 = strComparableImmutableTriple3.middle;
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple3.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple3.getMiddle();
        // The following exception was thrown during execution in ImmutableTriple generation
        try {
            java.lang.Class<?> wildcardClass7 = genericDeclaration6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable5.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration6);
    }

    @Test
    public void ImmutableTriple1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1203");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
    }

    @Test
    public void ImmutableTriple1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1204");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))");
        java.lang.String str5 = strComparableImmutableTriple3.toString("hi!");
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple3.middle;
        java.lang.String str7 = strComparableImmutableTriple3.toString();
        java.lang.String str8 = strComparableImmutableTriple3.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,null,(hi!,class java.lang.Object,(hi!,class java.lang.Object,)))" + "'", str7.equals("(hi!,null,(hi!,class java.lang.Object,(hi!,class java.lang.Object,)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,null,(hi!,class java.lang.Object,(hi!,class java.lang.Object,)))" + "'", str8.equals("(hi!,null,(hi!,class java.lang.Object,(hi!,class java.lang.Object,)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1205");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1206");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple5 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass3, (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple7 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.reflect.GenericDeclaration) wildcardClass3, (java.lang.Comparable<java.lang.String>) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple7.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple7.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))" + "'", strComparable8.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1207");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.String str5 = strComparableImmutableTriple3.toString("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple3.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple3.getRight();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple3.getLeft();
        java.lang.String str9 = strComparableImmutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)" + "'", str5.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable6.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable7.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable8.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))" + "'", str9.equals("((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))"));
    }

    @Test
    public void ImmutableTriple1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1208");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1209");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1210");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,)");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableImmutableTriple3.getRight();
        java.lang.String str6 = strComparableImmutableTriple3.toString("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable4 + "' != '" + "(hi!,class java.lang.Object,)" + "'", strComparable4.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", str6.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
    }

    @Test
    public void ImmutableTriple1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1211");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(strComparable0, genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)");
        java.lang.String str4 = strComparableImmutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null,((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!))" + "'", str4.equals("(null,null,((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!))"));
    }

    @Test
    public void ImmutableTriple1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1212");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1213");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str6 = strComparableImmutableTriple4.toString("hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1214");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.String str7 = strComparableImmutableTriple4.toString("(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))");
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        java.lang.Class<?> wildcardClass9 = strComparableImmutableTriple4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))" + "'", str7.equals("(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1215");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.String str7 = strComparableImmutableTriple4.toString("((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))" + "'", str7.equals("((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1216");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1217");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.String str7 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str7.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1218");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.String str7 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.String str9 = strComparableImmutableTriple4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str7.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str9.equals("(hi!,class java.lang.Object,)"));
    }

    @Test
    public void ImmutableTriple1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1219");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.String str8 = strComparableImmutableTriple4.toString("");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1220");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.String str7 = strComparableImmutableTriple4.toString("((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))" + "'", str7.equals("((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1221");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.String str6 = strComparableImmutableTriple4.toString();
        java.lang.Class<?> wildcardClass7 = strComparableImmutableTriple4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str6.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ImmutableTriple1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1222");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1223");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.left;
        java.lang.String str7 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str7.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1224");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,)");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableImmutableTriple3.left;
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable4 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable4.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable5.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
    }

    @Test
    public void ImmutableTriple1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1225");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str6 = strComparableImmutableTriple4.toString("hi!");
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1226");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1227");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableImmutableTriple3.getRight();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple3.right;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple3.getRight();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable4 + "' != '" + "" + "'", strComparable4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable7.equals("((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))"));
    }

    @Test
    public void ImmutableTriple1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1228");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1229");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1230");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
    }

    @Test
    public void ImmutableTriple1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1231");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.reflect.GenericDeclaration genericDeclaration4 = strComparableImmutableTriple3.middle;
        java.lang.String str6 = strComparableImmutableTriple3.toString("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))");
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))" + "'", str6.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration7);
    }

    @Test
    public void ImmutableTriple1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1232");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.String str9 = strComparableImmutableTriple4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str9.equals("(hi!,class java.lang.Object,)"));
    }

    @Test
    public void ImmutableTriple1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1233");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple5 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass3, (java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple7 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(strComparable0, (java.lang.reflect.GenericDeclaration) wildcardClass3, (java.lang.Comparable<java.lang.String>) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))");
        java.lang.String str8 = strComparableImmutableTriple7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(null,class java.lang.Object,((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)))" + "'", str8.equals("(null,class java.lang.Object,((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)))"));
    }

    @Test
    public void ImmutableTriple1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1234");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple3.toString("");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple3.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple3.left;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable6.equals("((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable7.equals("((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration8);
    }

    @Test
    public void ImmutableTriple1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1235");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str6 = strComparableImmutableTriple4.toString("hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1236");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.String str6 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str6.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1237");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1238");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1239");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str6 = strComparableImmutableTriple4.toString("hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1240");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        java.lang.Class<?> wildcardClass9 = strComparableImmutableTriple4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1241");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str6 = strComparableImmutableTriple4.toString("hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.right;
        java.lang.Class<?> wildcardClass9 = strComparableImmutableTriple4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1242");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple2 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.String, java.lang.String, org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> strImmutableTriple3 = org.apache.commons.lang3.tuple.ImmutableTriple.of("(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))", "(hi!,class java.lang.Object,)", strComparableImmutableTriple2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutableTriple3);
    }

    @Test
    public void ImmutableTriple1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1243");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.String str4 = strComparableImmutableTriple3.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple3.getMiddle();
        java.lang.String str6 = strComparableImmutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))" + "'", str4.equals("((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))" + "'", str6.equals("((hi!,class java.lang.Object,(hi!,class java.lang.Object,)),null,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))"));
    }

    @Test
    public void ImmutableTriple1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1244");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.getLeft();
        java.lang.String str7 = strComparableImmutableTriple4.toString("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", str7.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1245");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,)");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableImmutableTriple3.left;
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple3.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple3.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable4 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable4.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", strComparable5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "(hi!,class java.lang.Object,)" + "'", strComparable7.equals("(hi!,class java.lang.Object,)"));
    }

    @Test
    public void ImmutableTriple1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1246");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1247");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
    }

    @Test
    public void ImmutableTriple1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1248");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Class<?> wildcardClass9 = strComparableImmutableTriple4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutableTriple1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1249");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.apache.commons.lang3.tuple.Triple<java.lang.reflect.GenericDeclaration, java.lang.String, java.lang.reflect.GenericDeclaration> genericDeclarationTriple6 = org.apache.commons.lang3.tuple.Triple.of((java.lang.reflect.GenericDeclaration) wildcardClass2, "", (java.lang.reflect.GenericDeclaration) wildcardClass5);
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple8 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple8.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationTriple6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1250");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableImmutableTriple3.getLeft();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple3.getLeft();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple3.right;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable4 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)" + "'", strComparable4.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)" + "'", strComparable5.equals("((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable6.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration7);
    }

    @Test
    public void ImmutableTriple1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1251");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.String str7 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str7.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1252");
        java.lang.reflect.GenericDeclaration genericDeclaration3 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple5 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration3, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple5.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple5.left;
        org.apache.commons.lang3.tuple.Triple<java.lang.String, java.lang.Comparable<java.lang.String>, java.io.Serializable> strTriple8 = org.apache.commons.lang3.tuple.Triple.of("hi!", (java.lang.Comparable<java.lang.String>) "(((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,)),null,(hi!,class java.lang.Object,(hi!,class java.lang.Object,)))", (java.io.Serializable) strComparableImmutableTriple5);
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple5.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable7.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTriple8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)" + "'", strComparable9.equals("((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)"));
    }

    @Test
    public void ImmutableTriple1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1253");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple3.toString("");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple3.getRight();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable7.equals("((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))"));
    }

    @Test
    public void ImmutableTriple1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1254");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getLeft();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1255");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1256");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.String str7 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str7.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
    }

    @Test
    public void ImmutableTriple1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1257");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getLeft();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.getMiddle();
        java.lang.reflect.GenericDeclaration genericDeclaration8 = strComparableImmutableTriple4.getMiddle();
        java.lang.String str9 = strComparableImmutableTriple4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str9.equals("(hi!,class java.lang.Object,)"));
    }

    @Test
    public void ImmutableTriple1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1258");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void ImmutableTriple1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1259");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.left;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        java.lang.reflect.GenericDeclaration genericDeclaration9 = strComparableImmutableTriple4.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "hi!" + "'", strComparable5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration9);
    }

    @Test
    public void ImmutableTriple1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1260");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.getRight();
        java.lang.String str7 = strComparableImmutableTriple4.toString("((hi!,class java.lang.Object,),class java.lang.Object,)");
        java.lang.String str8 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,class java.lang.Object,),class java.lang.Object,)" + "'", str7.equals("((hi!,class java.lang.Object,),class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str8.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1261");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.getRight();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
    }

    @Test
    public void ImmutableTriple1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1262");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration7 = strComparableImmutableTriple4.middle;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableImmutableTriple4.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void ImmutableTriple1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.ImmutableTriple1263");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str5 = strComparableImmutableTriple4.toString();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableImmutableTriple4.right;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableImmutableTriple4.left;
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableImmutableTriple4.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,class java.lang.Object,)" + "'", str5.equals("(hi!,class java.lang.Object,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "" + "'", strComparable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
    }
}

