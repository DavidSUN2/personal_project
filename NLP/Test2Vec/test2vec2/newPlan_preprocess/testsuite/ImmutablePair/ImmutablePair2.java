package ImmutablePair;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ImmutablePair2 {

    public static boolean debug = false;

    @Test
    public void ImmutablePair1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1001");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString("hi!");
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.left;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair2.setValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1002");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        boolean boolean7 = strImmutablePair3.equals((java.lang.Object) (byte) 10);
        java.lang.String str8 = strImmutablePair3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1003");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        org.apache.commons.lang3.tuple.Pair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> strEntryPair6 = org.apache.commons.lang3.tuple.Pair.of((java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair2, "(hi!,)");
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strEntryPair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1004");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.Class<?> wildcardClass5 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ImmutablePair1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1005");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getKey();
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairPair5 = org.apache.commons.lang3.tuple.Pair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass6 = strPairPair5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairPair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ImmutablePair1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1006");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str4 = strImmutablePair3.left;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> strImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of("(hi!,)", strImmutablePair3);
        java.lang.String str6 = strImmutablePair3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1007");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getRight();
        java.lang.String str6 = strImmutablePair3.right;
        java.lang.String str7 = strImmutablePair3.getLeft();
        java.lang.String str8 = strImmutablePair3.getLeft();
        java.lang.String str9 = strImmutablePair3.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1008");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((,((hi!,),)),(hi!,))", "(((hi!,),),((hi!,),))");
        java.lang.String str3 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((,((hi!,),)),(hi!,)),(((hi!,),),((hi!,),)))" + "'", str3.equals("(((,((hi!,),)),(hi!,)),(((hi!,),),((hi!,),)))"));
    }

    @Test
    public void ImmutablePair1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1009");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.right;
        java.lang.String str6 = strImmutablePair3.right;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of("", (java.io.Serializable) strImmutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair7);
    }

    @Test
    public void ImmutablePair1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1010");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(,((hi!,),))");
        java.lang.String str4 = strImmutablePair3.right;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.util.Map.Entry<java.lang.String, java.lang.String>> charSequenceImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "((hi!,),)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str6 = strImmutablePair3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,((hi!,),))" + "'", str4.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((hi!,),)" + "'", str6.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1011");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.getValue();
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.Object> charSequencePair8 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(hi!,)", (java.lang.Object) strImmutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((hi!,),)" + "'", str6.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair8);
    }

    @Test
    public void ImmutablePair1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1012");
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(hi!,)", (java.lang.Comparable<java.lang.String>) "((hi!,),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void ImmutablePair1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1013");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(((hi!,),),((hi!,),))");
        java.lang.String str3 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,(((hi!,),),((hi!,),)))" + "'", str3.equals("(hi!,(((hi!,),),((hi!,),)))"));
    }

    @Test
    public void ImmutablePair1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1014");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.Class<?> wildcardClass8 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1015");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.getValue();
        java.lang.String str6 = strImmutablePair3.getKey();
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> charSequencePair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(hi!,)", strImmutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair7);
    }

    @Test
    public void ImmutablePair1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1016");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getValue();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1017");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.toString("(hi!,(((hi!,),),((hi!,),)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,(((hi!,),),((hi!,),)))" + "'", str8.equals("(hi!,(((hi!,),),((hi!,),)))"));
    }

    @Test
    public void ImmutablePair1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1018");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "hi!");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.Class<?> wildcardClass5 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ImmutablePair1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1019");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getRight();
        java.lang.String str5 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ImmutablePair1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1020");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("(hi!,(((hi!,),),((hi!,),)))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str6.equals("(((hi!,),),(,((hi!,),)))"));
    }

    @Test
    public void ImmutablePair1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1021");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.left;
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1022");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.getValue();
        java.lang.String str7 = strImmutablePair3.getValue();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> strPair8 = org.apache.commons.lang3.tuple.Pair.of("((hi!,),)", strImmutablePair3);
        java.lang.Class<?> wildcardClass9 = strImmutablePair3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1023");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str5 = strImmutablePair2.setValue("((hi!,),hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1024");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.left;
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>> strPairImmutablePair9 = new org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>>((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.Comparable<java.lang.String>) "((,hi!),hi!)");
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
    public void ImmutablePair1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1025");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> objImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>((java.lang.Object) 'a', (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.right;
        java.lang.String str6 = strImmutablePair3.getValue();
        java.lang.String str7 = strImmutablePair3.getKey();
        java.lang.String str8 = strImmutablePair3.getKey();
        java.lang.String str9 = strImmutablePair3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1026");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>> strPairImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>>((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1027");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,(((hi!,),),((hi!,),)))", "(hi!,)");
    }

    @Test
    public void ImmutablePair1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1028");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(((hi!,),hi!),(,hi!))");
        java.lang.String str3 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void ImmutablePair1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1029");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1030");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.Class<?> wildcardClass4 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.Type) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = strComparableImmutablePair5.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> strPair7 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.GenericDeclaration, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> genericDeclarationPair8 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.GenericDeclaration) wildcardClass6, strPair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationPair8);
    }

    @Test
    public void ImmutablePair1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1031");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.right;
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
    }

    @Test
    public void ImmutablePair1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1032");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.getLeft();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1033");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),),hi!)", "(((hi!,),hi!),hi!)");
    }

    @Test
    public void ImmutablePair1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1034");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.left;
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1035");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1036");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getRight();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.toString("(((,((hi!,),)),(hi!,)),(((hi!,),),((hi!,),)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(((,((hi!,),)),(hi!,)),(((hi!,),),((hi!,),)))" + "'", str8.equals("(((,((hi!,),)),(hi!,)),(((hi!,),),((hi!,),)))"));
    }

    @Test
    public void ImmutablePair1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1037");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((,((hi!,),)),(hi!,))", "((,((hi!,),)),(hi!,))");
        java.lang.String str3 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((,((hi!,),)),(hi!,))" + "'", str3.equals("((,((hi!,),)),(hi!,))"));
    }

    @Test
    public void ImmutablePair1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1038");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.Class<?> wildcardClass6 = strImmutablePair2.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationImmutablePair8 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.reflect.GenericDeclaration) wildcardClass6, "(((hi!,),),((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationImmutablePair8);
    }

    @Test
    public void ImmutablePair1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1039");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.toString("(((hi!,),),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(((hi!,),),hi!)" + "'", str5.equals("(((hi!,),),hi!)"));
    }

    @Test
    public void ImmutablePair1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1040");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,)" + "'", str7.equals("(,)"));
    }

    @Test
    public void ImmutablePair1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1041");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str8.equals("(((hi!,),),(,((hi!,),)))"));
    }

    @Test
    public void ImmutablePair1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1042");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,),)" + "'", str8.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1043");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.right;
        java.lang.String str8 = strImmutablePair2.getKey();
        java.lang.String str9 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1044");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        java.lang.String str4 = strImmutablePair2.toString("");
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1045");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ImmutablePair1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1046");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getKey();
        java.lang.String str5 = strImmutablePair2.getRight();
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.String> objPair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Object) strImmutablePair2, "(,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPair7);
    }

    @Test
    public void ImmutablePair1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1047");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1048");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.right;
        java.lang.String str7 = strImmutablePair3.getRight();
        java.lang.String str8 = strImmutablePair3.getRight();
        java.lang.String str9 = strImmutablePair3.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1049");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getKey();
        java.lang.String str9 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1050");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((hi!,),)" + "'", str6.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1051");
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.CharSequence> charSequencePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "(,((hi!,),))", (java.lang.CharSequence) "(((hi!,),hi!),(,hi!))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair2);
    }

    @Test
    public void ImmutablePair1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1052");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.Class<?> wildcardClass7 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(((hi!,),),hi!)" + "'", str5.equals("(((hi!,),),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((hi!,),)" + "'", str6.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ImmutablePair1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1053");
        java.lang.reflect.Type type0 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),),(,((hi!,),)))", "(,hi!)");
        java.lang.Class<?> wildcardClass5 = strImmutablePair4.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.reflect.AnnotatedElement> strPair6 = org.apache.commons.lang3.tuple.Pair.of("(,hi!)", (java.lang.reflect.AnnotatedElement) wildcardClass5);
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.Type, java.lang.Object> typePair7 = org.apache.commons.lang3.tuple.Pair.of(type0, (java.lang.Object) "(,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typePair7);
    }

    @Test
    public void ImmutablePair1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1054");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.toString("(hi!,)");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1055");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1056");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1057");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),hi!)" + "'", str5.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,),hi!)" + "'", str8.equals("((hi!,),hi!)"));
    }

    @Test
    public void ImmutablePair1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1058");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getValue();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1059");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(,((hi!,),))");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("(((hi!,),),(hi!,))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1060");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.getLeft();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1061");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getValue();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1062");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "((hi!,),)");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.right;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair7 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str8 = strImmutablePair7.getValue();
        int int9 = strImmutablePair2.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-64) + "'", int9 == (-64));
    }

    @Test
    public void ImmutablePair1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1063");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((,((hi!,),)),(hi!,))");
        java.lang.String str3 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ImmutablePair1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1064");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "((hi!,),)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1065");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,((hi!,),))" + "'", str4.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(,((hi!,),))" + "'", str6.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1066");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getRight();
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
    public void ImmutablePair1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1067");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(((hi!,),),(,((hi!,),)))");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str5 = strImmutablePair2.toString("(hi!,)");
        java.lang.String str7 = strImmutablePair2.toString("((,hi!),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((,hi!),hi!)" + "'", str7.equals("((,hi!),hi!)"));
    }

    @Test
    public void ImmutablePair1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair2.ImmutablePair1068");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.getValue();
        java.lang.String str7 = strImmutablePair3.toString();
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strComparablePair8 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(((hi!,),),((hi!,),))", (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair8);
    }
}

