package ImmutableTriple;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ImmutableTriple0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test01");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) '4', (java.lang.CharSequence) "", "");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple7 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.io.Serializable serializable8 = serializableImmutableTriple7.getLeft();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = serializableImmutableTriple3.compareTo((org.apache.commons.lang3.tuple.Triple<java.io.Serializable, java.lang.CharSequence, java.lang.String>) serializableImmutableTriple7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.Character");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 10 + "'", serializable8.equals(10));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test02");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.io.Serializable serializable4 = serializableImmutableTriple3.getLeft();
        java.io.Serializable serializable5 = serializableImmutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 10 + "'", serializable4.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 10 + "'", serializable5.equals(10));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test03");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) '4', (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        java.lang.String str5 = serializableImmutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "(4,,)" + "'", str5.equals("(4,,)"));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test04");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        java.lang.String str5 = serializableImmutableTriple3.right;
        java.lang.String str6 = serializableImmutableTriple3.getRight();
        java.io.Serializable serializable7 = serializableImmutableTriple3.left;
        java.lang.CharSequence charSequence8 = serializableImmutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 10 + "'", serializable7.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test05");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) '4', (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        org.apache.commons.lang3.tuple.ImmutableTriple<org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> serializableImmutableTripleImmutableTriple7 = new org.apache.commons.lang3.tuple.ImmutableTriple<org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>(serializableImmutableTriple3, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.Class<?> wildcardClass8 = serializableImmutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test06");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        java.lang.String str5 = serializableImmutableTriple3.right;
        java.io.Serializable serializable6 = serializableImmutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 10 + "'", serializable6.equals(10));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test07");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        java.lang.String str5 = serializableImmutableTriple3.right;
        java.lang.String str6 = serializableImmutableTriple3.getRight();
        java.lang.CharSequence charSequence7 = serializableImmutableTriple3.getMiddle();
        java.io.Serializable serializable8 = serializableImmutableTriple3.getLeft();
        java.lang.Class<?> wildcardClass9 = serializableImmutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 10 + "'", serializable8.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test08");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) '4', (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        org.apache.commons.lang3.tuple.ImmutableTriple<org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> serializableImmutableTripleImmutableTriple7 = new org.apache.commons.lang3.tuple.ImmutableTriple<org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>(serializableImmutableTriple3, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.CharSequence charSequence8 = serializableImmutableTriple3.getMiddle();
        java.io.Serializable serializable9 = serializableImmutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + '4' + "'", serializable9.equals('4'));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test09");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        java.lang.String str5 = serializableImmutableTriple3.right;
        java.lang.String str6 = serializableImmutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test10");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.io.Serializable serializable4 = serializableImmutableTriple3.getLeft();
        java.lang.String str5 = serializableImmutableTriple3.getRight();
        java.lang.CharSequence charSequence6 = serializableImmutableTriple3.getMiddle();
        java.lang.String str8 = serializableImmutableTriple3.toString("hi!");
        java.lang.CharSequence charSequence9 = serializableImmutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 10 + "'", serializable4.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test11");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.io.Serializable serializable4 = serializableImmutableTriple3.getLeft();
        java.lang.String str6 = serializableImmutableTriple3.toString("(4,,)");
        java.lang.Class<?> wildcardClass7 = serializableImmutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 10 + "'", serializable4.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(4,,)" + "'", str6.equals("(4,,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test12");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        java.lang.CharSequence charSequence5 = serializableImmutableTriple3.getMiddle();
        java.io.Serializable serializable6 = serializableImmutableTriple3.getLeft();
        java.lang.CharSequence charSequence7 = serializableImmutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 10 + "'", serializable6.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test13");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        java.lang.String str5 = serializableImmutableTriple3.right;
        java.lang.CharSequence charSequence6 = serializableImmutableTriple3.getMiddle();
        java.lang.String str7 = serializableImmutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test14");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.io.Serializable serializable4 = serializableImmutableTriple3.getLeft();
        java.lang.String str5 = serializableImmutableTriple3.getRight();
        java.lang.CharSequence charSequence6 = serializableImmutableTriple3.getMiddle();
        java.lang.Class<?> wildcardClass7 = charSequence6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 10 + "'", serializable4.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test15");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) '4', (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        org.apache.commons.lang3.tuple.ImmutableTriple<org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> serializableImmutableTripleImmutableTriple7 = new org.apache.commons.lang3.tuple.ImmutableTriple<org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>(serializableImmutableTriple3, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.lang.String str8 = serializableImmutableTriple3.toString();
        java.lang.CharSequence charSequence9 = serializableImmutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(4,,)" + "'", str8.equals("(4,,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test16");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) '4', (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        java.io.Serializable serializable5 = serializableImmutableTriple3.left;
        java.lang.CharSequence charSequence6 = serializableImmutableTriple3.middle;
        java.lang.CharSequence charSequence7 = serializableImmutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + '4' + "'", serializable5.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test17");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.io.Serializable serializable4 = serializableImmutableTriple3.getLeft();
        java.lang.String str5 = serializableImmutableTriple3.getRight();
        java.lang.CharSequence charSequence6 = serializableImmutableTriple3.getMiddle();
        java.lang.CharSequence charSequence7 = serializableImmutableTriple3.getMiddle();
        java.lang.String str8 = serializableImmutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 10 + "'", serializable4.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test18");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.io.Serializable serializable4 = serializableImmutableTriple3.getLeft();
        java.lang.String str5 = serializableImmutableTriple3.getRight();
        java.io.Serializable serializable6 = serializableImmutableTriple3.getLeft();
        java.lang.CharSequence charSequence7 = serializableImmutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 10 + "'", serializable4.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 10 + "'", serializable6.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test19");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.io.Serializable serializable4 = serializableImmutableTriple3.getLeft();
        java.lang.String str5 = serializableImmutableTriple3.getRight();
        java.io.Serializable serializable6 = serializableImmutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 10 + "'", serializable4.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 10 + "'", serializable6.equals(10));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test20");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) '4', (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        java.lang.Class<?> wildcardClass5 = serializableImmutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test21");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        java.lang.String str5 = serializableImmutableTriple3.right;
        java.lang.String str6 = serializableImmutableTriple3.getRight();
        java.lang.CharSequence charSequence7 = serializableImmutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test22");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) '4', (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        org.apache.commons.lang3.tuple.ImmutableTriple<org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> serializableImmutableTripleImmutableTriple7 = new org.apache.commons.lang3.tuple.ImmutableTriple<org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>(serializableImmutableTriple3, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.io.Serializable serializable8 = serializableImmutableTriple3.left;
        java.io.Serializable serializable9 = serializableImmutableTriple3.left;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + '4' + "'", serializable8.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + '4' + "'", serializable9.equals('4'));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test23");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        java.lang.CharSequence charSequence5 = serializableImmutableTriple3.getMiddle();
        java.io.Serializable serializable6 = serializableImmutableTriple3.getLeft();
        java.lang.String str7 = serializableImmutableTriple3.toString();
        java.lang.String str8 = serializableImmutableTriple3.right;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 10 + "'", serializable6.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "(10,,)" + "'", str7.equals("(10,,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test24");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple4 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) true, (java.lang.CharSequence) "(4,,)", "hi!");
        org.apache.commons.lang3.tuple.Triple<java.lang.String, java.io.Serializable, java.lang.String> strTriple6 = org.apache.commons.lang3.tuple.Triple.of("(4,,)", (java.io.Serializable) "(4,,)", "(10,,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTriple6);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test25");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 0L, (java.lang.CharSequence) "(10,,)", "(4,,)");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test26");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) '4', (java.lang.CharSequence) "", "");
        java.io.Serializable serializable4 = serializableImmutableTriple3.getLeft();
        boolean boolean6 = serializableImmutableTriple3.equals((java.lang.Object) (short) 10);
        java.lang.String str7 = serializableImmutableTriple3.getRight();
        java.lang.String str8 = serializableImmutableTriple3.right;
        java.lang.CharSequence charSequence9 = serializableImmutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + '4' + "'", serializable4.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test27");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        java.lang.String str5 = serializableImmutableTriple3.right;
        java.lang.String str6 = serializableImmutableTriple3.getRight();
        java.io.Serializable serializable7 = serializableImmutableTriple3.left;
        java.lang.String str8 = serializableImmutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 10 + "'", serializable7.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(10,,)" + "'", str8.equals("(10,,)"));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test28");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) '4', (java.lang.CharSequence) "", "");
        java.io.Serializable serializable4 = serializableImmutableTriple3.getLeft();
        boolean boolean6 = serializableImmutableTriple3.equals((java.lang.Object) (short) 10);
        java.lang.String str7 = serializableImmutableTriple3.getRight();
        java.lang.String str8 = serializableImmutableTriple3.right;
        java.lang.CharSequence charSequence9 = serializableImmutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + '4' + "'", serializable4.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "" + "'", charSequence9.equals(""));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test29");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) '4', (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        org.apache.commons.lang3.tuple.ImmutableTriple<org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String> serializableImmutableTripleImmutableTriple7 = new org.apache.commons.lang3.tuple.ImmutableTriple<org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>, java.lang.Comparable<java.lang.String>, java.lang.String>(serializableImmutableTriple3, (java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        java.io.Serializable serializable8 = serializableImmutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + '4' + "'", serializable8.equals('4'));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test30");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.io.Serializable serializable4 = serializableImmutableTriple3.getLeft();
        boolean boolean6 = serializableImmutableTriple3.equals((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass7 = serializableImmutableTriple3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 10 + "'", serializable4.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test31");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.lang.Object obj4 = null;
        boolean boolean5 = serializableImmutableTriple3.equals(obj4);
        java.lang.String str6 = serializableImmutableTriple3.toString();
        java.lang.CharSequence charSequence7 = serializableImmutableTriple3.getMiddle();
        java.io.Serializable serializable8 = serializableImmutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(10,,)" + "'", str6.equals("(10,,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 10 + "'", serializable8.equals(10));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test32");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) '4', (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        java.io.Serializable serializable5 = serializableImmutableTriple3.left;
        java.lang.CharSequence charSequence6 = serializableImmutableTriple3.middle;
        java.io.Serializable serializable7 = serializableImmutableTriple3.getLeft();
        java.lang.String str8 = serializableImmutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + '4' + "'", serializable5.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + '4' + "'", serializable7.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test33");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        java.lang.String str5 = serializableImmutableTriple3.right;
        java.lang.String str6 = serializableImmutableTriple3.getRight();
        java.io.Serializable serializable7 = serializableImmutableTriple3.left;
        java.lang.CharSequence charSequence8 = serializableImmutableTriple3.middle;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 10 + "'", serializable7.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test34");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.lang.Object obj4 = null;
        boolean boolean5 = serializableImmutableTriple3.equals(obj4);
        java.lang.String str6 = serializableImmutableTriple3.toString();
        java.lang.CharSequence charSequence7 = serializableImmutableTriple3.getMiddle();
        boolean boolean9 = serializableImmutableTriple3.equals((java.lang.Object) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(10,,)" + "'", str6.equals("(10,,)"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "" + "'", charSequence7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test35");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.lang.CharSequence charSequence4 = serializableImmutableTriple3.getMiddle();
        java.io.Serializable serializable5 = serializableImmutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "" + "'", charSequence4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 10 + "'", serializable5.equals(10));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test36");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.getRight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test37");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) '4', (java.lang.CharSequence) "", "");
        java.io.Serializable serializable4 = serializableImmutableTriple3.getLeft();
        boolean boolean6 = serializableImmutableTriple3.equals((java.lang.Object) (short) 10);
        java.lang.String str7 = serializableImmutableTriple3.getRight();
        java.io.Serializable serializable8 = serializableImmutableTriple3.getLeft();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + '4' + "'", serializable4.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + '4' + "'", serializable8.equals('4'));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test38");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) 10, (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        java.lang.CharSequence charSequence5 = serializableImmutableTriple3.getMiddle();
        java.lang.String str6 = serializableImmutableTriple3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "(10,,)" + "'", str6.equals("(10,,)"));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test39");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) '4', (java.lang.CharSequence) "", "");
        java.lang.String str4 = serializableImmutableTriple3.right;
        java.io.Serializable serializable5 = serializableImmutableTriple3.left;
        java.lang.CharSequence charSequence6 = serializableImmutableTriple3.middle;
        java.io.Serializable serializable7 = serializableImmutableTriple3.getLeft();
        java.lang.CharSequence charSequence8 = serializableImmutableTriple3.getMiddle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + '4' + "'", serializable5.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "" + "'", charSequence6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + '4' + "'", serializable7.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "" + "'", charSequence8.equals(""));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test40");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ImmutableTriple0.test41");
        org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String> serializableImmutableTriple3 = new org.apache.commons.lang3.tuple.ImmutableTriple<java.io.Serializable, java.lang.CharSequence, java.lang.String>((java.io.Serializable) '4', (java.lang.CharSequence) "", "");
        java.io.Serializable serializable4 = serializableImmutableTriple3.getLeft();
        java.lang.CharSequence charSequence5 = serializableImmutableTriple3.middle;
        java.io.Serializable serializable6 = serializableImmutableTriple3.left;
        java.lang.String str8 = serializableImmutableTriple3.toString("(10,,)");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + '4' + "'", serializable4.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + '4' + "'", serializable6.equals('4'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "(10,,)" + "'", str8.equals("(10,,)"));
    }
}

