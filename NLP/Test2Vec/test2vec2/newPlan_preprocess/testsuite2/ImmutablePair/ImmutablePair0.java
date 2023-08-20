package ImmutablePair;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ImmutablePair0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test01");
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.lang.CharSequence> serializablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.io.Serializable) true, (java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializablePair2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test02");
        org.apache.commons.lang3.tuple.Pair<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializablePair2 = org.apache.commons.lang3.tuple.Pair.of((java.io.Serializable) (byte) 1, (java.lang.Comparable<java.lang.String>) "(hi!,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializablePair2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test03");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable4 = strImmutablePair2.setValue((java.io.Serializable) true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test04");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        java.lang.String str4 = strImmutablePair2.toString("hi!");
        java.lang.String str5 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test05");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", (java.io.Serializable) "");
        java.io.Serializable serializable3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + "" + "'", serializable3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test06");
        java.io.Serializable serializable1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", serializable1);
        java.io.Serializable serializable3 = strImmutablePair2.right;
        java.io.Serializable serializable4 = strImmutablePair2.getRight();
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.io.Serializable serializable6 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str8 = strImmutablePair2.getKey();
        java.io.Serializable serializable9 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,null)" + "'", str7.equals("(hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test07");
        java.io.Serializable serializable1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", serializable1);
        java.io.Serializable serializable3 = strImmutablePair2.right;
        java.io.Serializable serializable4 = strImmutablePair2.getRight();
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.io.Serializable serializable6 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.toString("hi!");
        java.io.Serializable serializable9 = strImmutablePair2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test08");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        java.lang.String str3 = strImmutablePair2.toString();
        java.io.Serializable serializable4 = strImmutablePair2.right;
        java.io.Serializable serializable5 = strImmutablePair2.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,1)" + "'", str3.equals("(,1)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 1 + "'", serializable4.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 1 + "'", serializable5.equals(1));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test09");
        java.io.Serializable serializable1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", serializable1);
        java.io.Serializable serializable3 = strImmutablePair2.right;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = serializable3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test10");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        java.lang.String str3 = strImmutablePair2.toString();
        java.io.Serializable serializable4 = strImmutablePair2.right;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable6 = strImmutablePair2.setValue((java.io.Serializable) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,1)" + "'", str3.equals("(,1)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 1 + "'", serializable4.equals(1));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test11");
        java.io.Serializable serializable1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", serializable1);
        java.io.Serializable serializable3 = strImmutablePair2.right;
        java.io.Serializable serializable4 = strImmutablePair2.getRight();
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.io.Serializable serializable6 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.left;
        java.lang.Object obj8 = null;
        boolean boolean9 = strImmutablePair2.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test12");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        java.lang.String str4 = strImmutablePair2.toString("hi!");
        java.io.Serializable serializable5 = strImmutablePair2.getRight();
        org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable>, java.lang.String> strPairPair7 = org.apache.commons.lang3.tuple.Pair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable>) strImmutablePair2, "(,1)");
        java.lang.Class<?> wildcardClass8 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 1 + "'", serializable5.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairPair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test13");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        java.lang.String str4 = strImmutablePair2.toString("hi!");
        java.lang.String str6 = strImmutablePair2.toString("(,1)");
        java.lang.String str7 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(,1)" + "'", str6.equals("(,1)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,1)" + "'", str7.equals("(,1)"));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test14");
        java.io.Serializable serializable1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", serializable1);
        java.io.Serializable serializable3 = strImmutablePair2.right;
        java.io.Serializable serializable4 = strImmutablePair2.getRight();
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.io.Serializable serializable6 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.toString();
        java.lang.String str9 = strImmutablePair2.toString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,null)" + "'", str7.equals("(hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test15");
        java.io.Serializable serializable1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", serializable1);
        boolean boolean4 = strImmutablePair2.equals((java.lang.Object) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test16");
        java.io.Serializable serializable1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", serializable1);
        java.io.Serializable serializable3 = strImmutablePair2.right;
        java.io.Serializable serializable4 = strImmutablePair2.getRight();
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.io.Serializable serializable6 = strImmutablePair2.getRight();
        java.lang.String str8 = strImmutablePair2.toString("hi!");
        java.lang.String str9 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test17");
        java.io.Serializable serializable1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", serializable1);
        java.io.Serializable serializable3 = strImmutablePair2.right;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable5 = strImmutablePair2.setValue((java.io.Serializable) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test18");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        java.lang.String str4 = strImmutablePair2.toString("hi!");
        java.lang.String str6 = strImmutablePair2.toString("(hi!,null)");
        java.lang.String str8 = strImmutablePair2.toString("(hi!,null)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,null)" + "'", str6.equals("(hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(hi!,null)" + "'", str8.equals("(hi!,null)"));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test19");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        java.io.Serializable serializable3 = strImmutablePair2.getValue();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair6 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", (java.io.Serializable) "");
        java.io.Serializable serializable7 = strImmutablePair6.right;
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>, java.io.Serializable> strImmutablePairImmutablePair8 = org.apache.commons.lang3.tuple.ImmutablePair.of(strImmutablePair2, (java.io.Serializable) strImmutablePair6);
        java.lang.Class<?> wildcardClass9 = strImmutablePairImmutablePair8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1 + "'", serializable3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + "" + "'", serializable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePairImmutablePair8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test20");
        java.io.Serializable serializable1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", serializable1);
        java.io.Serializable serializable3 = strImmutablePair2.right;
        java.io.Serializable serializable4 = strImmutablePair2.getRight();
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.io.Serializable serializable6 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.toString();
        org.apache.commons.lang3.tuple.ImmutablePair<java.io.Serializable, java.lang.CharSequence> serializableImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.io.Serializable) str7, (java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,null)" + "'", str7.equals("(hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableImmutablePair9);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test21");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        java.lang.String str3 = strImmutablePair2.toString();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>, java.lang.Comparable<java.lang.String>> strImmutablePairImmutablePair5 = org.apache.commons.lang3.tuple.ImmutablePair.of(strImmutablePair2, (java.lang.Comparable<java.lang.String>) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,1)" + "'", str3.equals("(,1)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strImmutablePairImmutablePair5);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test22");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        java.lang.String str4 = strImmutablePair2.toString("hi!");
        java.io.Serializable serializable5 = strImmutablePair2.getRight();
        java.lang.String str6 = strImmutablePair2.getKey();
        java.lang.String str7 = strImmutablePair2.toString();
        org.apache.commons.lang3.tuple.ImmutablePair<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable>, java.lang.String> strPairImmutablePair9 = org.apache.commons.lang3.tuple.ImmutablePair.of((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable>) strImmutablePair2, "(,1)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 1 + "'", serializable5.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,1)" + "'", str7.equals("(,1)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strPairImmutablePair9);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test23");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", (java.io.Serializable) "");
        java.lang.Class<?> wildcardClass3 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test24");
        java.io.Serializable serializable1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", serializable1);
        java.io.Serializable serializable3 = strImmutablePair2.right;
        java.io.Serializable serializable4 = strImmutablePair2.getRight();
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.lang.String str6 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test25");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        java.io.Serializable serializable3 = strImmutablePair2.getValue();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair6 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        java.lang.String str8 = strImmutablePair6.toString("hi!");
        int int9 = strImmutablePair2.compareTo((org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable>) strImmutablePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1 + "'", serializable3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test26");
        java.io.Serializable serializable2 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", serializable2);
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "hi!", (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.left;
        java.lang.String str6 = strImmutablePair3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test27");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.io.Serializable serializable4 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair5 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", serializable4);
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable>> charSequencePair6 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "hi!", (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable>) strImmutablePair5);
        java.lang.Class<?> wildcardClass7 = charSequencePair6.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.Type, java.lang.Class<?>> typeImmutablePair8 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.reflect.Type) wildcardClass1, wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(typeImmutablePair8);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test28");
        java.io.Serializable serializable2 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", serializable2);
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "hi!", (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable>) strImmutablePair3);
        java.lang.Class<?> wildcardClass5 = charSequencePair4.getClass();
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationImmutablePair7 = org.apache.commons.lang3.tuple.ImmutablePair.of((java.lang.reflect.GenericDeclaration) wildcardClass5, (java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass8 = genericDeclarationImmutablePair7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(genericDeclarationImmutablePair7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test29");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        java.io.Serializable serializable3 = strImmutablePair2.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1 + "'", serializable3.equals(1));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test30");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", (java.io.Serializable) "");
        java.io.Serializable serializable3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + "" + "'", serializable3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "(hi!,)" + "'", str4.equals("(hi!,)"));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test31");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        java.lang.String str4 = strImmutablePair2.toString("hi!");
        java.io.Serializable serializable5 = strImmutablePair2.getRight();
        java.io.Serializable serializable6 = strImmutablePair2.right;
        java.lang.String str7 = strImmutablePair2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 1 + "'", serializable5.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1 + "'", serializable6.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(,1)" + "'", str7.equals("(,1)"));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test32");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        java.io.Serializable serializable3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1 + "'", serializable3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test33");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.Class<?> wildcardClass4 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test34");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        java.io.Serializable serializable3 = strImmutablePair2.getValue();
        java.lang.String str4 = strImmutablePair2.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1 + "'", serializable3.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test35");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", (java.io.Serializable) "");
        java.io.Serializable serializable3 = strImmutablePair2.right;
        java.lang.String str4 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + "" + "'", serializable3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test36");
        java.io.Serializable serializable2 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", serializable2);
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "hi!", (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(hi!,null)" + "'", str5.equals("(hi!,null)"));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test37");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        java.lang.String str4 = strImmutablePair2.toString("hi!");
        java.lang.Class<?> wildcardClass5 = strImmutablePair2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test38");
        java.io.Serializable serializable1 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", serializable1);
        java.io.Serializable serializable3 = strImmutablePair2.right;
        java.io.Serializable serializable4 = strImmutablePair2.getRight();
        java.lang.String str5 = strImmutablePair2.getLeft();
        java.io.Serializable serializable6 = strImmutablePair2.getRight();
        java.lang.String str7 = strImmutablePair2.toString();
        java.io.Serializable serializable8 = strImmutablePair2.getRight();
        java.lang.String str9 = strImmutablePair2.getKey();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(hi!,null)" + "'", str7.equals("(hi!,null)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test39");
        java.io.Serializable serializable2 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", serializable2);
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "hi!", (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.lang.String str6 = strImmutablePair3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(hi!,null)" + "'", str6.equals("(hi!,null)"));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test40");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        java.lang.String str3 = strImmutablePair2.getKey();
        java.lang.String str4 = strImmutablePair2.getKey();
        java.lang.String str6 = strImmutablePair2.toString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test41");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("", (java.io.Serializable) 1);
        java.lang.String str3 = strImmutablePair2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable5 = strImmutablePair2.setValue((java.io.Serializable) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "(,1)" + "'", str3.equals("(,1)"));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test42");
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.lang.Comparable<java.lang.String>> objImmutablePair2 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.Object, java.lang.Comparable<java.lang.String>>((java.lang.Object) ' ', (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutablePair0.test43");
        java.io.Serializable serializable2 = null;
        org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable> strImmutablePair3 = new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.io.Serializable>("hi!", serializable2);
        org.apache.commons.lang3.tuple.Pair<java.lang.CharSequence, org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable>> charSequencePair4 = org.apache.commons.lang3.tuple.Pair.of((java.lang.CharSequence) "hi!", (org.apache.commons.lang3.tuple.Pair<java.lang.String, java.io.Serializable>) strImmutablePair3);
        java.lang.String str5 = strImmutablePair3.getLeft();
        java.io.Serializable serializable6 = strImmutablePair3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequencePair4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
    }
}

