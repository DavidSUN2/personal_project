package ImmutablePair;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ImmutablePair1 {

    public static boolean debug = false;

    @Test
    public void ImmutablePair0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0501");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),),(,((hi!,),)))", "(((hi!,),),(,((hi!,),)))");
        java.lang.Class<?> wildcardClass4 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of("(((hi!,),),(hi!,))", (java.io.Serializable) strImmutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair5);
    }

    @Test
    public void ImmutablePair0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0502");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((java.lang.Comparable<java.lang.String>) "(((hi!,),),(,((hi!,),)))", (java.lang.CharSequence) "((,((hi!,),)),(hi!,))");
    }

    @Test
    public void ImmutablePair0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0503");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0504");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> objImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>((java.lang.Object) 'a', (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.right;
        java.lang.String str6 = strImmutablePair3.getValue();
        java.lang.String str7 = strImmutablePair3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0505");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0506");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.getValue();
        java.lang.String str6 = strImmutablePair3.getRight();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPair7 = org.apache.commons.lang3.tuple.Pair.of("(,((hi!,),))", (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str9 = strImmutablePair3.toString("((,((hi!,),)),(hi!,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((,((hi!,),)),(hi!,))" + "'", str9.equals("((,((hi!,),)),(hi!,))"));
    }

    @Test
    public void ImmutablePair0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0507");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.Class<?> wildcardClass6 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ImmutablePair0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0508");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.lang.CharSequence> charSequenceImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "((hi!,),hi!)", (java.lang.CharSequence) "(((hi!,),hi!),(,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair2);
    }

    @Test
    public void ImmutablePair0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0509");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair5 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair6 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair5);
        java.lang.Class<?> wildcardClass7 = strImmutablePair5.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.reflect.Type> strPair8 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.lang.reflect.Type) wildcardClass7);
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Class<?>> strPair9 = org.apache.commons.lang3.tuple.Pair.of("((hi!,),hi!)", wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair9);
    }

    @Test
    public void ImmutablePair0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0510");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.Object obj8 = null;
        boolean boolean9 = strImmutablePair2.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ImmutablePair0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0511");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.getValue();
        java.lang.String str6 = strImmutablePair3.getValue();
        java.lang.String str7 = strImmutablePair3.getValue();
        java.lang.Class<?> wildcardClass8 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequencePair9 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(hi!,)", (java.lang.reflect.GenericDeclaration) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair9);
    }

    @Test
    public void ImmutablePair0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0512");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0513");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Object> strImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of("hi!", (java.lang.Object) 0);
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair5 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str6 = strImmutablePair5.left;
        java.lang.String str7 = strImmutablePair5.toString();
        org.apache.commons.lang3.tuple.ImmutablePair<java.io.Serializable, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> serializableImmutablePair8 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.io.Serializable) 0, strImmutablePair5);
        java.lang.String str9 = strImmutablePair5.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableImmutablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0514");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.toString();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("(hi!,)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0515");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0516");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.right;
        java.lang.String str8 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0517");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) '#');
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0518");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.CharSequence> strPair2 = org.apache.commons.lang3.tuple.Pair.of("((hi!,),)", (java.lang.CharSequence) "((,((hi!,),)),(hi!,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void ImmutablePair0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0519");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.io.Serializable> objImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Object) 1L, (java.io.Serializable) strImmutablePair3);
        java.lang.String str9 = strImmutablePair3.toString("(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objImmutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0520");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),hi!),(,hi!))", "(((hi!,),),hi!)");
    }

    @Test
    public void ImmutablePair0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0521");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,),hi!)" + "'", str7.equals("((hi!,),hi!)"));
    }

    @Test
    public void ImmutablePair0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0522");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(((hi!,),),(hi!,))");
    }

    @Test
    public void ImmutablePair0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0523");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(,((hi!,),))");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.toString("((,((hi!,),)),(hi!,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,((hi!,),))" + "'", str3.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((,((hi!,),)),(hi!,))" + "'", str5.equals("((,((hi!,),)),(hi!,))"));
    }

    @Test
    public void ImmutablePair0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0524");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0525");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0526");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0527");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.toString("(hi!,)");
        java.lang.String str7 = strImmutablePair2.toString("(,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,hi!)" + "'", str7.equals("(,hi!)"));
    }

    @Test
    public void ImmutablePair0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0528");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
        java.lang.String str7 = strImmutablePair2.right;
        java.lang.Class<?> wildcardClass8 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str6.equals("(((hi!,),),(,((hi!,),)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0529");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str8 = strImmutablePair2.toString("(,((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(,((hi!,),))" + "'", str8.equals("(,((hi!,),))"));
    }

    @Test
    public void ImmutablePair0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0530");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairPair8 = org.apache.commons.lang3.tuple.Pair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "hi!");
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairPair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0531");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.toString();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("((,((hi!,),)),(hi!,))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0532");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.toString();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("(,hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0533");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ImmutablePair0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0534");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0535");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0536");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str9 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,),)" + "'", str8.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0537");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.Class<?> wildcardClass6 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ImmutablePair0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0538");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.right;
        java.lang.String str6 = strImmutablePair3.toString("((hi!,),)");
        java.lang.Class<?> wildcardClass7 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.io.Serializable, java.io.Serializable> serializableImmutablePair8 = org.apache.commons.lang3.tuple.ImmutablePair.of(serializable0, (java.io.Serializable) strImmutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((hi!,),)" + "'", str6.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableImmutablePair8);
    }

    @Test
    public void ImmutablePair0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0539");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(,((hi!,),))");
        java.lang.String str3 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,((hi!,),))" + "'", str3.equals("(,((hi!,),))"));
    }

    @Test
    public void ImmutablePair0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0540");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        java.lang.String str3 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0541");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0542");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str6 = strImmutablePair2.toString("(,((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(,((hi!,),))" + "'", str6.equals("(,((hi!,),))"));
    }

    @Test
    public void ImmutablePair0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0543");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0544");
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String> charSequencePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(,((hi!,),))", "(((hi!,),),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair2);
    }

    @Test
    public void ImmutablePair0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0545");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getRight();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair2.setValue("((hi!,),)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0546");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str8 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,),)" + "'", str7.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0547");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        org.apache.commons.lang3.tuple.Pair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> strEntryPair6 = org.apache.commons.lang3.tuple.Pair.of((java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair2, "(hi!,)");
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strEntryPair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0548");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(((hi!,),),(,((hi!,),)))");
        java.lang.Class<?> wildcardClass3 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ImmutablePair0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0549");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0550");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str4 = strImmutablePair3.left;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> strImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of("(hi!,)", strImmutablePair3);
        java.lang.String str6 = strImmutablePair3.getLeft();
        java.lang.String str8 = strImmutablePair3.toString("(((hi!,),hi!),(,hi!))");
        java.lang.String str9 = strImmutablePair3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(((hi!,),hi!),(,hi!))" + "'", str8.equals("(((hi!,),hi!),(,hi!))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0551");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.getKey();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair2.setValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0552");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.String str9 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0553");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),hi!)", "(,((hi!,),))");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,((hi!,),))" + "'", str3.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,((hi!,),))" + "'", str4.equals("(,((hi!,),))"));
    }

    @Test
    public void ImmutablePair0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0554");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.toString("((hi!,),)");
        java.lang.Class<?> wildcardClass6 = strImmutablePair2.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration7 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.Class<?>, java.lang.reflect.GenericDeclaration> wildcardClassPair8 = org.apache.commons.lang3.tuple.Pair.of(wildcardClass6, genericDeclaration7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassPair8);
    }

    @Test
    public void ImmutablePair0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0555");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair5 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair4);
        java.lang.String str6 = strImmutablePair4.toString();
        java.lang.String str7 = strImmutablePair4.left;
        java.lang.String str8 = strImmutablePair4.left;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of(strComparable0, (java.io.Serializable) strImmutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair9);
    }

    @Test
    public void ImmutablePair0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0556");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0557");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0558");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.right;
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0559");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0560");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.Class<?> wildcardClass5 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair6);
    }

    @Test
    public void ImmutablePair0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0561");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0562");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>, java.lang.CharSequence> strImmutablePairImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of(strImmutablePair2, (java.lang.CharSequence) "((hi!,),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePairImmutablePair9);
    }

    @Test
    public void ImmutablePair0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0563");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair5 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair4);
        java.lang.Class<?> wildcardClass6 = strImmutablePair4.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.reflect.Type> strPair7 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.lang.reflect.Type) wildcardClass6);
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.reflect.GenericDeclaration) wildcardClass6, (java.lang.Comparable<java.lang.String>) "((hi!,),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationImmutablePair9);
    }

    @Test
    public void ImmutablePair0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0564");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.getValue();
        java.lang.Class<?> wildcardClass7 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Class<?>> strImmutablePair8 = org.apache.commons.lang3.tuple.ImmutablePair.of("(((hi!,),hi!),(,hi!))", wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair8);
    }

    @Test
    public void ImmutablePair0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0565");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0566");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),hi!),(,hi!))", "((hi!,),hi!)");
        java.lang.String str3 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((hi!,),hi!),(,hi!))" + "'", str3.equals("(((hi!,),hi!),(,hi!))"));
    }

    @Test
    public void ImmutablePair0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0567");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3, (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = strPairImmutablePair7.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.lang.reflect.Type> charSequenceImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "((hi!,),hi!)", (java.lang.reflect.Type) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair9);
    }

    @Test
    public void ImmutablePair0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0568");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(,hi!)", "(,((hi!,),))");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str5 = strImmutablePair2.toString("(,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,((hi!,),))" + "'", str3.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(,hi!)" + "'", str5.equals("(,hi!)"));
    }

    @Test
    public void ImmutablePair0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0569");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0570");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString("hi!");
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0571");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getRight();
        java.lang.String str6 = strImmutablePair3.right;
        java.lang.String str7 = strImmutablePair3.getLeft();
        java.lang.String str9 = strImmutablePair3.toString("((,((hi!,),)),(hi!,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((,((hi!,),)),(hi!,))" + "'", str9.equals("((,((hi!,),)),(hi!,))"));
    }

    @Test
    public void ImmutablePair0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0572");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(,hi!)", "hi!");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.Class<?> wildcardClass4 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,hi!)" + "'", str3.equals("(,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ImmutablePair0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0573");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.right;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair2.setValue("((hi!,),)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0574");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.String str7 = strImmutablePair3.left;
        java.lang.String str8 = strImmutablePair3.right;
        java.lang.String str9 = strImmutablePair3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0575");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0576");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.toString();
        boolean boolean6 = strImmutablePair2.equals((java.lang.Object) (byte) 0);
        java.lang.String str8 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
        java.lang.String str9 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str8.equals("(((hi!,),),(,((hi!,),)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((hi!,),)" + "'", str9.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0577");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0578");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.left;
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparablePair6 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "((,((hi!,),)),(hi!,))", (java.lang.Object) str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair6);
    }

    @Test
    public void ImmutablePair0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0579");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("((,((hi!,),)),(hi!,))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void ImmutablePair0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0580");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.toString("(((hi!,),hi!),(,hi!))");
        java.lang.String str9 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(((hi!,),hi!),(,hi!))" + "'", str8.equals("(((hi!,),hi!),(,hi!))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0581");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair6 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        int int7 = strImmutablePair2.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair6);
        java.lang.String str8 = strImmutablePair6.getLeft();
        java.lang.String str9 = strImmutablePair6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(,((hi!,),))" + "'", str9.equals("(,((hi!,),))"));
    }

    @Test
    public void ImmutablePair0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0582");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0583");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(,hi!)");
    }

    @Test
    public void ImmutablePair0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0584");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.Class<?> wildcardClass6 = strImmutablePair3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ImmutablePair0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0585");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString("(hi!,)");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0586");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(,((hi!,),))" + "'", str5.equals("(,((hi!,),))"));
    }

    @Test
    public void ImmutablePair0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0587");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair6 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        int int7 = strImmutablePair2.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair6);
        java.lang.String str8 = strImmutablePair6.left;
        java.lang.Class<?> wildcardClass9 = strImmutablePair6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0588");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Object> strImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of("hi!", (java.lang.Object) 0);
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair5 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str6 = strImmutablePair5.left;
        java.lang.String str7 = strImmutablePair5.toString();
        org.apache.commons.lang3.tuple.ImmutablePair<java.io.Serializable, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> serializableImmutablePair8 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.io.Serializable) 0, strImmutablePair5);
        java.lang.String str9 = strImmutablePair5.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableImmutablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0589");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0590");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.Class<?> wildcardClass7 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ImmutablePair0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0591");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0592");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0593");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0594");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getKey();
        java.lang.String str9 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0595");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.toString();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("(,((hi!,),))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0596");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.toString("(((hi!,),hi!),(,hi!))");
        java.lang.String str6 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),hi!)" + "'", str3.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(((hi!,),hi!),(,hi!))" + "'", str5.equals("(((hi!,),hi!),(,hi!))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0597");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.String str9 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0598");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getRight();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair2.setValue("(((hi!,),),(,((hi!,),)))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0599");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0600");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0601");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0602");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("(((hi!,),),(hi!,))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0603");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0604");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),),(,((hi!,),)))", "(((hi!,),),(,((hi!,),)))");
        java.lang.String str3 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str3.equals("(((hi!,),),(,((hi!,),)))"));
    }

    @Test
    public void ImmutablePair0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0605");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.getKey();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.toString("(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0606");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str6 = strImmutablePair3.toString("(,((hi!,),))");
        java.lang.String str7 = strImmutablePair3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(,((hi!,),))" + "'", str6.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0607");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.toString();
        boolean boolean6 = strImmutablePair2.equals((java.lang.Object) (byte) 0);
        java.lang.String str8 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
        java.lang.String str9 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str8.equals("(((hi!,),),(,((hi!,),)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0608");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(,((hi!,),))", "(((hi!,),),(,((hi!,),)))");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.Object obj4 = null;
        boolean boolean5 = strImmutablePair2.equals(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str3.equals("(((hi!,),),(,((hi!,),)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ImmutablePair0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0609");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(,hi!)", "hi!");
        java.lang.String str3 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((,hi!),hi!)" + "'", str3.equals("((,hi!),hi!)"));
    }

    @Test
    public void ImmutablePair0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0610");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>> strPairImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>>((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,),)" + "'", str7.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0611");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("(hi!,)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ImmutablePair0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0612");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
        java.lang.String str7 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str6.equals("(((hi!,),),(,((hi!,),)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,),)" + "'", str7.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0613");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair2.setValue("(hi!,)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0614");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.toString();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair2.setValue("(((hi!,),),(,((hi!,),)))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(((hi!,),),(hi!,))" + "'", str7.equals("(((hi!,),),(hi!,))"));
    }

    @Test
    public void ImmutablePair0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0615");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.CharSequence> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.CharSequence>("hi!", (java.lang.CharSequence) "hi!");
    }

    @Test
    public void ImmutablePair0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0616");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Object> strImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of("hi!", (java.lang.Object) 0);
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair5 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str6 = strImmutablePair5.left;
        java.lang.String str7 = strImmutablePair5.toString();
        org.apache.commons.lang3.tuple.ImmutablePair<java.io.Serializable, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> serializableImmutablePair8 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.io.Serializable) 0, strImmutablePair5);
        java.lang.String str9 = strImmutablePair5.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableImmutablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0617");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Comparable<java.lang.String>) "(((hi!,),),(hi!,))", (java.lang.Comparable<java.lang.String>) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair2);
    }

    @Test
    public void ImmutablePair0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0618");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> strPair2 = org.apache.commons.lang3.tuple.Pair.of("hi!", "hi!");
        java.lang.String str3 = strPair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void ImmutablePair0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0619");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.toString("((hi!,),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,),hi!)" + "'", str8.equals("((hi!,),hi!)"));
    }

    @Test
    public void ImmutablePair0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0620");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0621");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0622");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),hi!)" + "'", str5.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0623");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.getValue();
        java.lang.String str7 = strImmutablePair3.getValue();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> strPair8 = org.apache.commons.lang3.tuple.Pair.of("((hi!,),)", strImmutablePair3);
        java.lang.String str9 = strImmutablePair3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0624");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ImmutablePair0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0625");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.Class<?> wildcardClass6 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ImmutablePair0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0626");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str9 = strImmutablePair2.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0627");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
        java.lang.String str7 = strImmutablePair2.right;
        java.lang.String str8 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str6.equals("(((hi!,),),(,((hi!,),)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,),)" + "'", str8.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0628");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "((hi!,),)");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(((hi!,),),((hi!,),))" + "'", str5.equals("(((hi!,),),((hi!,),))"));
    }

    @Test
    public void ImmutablePair0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0629");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> strPair2 = org.apache.commons.lang3.tuple.Pair.of("hi!", "hi!");
        java.lang.String str3 = strPair2.getValue();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Comparable<java.lang.String>) "(hi!,)", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strPair2.equals((java.lang.Object) "(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ImmutablePair0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0630");
        java.lang.reflect.AnnotatedElement annotatedElement0 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.toString();
        java.lang.String str7 = strImmutablePair3.getLeft();
        java.lang.Class<?> wildcardClass8 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementPair9 = org.apache.commons.lang3.tuple.Pair.of(annotatedElement0, (java.lang.reflect.GenericDeclaration) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementPair9);
    }

    @Test
    public void ImmutablePair0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0631");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0632");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str5 = strImmutablePair4.getRight();
        java.lang.String str6 = strImmutablePair4.toString();
        java.lang.Class<?> wildcardClass7 = strImmutablePair4.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceImmutablePair8 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass7);
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.reflect.GenericDeclaration> strImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of("(((hi!,),),hi!)", (java.lang.reflect.GenericDeclaration) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((hi!,),)" + "'", str6.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair9);
    }

    @Test
    public void ImmutablePair0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0633");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),),(hi!,))", "((,((hi!,),)),(hi!,))");
    }

    @Test
    public void ImmutablePair0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0634");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0635");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.lang.Comparable<java.lang.String>> objImmutablePair8 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Object) strImmutablePair2, (java.lang.Comparable<java.lang.String>) "(,((hi!,),))");
        java.lang.String str9 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objImmutablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((hi!,),hi!)" + "'", str9.equals("((hi!,),hi!)"));
    }

    @Test
    public void ImmutablePair0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0636");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0637");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(,hi!)", "(,((hi!,),))");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,((hi!,),))" + "'", str3.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,((hi!,),))" + "'", str4.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(,hi!)" + "'", str5.equals("(,hi!)"));
    }

    @Test
    public void ImmutablePair0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0638");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str9.equals("(((hi!,),),(,((hi!,),)))"));
    }

    @Test
    public void ImmutablePair0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0639");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(((hi!,),),(,((hi!,),)))");
        java.lang.String str3 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str3.equals("(((hi!,),),(,((hi!,),)))"));
    }

    @Test
    public void ImmutablePair0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0640");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "hi!");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,hi!)" + "'", str3.equals("(,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,hi!)" + "'", str4.equals("(,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(,hi!)" + "'", str5.equals("(,hi!)"));
    }

    @Test
    public void ImmutablePair0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0641");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString("(,((hi!,),))");
        java.lang.String str8 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,((hi!,),))" + "'", str7.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0642");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.lang.CharSequence> charSequenceImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.lang.CharSequence>((java.lang.CharSequence) "(((hi!,),),(hi!,))", (java.lang.CharSequence) "((,hi!),hi!)");
    }

    @Test
    public void ImmutablePair0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0643");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0644");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,((hi!,),))" + "'", str4.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(,((hi!,),))" + "'", str6.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,),)" + "'", str7.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0645");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair2.setValue("(((hi!,),),(,((hi!,),)))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0646");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0647");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0648");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(((hi!,),),(,((hi!,),)))");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str5.equals("(((hi!,),),(,((hi!,),)))"));
    }

    @Test
    public void ImmutablePair0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0649");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str9 = strImmutablePair2.toString("((hi!,),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((hi!,),hi!)" + "'", str9.equals("((hi!,),hi!)"));
    }

    @Test
    public void ImmutablePair0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0650");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str7 = strImmutablePair3.toString("");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> strPair8 = org.apache.commons.lang3.tuple.Pair.of("((,hi!),hi!)", strImmutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair8);
    }

    @Test
    public void ImmutablePair0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0651");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.Class<?> wildcardClass4 = strImmutablePair2.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.Type, java.lang.CharSequence> typeImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.reflect.Type) wildcardClass4, (java.lang.CharSequence) "(((hi!,),),((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeImmutablePair6);
    }

    @Test
    public void ImmutablePair0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0652");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0653");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0654");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getRight();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("(((hi!,),),((hi!,),))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0655");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),hi!),(,hi!))", "(((hi!,),hi!),(,hi!))");
        java.lang.String str3 = strImmutablePair2.getLeft();
        java.lang.String str4 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((hi!,),hi!),(,hi!))" + "'", str3.equals("(((hi!,),hi!),(,hi!))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(((hi!,),hi!),(,hi!))" + "'", str4.equals("(((hi!,),hi!),(,hi!))"));
    }

    @Test
    public void ImmutablePair0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0656");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0657");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),hi!)", "(,((hi!,),))");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,((hi!,),))" + "'", str3.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),hi!)" + "'", str4.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),hi!)" + "'", str5.equals("((hi!,),hi!)"));
    }

    @Test
    public void ImmutablePair0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0658");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.getValue();
        java.lang.String str6 = strImmutablePair3.getRight();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPair7 = org.apache.commons.lang3.tuple.Pair.of("(,((hi!,),))", (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str8 = strImmutablePair3.toString();
        java.lang.String str9 = strImmutablePair3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0659");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        org.apache.commons.lang3.tuple.Pair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> strEntryPair6 = org.apache.commons.lang3.tuple.Pair.of((java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair2, "(hi!,)");
        java.lang.String str7 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair2.setValue("(hi!,)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strEntryPair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0660");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0661");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0662");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.String str9 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0663");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("(((hi!,),hi!),(,hi!))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0664");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0665");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str6 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ImmutablePair0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0666");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.right;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("((hi!,),hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void ImmutablePair0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0667");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.toString("(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0668");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0669");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.toString("");
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0670");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Comparable<java.lang.String>) "((,hi!),hi!)", (java.lang.CharSequence) "(((hi!,),),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair2);
    }

    @Test
    public void ImmutablePair0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0671");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str9 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str9.equals("(((hi!,),),(,((hi!,),)))"));
    }

    @Test
    public void ImmutablePair0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0672");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0673");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0674");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,),)" + "'", str7.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0675");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.CharSequence> strImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of("((hi!,),)", (java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableImmutablePair5 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "(hi!,)", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass6 = strComparableImmutablePair5.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.lang.reflect.AnnotatedElement> objImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Object) "hi!", (java.lang.reflect.AnnotatedElement) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objImmutablePair7);
    }

    @Test
    public void ImmutablePair0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0676");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0677");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str7 = strImmutablePair2.toString("(,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,hi!)" + "'", str7.equals("(,hi!)"));
    }

    @Test
    public void ImmutablePair0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0678");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0679");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),),((hi!,),))", "((,hi!),hi!)");
    }

    @Test
    public void ImmutablePair0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0680");
        java.lang.reflect.AnnotatedElement annotatedElement1 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.reflect.AnnotatedElement> strPair2 = org.apache.commons.lang3.tuple.Pair.of("hi!", annotatedElement1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void ImmutablePair0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0681");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0682");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((,((hi!,),)),(hi!,))", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void ImmutablePair0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0683");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),hi!)" + "'", str3.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0684");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),hi!)", "(((hi!,),),(,((hi!,),)))");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0685");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0686");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(,hi!)");
        java.lang.String str3 = strImmutablePair2.getLeft();
        java.lang.Class<?> wildcardClass4 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ImmutablePair0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0687");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        org.apache.commons.lang3.tuple.Pair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> strEntryPair6 = org.apache.commons.lang3.tuple.Pair.of((java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair2, "(hi!,)");
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strEntryPair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0688");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),hi!),(,hi!))", "(((hi!,),hi!),(,hi!))");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Object> strImmutablePair4 = org.apache.commons.lang3.tuple.ImmutablePair.of("((,hi!),hi!)", (java.lang.Object) "(((hi!,),hi!),(,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair4);
    }

    @Test
    public void ImmutablePair0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0689");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str4 = strImmutablePair3.left;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> strImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of("(hi!,)", strImmutablePair3);
        java.lang.String str6 = strImmutablePair3.getLeft();
        java.lang.String str7 = strImmutablePair3.toString();
        java.lang.String str8 = strImmutablePair3.getValue();
        java.lang.String str9 = strImmutablePair3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,),)" + "'", str7.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0690");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.toString("");
        java.lang.String str8 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0691");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.toString("((hi!,),)");
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,),)" + "'", str8.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0692");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),hi!),(,hi!))", "(,((hi!,),))");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("((,((hi!,),)),(hi!,))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0693");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0694");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.io.Serializable> objImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Object) 1L, (java.io.Serializable) strImmutablePair3);
        java.lang.String str8 = strImmutablePair3.left;
        java.lang.String str9 = strImmutablePair3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objImmutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0695");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0696");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ImmutablePair0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0697");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0698");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = strImmutablePair2.equals(obj5);
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0699");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0700");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0701");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0702");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> strComparableImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Comparable<java.lang.String>) "(((hi!,),hi!),(,hi!))", strImmutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((hi!,),)" + "'", str6.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair7);
    }

    @Test
    public void ImmutablePair0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0703");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> objImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>((java.lang.Object) 'a', (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.getKey();
        java.lang.String str8 = strImmutablePair3.toString();
        java.lang.String str9 = strImmutablePair3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0704");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0705");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0706");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "hi!");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.Class<?> wildcardClass4 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ImmutablePair0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0707");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0708");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "((,((hi!,),)),(hi!,))");
    }

    @Test
    public void ImmutablePair0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0709");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        java.lang.String str4 = strImmutablePair3.getValue();
        java.lang.String str5 = strImmutablePair3.toString();
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> charSequencePair6 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "((,hi!),hi!)", strImmutablePair3);
        java.lang.Class<?> wildcardClass7 = charSequencePair6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),hi!)" + "'", str5.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ImmutablePair0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0710");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.String str9 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0711");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.CharSequence> strImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of("", (java.lang.CharSequence) "(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair2);
    }

    @Test
    public void ImmutablePair0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0712");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        java.lang.String str4 = strImmutablePair3.toString();
        java.lang.Class<?> wildcardClass5 = strImmutablePair3.getClass();
        java.lang.Class<?> wildcardClass6 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.AnnotatedElement, java.lang.Class<?>> annotatedElementPair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.AnnotatedElement) wildcardClass5, wildcardClass6);
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.reflect.GenericDeclaration> strImmutablePair8 = org.apache.commons.lang3.tuple.ImmutablePair.of("", (java.lang.reflect.GenericDeclaration) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(((hi!,),),hi!)" + "'", str4.equals("(((hi!,),),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementPair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair8);
    }

    @Test
    public void ImmutablePair0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0713");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.Class<?> wildcardClass6 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ImmutablePair0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0714");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(((hi!,),),(,((hi!,),)))");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0715");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.right;
        java.lang.String str8 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0716");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.toString("((hi!,),hi!)");
        java.lang.String str8 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,),hi!)" + "'", str7.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0717");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.getRight();
        java.lang.String str8 = strImmutablePair3.toString("((hi!,),hi!)");
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.util.Map.Entry<java.lang.String, java.lang.String>> charSequencePair9 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(((hi!,),),((hi!,),))", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,),hi!)" + "'", str8.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair9);
    }

    @Test
    public void ImmutablePair0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0718");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(,((hi!,),))");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,((hi!,),))" + "'", str3.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ImmutablePair0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0719");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.String str9 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0720");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),hi!)" + "'", str5.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0721");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str4 = strImmutablePair2.toString("(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0722");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0723");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,),hi!)" + "'", str7.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0724");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0725");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(((hi!,),),hi!)");
    }

    @Test
    public void ImmutablePair0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0726");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(((hi!,),),hi!)");
    }

    @Test
    public void ImmutablePair0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0727");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(,hi!)");
        java.lang.String str3 = strImmutablePair2.getLeft();
        java.lang.String str4 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,hi!)" + "'", str4.equals("(,hi!)"));
    }

    @Test
    public void ImmutablePair0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0728");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0729");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.getKey();
        java.lang.String str8 = strImmutablePair3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0730");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0731");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0732");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.right;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("(((hi!,),),((hi!,),))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ImmutablePair0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0733");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3, (java.lang.CharSequence) "");
        java.lang.String str8 = strImmutablePair3.toString();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strImmutablePair9 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>("(((hi!,),),(hi!,))", (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0734");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("(,hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0735");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),),(hi!,))", "hi!");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(((hi!,),),(hi!,))" + "'", str4.equals("(((hi!,),),(hi!,))"));
    }

    @Test
    public void ImmutablePair0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0736");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ImmutablePair0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0737");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(,hi!)");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("((hi!,),)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0738");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((,((hi!,),)),(hi!,))", "(,((hi!,),))");
    }

    @Test
    public void ImmutablePair0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0739");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0740");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),hi!)");
        java.lang.String str4 = strImmutablePair2.toString("");
        java.lang.String str6 = strImmutablePair2.toString("(((hi!,),hi!),(,hi!))");
        java.lang.String str7 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(((hi!,),hi!),(,hi!))" + "'", str6.equals("(((hi!,),hi!),(,hi!))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0741");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.getValue();
        java.lang.String str6 = strImmutablePair3.getRight();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPair7 = org.apache.commons.lang3.tuple.Pair.of("(,((hi!,),))", (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str8 = strImmutablePair3.getLeft();
        java.lang.String str9 = strImmutablePair3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0742");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0743");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(,hi!)", "(,((hi!,),))");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,((hi!,),))" + "'", str3.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,hi!)" + "'", str4.equals("(,hi!)"));
    }

    @Test
    public void ImmutablePair0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0744");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) '#');
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),hi!)" + "'", str5.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,),hi!)" + "'", str8.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0745");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.getValue();
        java.lang.String str7 = strImmutablePair3.toString();
        java.lang.String str8 = strImmutablePair3.getRight();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> strPair9 = org.apache.commons.lang3.tuple.Pair.of("(((hi!,),),(hi!,))", strImmutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair9);
    }

    @Test
    public void ImmutablePair0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0746");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getKey();
        java.lang.String str9 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0747");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),hi!)" + "'", str4.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ImmutablePair0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0748");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString("(,((hi!,),))");
        java.lang.String str8 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,((hi!,),))" + "'", str7.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0749");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str9 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((hi!,),)" + "'", str6.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str9.equals("(((hi!,),),(,((hi!,),)))"));
    }

    @Test
    public void ImmutablePair0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0750");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        boolean boolean8 = strImmutablePair2.equals((java.lang.Object) (short) 10);
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0751");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),hi!)", "(,((hi!,),))");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,((hi!,),))" + "'", str3.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),hi!)" + "'", str4.equals("((hi!,),hi!)"));
    }

    @Test
    public void ImmutablePair0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0752");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> strPair0 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.String> strPairImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of(strPair0, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair2);
    }

    @Test
    public void ImmutablePair0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0753");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0754");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(,((hi!,),))");
        java.lang.String str4 = strImmutablePair3.right;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.util.Map.Entry<java.lang.String, java.lang.String>> charSequenceImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "((hi!,),)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str7 = strImmutablePair3.toString("(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,((hi!,),))" + "'", str4.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0755");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.toString("((hi!,),hi!)");
        java.lang.String str8 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,),hi!)" + "'", str7.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0756");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(,((hi!,),))");
        java.lang.String str3 = strImmutablePair2.getRight();
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>, java.lang.CharSequence> strImmutablePairPair5 = org.apache.commons.lang3.tuple.Pair.of(strImmutablePair2, (java.lang.CharSequence) "((,hi!),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,((hi!,),))" + "'", str3.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePairPair5);
    }

    @Test
    public void ImmutablePair0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0757");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getKey();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> strComparableImmutablePair6 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,),hi!)", strImmutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ImmutablePair0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0758");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.left;
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> strPair8 = null;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            int int9 = strImmutablePair2.compareTo(strPair8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0759");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.io.Serializable> objImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Object) 1L, (java.io.Serializable) strImmutablePair3);
        java.lang.String str8 = strImmutablePair3.getKey();
        java.lang.String str9 = strImmutablePair3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objImmutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0760");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.toString("(,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(,hi!)" + "'", str8.equals("(,hi!)"));
    }

    @Test
    public void ImmutablePair0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0761");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0762");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.toString("");
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0763");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.left;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair8 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(,hi!)");
        int int9 = strImmutablePair2.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
    }

    @Test
    public void ImmutablePair0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0764");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Comparable<java.lang.String>> strImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of("(((hi!,),),hi!)", (java.lang.Comparable<java.lang.String>) "((hi!,),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair2);
    }

    @Test
    public void ImmutablePair0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0765");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0766");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.right;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("(((hi!,),),((hi!,),))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,((hi!,),))" + "'", str4.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0767");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "((hi!,),hi!)");
    }

    @Test
    public void ImmutablePair0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0768");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.toString();
        boolean boolean6 = strImmutablePair2.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0769");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((hi!,),),hi!)" + "'", str3.equals("(((hi!,),),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(((hi!,),),hi!)" + "'", str4.equals("(((hi!,),),hi!)"));
    }

    @Test
    public void ImmutablePair0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0770");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(,hi!)", "(hi!,)");
        java.lang.String str4 = strImmutablePair2.toString("((hi!,),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),hi!)" + "'", str4.equals("((hi!,),hi!)"));
    }

    @Test
    public void ImmutablePair0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0771");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getRight();
        java.lang.String str5 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ImmutablePair0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0772");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString("hi!");
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0773");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.toString("((hi!,),)");
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.util.Map.Entry<java.lang.String, java.lang.String>> strComparablePair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "hi!", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((hi!,),)" + "'", str6.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair7);
    }

    @Test
    public void ImmutablePair0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0774");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),hi!)" + "'", str3.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0775");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0776");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "((hi!,),)");
    }

    @Test
    public void ImmutablePair0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0777");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str8.equals("(((hi!,),),(,((hi!,),)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0778");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0779");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getValue();
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairPair8 = org.apache.commons.lang3.tuple.Pair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "((hi!,),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairPair8);
    }

    @Test
    public void ImmutablePair0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0780");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),hi!)", "hi!");
        java.lang.String str3 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),hi!)" + "'", str3.equals("((hi!,),hi!)"));
    }

    @Test
    public void ImmutablePair0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0781");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.toString();
        boolean boolean6 = strImmutablePair2.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0782");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0783");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0784");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.toString("((hi!,),hi!)");
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>, java.lang.CharSequence> strImmutablePairPair9 = org.apache.commons.lang3.tuple.Pair.of(strImmutablePair2, (java.lang.CharSequence) "(((hi!,),),(hi!,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,),hi!)" + "'", str7.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePairPair9);
    }

    @Test
    public void ImmutablePair0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0785");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.toString();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("(,hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),hi!)" + "'", str4.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),hi!)" + "'", str5.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((hi!,),hi!)" + "'", str6.equals("((hi!,),hi!)"));
    }

    @Test
    public void ImmutablePair0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0786");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair1 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "", strImmutablePair1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void ImmutablePair0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0787");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(hi!,)");
        java.lang.Class<?> wildcardClass3 = strImmutablePair2.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.Type, java.lang.CharSequence> typeImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.reflect.Type) wildcardClass3, (java.lang.CharSequence) "(((hi!,),),((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeImmutablePair5);
    }

    @Test
    public void ImmutablePair0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0788");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0789");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>((java.lang.Comparable<java.lang.String>) "(hi!,)", (java.lang.CharSequence) "(((hi!,),),(hi!,))");
    }

    @Test
    public void ImmutablePair0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0790");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0791");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0792");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.Class<?> wildcardClass4 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.Type) wildcardClass4);
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.Type, java.lang.String> typeImmutablePair7 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.Type, java.lang.String>((java.lang.reflect.Type) wildcardClass4, "");
        java.lang.Class<?> wildcardClass8 = typeImmutablePair7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0793");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str5 = strImmutablePair2.toString("(,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(,hi!)" + "'", str5.equals("(,hi!)"));
    }

    @Test
    public void ImmutablePair0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0794");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "hi!");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.toString("(,((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,hi!)" + "'", str3.equals("(,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(,((hi!,),))" + "'", str5.equals("(,((hi!,),))"));
    }

    @Test
    public void ImmutablePair0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0795");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0796");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.toString("(hi!,)");
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0797");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0798");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.Class<?> wildcardClass8 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0799");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.String str9 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0800");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.right;
        java.lang.String str8 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0801");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0802");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((,((hi!,),)),(hi!,))", "(((hi!,),),(hi!,))");
    }

    @Test
    public void ImmutablePair0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0803");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),hi!),(,hi!))", "");
    }

    @Test
    public void ImmutablePair0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0804");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.getKey();
        java.lang.String str9 = strImmutablePair3.toString("(,((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(,((hi!,),))" + "'", str9.equals("(,((hi!,),))"));
    }

    @Test
    public void ImmutablePair0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0805");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.toString("(hi!,)");
        java.lang.String str6 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0806");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0807");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),),(,((hi!,),)))", "(,((hi!,),))");
        java.lang.String str3 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str3.equals("(((hi!,),),(,((hi!,),)))"));
    }

    @Test
    public void ImmutablePair0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0808");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0809");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0810");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0811");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.Class<?> wildcardClass8 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0812");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0813");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.toString();
        boolean boolean8 = strImmutablePair2.equals((java.lang.Object) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ImmutablePair0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0814");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.right;
        java.lang.Class<?> wildcardClass6 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.io.Serializable> charSequencePair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "hi!", (java.io.Serializable) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair7);
    }

    @Test
    public void ImmutablePair0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0815");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0816");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("((,hi!),hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ImmutablePair0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0817");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ImmutablePair0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0818");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),),hi!)", "");
        java.lang.String str3 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((hi!,),),hi!)" + "'", str3.equals("(((hi!,),),hi!)"));
    }

    @Test
    public void ImmutablePair0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0819");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.String str7 = strImmutablePair3.left;
        java.lang.String str8 = strImmutablePair3.right;
        java.lang.String str9 = strImmutablePair3.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0820");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.String str7 = strImmutablePair3.getValue();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> strComparableImmutablePair8 = org.apache.commons.lang3.tuple.ImmutablePair.of(strComparable0, strImmutablePair3);
        java.lang.String str9 = strImmutablePair3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0821");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.right;
        java.lang.Class<?> wildcardClass7 = strImmutablePair3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ImmutablePair0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0822");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>> strPairImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>>((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass5 = strPairImmutablePair4.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.reflect.GenericDeclaration) wildcardClass5, "((,((hi!,),)),(hi!,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationImmutablePair7);
    }

    @Test
    public void ImmutablePair0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0823");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.String str7 = strImmutablePair3.left;
        java.lang.String str8 = strImmutablePair3.getLeft();
        java.lang.String str9 = strImmutablePair3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0824");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.toString("hi!");
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0825");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0826");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0827");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(,hi!)", "(hi!,)");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair5 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(((hi!,),hi!),(,hi!))");
        java.lang.String str6 = strImmutablePair5.left;
        int int7 = strImmutablePair2.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair5);
        java.lang.Class<?> wildcardClass8 = strImmutablePair5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0828");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0829");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),hi!)", "(,hi!)");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((hi!,),hi!),(,hi!))" + "'", str3.equals("(((hi!,),hi!),(,hi!))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),hi!)" + "'", str4.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(,hi!)" + "'", str5.equals("(,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(,hi!)" + "'", str6.equals("(,hi!)"));
    }

    @Test
    public void ImmutablePair0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0830");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0831");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.lang.String> charSequenceImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "((,((hi!,),)),(hi!,))", "(((hi!,),),(hi!,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair2);
    }

    @Test
    public void ImmutablePair0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0832");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getKey();
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.Class<?> wildcardClass7 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ImmutablePair0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0833");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("(((hi!,),),((hi!,),))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ImmutablePair0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0834");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> objImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>((java.lang.Object) 'a', (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str7 = strImmutablePair3.toString("(((hi!,),),((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(((hi!,),),((hi!,),))" + "'", str7.equals("(((hi!,),),((hi!,),))"));
    }

    @Test
    public void ImmutablePair0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0835");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0836");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(((hi!,),),(,((hi!,),)))");
    }

    @Test
    public void ImmutablePair0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0837");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean5 = strImmutablePair3.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair3.right;
        java.lang.String str7 = strImmutablePair3.right;
        java.lang.Class<?> wildcardClass8 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.reflect.AnnotatedElement> strPair9 = org.apache.commons.lang3.tuple.Pair.of("(((hi!,),),(,((hi!,),)))", (java.lang.reflect.AnnotatedElement) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair9);
    }

    @Test
    public void ImmutablePair0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0838");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair6 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        int int7 = strImmutablePair2.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair6);
        java.lang.String str8 = strImmutablePair6.left;
        java.lang.String str9 = strImmutablePair6.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((hi!,),)" + "'", str9.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0839");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.getValue();
        java.lang.String str6 = strImmutablePair3.getRight();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPair7 = org.apache.commons.lang3.tuple.Pair.of("(,((hi!,),))", (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str8 = strImmutablePair3.getLeft();
        java.lang.String str9 = strImmutablePair3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0840");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) '#');
        java.lang.String str5 = strImmutablePair2.toString();
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.Comparable<java.lang.String>> objPair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Object) strImmutablePair2, (java.lang.Comparable<java.lang.String>) "((hi!,),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),hi!)" + "'", str5.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPair7);
    }

    @Test
    public void ImmutablePair0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0841");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),),(hi!,))", "");
    }

    @Test
    public void ImmutablePair0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0842");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.toString("((,hi!),hi!)");
        java.lang.String str8 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((,hi!),hi!)" + "'", str7.equals("((,hi!),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0843");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0844");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.toString("(((hi!,),),((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(((hi!,),),((hi!,),))" + "'", str8.equals("(((hi!,),),((hi!,),))"));
    }

    @Test
    public void ImmutablePair0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0845");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair2.setValue("(((hi!,),),hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0846");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.Class<?> wildcardClass7 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ImmutablePair0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0847");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> objImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>((java.lang.Object) 'a', (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.toString();
        java.lang.String str7 = strImmutablePair3.right;
        java.lang.String str8 = strImmutablePair3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0848");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0849");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getKey();
        java.lang.String str9 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0850");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Comparable<java.lang.String>) "(,hi!)", "hi!");
    }

    @Test
    public void ImmutablePair0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0851");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0852");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,((hi!,),))" + "'", str4.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(,((hi!,),))" + "'", str6.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,),)" + "'", str8.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((hi!,),)" + "'", str9.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0853");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0854");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.toString();
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.String str7 = strImmutablePair3.right;
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> charSequencePair8 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(,((hi!,),))", (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str9 = strImmutablePair3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0855");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(,((hi!,),))");
        java.lang.Class<?> wildcardClass3 = strImmutablePair2.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair6 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(hi!,)");
        java.lang.Class<?> wildcardClass7 = strImmutablePair6.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassImmutablePair8 = org.apache.commons.lang3.tuple.ImmutablePair.of(wildcardClass3, (java.lang.reflect.AnnotatedElement) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = wildcardClassImmutablePair8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassImmutablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0856");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getRight();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0857");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((hi!,),)" + "'", str6.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0858");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.right;
        java.lang.String str8 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0859");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),hi!)", "(,hi!)");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((hi!,),hi!),(,hi!))" + "'", str3.equals("(((hi!,),hi!),(,hi!))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),hi!)" + "'", str4.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(,hi!)" + "'", str5.equals("(,hi!)"));
    }

    @Test
    public void ImmutablePair0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0860");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0861");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(((hi!,),hi!),(,hi!))");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void ImmutablePair0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0862");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> objImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>((java.lang.Object) 'a', (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>, java.lang.String> strImmutablePairPair8 = org.apache.commons.lang3.tuple.Pair.of(strImmutablePair3, "(,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePairPair8);
    }

    @Test
    public void ImmutablePair0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0863");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getKey();
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairPair5 = org.apache.commons.lang3.tuple.Pair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str6 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairPair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0864");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((hi!,),)" + "'", str6.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,),)" + "'", str7.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0865");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0866");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString("(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0867");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0868");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0869");
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.String> charSequencePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "((hi!,),hi!)", "((,hi!),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair2);
    }

    @Test
    public void ImmutablePair0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0870");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair6 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str7 = strImmutablePair6.getValue();
        int int8 = strImmutablePair2.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair6);
        java.lang.String str9 = strImmutablePair6.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0871");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> strPair2 = org.apache.commons.lang3.tuple.Pair.of("hi!", "hi!");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair5 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(,((hi!,),))");
        java.lang.String str6 = strImmutablePair5.toString();
        java.lang.String str7 = strImmutablePair5.getValue();
        boolean boolean8 = strPair2.equals((java.lang.Object) strImmutablePair5);
        java.lang.String str9 = strImmutablePair5.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str6.equals("(((hi!,),),(,((hi!,),)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,((hi!,),))" + "'", str7.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(,((hi!,),))" + "'", str9.equals("(,((hi!,),))"));
    }

    @Test
    public void ImmutablePair0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0872");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ImmutablePair0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0873");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.String str9 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((hi!,),hi!)" + "'", str9.equals("((hi!,),hi!)"));
    }

    @Test
    public void ImmutablePair0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0874");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getRight();
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.String str7 = strImmutablePair3.getValue();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair3.setValue("(((hi!,),),((hi!,),))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0875");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.right;
        java.lang.String str8 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0876");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry0 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.getLeft();
        java.lang.String str7 = strImmutablePair3.left;
        java.lang.String str8 = strImmutablePair3.getRight();
        org.apache.commons.lang3.tuple.ImmutablePair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.Object> strEntryImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of(strEntry0, (java.lang.Object) strImmutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strEntryImmutablePair9);
    }

    @Test
    public void ImmutablePair0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0877");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0878");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0879");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0880");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString("(,((hi!,),))");
        java.lang.String str8 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,((hi!,),))" + "'", str7.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0881");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.CharSequence> strImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of("(((hi!,),hi!),(,hi!))", (java.lang.CharSequence) "(((hi!,),hi!),(,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair2);
    }

    @Test
    public void ImmutablePair0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0882");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair6 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        int int7 = strImmutablePair2.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair6);
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((hi!,),)" + "'", str9.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0883");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.toString("(hi!,)");
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0884");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> objImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>((java.lang.Object) 'a', (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.toString();
        java.lang.String str7 = strImmutablePair3.right;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair3.setValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0885");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        org.apache.commons.lang3.tuple.Pair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> strEntryPair6 = org.apache.commons.lang3.tuple.Pair.of((java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair2, "(hi!,)");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strEntryPair6);
    }

    @Test
    public void ImmutablePair0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0886");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.toString();
        boolean boolean6 = strImmutablePair2.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0887");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getKey();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.Class<?> wildcardClass7 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ImmutablePair0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0888");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.right;
        java.lang.String str6 = strImmutablePair3.right;
        java.lang.Class<?> wildcardClass7 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Class<?>> strPair8 = org.apache.commons.lang3.tuple.Pair.of("hi!", wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair8);
    }

    @Test
    public void ImmutablePair0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0889");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "hi!");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,hi!)" + "'", str3.equals("(,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ImmutablePair0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0890");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0891");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(,hi!)", "(hi!,)");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair5 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(((hi!,),hi!),(,hi!))");
        java.lang.String str6 = strImmutablePair5.left;
        int int7 = strImmutablePair2.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair5);
        java.lang.String str8 = strImmutablePair5.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(((hi!,),hi!),(,hi!))" + "'", str8.equals("(((hi!,),hi!),(,hi!))"));
    }

    @Test
    public void ImmutablePair0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0892");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.toString("(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0893");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.String> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, "(((hi!,),),(hi!,))");
        java.lang.String str7 = strImmutablePair2.right;
        java.lang.String str8 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(((hi!,),),(hi!,))" + "'", str8.equals("(((hi!,),),(hi!,))"));
    }

    @Test
    public void ImmutablePair0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0894");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0895");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair2.setValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0896");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        java.lang.String str3 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str5 = strImmutablePair2.setValue("(((hi!,),),((hi!,),))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0897");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.Class<?> wildcardClass5 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ImmutablePair0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0898");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0899");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0900");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        java.lang.String str4 = strImmutablePair3.toString();
        java.lang.Class<?> wildcardClass5 = strImmutablePair3.getClass();
        java.lang.Class<?> wildcardClass6 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.AnnotatedElement, java.lang.Class<?>> annotatedElementPair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.AnnotatedElement) wildcardClass5, wildcardClass6);
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.reflect.AnnotatedElement> strPair8 = org.apache.commons.lang3.tuple.Pair.of("((,hi!),hi!)", (java.lang.reflect.AnnotatedElement) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(((hi!,),),hi!)" + "'", str4.equals("(((hi!,),),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementPair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair8);
    }

    @Test
    public void ImmutablePair0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0901");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> strPair2 = org.apache.commons.lang3.tuple.Pair.of("hi!", "hi!");
        java.lang.String str4 = strPair2.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void ImmutablePair0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0902");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>> strPairImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>>((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.right;
        java.lang.String str8 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0903");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),hi!),(,hi!))", "((,((hi!,),)),(hi!,))");
    }

    @Test
    public void ImmutablePair0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0904");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.lang.String> charSequenceImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair2);
    }

    @Test
    public void ImmutablePair0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0905");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(,((hi!,),))");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.Class<?> wildcardClass5 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str3.equals("(((hi!,),),(,((hi!,),)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,((hi!,),))" + "'", str4.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ImmutablePair0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0906");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void ImmutablePair0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0907");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),),(,((hi!,),)))", "");
    }

    @Test
    public void ImmutablePair0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0908");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str4 = strImmutablePair3.left;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> strImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of("(hi!,)", strImmutablePair3);
        java.lang.String str6 = strImmutablePair3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ImmutablePair0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0909");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(((hi!,),),(hi!,))" + "'", str7.equals("(((hi!,),),(hi!,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,),)" + "'", str8.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0910");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0911");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "hi!");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str5.equals("(((hi!,),),(,((hi!,),)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str8.equals("(((hi!,),),(,((hi!,),)))"));
    }

    @Test
    public void ImmutablePair0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0912");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0913");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.Class<?> wildcardClass8 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0914");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0915");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),),hi!)", "(hi!,)");
        java.lang.Class<?> wildcardClass4 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.lang.Class<?>> charSequenceImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "((,hi!),hi!)", wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair5);
    }

    @Test
    public void ImmutablePair0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0916");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ImmutablePair0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0917");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "((hi!,),)");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0918");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0919");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0920");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0921");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> objImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>((java.lang.Object) 'a', (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.right;
        java.lang.String str6 = strImmutablePair3.getValue();
        java.lang.String str8 = strImmutablePair3.toString("(,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(,hi!)" + "'", str8.equals("(,hi!)"));
    }

    @Test
    public void ImmutablePair0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0922");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getRight();
        java.lang.String str6 = strImmutablePair3.right;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair3.setValue("(((hi!,),hi!),(,hi!))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ImmutablePair0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0923");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ImmutablePair0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0924");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.left;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair8 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),),hi!)", "(,((hi!,),))");
        org.apache.commons.lang3.tuple.ImmutablePair<java.io.Serializable, java.lang.Object> serializableImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.io.Serializable) strImmutablePair2, (java.lang.Object) "(((hi!,),),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableImmutablePair9);
    }

    @Test
    public void ImmutablePair0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0925");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0926");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str8 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str9 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,),)" + "'", str8.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0927");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getKey();
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairPair5 = org.apache.commons.lang3.tuple.Pair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.toString("(((hi!,),hi!),hi!)");
        java.lang.String str9 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairPair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(((hi!,),),(hi!,))" + "'", str6.equals("(((hi!,),),(hi!,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(((hi!,),hi!),hi!)" + "'", str8.equals("(((hi!,),hi!),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((hi!,),)" + "'", str9.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0928");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>> strPairImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>>((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString("(,((hi!,),))");
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,((hi!,),))" + "'", str7.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,),)" + "'", str8.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((hi!,),)" + "'", str9.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0929");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((hi!,),)" + "'", str6.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0930");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),hi!),hi!)", "((,hi!),hi!)");
    }

    @Test
    public void ImmutablePair0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0931");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair5 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.Class<?> wildcardClass6 = strImmutablePair5.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.Type) wildcardClass6);
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.reflect.Type> charSequencePair8 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(((hi!,),),(,((hi!,),)))", (java.lang.reflect.Type) wildcardClass6);
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparablePair9 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(((hi!,),),(hi!,))", (java.lang.reflect.AnnotatedElement) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair9);
    }

    @Test
    public void ImmutablePair0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0932");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(((hi!,),),(hi!,))" + "'", str6.equals("(((hi!,),),(hi!,))"));
    }

    @Test
    public void ImmutablePair0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0933");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.left;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair2.setValue("((hi!,),hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0934");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),hi!)" + "'", str5.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0935");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0936");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "");
        java.lang.String str3 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void ImmutablePair0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0937");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0938");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getKey();
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0939");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("(((hi!,),),(,((hi!,),)))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void ImmutablePair0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0940");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0941");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.String str7 = strImmutablePair3.getRight();
        java.lang.String str8 = strImmutablePair3.getLeft();
        java.lang.String str9 = strImmutablePair3.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0942");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getKey();
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>, java.lang.Object> strImmutablePairImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of(strImmutablePair2, obj6);
        java.lang.String str8 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePairImmutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0943");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Comparable<java.lang.String>> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Comparable<java.lang.String>>("((,hi!),hi!)", (java.lang.Comparable<java.lang.String>) "(hi!,)");
    }

    @Test
    public void ImmutablePair0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0944");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((,((hi!,),)),(hi!,))");
        java.lang.String str3 = strImmutablePair2.getLeft();
        java.lang.String str4 = strImmutablePair2.right;
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.String> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, "((,((hi!,),)),(hi!,))");
        java.lang.String str7 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((,((hi!,),)),(hi!,))" + "'", str4.equals("((,((hi!,),)),(hi!,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0945");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair6 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        int int7 = strImmutablePair2.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair6);
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0946");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ImmutablePair0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0947");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0948");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.toString("((,hi!),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((,hi!),hi!)" + "'", str7.equals("((,hi!),hi!)"));
    }

    @Test
    public void ImmutablePair0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0949");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "hi!");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,hi!)" + "'", str3.equals("(,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,hi!)" + "'", str4.equals("(,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ImmutablePair0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0950");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0951");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.String str9 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0952");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.toString("(((hi!,),),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(((hi!,),),hi!)" + "'", str6.equals("(((hi!,),),hi!)"));
    }

    @Test
    public void ImmutablePair0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0953");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "hi!");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,hi!)" + "'", str3.equals("(,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ImmutablePair0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0954");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.String str9 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0955");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = strImmutablePair2.equals(obj5);
        java.lang.Class<?> wildcardClass7 = strImmutablePair2.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.reflect.GenericDeclaration) wildcardClass7, (java.lang.CharSequence) "(((hi!,),),(,((hi!,),)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationImmutablePair9);
    }

    @Test
    public void ImmutablePair0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0956");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.Object obj7 = null;
        boolean boolean8 = strImmutablePair2.equals(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ImmutablePair0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0957");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("(((hi!,),),(hi!,))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0958");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.Object obj6 = null;
        boolean boolean7 = strImmutablePair2.equals(obj6);
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair2.setValue("(((hi!,),hi!),(,hi!))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ImmutablePair0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0959");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,((hi!,),))" + "'", str4.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ImmutablePair0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0960");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0961");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.getValue();
        java.lang.String str6 = strImmutablePair3.getRight();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPair7 = org.apache.commons.lang3.tuple.Pair.of("(,((hi!,),))", (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair3.setValue("(((hi!,),),(hi!,))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair7);
    }

    @Test
    public void ImmutablePair0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0962");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.right;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryImmutablePair8 = new org.apache.commons.lang3.tuple.ImmutablePair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.util.Map.Entry<java.lang.String, java.lang.String>>((java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair2, strEntry7);
        java.lang.String str9 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0963");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("(((hi!,),hi!),(,hi!))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ImmutablePair0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0964");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(((hi!,),),(,((hi!,),)))");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.Class<?> wildcardClass4 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ImmutablePair0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0965");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),hi!)", "hi!");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.toString("(((hi!,),),hi!)");
        java.lang.String str6 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((hi!,),hi!),hi!)" + "'", str3.equals("(((hi!,),hi!),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(((hi!,),),hi!)" + "'", str5.equals("(((hi!,),),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0966");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(,hi!)", "((hi!,),)");
    }

    @Test
    public void ImmutablePair0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0967");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((,hi!),hi!)", "(((hi!,),),(hi!,))");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("(((hi!,),),((hi!,),))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0968");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0969");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),hi!)", "(,((hi!,),))");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("(((hi!,),hi!),hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,((hi!,),))" + "'", str3.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,((hi!,),))" + "'", str4.equals("(,((hi!,),))"));
    }

    @Test
    public void ImmutablePair0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0970");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> objImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>((java.lang.Object) 'a', (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.getRight();
        java.lang.String str8 = strImmutablePair3.getRight();
        java.lang.String str9 = strImmutablePair3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0971");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.Object obj4 = null;
        boolean boolean5 = strImmutablePair2.equals(obj4);
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0972");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0973");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(,((hi!,),))");
        java.lang.String str4 = strImmutablePair3.right;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.util.Map.Entry<java.lang.String, java.lang.String>> charSequenceImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "((hi!,),)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.CharSequence charSequence6 = null;
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairPair7 = org.apache.commons.lang3.tuple.Pair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3, charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,((hi!,),))" + "'", str4.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairPair7);
    }

    @Test
    public void ImmutablePair0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0974");
        java.lang.reflect.Type type0 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.Type, java.lang.CharSequence> typePair2 = org.apache.commons.lang3.tuple.Pair.of(type0, (java.lang.CharSequence) "(,((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typePair2);
    }

    @Test
    public void ImmutablePair0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0975");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(((hi!,),),(,((hi!,),)))");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str5 = strImmutablePair2.toString("(hi!,)");
        java.lang.String str6 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0976");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.getRight();
        java.lang.String str7 = strImmutablePair3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0977");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        org.apache.commons.lang3.tuple.Pair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> strEntryPair6 = org.apache.commons.lang3.tuple.Pair.of((java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair2, "(hi!,)");
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strEntryPair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0978");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("(((hi!,),),hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ImmutablePair0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0979");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),),(hi!,))", "(((hi!,),),hi!)");
        java.lang.String str3 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((hi!,),),(hi!,))" + "'", str3.equals("(((hi!,),),(hi!,))"));
    }

    @Test
    public void ImmutablePair0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0980");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> objImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>((java.lang.Object) 'a', (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.right;
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0981");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,),)" + "'", str7.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0982");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getRight();
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.Class<?> wildcardClass6 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ImmutablePair0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0983");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0984");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString("hi!");
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0985");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getKey();
        java.lang.String str5 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ImmutablePair0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0986");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.getKey();
        java.lang.Class<?> wildcardClass5 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ImmutablePair0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0987");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.right;
        java.lang.String str7 = strImmutablePair3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0988");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getKey();
        java.lang.String str9 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0989");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(hi!,)");
        java.lang.String str4 = strImmutablePair3.right;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.util.Map.Entry<java.lang.String, java.lang.String>> strComparableImmutablePair5 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.util.Map.Entry<java.lang.String, java.lang.String>>((java.lang.Comparable<java.lang.String>) "((hi!,),)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.lang.CharSequence> serializablePair7 = org.apache.commons.lang3.tuple.Pair.of((java.io.Serializable) strImmutablePair3, (java.lang.CharSequence) "((,((hi!,),)),(hi!,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializablePair7);
    }

    @Test
    public void ImmutablePair0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0990");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.io.Serializable> objImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Object) 1L, (java.io.Serializable) strImmutablePair3);
        java.lang.String str8 = strImmutablePair3.left;
        java.lang.String str9 = strImmutablePair3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objImmutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0991");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> strPair0 = null;
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.String> strPairPair2 = org.apache.commons.lang3.tuple.Pair.of(strPair0, "(,((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairPair2);
    }

    @Test
    public void ImmutablePair0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0992");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((,((hi!,),)),(hi!,))", "((,((hi!,),)),(hi!,))");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("((,((hi!,),)),(hi!,))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0993");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("(,((hi!,),))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0994");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getRight();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0995");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("((hi!,),)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0996");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ImmutablePair0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0997");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "hi!");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
        java.lang.String str7 = strImmutablePair2.toString("(,((hi!,),))");
        java.lang.String str8 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str5.equals("(((hi!,),),(,((hi!,),)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,((hi!,),))" + "'", str7.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0998");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str4 = strImmutablePair3.left;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> strImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of("(hi!,)", strImmutablePair3);
        java.lang.String str6 = strImmutablePair3.getLeft();
        java.lang.String str8 = strImmutablePair3.toString("((,((hi!,),)),(hi!,))");
        java.lang.String str9 = strImmutablePair3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((,((hi!,),)),(hi!,))" + "'", str8.equals("((,((hi!,),)),(hi!,))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair0999");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str5 = strImmutablePair2.setValue("(((hi!,),hi!),(,hi!))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair1.ImmutablePair1000");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }
}

