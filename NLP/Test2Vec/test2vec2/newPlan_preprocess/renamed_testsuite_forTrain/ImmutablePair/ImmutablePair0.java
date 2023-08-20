
package ImmutablePair;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ImmutablePair0 {

    public static boolean debug = false;

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0001");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("(hi!,)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0002");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable> strPair2 = org.apache.commons.lang3.tuple.Pair.of("hi!", (java.io.Serializable) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0003");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0004");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.lang.String> objImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.lang.String>(obj0, "");
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0005");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0006");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0007");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0008");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0009");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0010");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0011");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0012");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0013");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0014");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0015");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0016");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.left;
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0017");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0018");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0019");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0020");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0021");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "(hi!,)", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass3 = strComparableImmutablePair2.getClass();
        org.apache.commons.lang3.tuple.Pair<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationPair5 = org.apache.commons.lang3.tuple.Pair.of((java.lang.reflect.GenericDeclaration) wildcardClass3, (java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationPair5);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0022");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0023");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0024");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0025");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0026");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0027");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0028");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0029");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0030");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("(hi!,)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0031");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0032");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0033");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0034");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0035");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> strPair6 = null;
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0036");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.right;
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0037");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0038");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0039");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0040");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0041");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0042");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.CharSequence> strImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of("(hi!,)", (java.lang.CharSequence) "((hi!,),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0043");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0044");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0045");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0046");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.getKey();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0047");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0048");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0049");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0050");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0051");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0052");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0053");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0054");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getRight();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0055");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0056");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.toString();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0057");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0058");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "(hi!,)", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass4 = strComparableImmutablePair3.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Class<?>> strImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of("", wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair5);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0059");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0060");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0061");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0062");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0063");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0064");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0065");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0066");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0067");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0068");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0069");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.toString();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0070");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0071");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0072");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0073");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0074");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0075");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0076");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0077");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0078");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0079");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0080");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0081");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0082");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0083");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0084");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getRight();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0085");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0086");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0087");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0088");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0089");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0090");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.right;
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0091");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0092");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0093");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0094");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0095");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0096");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>> strPairImmutablePair4 = new org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.Comparable<java.lang.String>>((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strImmutablePair2.setValue("((hi!,),)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0097");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0098");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "hi!", (java.lang.Comparable<java.lang.String>) "((hi!,),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0099");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0100");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0101");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0102");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0103");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0104");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0105");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0106");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("(hi!,)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0107");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0108");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.CharSequence> strImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of("((hi!,),)", (java.lang.CharSequence) "(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0109");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0110");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0111");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0112");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0113");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0114");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0115");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0116");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0117");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0118");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0119");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0120");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.left;
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0121");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0122");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0123");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0124");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0125");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.right;
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0126");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0127");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0128");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0129");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0130");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        org.apache.commons.lang3.tuple.Pair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> strEntryPair6 = org.apache.commons.lang3.tuple.Pair.of((java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair2, "(hi!,)");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> strPair7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0131");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString();
        java.lang.String str6 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0132");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0133");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry0 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.CharSequence> strEntryImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.CharSequence>(strEntry0, (java.lang.CharSequence) "(,((hi!,),))");
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0134");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0135");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0136");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0137");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.toString();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0138");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0139");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair6 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair2, (java.lang.CharSequence) "");
        java.lang.String str7 = strImmutablePair2.right;
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0140");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0141");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0142");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0143");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0144");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0145");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0146");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0147");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.right;
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0148");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0149");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0150");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0151");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0152");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.lang.CharSequence> charSequenceImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "(,((hi!,),))", (java.lang.CharSequence) "((hi!,),)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0153");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.toString();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0154");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0155");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0156");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0157");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0158");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0159");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getKey();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0160");
        java.lang.reflect.GenericDeclaration genericDeclaration1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Comparable<java.lang.String>) "((hi!,),)", genericDeclaration1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0161");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0162");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0163");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0164");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0165");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0166");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0167");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0168");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0169");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.getKey();
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.getKey();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.io.Serializable> objImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Object) 1L, (java.io.Serializable) strImmutablePair3);
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0170");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0171");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0172");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0173");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0174");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0175");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0176");
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "(((hi!,),),(,((hi!,),)))", (java.lang.CharSequence) "(,((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0177");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0178");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0179");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0180");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0181");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0182");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.right;
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0183");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(,hi!)", (java.io.Serializable) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0184");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0185");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0186");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0187");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0188");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0189");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.getKey();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0190");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0191");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0192");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.String>((java.lang.Comparable<java.lang.String>) "((hi!,),)", "(,((hi!,),))");
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0193");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0194");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(hi!,)");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable> strPair4 = org.apache.commons.lang3.tuple.Pair.of("", (java.io.Serializable) "(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair4);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0195");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0196");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "hi!");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> strPair3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = strImmutablePair2.compareTo(strPair3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0197");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0198");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0199");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0200");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0201");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0202");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0203");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0204");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0205");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Object> strImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of("(hi!,)", (java.lang.Object) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0206");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(,((hi!,),))");
        java.lang.String str3 = strImmutablePair2.getLeft();
        java.lang.String str4 = strImmutablePair2.toString();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0207");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0208");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of(strComparable0, (java.lang.Comparable<java.lang.String>) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0209");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0210");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.getKey();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0211");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0212");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0213");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0214");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0215");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString("(((hi!,),),(,((hi!,),)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str5.equals("(((hi!,),),(,((hi!,),)))"));
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0216");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0217");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0218");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0219");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0220");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0221");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0222");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0223");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0224");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0225");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0226");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0227");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0228");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0229");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0230");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0231");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0232");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(,((hi!,),))", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((,((hi!,),)),(hi!,))" + "'", str3.equals("((,((hi!,),)),(hi!,))"));
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0233");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0234");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0235");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(hi!,)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("((hi!,),)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0236");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0237");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0238");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0239");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0240");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0241");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0242");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getKey();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0243");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0244");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0245");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0246");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0247");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.getKey();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> strPair8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0248");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(((hi!,),),(,((hi!,),)))");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("((,((hi!,),)),(hi!,))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0249");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0250");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0251");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0252");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0253");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0254");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.toString("((hi!,),)");
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0255");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0256");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0257");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0258");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0259");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0260");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0261");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.CharSequence> strImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of("hi!", (java.lang.CharSequence) "(((hi!,),),(,((hi!,),)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0262");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(,((hi!,),))");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("((,((hi!,),)),(hi!,))");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0263");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0264");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0265");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0266");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0267");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str4 = strImmutablePair3.left;
        java.lang.String str5 = strImmutablePair3.getValue();
        java.lang.String str6 = strImmutablePair3.getRight();
        org.apache.commons.lang3.tuple.Pair<java.lang.String, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPair7 = org.apache.commons.lang3.tuple.Pair.of("(,((hi!,),))", (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>) strImmutablePair3);
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0268");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0269");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.toString();
        java.lang.String str7 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0270");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "hi!");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) "");
        java.lang.String str5 = strImmutablePair2.toString();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0271");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.getValue();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0272");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.Class<?> wildcardClass4 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0273");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0274");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0275");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0276");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str6 = strImmutablePair2.toString("((hi!,),)");
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0277");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(((hi!,),),(,((hi!,),)))");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.Class<?> wildcardClass4 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0278");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0279");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(,((hi!,),))");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,((hi!,),))" + "'", str3.equals("(,((hi!,),))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,((hi!,),))" + "'", str4.equals("(,((hi!,),))"));
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0280");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0281");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0282");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0283");
        java.lang.reflect.AnnotatedElement annotatedElement1 = null;
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.reflect.AnnotatedElement> strPair2 = org.apache.commons.lang3.tuple.Pair.of("((hi!,),)", annotatedElement1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0284");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getRight();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0285");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0286");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0287");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0288");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0289");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0290");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0291");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0292");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0293");
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.String> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "((hi!,),hi!)", "(((hi!,),),(,((hi!,),)))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0294");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0295");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0296");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.util.Map.Entry<java.lang.String, java.lang.String>> strPair4 = org.apache.commons.lang3.tuple.Pair.of("(hi!,)", (java.util.Map.Entry<java.lang.String, java.lang.String>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        java.lang.String str6 = strImmutablePair3.getKey();
        java.lang.String str7 = strImmutablePair3.left;
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0297");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0298");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "hi!");
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0299");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0300");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.getRight();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0301");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0302");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0303");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getKey();
        java.lang.String str5 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0304");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.toString();
        boolean boolean6 = strImmutablePair2.equals((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0305");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Comparable<java.lang.String>> strImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of("(((hi!,),),(,((hi!,),)))", (java.lang.Comparable<java.lang.String>) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0306");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.String str4 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString("hi!");
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0307");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0308");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0309");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0310");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0311");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0312");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0313");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.toString();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0314");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0315");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.toString();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0316");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0317");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0318");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0319");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0320");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0321");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0322");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0323");
        java.io.Serializable serializable1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.io.Serializable>((java.lang.Comparable<java.lang.String>) "", serializable1);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0324");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> strPair0 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>, java.lang.CharSequence> strPairImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of(strPair0, (java.lang.CharSequence) "((hi!,),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0325");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0326");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0327");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),)");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0328");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),)", "(,((hi!,),))");
        java.lang.String str3 = strImmutablePair2.getLeft();
        java.lang.Class<?> wildcardClass4 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "((hi!,),)" + "'", str3.equals("((hi!,),)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0329");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0330");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(hi!,)");
        java.lang.Class<?> wildcardClass3 = strImmutablePair2.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.reflect.AnnotatedElement) wildcardClass3, (java.lang.Comparable<java.lang.String>) "(,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(annotatedElementImmutablePair5);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0331");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0332");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0333");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0334");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0335");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getValue();
        java.lang.String str6 = strImmutablePair2.getValue();
        java.lang.String str7 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0336");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getRight();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0337");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0338");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) false);
        java.lang.String str5 = strImmutablePair2.right;
        java.lang.String str6 = strImmutablePair2.toString();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0339");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0340");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0341");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0342");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0343");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0344");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0345");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0346");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        java.lang.String str5 = strImmutablePair2.left;
        java.lang.String str6 = strImmutablePair2.toString();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0347");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0348");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0349");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Comparable<java.lang.String>> strPair2 = org.apache.commons.lang3.tuple.Pair.of("(,((hi!,),))", (java.lang.Comparable<java.lang.String>) "((hi!,),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0350");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),hi!)", "(,hi!)");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((hi!,),hi!),(,hi!))" + "'", str3.equals("(((hi!,),hi!),(,hi!))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,hi!)" + "'", str4.equals("(,hi!)"));
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0351");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0352");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0353");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0354");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0355");
        org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.CharSequence> strPair2 = org.apache.commons.lang3.tuple.Pair.of("(,((hi!,),))", (java.lang.CharSequence) "((,((hi!,),)),(hi!,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0356");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0357");
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequencePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "((hi!,),hi!)", (java.lang.Comparable<java.lang.String>) "(,((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0358");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0359");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0360");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0361");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0362");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0363");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0364");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0365");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0366");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(,((hi!,),))", "hi!");
        java.lang.String str4 = strImmutablePair2.toString("(,((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,((hi!,),))" + "'", str4.equals("(,((hi!,),))"));
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0367");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0368");
        java.io.Serializable serializable1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.io.Serializable> charSequenceImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.io.Serializable>((java.lang.CharSequence) "((hi!,),hi!)", serializable1);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0369");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(,((hi!,),))", "(((hi!,),),(,((hi!,),)))");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str5 = strImmutablePair2.toString("((,((hi!,),)),(hi!,))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str3.equals("(((hi!,),),(,((hi!,),)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "((,((hi!,),)),(hi!,))" + "'", str5.equals("((,((hi!,),)),(hi!,))"));
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0370");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0371");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0372");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0373");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0374");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "");
        java.lang.String str3 = strImmutablePair2.left;
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0375");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.toString();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0376");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0377");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0378");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0379");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0380");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0381");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0382");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0383");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getRight();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0384");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0385");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0386");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0387");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.lang.CharSequence> charSequenceImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "", (java.lang.CharSequence) "((hi!,),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0388");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0389");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0390");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0391");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0392");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0393");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0394");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0395");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0396");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0397");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0398");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0399");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0400");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0401");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0402");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0403");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0404");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0405");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.left;
        java.lang.String str4 = strImmutablePair2.left;
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.getKey();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0406");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0407");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0408");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0409");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0410");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0411");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0412");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0413");
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.io.Serializable) "(((hi!,),hi!),(,hi!))", (java.lang.Comparable<java.lang.String>) "(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializablePair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0414");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0415");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.CharSequence, java.util.Map.Entry<java.lang.String, java.lang.String>> charSequenceImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.CharSequence) "", strEntry1);
        java.lang.Class<?> wildcardClass3 = charSequenceImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceImmutablePair2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0416");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0417");
        org.apache.commons.lang3.tuple.Pair<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "(,((hi!,),))");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparablePair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0418");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0419");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0420");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0421");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0422");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0423");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0424");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("((hi!,),hi!)", "(((hi!,),),(,((hi!,),)))");
        java.lang.String str3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(((hi!,),),(,((hi!,),)))" + "'", str3.equals("(((hi!,),),(,((hi!,),)))"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "((hi!,),hi!)" + "'", str4.equals("((hi!,),hi!)"));
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0425");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0426");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0427");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0428");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Comparable<java.lang.String>) "(,hi!)", "((hi!,),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0429");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(((hi!,),),(,((hi!,),)))");
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0430");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0431");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0432");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0433");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0434");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0435");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0436");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0437");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0438");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0439");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.CharSequence> strImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of("((hi!,),)", (java.lang.CharSequence) "((hi!,),hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0440");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0441");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0442");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0443");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "");
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getLeft();
        java.lang.String str5 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.left;
        java.lang.String str7 = strImmutablePair2.getRight();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0444");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0445");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("hi!", "(hi!,)");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableImmutablePair4 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Object) "(hi!,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair4);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0446");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0447");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0448");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0449");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0450");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0451");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0452");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0453");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0454");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0455");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0456");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0457");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0458");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0459");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0460");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0461");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0462");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(,((hi!,),))", "(((hi!,),hi!),(,hi!))");
        java.lang.Class<?> wildcardClass3 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0463");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0464");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),),(,((hi!,),)))", "(,hi!)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strImmutablePair2.setValue("((hi!,),hi!)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0465");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0466");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "((hi!,),hi!)");
        java.lang.String str3 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0467");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0468");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0469");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0470");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0471");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0472");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0473");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0474");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0475");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0476");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0477");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "hi!");
        java.lang.String str3 = strImmutablePair2.toString();
        java.lang.String str4 = strImmutablePair2.getLeft();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0478");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0479");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(((hi!,),hi!),(,hi!))", "hi!");
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0480");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.getRight();
        java.lang.Class<?> wildcardClass4 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(hi!,)" + "'", str3.equals("(hi!,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0481");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0482");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0483");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableImmutablePair2 = org.apache.commons.lang3.tuple.ImmutablePair.of(strComparable0, strComparable1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableImmutablePair2);
    }

    @Test
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0484");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0485");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0486");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0487");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0488");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0489");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0490");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0491");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0492");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0493");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0494");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0495");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0496");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("(hi!,)", "(hi!,)");
        java.lang.String str3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getValue();
        // The following exception was thrown during execution in test generation
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0497");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0498");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0499");
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
    public void ImmutablePair() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test0500");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.String>("", "");
        java.lang.String str4 = strImmutablePair2.toString("(,hi!)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(,hi!)" + "'", str4.equals("(,hi!)"));
    }
}

