
package ImmutableTriple;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ImmutableTriple2 {

    public static boolean debug = false;

    @Test
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1001");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1002");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1003");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1004");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1005");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1006");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1007");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1008");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1009");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1010");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1011");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1012");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1013");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1014");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1015");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1016");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1017");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1018");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1019");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1020");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1021");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1022");
        org.apache.commons.lang3.tuple.Triple<java.lang.CharSequence, java.lang.Object, java.lang.CharSequence> charSequenceTriple3 = org.apache.commons.lang3.tuple.Triple.of((java.lang.CharSequence) "((hi!,class java.lang.Object,hi!),class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,hi!))", (java.lang.Object) true, (java.lang.CharSequence) "((hi!,class java.lang.Object,hi!),class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTriple3);
    }

    @Test
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1023");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1024");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1025");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1026");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1027");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1028");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1029");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1030");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1031");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1032");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1033");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1034");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1035");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1036");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1037");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1038");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1039");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1040");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1041");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1042");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1043");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1044");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1045");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1046");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1047");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1048");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1049");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1050");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1051");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1052");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1053");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1054");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1055");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1056");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1057");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1058");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1059");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1060");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1061");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1062");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1063");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1064");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1065");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1066");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1067");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1068");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1069");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1070");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1071");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1072");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1073");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1074");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1075");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1076");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1077");
        org.apache.commons.lang3.tuple.Triple<java.lang.CharSequence, java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceTriple3 = org.apache.commons.lang3.tuple.Triple.of((java.lang.CharSequence) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)", (java.lang.CharSequence) "((hi!,class java.lang.Object,hi!),class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,hi!))", (java.lang.Comparable<java.lang.String>) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTriple3);
    }

    @Test
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1078");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1079");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1080");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1081");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1082");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1083");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1084");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1085");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1086");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1087");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1088");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1089");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1090");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1091");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1092");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1093");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1094");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1095");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1096");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1097");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1098");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1099");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1100");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1101");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1102");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1103");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1104");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1105");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1106");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1107");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1108");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1109");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1110");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1111");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1112");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1113");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1114");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1115");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1116");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1117");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1118");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1119");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "");
        java.lang.reflect.GenericDeclaration genericDeclaration5 = strComparableImmutableTriple4.middle;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple4.getMiddle();
        org.apache.commons.lang3.tuple.Triple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableTriple7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1120");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1121");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1122");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1123");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1124");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1125");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1126");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1127");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1128");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1129");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1130");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1131");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1132");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1133");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1134");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1135");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1136");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1137");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1138");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1139");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1140");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1141");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1142");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1143");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1144");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1145");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1146");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1147");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))");
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableImmutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + strComparable4 + "' != '" + "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))" + "'", strComparable4.equals("(hi!,class java.lang.Object,(hi!,class java.lang.Object,))"));
    }

    @Test
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1148");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1149");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1150");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1151");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1152");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1153");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1154");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1155");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1156");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1157");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1158");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1159");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1160");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.String, java.lang.CharSequence> strComparableImmutableTriple3 = org.apache.commons.lang3.tuple.ImmutableTriple.of((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))", "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)", (java.lang.CharSequence) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class java.lang.Object,((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,))");
        java.lang.Class<?> wildcardClass4 = strComparableImmutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutableTriple3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1161");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1162");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1163");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1164");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1165");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1166");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1167");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class java.lang.Object,(hi!,class java.lang.Object,))", (java.lang.reflect.GenericDeclaration) wildcardClass2, (java.lang.Comparable<java.lang.String>) "(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1168");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1169");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1170");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1171");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1172");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1173");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1174");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1175");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1176");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1177");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1178");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1179");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1180");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1181");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1182");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1183");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1184");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1185");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1186");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1187");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1188");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1189");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1190");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1191");
        org.apache.commons.lang3.tuple.Triple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableTriple2 = null;
        org.apache.commons.lang3.tuple.Triple<java.lang.Comparable<java.lang.String>, java.lang.String, org.apache.commons.lang3.tuple.Triple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> strComparableTriple3 = org.apache.commons.lang3.tuple.Triple.of((java.lang.Comparable<java.lang.String>) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)", "(hi!,null,(hi!,class java.lang.Object,(hi!,class java.lang.Object,)))", strComparableTriple2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableTriple3);
    }

    @Test
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1192");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1193");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1194");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1195");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1196");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1197");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1198");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1199");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1200");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1201");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1202");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((hi!,class java.lang.Object,),class org.apache.commons.lang3.tuple.ImmutableTriple,)");
        java.lang.reflect.GenericDeclaration genericDeclaration4 = strComparableImmutableTriple3.middle;
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableImmutableTriple3.right;
        java.lang.reflect.GenericDeclaration genericDeclaration6 = strComparableImmutableTriple3.getMiddle();
        // The following exception was thrown during execution in test generation
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1203");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1204");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1205");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1206");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1207");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1208");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1209");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1210");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1211");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(strComparable0, genericDeclaration1, (java.lang.Comparable<java.lang.String>) "((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!)");
        java.lang.String str4 = strComparableImmutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(null,null,((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!))" + "'", str4.equals("(null,null,((,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,)),class org.apache.commons.lang3.tuple.ImmutableTriple,hi!))"));
    }

    @Test
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1212");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1213");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1214");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1215");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1216");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1217");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1218");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1219");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1220");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1221");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1222");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1223");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1224");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1225");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1226");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1227");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1228");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1229");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1230");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1231");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1232");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1233");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1234");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1235");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1236");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1237");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1238");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1239");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1240");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1241");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1242");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple2 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.String, java.lang.String, org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>> strImmutableTriple3 = org.apache.commons.lang3.tuple.ImmutableTriple.of("(,class org.apache.commons.lang3.tuple.ImmutableTriple,(hi!,class java.lang.Object,))", "(hi!,class java.lang.Object,)", strComparableImmutableTriple2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutableTriple3);
    }

    @Test
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1243");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1244");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1245");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1246");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1247");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1248");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1249");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1250");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1251");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1252");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1253");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1254");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1255");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1256");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1257");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1258");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> strComparableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "(hi!,class java.lang.Object,(hi!,class java.lang.Object,))", genericDeclaration1, (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1259");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1260");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1261");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1262");
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
    public void ImmutableTriple() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple2.test1263");
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

