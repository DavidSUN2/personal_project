
package ConstantInitializer;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ConstantInitializer0 {

    public static boolean debug = false;

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test01");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) true);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test02");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test03");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Comparable<java.lang.String>> strComparableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test04");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence2 = charSequenceConstantInitializer1.getObject();
        java.lang.CharSequence charSequence3 = charSequenceConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "" + "'", charSequence2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "" + "'", charSequence3.equals(""));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test05");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.String str2 = charSequenceConstantInitializer1.toString();
        boolean boolean4 = charSequenceConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass5 = charSequenceConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test06");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Comparable<java.lang.String>> strComparableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Comparable<java.lang.String>>(strComparable0);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test07");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>> charSequenceConcurrentInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>) charSequenceConstantInitializer1);
        boolean boolean4 = charSequenceConstantInitializer1.equals((java.lang.Object) 1L);
        java.lang.String str5 = charSequenceConstantInitializer1.toString();
        java.lang.CharSequence charSequence6 = charSequenceConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test08");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence2 = charSequenceConstantInitializer1.getObject();
        boolean boolean4 = charSequenceConstantInitializer1.equals((java.lang.Object) 1.0d);
        java.lang.CharSequence charSequence5 = charSequenceConstantInitializer1.get();
        java.lang.Class<?> wildcardClass6 = charSequence5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "" + "'", charSequence2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test09");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence2 = charSequenceConstantInitializer1.getObject();
        java.lang.CharSequence charSequence3 = charSequenceConstantInitializer1.get();
        java.lang.Class<?> wildcardClass4 = charSequence3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "hi!" + "'", charSequence3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test10");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.String> strConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.String>("");
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test11");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence2 = charSequenceConstantInitializer1.get();
        java.lang.CharSequence charSequence3 = charSequenceConstantInitializer1.get();
        java.lang.CharSequence charSequence4 = charSequenceConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "hi!" + "'", charSequence3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test12");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0f);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test13");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>> charSequenceConcurrentInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>) charSequenceConstantInitializer1);
        java.lang.String str3 = charSequenceConstantInitializer1.toString();
        java.lang.String str4 = charSequenceConstantInitializer1.toString();
        java.lang.CharSequence charSequence5 = charSequenceConstantInitializer1.get();
        java.lang.CharSequence charSequence6 = charSequenceConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test14");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>> charSequenceConcurrentInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>) charSequenceConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.String str5 = charSequenceConstantInitializer4.toString();
        boolean boolean6 = charSequenceConstantInitializer1.equals((java.lang.Object) str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test15");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>> charSequenceConcurrentInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>) charSequenceConstantInitializer1);
        boolean boolean4 = charSequenceConstantInitializer1.equals((java.lang.Object) 1L);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0f);
        boolean boolean7 = charSequenceConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test16");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.String str2 = charSequenceConstantInitializer1.toString();
        boolean boolean4 = charSequenceConstantInitializer1.equals((java.lang.Object) "");
        java.lang.CharSequence charSequence5 = charSequenceConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test17");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>> charSequenceConcurrentInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>) charSequenceConstantInitializer1);
        java.lang.Class<?> wildcardClass3 = charSequenceConcurrentInitializerConstantInitializer2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test18");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence2 = charSequenceConstantInitializer1.getObject();
        java.lang.String str3 = charSequenceConstantInitializer1.toString();
        java.lang.String str4 = charSequenceConstantInitializer1.toString();
        java.lang.CharSequence charSequence5 = charSequenceConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test19");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.String str2 = charSequenceConstantInitializer1.toString();
        boolean boolean4 = charSequenceConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.CharSequence charSequence5 = charSequenceConstantInitializer1.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>> charSequenceConcurrentInitializerConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>) charSequenceConstantInitializer1);
        java.lang.CharSequence charSequence7 = charSequenceConstantInitializer1.getObject();
        java.lang.CharSequence charSequence8 = charSequenceConstantInitializer1.get();
        java.lang.CharSequence charSequence9 = charSequenceConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test20");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>> charSequenceConcurrentInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>) charSequenceConstantInitializer1);
        java.lang.String str3 = charSequenceConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) str3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test21");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>> charSequenceConcurrentInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>) charSequenceConstantInitializer1);
        java.lang.String str3 = charSequenceConstantInitializer1.toString();
        java.lang.CharSequence charSequence4 = charSequenceConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence4 + "' != '" + "hi!" + "'", charSequence4.equals("hi!"));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test22");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) (short) 0);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test23");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.String str2 = charSequenceConstantInitializer1.toString();
        boolean boolean4 = charSequenceConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.CharSequence charSequence5 = charSequenceConstantInitializer1.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>> charSequenceConcurrentInitializerConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>) charSequenceConstantInitializer1);
        java.lang.CharSequence charSequence7 = charSequenceConstantInitializer1.getObject();
        java.lang.CharSequence charSequence8 = charSequenceConstantInitializer1.get();
        java.lang.Class<?> wildcardClass9 = charSequence8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test24");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence2 = charSequenceConstantInitializer1.getObject();
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceConstantInitializer1.equals(obj3);
        java.lang.Class<?> wildcardClass5 = charSequenceConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test25");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.String str2 = charSequenceConstantInitializer1.toString();
        boolean boolean4 = charSequenceConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.CharSequence charSequence5 = charSequenceConstantInitializer1.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>> charSequenceConcurrentInitializerConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>) charSequenceConstantInitializer1);
        java.lang.String str7 = charSequenceConstantInitializer1.toString();
        java.lang.CharSequence charSequence8 = charSequenceConstantInitializer1.getObject();
        java.lang.CharSequence charSequence9 = charSequenceConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test26");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.String str2 = charSequenceConstantInitializer1.toString();
        boolean boolean4 = charSequenceConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.CharSequence charSequence5 = charSequenceConstantInitializer1.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>> charSequenceConcurrentInitializerConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>) charSequenceConstantInitializer1);
        boolean boolean8 = charSequenceConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.CharSequence charSequence9 = charSequenceConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9.equals("hi!"));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test27");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.String str2 = charSequenceConstantInitializer1.toString();
        boolean boolean4 = charSequenceConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.CharSequence charSequence5 = charSequenceConstantInitializer1.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>> charSequenceConcurrentInitializerConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>) charSequenceConstantInitializer1);
        java.lang.String str7 = charSequenceConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass8 = charSequenceConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test28");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>> charSequenceConcurrentInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>) charSequenceConstantInitializer1);
        java.lang.String str3 = charSequenceConstantInitializer1.toString();
        java.lang.String str4 = charSequenceConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass5 = charSequenceConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test29");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.String str2 = charSequenceConstantInitializer1.toString();
        boolean boolean4 = charSequenceConstantInitializer1.equals((java.lang.Object) (short) 10);
        boolean boolean6 = charSequenceConstantInitializer1.equals((java.lang.Object) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test30");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.String str2 = charSequenceConstantInitializer1.toString();
        boolean boolean4 = charSequenceConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.CharSequence charSequence5 = charSequenceConstantInitializer1.get();
        java.lang.Class<?> wildcardClass6 = charSequenceConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test31");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence2 = charSequenceConstantInitializer1.getObject();
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceConstantInitializer1.equals(obj3);
        java.lang.CharSequence charSequence5 = charSequenceConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test32");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence2 = charSequenceConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = charSequenceConstantInitializer4.getObject();
        java.lang.String str6 = charSequenceConstantInitializer4.toString();
        java.lang.String str7 = charSequenceConstantInitializer4.toString();
        boolean boolean8 = charSequenceConstantInitializer1.equals((java.lang.Object) charSequenceConstantInitializer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test33");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence2 = charSequenceConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass3 = charSequence2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass3);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "" + "'", charSequence2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test34");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 1L);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test35");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence2 = charSequenceConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass3 = charSequenceConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass3);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test36");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence2 = charSequenceConstantInitializer1.get();
        java.lang.CharSequence charSequence3 = charSequenceConstantInitializer1.get();
        java.lang.String str4 = charSequenceConstantInitializer1.toString();
        java.lang.CharSequence charSequence5 = charSequenceConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "hi!" + "'", charSequence3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test37");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>> charSequenceConcurrentInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>) charSequenceConstantInitializer1);
        java.lang.String str3 = charSequenceConstantInitializer1.toString();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = charSequenceConstantInitializer1.equals(obj4);
        java.lang.CharSequence charSequence6 = charSequenceConstantInitializer1.get();
        java.lang.CharSequence charSequence7 = charSequenceConstantInitializer1.get();
        java.lang.Class<?> wildcardClass8 = charSequenceConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test38");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.String str2 = charSequenceConstantInitializer1.toString();
        boolean boolean4 = charSequenceConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.CharSequence charSequence5 = charSequenceConstantInitializer1.get();
        java.lang.String str6 = charSequenceConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test39");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence2 = charSequenceConstantInitializer1.getObject();
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceConstantInitializer1.equals(obj3);
        java.lang.String str5 = charSequenceConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test40");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.String str2 = charSequenceConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass3 = charSequenceConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test41");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence2 = charSequenceConstantInitializer1.get();
        java.lang.CharSequence charSequence3 = charSequenceConstantInitializer1.get();
        java.lang.String str4 = charSequenceConstantInitializer1.toString();
        java.lang.String str5 = charSequenceConstantInitializer1.toString();
        boolean boolean7 = charSequenceConstantInitializer1.equals((java.lang.Object) 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "hi!" + "'", charSequence3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test42");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence2 = charSequenceConstantInitializer1.getObject();
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceConstantInitializer1.equals(obj3);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>> charSequenceConstantInitializerConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>>(charSequenceConstantInitializer1);
        java.lang.CharSequence charSequence6 = charSequenceConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test43");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence2 = charSequenceConstantInitializer1.getObject();
        boolean boolean4 = charSequenceConstantInitializer1.equals((java.lang.Object) 1.0d);
        java.lang.CharSequence charSequence5 = charSequenceConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "" + "'", charSequence2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test44");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.String str2 = charSequenceConstantInitializer1.toString();
        java.lang.CharSequence charSequence3 = charSequenceConstantInitializer1.get();
        java.lang.String str4 = charSequenceConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence3 + "' != '" + "hi!" + "'", charSequence3.equals("hi!"));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test45");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.String str2 = charSequenceConstantInitializer1.toString();
        boolean boolean4 = charSequenceConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.CharSequence charSequence5 = charSequenceConstantInitializer1.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>> charSequenceConcurrentInitializerConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>) charSequenceConstantInitializer1);
        java.lang.Class<?> wildcardClass7 = charSequenceConcurrentInitializerConstantInitializer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test46");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence2 = charSequenceConstantInitializer1.getObject();
        boolean boolean4 = charSequenceConstantInitializer1.equals((java.lang.Object) ' ');
        java.lang.CharSequence charSequence5 = charSequenceConstantInitializer1.get();
        java.lang.Class<?> wildcardClass6 = charSequenceConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "" + "'", charSequence2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "" + "'", charSequence5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test47");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.String str2 = charSequenceConstantInitializer1.toString();
        boolean boolean4 = charSequenceConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.CharSequence charSequence5 = charSequenceConstantInitializer1.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>> charSequenceConcurrentInitializerConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.lang.CharSequence>) charSequenceConstantInitializer1);
        java.lang.Class<?> wildcardClass7 = charSequenceConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test48");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.String str2 = charSequenceConstantInitializer1.toString();
        boolean boolean4 = charSequenceConstantInitializer1.equals((java.lang.Object) "");
        java.lang.CharSequence charSequence5 = charSequenceConstantInitializer1.get();
        java.lang.CharSequence charSequence6 = charSequenceConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence5 + "' != '" + "hi!" + "'", charSequence5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence6 + "' != '" + "hi!" + "'", charSequence6.equals("hi!"));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test49");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) 10);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test50");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence2 = charSequenceConstantInitializer1.getObject();
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceConstantInitializer1.equals(obj3);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>> charSequenceConstantInitializerConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>>(charSequenceConstantInitializer1);
        java.lang.String str6 = charSequenceConstantInitializer1.toString();
        java.lang.CharSequence charSequence7 = charSequenceConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence7 + "' != '" + "hi!" + "'", charSequence7.equals("hi!"));
    }
}

