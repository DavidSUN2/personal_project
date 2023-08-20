package ImmutablePair;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ImmutablePair0 {

    public static boolean debug = false;

    @Test
    public void ImmutablePair0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0001");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("(hi!,)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0002");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable> strPair2 = org.apache.commons.lang3.tuple.Pair.of("hi!", (java.io.Serializable) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void ImmutablePair0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0003");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str5 = strImmutablePair2.setValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0004");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.lang.String> objImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.lang.String>(obj0, "");
    }

    @Test
    public void ImmutablePair0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0005");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0006");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.lang.String> objImmutablePair8 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.lang.String>((java.lang.Object) str6, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ImmutablePair0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0007");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0008");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        java.lang.String str9 = strImmutablePair2.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0009");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.left;
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0010");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.io.Serializable> objImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Object) 1L, (java.io.Serializable) strImmutablePair3);
        java.lang.String str8 = strImmutablePair3.getKey();
        java.lang.String str9 = strImmutablePair3.getLeft();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0011");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void ImmutablePair0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0012");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.getValue();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0013");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.getRight();
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
    public void ImmutablePair0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0014");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean5 = strImmutablePair3.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair3.right;
        java.lang.String str7 = strImmutablePair3.right;
        java.lang.Class<?> wildcardClass8 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Class<?>> strImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of("", wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair9);
    }

    @Test
    public void ImmutablePair0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0015");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.io.Serializable> objImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Object) 1L, (java.io.Serializable) strImmutablePair3);
        java.lang.String str8 = strImmutablePair3.getKey();
        java.lang.Class<?> wildcardClass9 = strImmutablePair3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0016");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.left;
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0017");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.right;
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
    public void ImmutablePair0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0018");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean5 = strImmutablePair3.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair3.right;
        java.lang.String str7 = strImmutablePair3.right;
        java.lang.Class<?> wildcardClass8 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Class<?>> strComparableImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Comparable<java.lang.String>) "", wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair9);
    }

    @Test
    public void ImmutablePair0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0019");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.getLeft();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0020");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getKey();
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0021");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "(hi!,)", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass3 = strComparableImmutablePair2.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationPair5 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.GenericDeclaration) wildcardClass3, (java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationPair5);
    }

    @Test
    public void ImmutablePair0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0022");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.io.Serializable> objImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Object) 1L, (java.io.Serializable) strImmutablePair3);
        java.lang.Class<?> wildcardClass8 = strImmutablePair3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objImmutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0023");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.Class<?> wildcardClass8 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0024");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        java.lang.String str9 = strImmutablePair2.toString("(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0025");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairPair8 = org.apache.commons.lang3.tuple.Pair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairPair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0026");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
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
    public void ImmutablePair0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0027");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0028");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0029");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0030");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("(hi!,)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0031");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("((hi!,),)");
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
    }

    @Test
    public void ImmutablePair0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0032");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean5 = strImmutablePair3.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair3.right;
        java.lang.String str7 = strImmutablePair3.right;
        java.lang.Class<?> wildcardClass8 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparablePair9 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.GenericDeclaration) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair9);
    }

    @Test
    public void ImmutablePair0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0033");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getKey();
        java.lang.String str9 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
    public void ImmutablePair0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0034");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.toString("(hi!,)");
        java.lang.Class<?> wildcardClass8 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0035");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> strPair6 = null;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            int int7 = strImmutablePair2.compareTo(strPair6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ImmutablePair0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0036");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.right;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("((hi!,),)");
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
    }

    @Test
    public void ImmutablePair0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0037");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.toString();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.io.Serializable, java.util.Map.Entry<java.lang.String, java.lang.String>> serializableImmutablePair9 = new org.apache.commons.lang3.tuple.ImmutablePair<java.io.Serializable, java.util.Map.Entry<java.lang.String, java.lang.String>>((java.io.Serializable) strImmutablePair2, strEntry8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0038");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.getRight();
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
    public void ImmutablePair0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0039");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str8 = strImmutablePair2.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0040");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.getValue();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0041");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.getLeft();
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
    public void ImmutablePair0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0042");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.CharSequence> strImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of("(hi!,)", (java.lang.CharSequence) "((hi!,),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair2);
    }

    @Test
    public void ImmutablePair0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0043");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("((hi!,),)");
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
    public void ImmutablePair0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0044");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0045");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.Object obj7 = null;
        boolean boolean8 = strImmutablePair2.equals(obj7);
        java.lang.String str9 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0046");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0047");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getKey();
        java.lang.String str9 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
    public void ImmutablePair0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0048");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0049");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.toString("(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0050");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("");
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
    public void ImmutablePair0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0051");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str5 = strImmutablePair2.setValue("(hi!,)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0052");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.right;
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
    }

    @Test
    public void ImmutablePair0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0053");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.getValue();
        java.lang.Class<?> wildcardClass8 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Class<?>> strImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of("(hi!,)", wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair9);
    }

    @Test
    public void ImmutablePair0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0054");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getRight();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("(hi!,)");
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
    }

    @Test
    public void ImmutablePair0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0055");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str5 = strImmutablePair2.setValue("(hi!,)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void ImmutablePair0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0056");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.toString();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("(hi!,)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0057");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.Class<?> wildcardClass6 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ImmutablePair0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0058");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "(hi!,)", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass4 = strComparableImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Class<?>> strImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of("", wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair5);
    }

    @Test
    public void ImmutablePair0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0059");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.getLeft();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0060");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str5 = strImmutablePair2.setValue("(hi!,)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0061");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0062");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("(hi!,)");
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
    public void ImmutablePair0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0063");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair5 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair4);
        java.lang.String str6 = strImmutablePair4.toString();
        java.lang.String str7 = strImmutablePair4.left;
        java.lang.String str8 = strImmutablePair4.left;
        org.apache.commons.lang3.tuple.Pair<java.lang.String, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPair9 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair9);
    }

    @Test
    public void ImmutablePair0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0064");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.getLeft();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0065");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.right;
        java.lang.String str8 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0066");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.getKey();
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
    public void ImmutablePair0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0067");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("((hi!,),)");
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
    }

    @Test
    public void ImmutablePair0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0068");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.Object obj7 = null;
        boolean boolean8 = strImmutablePair2.equals(obj7);
        java.lang.String str9 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0069");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.toString();
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
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0070");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0071");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair2.setValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0072");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ImmutablePair0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0073");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.String str7 = strImmutablePair3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0074");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.right;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryImmutablePair8 = new org.apache.commons.lang3.tuple.ImmutablePair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.util.Map.Entry<java.lang.String, java.lang.String>>((java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair2, strEntry7);
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0075");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0076");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getLeft();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0077");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.Class<?> wildcardClass8 = strImmutablePair2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0078");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ImmutablePair0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0079");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getKey();
        java.lang.String str9 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0080");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0081");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.Class<?> wildcardClass8 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0082");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str5 = strImmutablePair2.setValue("((hi!,),)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void ImmutablePair0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0083");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairPair8 = org.apache.commons.lang3.tuple.Pair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "hi!");
        java.lang.String str9 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairPair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0084");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getRight();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void ImmutablePair0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0085");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0086");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0087");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0088");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.toString("hi!");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0089");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        java.lang.Class<?> wildcardClass8 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0090");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.right;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("((hi!,),)");
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
    }

    @Test
    public void ImmutablePair0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0091");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.toString("");
        java.lang.String str9 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0092");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
    public void ImmutablePair0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0093");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0094");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getKey();
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
    public void ImmutablePair0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0095");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getValue();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair7 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str8 = strImmutablePair7.left;
        boolean boolean9 = strImmutablePair2.equals((java.lang.Object) strImmutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ImmutablePair0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0096");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>> strPairImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>>((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("((hi!,),)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0097");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.String str7 = strImmutablePair3.left;
        java.lang.String str9 = strImmutablePair3.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0098");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "((hi!,),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair2);
    }

    @Test
    public void ImmutablePair0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0099");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.getRight();
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
    public void ImmutablePair0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0100");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str9 = strImmutablePair2.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0101");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.left;
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0102");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0103");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.toString("((hi!,),)");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,),)" + "'", str8.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0104");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.Object obj7 = null;
        boolean boolean8 = strImmutablePair2.equals(obj7);
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0105");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.getValue();
        java.lang.Class<?> wildcardClass8 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.Object, java.lang.reflect.Type> objPair9 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Object) 0, (java.lang.reflect.Type) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objPair9);
    }

    @Test
    public void ImmutablePair0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0106");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "hi!");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("(hi!,)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0107");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str9 = strImmutablePair2.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0108");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.CharSequence> strImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of("((hi!,),)", (java.lang.CharSequence) "(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair2);
    }

    @Test
    public void ImmutablePair0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0109");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.toString("(hi!,)");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0110");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.left;
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
    public void ImmutablePair0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0111");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.getRight();
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
    public void ImmutablePair0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0112");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.getValue();
        java.lang.Class<?> wildcardClass8 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Class<?>> strComparableImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Comparable<java.lang.String>) "((hi!,),)", wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair9);
    }

    @Test
    public void ImmutablePair0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0113");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
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
    public void ImmutablePair0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0114");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.right;
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0115");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("hi!");
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
    public void ImmutablePair0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0116");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.Class<?> wildcardClass7 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ImmutablePair0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0117");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair5 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair4);
        java.lang.String str6 = strImmutablePair4.getRight();
        java.lang.String str7 = strImmutablePair4.left;
        java.lang.Class<?> wildcardClass8 = strImmutablePair4.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.lang.Class<?>> charSequenceImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "hi!", wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair9);
    }

    @Test
    public void ImmutablePair0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0118");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0119");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0120");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.left;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair3.setValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ImmutablePair0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0121");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.getRight();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0122");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getRight();
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>, java.lang.CharSequence> strImmutablePairPair7 = org.apache.commons.lang3.tuple.Pair.of(strImmutablePair3, (java.lang.CharSequence) "hi!");
        java.lang.String str8 = strImmutablePair3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePairPair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0123");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str5 = strImmutablePair4.getKey();
        java.lang.String str6 = strImmutablePair4.getLeft();
        java.lang.String str7 = strImmutablePair4.getKey();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.io.Serializable> objImmutablePair8 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Object) 1L, (java.io.Serializable) strImmutablePair4);
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableImmutablePair9 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "", (java.lang.Object) strImmutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objImmutablePair8);
    }

    @Test
    public void ImmutablePair0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0124");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.CharSequence> strPair8 = org.apache.commons.lang3.tuple.Pair.of("", (java.lang.CharSequence) "(hi!,)");
        boolean boolean9 = strImmutablePair3.equals((java.lang.Object) "(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ImmutablePair0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0125");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.right;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("");
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
    }

    @Test
    public void ImmutablePair0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0126");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.Class<?> wildcardClass7 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ImmutablePair0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0127");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0128");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str4 = strImmutablePair3.getRight();
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.getValue();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.lang.Object> charSequenceImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "hi!", (java.lang.Object) str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair7);
    }

    @Test
    public void ImmutablePair0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0129");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.toString("hi!");
        java.lang.String str9 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0130");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        org.apache.commons.lang3.tuple.Pair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> strEntryPair6 = org.apache.commons.lang3.tuple.Pair.of((java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair2, "(hi!,)");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> strPair7 = null;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            int int8 = strImmutablePair2.compareTo(strPair7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strEntryPair6);
    }

    @Test
    public void ImmutablePair0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0131");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("((hi!,),)");
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
    }

    @Test
    public void ImmutablePair0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0132");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("");
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
    }

    @Test
    public void ImmutablePair0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0133");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry0 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.CharSequence> strEntryImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.CharSequence>(strEntry0, (java.lang.CharSequence) "(,((hi!,),))");
    }

    @Test
    public void ImmutablePair0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0134");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.getKey();
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
    public void ImmutablePair0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0135");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("(,((hi!,),))");
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
    public void ImmutablePair0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0136");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getLeft();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0137");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.toString();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair2.setValue("((hi!,),)");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0138");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.toString("hi!");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0139");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.right;
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
    public void ImmutablePair0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0140");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0141");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.left;
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0142");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0143");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        org.apache.commons.lang3.tuple.Pair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> strEntryPair6 = org.apache.commons.lang3.tuple.Pair.of((java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair2, "(hi!,)");
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strEntryPair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0144");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.Class<?> wildcardClass7 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Class<?>> strImmutablePair8 = org.apache.commons.lang3.tuple.ImmutablePair.of("", wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair8);
    }

    @Test
    public void ImmutablePair0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0145");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.Class<?> wildcardClass5 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ImmutablePair0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0146");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.String str7 = strImmutablePair3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0147");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.right;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("(hi!,)");
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
    }

    @Test
    public void ImmutablePair0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0148");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.left;
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0149");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.toString("((hi!,),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((hi!,),)" + "'", str9.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0150");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0151");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.Class<?> wildcardClass5 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ImmutablePair0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0152");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.lang.CharSequence> charSequenceImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "(,((hi!,),))", (java.lang.CharSequence) "((hi!,),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair2);
    }

    @Test
    public void ImmutablePair0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0153");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.toString();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0154");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0155");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0156");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("(,hi!)");
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
    public void ImmutablePair0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0157");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getValue();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0158");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getValue();
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
    public void ImmutablePair0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0159");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair2.setValue("");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0160");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Comparable<java.lang.String>) "((hi!,),)", genericDeclaration1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair2);
    }

    @Test
    public void ImmutablePair0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0161");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0162");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.toString("");
        java.lang.String str9 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0163");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str9 = strImmutablePair2.toString("");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0164");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.toString("(hi!,)");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0165");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.String str9 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0166");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.right;
        java.lang.String str8 = strImmutablePair2.getKey();
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
    public void ImmutablePair0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0167");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> objImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>((java.lang.Object) 'a', (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str6 = strImmutablePair3.toString("hi!");
        java.lang.Class<?> wildcardClass7 = strImmutablePair3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ImmutablePair0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0168");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.right;
        java.lang.Class<?> wildcardClass8 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0169");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.io.Serializable> objImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Object) 1L, (java.io.Serializable) strImmutablePair3);
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair3.setValue("((hi!,),)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objImmutablePair7);
    }

    @Test
    public void ImmutablePair0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0170");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.toString("(,((hi!,),))");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(,((hi!,),))" + "'", str8.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0171");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        org.apache.commons.lang3.tuple.Pair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> strEntryPair6 = org.apache.commons.lang3.tuple.Pair.of((java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair2, "(hi!,)");
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.left;
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
    public void ImmutablePair0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0172");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("(,((hi!,),))");
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
    public void ImmutablePair0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0173");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.Class<?> wildcardClass7 = strImmutablePair3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ImmutablePair0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0174");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getRight();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0175");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair2.setValue("(,((hi!,),))");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0176");
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(((hi!,),),(,((hi!,),)))", (java.lang.CharSequence) "(,((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void ImmutablePair0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0177");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0178");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.String str9 = strImmutablePair2.getRight();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0179");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getValue();
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
    public void ImmutablePair0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0180");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.Class<?> wildcardClass7 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ImmutablePair0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0181");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.io.Serializable> objImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Object) 1L, (java.io.Serializable) strImmutablePair3);
        java.lang.String str8 = strImmutablePair3.right;
        java.lang.String str9 = strImmutablePair3.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objImmutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0182");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
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
    public void ImmutablePair0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0183");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(,hi!)", (java.io.Serializable) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
    }

    @Test
    public void ImmutablePair0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0184");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.getValue();
        java.lang.String str7 = strImmutablePair3.getLeft();
        java.lang.Class<?> wildcardClass8 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Comparable<java.lang.String>) "((hi!,),)", (java.lang.reflect.GenericDeclaration) wildcardClass8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair9);
    }

    @Test
    public void ImmutablePair0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0185");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean6 = strImmutablePair4.equals((java.lang.Object) false);
        java.lang.Class<?> wildcardClass7 = strImmutablePair4.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparablePair8 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(,((hi!,),))", (java.lang.reflect.GenericDeclaration) wildcardClass7);
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.reflect.AnnotatedElement> strImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of("(,hi!)", (java.lang.reflect.AnnotatedElement) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair9);
    }

    @Test
    public void ImmutablePair0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0186");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "hi!");
        java.lang.String str3 = strImmutablePair2.toString();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair6 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str7 = strImmutablePair6.getValue();
        java.lang.String str8 = strImmutablePair6.getRight();
        boolean boolean9 = strImmutablePair2.equals((java.lang.Object) strImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,hi!)" + "'", str3.equals("(,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ImmutablePair0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0187");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0188");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.toString();
        boolean boolean6 = strImmutablePair2.equals((java.lang.Object) (byte) 0);
        java.lang.String str8 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str9 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,),)" + "'", str8.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0189");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.getKey();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair3.setValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0190");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.Class<?> wildcardClass4 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.reflect.Type) wildcardClass4);
        org.apache.commons.lang3.tuple.Pair<java.lang.Class<?>, java.lang.CharSequence> wildcardClassPair7 = org.apache.commons.lang3.tuple.Pair.of(wildcardClass4, (java.lang.CharSequence) "((hi!,),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassPair7);
    }

    @Test
    public void ImmutablePair0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0191");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.String str9 = strImmutablePair2.right;
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0192");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Comparable<java.lang.String>) "((hi!,),)", "(,((hi!,),))");
    }

    @Test
    public void ImmutablePair0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0193");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void ImmutablePair0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0194");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(hi!,)");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable> strPair4 = org.apache.commons.lang3.tuple.Pair.of("", (java.io.Serializable) "(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
    }

    @Test
    public void ImmutablePair0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0195");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.left;
        java.lang.String str8 = strImmutablePair3.right;
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
    }

    @Test
    public void ImmutablePair0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0196");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> strPair3 = null;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            int int4 = strImmutablePair2.compareTo(strPair3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0197");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str9 = strImmutablePair2.toString("(hi!,)");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0198");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getKey();
        java.lang.String str9 = strImmutablePair2.getValue();
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
    public void ImmutablePair0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0199");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0200");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair6 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str7 = strImmutablePair6.getValue();
        int int8 = strImmutablePair2.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair6);
        java.lang.String str9 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "((hi!,),)" + "'", str9.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0201");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,),)" + "'", str7.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0202");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair6 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str7 = strImmutablePair6.getValue();
        int int8 = strImmutablePair2.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair6);
        java.lang.String str9 = strImmutablePair2.getRight();
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
    public void ImmutablePair0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0203");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getValue();
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
    public void ImmutablePair0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0204");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean5 = strImmutablePair3.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair3.right;
        java.lang.String str8 = strImmutablePair3.toString("((hi!,),)");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> strPair9 = org.apache.commons.lang3.tuple.Pair.of("(,hi!)", strImmutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,),)" + "'", str8.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair9);
    }

    @Test
    public void ImmutablePair0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0205");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Object> strImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of("(hi!,)", (java.lang.Object) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair2);
    }

    @Test
    public void ImmutablePair0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0206");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(,((hi!,),))");
        java.lang.String str3 = strImmutablePair2.getLeft();
        java.lang.String str4 = strImmutablePair2.toString();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("((hi!,),)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str4.equals("(((hi!,),),(,((hi!,),)))"));
    }

    @Test
    public void ImmutablePair0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0207");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str9 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,),)" + "'", str7.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str9.equals("(((hi!,),),(,((hi!,),)))"));
    }

    @Test
    public void ImmutablePair0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0208");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of(strComparable0, (java.lang.Comparable<java.lang.String>) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair2);
    }

    @Test
    public void ImmutablePair0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0209");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0210");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.getKey();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair3.setValue("(,hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0211");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0212");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getRight();
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.String str7 = strImmutablePair3.getValue();
        java.lang.String str8 = strImmutablePair3.toString();
        java.lang.String str9 = strImmutablePair3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0213");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0214");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getKey();
        java.lang.String str9 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0215");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str5.equals("(((hi!,),),(,((hi!,),)))"));
    }

    @Test
    public void ImmutablePair0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0216");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.toString("");
        java.lang.String str9 = strImmutablePair2.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0217");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0218");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getValue();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0219");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str8 = strImmutablePair2.getRight();
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
    public void ImmutablePair0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0220");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str8 = strImmutablePair2.toString();
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,),)" + "'", str7.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0221");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
        java.lang.String str9 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str8.equals("(((hi!,),),(,((hi!,),)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0222");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        java.lang.String str8 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0223");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ImmutablePair0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0224");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getValue();
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
    public void ImmutablePair0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0225");
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.io.Serializable> serializablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.io.Serializable) "", (java.io.Serializable) 0L);
        java.lang.Class<?> wildcardClass3 = serializablePair2.getClass();
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializablePair5 = org.apache.commons.lang3.tuple.Pair.of((java.io.Serializable) serializablePair2, (java.lang.Comparable<java.lang.String>) "((hi!,),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializablePair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializablePair5);
    }

    @Test
    public void ImmutablePair0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0226");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.getRight();
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
    public void ImmutablePair0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0227");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.getValue();
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.String> strPairPair9 = org.apache.commons.lang3.tuple.Pair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairPair9);
    }

    @Test
    public void ImmutablePair0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0228");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getRight();
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.String str7 = strImmutablePair3.getValue();
        java.lang.String str8 = strImmutablePair3.toString();
        java.lang.String str9 = strImmutablePair3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0229");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str8 = strImmutablePair2.left;
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
    public void ImmutablePair0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0230");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0231");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.getValue();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0232");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(,((hi!,),))", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((,((hi!,),)),(hi!,))" + "'", str3.equals("((,((hi!,),)),(hi!,))"));
    }

    @Test
    public void ImmutablePair0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0233");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.toString("");
        java.lang.String str9 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0234");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.right;
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
    }

    @Test
    public void ImmutablePair0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0235");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(hi!,)");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("((hi!,),)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0236");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.Class<?> wildcardClass7 = strImmutablePair2.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementImmutablePair9 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.AnnotatedElement, java.lang.String>((java.lang.reflect.AnnotatedElement) wildcardClass7, "((hi!,),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ImmutablePair0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0237");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ImmutablePair0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0238");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.getLeft();
        java.lang.String str8 = strImmutablePair3.toString("(hi!,)");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableImmutablePair9 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "", (java.lang.Object) "(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0239");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("hi!");
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
    }

    @Test
    public void ImmutablePair0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0240");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.left;
        boolean boolean9 = strImmutablePair2.equals((java.lang.Object) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ImmutablePair0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0241");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.left;
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0242");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0243");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.toString("((hi!,),)");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,),)" + "'", str8.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0244");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0245");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.getValue();
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
    public void ImmutablePair0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0246");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.toString();
        boolean boolean9 = strImmutablePair2.equals((java.lang.Object) "((hi!,),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ImmutablePair0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0247");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0248");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(((hi!,),),(,((hi!,),)))");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("((,((hi!,),)),(hi!,))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0249");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("((hi!,),)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void ImmutablePair0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0250");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getLeft();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0251");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.Class<?> wildcardClass8 = strImmutablePair2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0252");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.Class<?> wildcardClass7 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ImmutablePair0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0253");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0254");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString("((hi!,),)");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("(hi!,)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0255");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.toString();
        boolean boolean6 = strImmutablePair2.equals((java.lang.Object) (byte) 0);
        java.lang.String str8 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str9 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,),)" + "'", str8.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0256");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("hi!");
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
    public void ImmutablePair0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0257");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair6 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        int int7 = strImmutablePair2.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair6);
        java.lang.String str8 = strImmutablePair6.left;
        java.lang.String str9 = strImmutablePair6.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0258");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.getRight();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0259");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.getValue();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0260");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0261");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.CharSequence> strImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of("hi!", (java.lang.CharSequence) "(((hi!,),),(,((hi!,),)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair2);
    }

    @Test
    public void ImmutablePair0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0262");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(,((hi!,),))");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("((,((hi!,),)),(hi!,))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0263");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0264");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.right;
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.String> strPairImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, "(,((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair9);
    }

    @Test
    public void ImmutablePair0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0265");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> objImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>((java.lang.Object) 'a', (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str8 = strImmutablePair3.toString("(,((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(,((hi!,),))" + "'", str8.equals("(,((hi!,),))"));
    }

    @Test
    public void ImmutablePair0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0266");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.toString("hi!");
        java.lang.String str9 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0267");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.getValue();
        java.lang.String str6 = strImmutablePair3.getRight();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPair7 = org.apache.commons.lang3.tuple.Pair.of("(,((hi!,),))", (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair3.setValue("(((hi!,),),(,((hi!,),)))");
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
    public void ImmutablePair0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0268");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.left;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0269");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getValue();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0270");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.toString();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("((,((hi!,),)),(hi!,))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),hi!)" + "'", str5.equals("((hi!,),hi!)"));
    }

    @Test
    public void ImmutablePair0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0271");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.getValue();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair3.setValue("(hi!,)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
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
    public void ImmutablePair0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0272");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.Class<?> wildcardClass4 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ImmutablePair0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0273");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        boolean boolean9 = strImmutablePair2.equals((java.lang.Object) 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ImmutablePair0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0274");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.String str7 = strImmutablePair3.left;
        java.lang.String str8 = strImmutablePair3.right;
        java.lang.String str9 = strImmutablePair3.getValue();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0275");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        boolean boolean8 = strImmutablePair2.equals((java.lang.Object) (short) 10);
        java.lang.String str9 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0276");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("((hi!,),)");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("(,((hi!,),))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((hi!,),)" + "'", str6.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0277");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(((hi!,),),(,((hi!,),)))");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.Class<?> wildcardClass4 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ImmutablePair0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0278");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair6 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        int int7 = strImmutablePair2.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair6);
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
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
    public void ImmutablePair0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0279");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(,((hi!,),))");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,((hi!,),))" + "'", str3.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,((hi!,),))" + "'", str4.equals("(,((hi!,),))"));
    }

    @Test
    public void ImmutablePair0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0280");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        java.lang.Class<?> wildcardClass8 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0281");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) '#');
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),hi!)" + "'", str5.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0282");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getKey();
        java.lang.String str5 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ImmutablePair0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0283");
        java.lang.reflect.AnnotatedElement annotatedElement1 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.reflect.AnnotatedElement> strPair2 = org.apache.commons.lang3.tuple.Pair.of("((hi!,),)", annotatedElement1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void ImmutablePair0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0284");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getRight();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("((,((hi!,),)),(hi!,))");
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
    public void ImmutablePair0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0285");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.getRight();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0286");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.Class<?> wildcardClass5 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.reflect.GenericDeclaration) wildcardClass5, (java.lang.Comparable<java.lang.String>) "(hi!,)");
        org.apache.commons.lang3.tuple.ImmutablePair<java.io.Serializable, java.lang.CharSequence> serializableImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.io.Serializable) genericDeclarationImmutablePair7, (java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationImmutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableImmutablePair9);
    }

    @Test
    public void ImmutablePair0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0287");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.Class<?> wildcardClass8 = strImmutablePair2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0288");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getKey();
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
    }

    @Test
    public void ImmutablePair0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0289");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.Class<?> wildcardClass6 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ImmutablePair0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0290");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.Object obj6 = null;
        boolean boolean7 = strImmutablePair2.equals(obj6);
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0291");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair6 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        int int7 = strImmutablePair2.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair6);
        java.lang.String str9 = strImmutablePair2.toString("(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0292");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0293");
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.String> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "((hi!,),hi!)", "(((hi!,),),(,((hi!,),)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void ImmutablePair0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0294");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.right;
        java.lang.String str8 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0295");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        org.apache.commons.lang3.tuple.Pair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> strEntryPair6 = org.apache.commons.lang3.tuple.Pair.of((java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair2, "(hi!,)");
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.getValue();
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
    public void ImmutablePair0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0296");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.left;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str9 = strImmutablePair3.setValue("((hi!,),)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0297");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.getRight();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0298");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "hi!");
    }

    @Test
    public void ImmutablePair0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0299");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getValue();
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
    public void ImmutablePair0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0300");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getRight();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("((hi!,),hi!)");
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
    public void ImmutablePair0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0301");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.getValue();
        java.lang.String str8 = strImmutablePair3.getRight();
        java.lang.Class<?> wildcardClass9 = strImmutablePair3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0302");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> strPair2 = org.apache.commons.lang3.tuple.Pair.of("hi!", "hi!");
        java.lang.String str3 = strPair2.getValue();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair6 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(hi!,)");
        java.lang.Class<?> wildcardClass7 = strImmutablePair6.getClass();
        org.apache.commons.lang3.tuple.Pair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.reflect.AnnotatedElement> strEntryPair8 = org.apache.commons.lang3.tuple.Pair.of((java.util.Map.Entry<java.lang.String, java.lang.String>) strPair2, (java.lang.reflect.AnnotatedElement) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strEntryPair8);
    }

    @Test
    public void ImmutablePair0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0303");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getKey();
        java.lang.String str5 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("(,hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ImmutablePair0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0304");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.toString();
        boolean boolean6 = strImmutablePair2.equals((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void ImmutablePair0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0305");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Comparable<java.lang.String>> strImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of("(((hi!,),),(,((hi!,),)))", (java.lang.Comparable<java.lang.String>) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair2);
    }

    @Test
    public void ImmutablePair0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0306");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0307");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0308");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getLeft();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0309");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str4 = strImmutablePair3.left;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> strImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of("(hi!,)", strImmutablePair3);
        java.lang.String str6 = strImmutablePair3.getLeft();
        java.lang.String str7 = strImmutablePair3.toString();
        java.lang.Class<?> wildcardClass8 = strImmutablePair3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,),)" + "'", str7.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0310");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.toString("(,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),)" + "'", str4.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,hi!)" + "'", str7.equals("(,hi!)"));
    }

    @Test
    public void ImmutablePair0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0311");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getLeft();
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
    public void ImmutablePair0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0312");
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.io.Serializable> serializablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.io.Serializable) "", (java.io.Serializable) 0L);
        java.lang.Class<?> wildcardClass3 = serializablePair2.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair6 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str7 = strImmutablePair6.left;
        java.lang.String str8 = strImmutablePair6.left;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementImmutablePair9 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.AnnotatedElement, java.io.Serializable>((java.lang.reflect.AnnotatedElement) wildcardClass3, (java.io.Serializable) strImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializablePair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0313");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.toString();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("((hi!,),)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0314");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0315");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0316");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.right;
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0317");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ImmutablePair0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0318");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0319");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.toString("((,((hi!,),)),(hi!,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((,((hi!,),)),(hi!,))" + "'", str7.equals("((,((hi!,),)),(hi!,))"));
    }

    @Test
    public void ImmutablePair0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0320");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.getValue();
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
    }

    @Test
    public void ImmutablePair0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0321");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.toString("hi!");
        java.lang.String str9 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0322");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.toString("(,hi!)");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(,hi!)" + "'", str9.equals("(,hi!)"));
    }

    @Test
    public void ImmutablePair0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0323");
        java.io.Serializable serializable1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.io.Serializable>((java.lang.Comparable<java.lang.String>) "", serializable1);
    }

    @Test
    public void ImmutablePair0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0324");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> strPair0 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of(strPair0, (java.lang.CharSequence) "((hi!,),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair2);
    }

    @Test
    public void ImmutablePair0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0325");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0326");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.toString("((hi!,),)");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "((hi!,),)" + "'", str8.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0327");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void ImmutablePair0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0328");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(,((hi!,),))");
        java.lang.String str3 = strImmutablePair2.getLeft();
        java.lang.Class<?> wildcardClass4 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ImmutablePair0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0329");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getRight();
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>, java.lang.CharSequence> strImmutablePairPair7 = org.apache.commons.lang3.tuple.Pair.of(strImmutablePair3, (java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass8 = strImmutablePairPair7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePairPair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0330");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(hi!,)");
        java.lang.Class<?> wildcardClass3 = strImmutablePair2.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.reflect.AnnotatedElement) wildcardClass3, (java.lang.Comparable<java.lang.String>) "(,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementImmutablePair5);
    }

    @Test
    public void ImmutablePair0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0331");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0332");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getRight();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0333");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.getKey();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0334");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getLeft();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0335");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.getValue();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0336");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getRight();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0337");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.toString("((,((hi!,),)),(hi!,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((,((hi!,),)),(hi!,))" + "'", str6.equals("((,((hi!,),)),(hi!,))"));
    }

    @Test
    public void ImmutablePair0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0338");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0339");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.right;
        java.lang.Class<?> wildcardClass6 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Object> strImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of("(hi!,)", (java.lang.Object) strImmutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair7);
    }

    @Test
    public void ImmutablePair0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0340");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0341");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        org.apache.commons.lang3.tuple.Pair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> strEntryPair6 = org.apache.commons.lang3.tuple.Pair.of((java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair2, "(hi!,)");
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.right;
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
    public void ImmutablePair0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0342");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.left;
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0343");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0344");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.getValue();
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
    public void ImmutablePair0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0345");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.toString("");
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0346");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0347");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0348");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        org.apache.commons.lang3.tuple.Pair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> strEntryPair6 = org.apache.commons.lang3.tuple.Pair.of((java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair2, "(hi!,)");
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.getKey();
        java.lang.String str9 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strEntryPair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0349");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Comparable<java.lang.String>> strPair2 = org.apache.commons.lang3.tuple.Pair.of("(,((hi!,),))", (java.lang.Comparable<java.lang.String>) "((hi!,),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void ImmutablePair0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0350");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),hi!)", "(,hi!)");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((hi!,),hi!),(,hi!))" + "'", str3.equals("(((hi!,),hi!),(,hi!))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,hi!)" + "'", str4.equals("(,hi!)"));
    }

    @Test
    public void ImmutablePair0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0351");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0352");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0353");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getLeft();
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
    public void ImmutablePair0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0354");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getValue();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void ImmutablePair0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0355");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.CharSequence> strPair2 = org.apache.commons.lang3.tuple.Pair.of("(,((hi!,),))", (java.lang.CharSequence) "((,((hi!,),)),(hi!,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void ImmutablePair0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0356");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.left;
        java.lang.String str8 = strImmutablePair3.getRight();
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
    }

    @Test
    public void ImmutablePair0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0357");
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequencePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "((hi!,),hi!)", (java.lang.Comparable<java.lang.String>) "(,((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair2);
    }

    @Test
    public void ImmutablePair0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0358");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.right;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0359");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0360");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str4 = strImmutablePair3.left;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> strImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of("(hi!,)", strImmutablePair3);
        java.lang.String str6 = strImmutablePair3.getLeft();
        java.lang.String str7 = strImmutablePair3.toString();
        java.lang.String str8 = strImmutablePair3.left;
        java.lang.String str9 = strImmutablePair3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,),)" + "'", str7.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0361");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0362");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0363");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0364");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getRight();
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
    public void ImmutablePair0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0365");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> objImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>((java.lang.Object) 'a', (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.getKey();
        java.lang.String str8 = strImmutablePair3.left;
        java.lang.String str9 = strImmutablePair3.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
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
    public void ImmutablePair0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0366");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(,((hi!,),))", "hi!");
        java.lang.String str4 = strImmutablePair2.toString("(,((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,((hi!,),))" + "'", str4.equals("(,((hi!,),))"));
    }

    @Test
    public void ImmutablePair0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0367");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.lang.String> charSequenceImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "", "(((hi!,),),(,((hi!,),)))");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.lang.String> objImmutablePair4 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Object) "(((hi!,),),(,((hi!,),)))", "");
        java.lang.Class<?> wildcardClass5 = objImmutablePair4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objImmutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ImmutablePair0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0368");
        java.io.Serializable serializable1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.io.Serializable> charSequenceImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.io.Serializable>((java.lang.CharSequence) "((hi!,),hi!)", serializable1);
    }

    @Test
    public void ImmutablePair0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0369");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(,((hi!,),))", "(((hi!,),),(,((hi!,),)))");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.toString("((,((hi!,),)),(hi!,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str3.equals("(((hi!,),),(,((hi!,),)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((,((hi!,),)),(hi!,))" + "'", str5.equals("((,((hi!,),)),(hi!,))"));
    }

    @Test
    public void ImmutablePair0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0370");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str5 = strImmutablePair2.setValue("((,((hi!,),)),(hi!,))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0371");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.left;
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
    public void ImmutablePair0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0372");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.getLeft();
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
    public void ImmutablePair0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0373");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.getLeft();
        java.lang.String str7 = strImmutablePair3.toString();
        java.lang.String str8 = strImmutablePair3.toString();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> strComparableImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Comparable<java.lang.String>) "((hi!,),hi!)", strImmutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair9);
    }

    @Test
    public void ImmutablePair0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0374");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.left;
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str5 = strImmutablePair2.setValue("((,((hi!,),)),(hi!,))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0375");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("(((hi!,),hi!),(,hi!))");
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
    public void ImmutablePair0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0376");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getRight();
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.String str7 = strImmutablePair3.getValue();
        java.lang.String str8 = strImmutablePair3.toString();
        java.lang.String str9 = strImmutablePair3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0377");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.Class<?> wildcardClass8 = strImmutablePair2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0378");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.Class<?> wildcardClass7 = strImmutablePair2.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.reflect.AnnotatedElement) wildcardClass7, (java.lang.CharSequence) "(,((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementImmutablePair9);
    }

    @Test
    public void ImmutablePair0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0379");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.getRight();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0380");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getRight();
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>, java.lang.CharSequence> strImmutablePairPair7 = org.apache.commons.lang3.tuple.Pair.of(strImmutablePair3, (java.lang.CharSequence) "hi!");
        java.lang.String str8 = strImmutablePair3.toString();
        java.lang.String str9 = strImmutablePair3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePairPair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0381");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>, java.lang.CharSequence> strImmutablePairImmutablePair9 = new org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>, java.lang.CharSequence>(strImmutablePair2, (java.lang.CharSequence) "(hi!,)");
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
    }

    @Test
    public void ImmutablePair0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0382");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.toString("(,hi!)");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(,hi!)" + "'", str9.equals("(,hi!)"));
    }

    @Test
    public void ImmutablePair0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0383");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str7 = strImmutablePair2.setValue("(hi!,)");
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
    }

    @Test
    public void ImmutablePair0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0384");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("((hi!,),)");
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
    public void ImmutablePair0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0385");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.right;
        java.lang.String str9 = strImmutablePair2.getKey();
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
    public void ImmutablePair0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0386");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getRight();
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
    public void ImmutablePair0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0387");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.lang.CharSequence> charSequenceImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "", (java.lang.CharSequence) "((hi!,),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair2);
    }

    @Test
    public void ImmutablePair0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0388");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str9 = strImmutablePair2.toString("(,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(,hi!)" + "'", str9.equals("(,hi!)"));
    }

    @Test
    public void ImmutablePair0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0389");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.toString("(,((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(,((hi!,),))" + "'", str9.equals("(,((hi!,),))"));
    }

    @Test
    public void ImmutablePair0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0390");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.Class<?> wildcardClass7 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ImmutablePair0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0391");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0392");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getRight();
        java.lang.String str6 = strImmutablePair3.right;
        java.lang.String str7 = strImmutablePair3.getLeft();
        java.lang.String str8 = strImmutablePair3.getValue();
        java.lang.String str9 = strImmutablePair3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
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
    public void ImmutablePair0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0393");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getValue();
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
    public void ImmutablePair0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0394");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.Class<?> wildcardClass5 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ImmutablePair0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0395");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0396");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.getLeft();
        java.lang.String str7 = strImmutablePair3.toString();
        java.lang.Class<?> wildcardClass8 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequencePair9 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "", (java.lang.reflect.AnnotatedElement) wildcardClass8);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair9);
    }

    @Test
    public void ImmutablePair0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0397");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getRight();
        java.lang.String str6 = strImmutablePair3.right;
        java.lang.String str7 = strImmutablePair3.getLeft();
        java.lang.String str8 = strImmutablePair3.getValue();
        java.lang.String str9 = strImmutablePair3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0398");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getValue();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0399");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.Class<?> wildcardClass7 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableImmutablePair8 = new org.apache.commons.lang3.tuple.ImmutablePair<java.io.Serializable, java.lang.reflect.AnnotatedElement>((java.io.Serializable) (byte) -1, (java.lang.reflect.AnnotatedElement) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = serializableImmutablePair8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0400");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(hi!,)");
        java.lang.Class<?> wildcardClass3 = strImmutablePair2.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.Type, java.lang.String> typePair5 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.Type) wildcardClass3, "hi!");
        java.lang.reflect.Type type6 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.Type, java.lang.reflect.Type> typeImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.reflect.Type) wildcardClass3, type6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeImmutablePair7);
    }

    @Test
    public void ImmutablePair0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0401");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getKey();
        java.lang.Class<?> wildcardClass5 = strImmutablePair2.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration6 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationPair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.GenericDeclaration) wildcardClass5, genericDeclaration6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationPair7);
    }

    @Test
    public void ImmutablePair0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0402");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "");
        java.lang.String str3 = strImmutablePair2.getValue();
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
    public void ImmutablePair0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0403");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
    public void ImmutablePair0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0404");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.toString("(hi!,)");
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.String str9 = strImmutablePair2.right;
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0405");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.getKey();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str8 = strImmutablePair2.setValue("((hi!,),)");
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
    }

    @Test
    public void ImmutablePair0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0406");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0407");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getRight();
        java.lang.String str6 = strImmutablePair3.right;
        java.lang.String str7 = strImmutablePair3.getLeft();
        java.lang.String str8 = strImmutablePair3.getValue();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0408");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.Class<?> wildcardClass7 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ImmutablePair0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0409");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.getKey();
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
    public void ImmutablePair0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0410");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> objImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>((java.lang.Object) 'a', (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.getKey();
        java.lang.String str8 = strImmutablePair3.toString();
        java.lang.String str9 = strImmutablePair3.getRight();
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
    public void ImmutablePair0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0411");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getValue();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0412");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.toString("");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0413");
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.io.Serializable) "(((hi!,),hi!),(,hi!))", (java.lang.Comparable<java.lang.String>) "(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializablePair2);
    }

    @Test
    public void ImmutablePair0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0414");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getKey();
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.Object obj6 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>, java.lang.Object> strImmutablePairImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of(strImmutablePair2, obj6);
        java.lang.String str8 = strImmutablePair2.left;
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
    public void ImmutablePair0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0415");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.util.Map.Entry<java.lang.String, java.lang.String>> charSequenceImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "", strEntry1);
        java.lang.Class<?> wildcardClass3 = charSequenceImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ImmutablePair0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0416");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getKey();
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
    }

    @Test
    public void ImmutablePair0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0417");
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "(,((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void ImmutablePair0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0418");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
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
    public void ImmutablePair0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0419");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        boolean boolean8 = strImmutablePair2.equals((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0420");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.getRight();
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
    }

    @Test
    public void ImmutablePair0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0421");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0422");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.String str9 = strImmutablePair2.getRight();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0423");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
    public void ImmutablePair0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0424");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),hi!)", "(((hi!,),),(,((hi!,),)))");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str3.equals("(((hi!,),),(,((hi!,),)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),hi!)" + "'", str4.equals("((hi!,),hi!)"));
    }

    @Test
    public void ImmutablePair0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0425");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.toString("(,((hi!,),))");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(,((hi!,),))" + "'", str8.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0426");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0427");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getKey();
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0428");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Comparable<java.lang.String>) "(,hi!)", "((hi!,),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair2);
    }

    @Test
    public void ImmutablePair0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0429");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(((hi!,),),(,((hi!,),)))");
    }

    @Test
    public void ImmutablePair0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0430");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) '#');
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.toString("(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),hi!)" + "'", str5.equals("((hi!,),hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0431");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getRight();
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.String str7 = strImmutablePair3.getRight();
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
    public void ImmutablePair0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0432");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.io.Serializable> objImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Object) 1L, (java.io.Serializable) strImmutablePair3);
        java.lang.String str8 = strImmutablePair3.right;
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0433");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0434");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.toString();
        java.lang.String str7 = strImmutablePair3.getLeft();
        java.lang.Class<?> wildcardClass8 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.lang.reflect.AnnotatedElement> objImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Object) 1, (java.lang.reflect.AnnotatedElement) wildcardClass8);
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
        org.junit.Assert.assertNotNull(objImmutablePair9);
    }

    @Test
    public void ImmutablePair0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0435");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.toString("");
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.String str9 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0436");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str4 = strImmutablePair3.left;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> strImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of("(hi!,)", strImmutablePair3);
        java.lang.String str6 = strImmutablePair3.getLeft();
        java.lang.String str7 = strImmutablePair3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0437");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> objImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>((java.lang.Object) 'a', (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0438");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.toString();
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.String str7 = strImmutablePair3.right;
        java.lang.Class<?> wildcardClass8 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableImmutablePair9 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "(,((hi!,),))", (java.lang.Object) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ImmutablePair0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0439");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.CharSequence> strImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of("((hi!,),)", (java.lang.CharSequence) "((hi!,),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair2);
    }

    @Test
    public void ImmutablePair0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0440");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getKey();
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
    }

    @Test
    public void ImmutablePair0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0441");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(,((hi!,),))");
        java.lang.String str4 = strImmutablePair3.right;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.util.Map.Entry<java.lang.String, java.lang.String>> charSequenceImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "((hi!,),)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.io.Serializable, java.util.Map.Entry<java.lang.String, java.lang.String>> serializableImmutablePair7 = new org.apache.commons.lang3.tuple.ImmutablePair<java.io.Serializable, java.util.Map.Entry<java.lang.String, java.lang.String>>((java.io.Serializable) charSequenceImmutablePair5, strEntry6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,((hi!,),))" + "'", str4.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair5);
    }

    @Test
    public void ImmutablePair0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0442");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.right;
        java.lang.String str8 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0443");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getRight();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0444");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
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
    public void ImmutablePair0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0445");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableImmutablePair4 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Object) "(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair4);
    }

    @Test
    public void ImmutablePair0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0446");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.toString();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,)" + "'", str7.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0447");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.String str7 = strImmutablePair3.getRight();
        java.lang.String str8 = strImmutablePair3.right;
        java.lang.String str9 = strImmutablePair3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0448");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str4 = strImmutablePair3.left;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>> strImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of("(hi!,)", strImmutablePair3);
        java.lang.String str6 = strImmutablePair3.getLeft();
        boolean boolean8 = strImmutablePair3.equals((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass9 = strImmutablePair3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0449");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.left;
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0450");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
        java.lang.String str7 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str6.equals("(((hi!,),),(,((hi!,),)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void ImmutablePair0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0451");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0452");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.right;
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
    public void ImmutablePair0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0453");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0454");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.getValue();
        java.lang.String str6 = strImmutablePair3.getRight();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPair7 = org.apache.commons.lang3.tuple.Pair.of("(,((hi!,),))", (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str8 = strImmutablePair3.toString();
        java.lang.String str9 = strImmutablePair3.right;
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
    public void ImmutablePair0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0455");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.right;
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0456");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getRight();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0457");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.getValue();
        java.lang.String str8 = strImmutablePair3.toString("(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0458");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString("((hi!,),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((hi!,),)" + "'", str6.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0459");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getLeft();
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
    public void ImmutablePair0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0460");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getValue();
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
    public void ImmutablePair0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0461");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getRight();
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.String str7 = strImmutablePair3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void ImmutablePair0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0462");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(,((hi!,),))", "(((hi!,),hi!),(,hi!))");
        java.lang.Class<?> wildcardClass3 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ImmutablePair0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0463");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.toString("((hi!,),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "((hi!,),)" + "'", str7.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0464");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),),(,((hi!,),)))", "(,hi!)");
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("((hi!,),hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0465");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
    public void ImmutablePair0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0466");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),hi!)");
        java.lang.String str3 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void ImmutablePair0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0467");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.getRight();
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
    public void ImmutablePair0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0468");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getLeft();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0469");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>> strPairImmutablePair5 = new org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>>((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str6 = strImmutablePair3.left;
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable> strPair7 = org.apache.commons.lang3.tuple.Pair.of("hi!", (java.io.Serializable) strImmutablePair3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "((hi!,),)" + "'", str6.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair7);
    }

    @Test
    public void ImmutablePair0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0470");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getValue();
        java.lang.String str8 = strImmutablePair2.getKey();
        java.lang.String str9 = strImmutablePair2.left;
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0471");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("");
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.getRight();
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
    public void ImmutablePair0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0472");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getLeft();
        java.lang.String str8 = strImmutablePair2.toString("hi!");
        java.lang.String str9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
    public void ImmutablePair0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0473");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.getKey();
        java.lang.String str9 = strImmutablePair2.getKey();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0474");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> objImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>((java.lang.Object) 'a', (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.getKey();
        java.lang.String str8 = strImmutablePair3.toString();
        java.lang.String str9 = strImmutablePair3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,)" + "'", str8.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "(hi!,)" + "'", str9.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0475");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void ImmutablePair0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0476");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.left;
        java.lang.String str9 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
    public void ImmutablePair0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0477");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "hi!");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,hi!)" + "'", str3.equals("(,hi!)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void ImmutablePair0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0478");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.toString();
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.Class<?> wildcardClass7 = strImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable> strPair8 = org.apache.commons.lang3.tuple.Pair.of("", (java.io.Serializable) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,)" + "'", str5.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair8);
    }

    @Test
    public void ImmutablePair0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0479");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),hi!),(,hi!))", "hi!");
    }

    @Test
    public void ImmutablePair0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0480");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.Class<?> wildcardClass4 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ImmutablePair0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0481");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.right;
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
    public void ImmutablePair0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0482");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.Class<?> wildcardClass5 = strImmutablePair2.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.Type, java.io.Serializable> typePair7 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.Type) wildcardClass5, (java.io.Serializable) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typePair7);
    }

    @Test
    public void ImmutablePair0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0483");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of(strComparable0, strComparable1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair2);
    }

    @Test
    public void ImmutablePair0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0484");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean5 = strImmutablePair3.equals((java.lang.Object) "");
        java.lang.String str6 = strImmutablePair3.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Object> strImmutablePair7 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Object>("(((hi!,),),(,((hi!,),)))", (java.lang.Object) str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
    }

    @Test
    public void ImmutablePair0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0485");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getRight();
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
    public void ImmutablePair0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0486");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
    }

    @Test
    public void ImmutablePair0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0487");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>> strPairImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>>((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass5 = strPairImmutablePair4.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableImmutablePair8 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.Type, java.io.Serializable> typeImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.reflect.Type) wildcardClass5, (java.io.Serializable) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeImmutablePair9);
    }

    @Test
    public void ImmutablePair0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0488");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str8.equals("(((hi!,),),(,((hi!,),)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void ImmutablePair0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0489");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getRight();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void ImmutablePair0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0490");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        java.lang.String str8 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
    public void ImmutablePair0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0491");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.String str8 = strImmutablePair2.getLeft();
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0492");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString("((hi!,),)");
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.toString("");
        java.lang.Class<?> wildcardClass9 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((hi!,),)" + "'", str5.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0493");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.left;
        java.lang.String str7 = strImmutablePair3.left;
        java.lang.String str8 = strImmutablePair3.right;
        java.lang.String str9 = strImmutablePair3.getRight();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void ImmutablePair0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0494");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.getKey();
        java.lang.String str8 = strImmutablePair3.getRight();
        java.lang.Class<?> wildcardClass9 = strImmutablePair3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ImmutablePair0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0495");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> strPair0 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair5 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair4);
        java.lang.String str6 = strImmutablePair4.left;
        java.lang.String str7 = strImmutablePair4.getValue();
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairPair8 = org.apache.commons.lang3.tuple.Pair.of(strPair0, (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairPair8);
    }

    @Test
    public void ImmutablePair0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0496");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in ImmutablePair generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("((hi!,),)");
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
    public void ImmutablePair0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0497");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        org.apache.commons.lang3.tuple.Pair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> strEntryPair6 = org.apache.commons.lang3.tuple.Pair.of((java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair2, "(hi!,)");
        java.lang.String str7 = strImmutablePair2.getRight();
        java.lang.reflect.Type type8 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.reflect.Type> strEntryImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair2, type8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strEntryPair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strEntryImmutablePair9);
    }

    @Test
    public void ImmutablePair0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0498");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.Class<?> wildcardClass7 = strImmutablePair2.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.Class<?>, java.lang.CharSequence> wildcardClassPair9 = org.apache.commons.lang3.tuple.Pair.of(wildcardClass7, (java.lang.CharSequence) "(,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,)" + "'", str6.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClassPair9);
    }

    @Test
    public void ImmutablePair0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0499");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.toString();
        java.lang.String str5 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,((hi!,),))" + "'", str4.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void ImmutablePair0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.ImmutablePair0500");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "");
        java.lang.String str4 = strImmutablePair2.toString("(,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,hi!)" + "'", str4.equals("(,hi!)"));
    }
}

