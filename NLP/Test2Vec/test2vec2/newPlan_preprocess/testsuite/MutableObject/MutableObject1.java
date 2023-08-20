package MutableObject;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableObject1 {

    public static boolean debug = false;

    @Test
    public void MutableObject501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject501");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str7 = strMutableObject6.toString();
        boolean boolean8 = strMutableObject1.equals((java.lang.Object) strMutableObject6);
        java.lang.Class<?> wildcardClass9 = strMutableObject6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject502");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.toString();
        java.lang.String str3 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void MutableObject503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject503");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.getValue();
        java.lang.String str6 = strMutableObject1.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>((java.io.Serializable) strMutableObject1);
        java.lang.Class<?> wildcardClass8 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject504");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.getValue();
        java.lang.String str6 = strMutableObject1.getValue();
        java.lang.Class<?> wildcardClass7 = strMutableObject1.getClass();
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
    public void MutableObject505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject505");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject506");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        java.lang.Class<?> wildcardClass5 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject507");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        strMutableObject1.setValue("null");
        java.lang.String str4 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
    }

    @Test
    public void MutableObject508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject508");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject509");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void MutableObject510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject510");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.String str3 = strMutableObject1.toString();
        java.lang.String str4 = strMutableObject1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void MutableObject511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject511");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        java.lang.String str5 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableObject512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject512");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.Class<?> wildcardClass3 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject513");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.Object obj5 = null;
        boolean boolean6 = strMutableObject0.equals(obj5);
        java.lang.String str7 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void MutableObject514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject514");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        java.lang.Class<?> wildcardClass9 = strMutableMutableObject8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject515");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.getValue();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject516");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        java.lang.String str5 = strMutableObject1.toString();
        java.lang.String str6 = strMutableObject1.toString();
        java.lang.String str7 = strMutableObject1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
    }

    @Test
    public void MutableObject517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject517");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        java.lang.String str6 = strMutableObject1.getValue();
        java.lang.Class<?> wildcardClass7 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject518");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str5 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type> typeMutableObject9 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject519");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.getValue();
        java.lang.String str6 = strMutableObject1.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>((java.io.Serializable) strMutableObject1);
        strMutableObject1.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void MutableObject520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject520");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.toString();
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void MutableObject521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject521");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = strMutableObject0.equals(obj6);
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject522");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        strMutableObject1.setValue("");
        java.lang.String str7 = strMutableObject1.toString();
        java.lang.String str8 = strMutableObject1.getValue();
        java.lang.String str9 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject523");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) (byte) 100);
        java.lang.String str7 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>(strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableObject524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject524");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) strMutableObject6);
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject525");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject526");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("");
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject527");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("");
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
    }

    @Test
    public void MutableObject528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject528");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void MutableObject529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject529");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject530");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.getValue();
        java.lang.String str6 = strMutableObject1.toString();
        java.lang.String str7 = strMutableObject1.getValue();
        java.lang.String str8 = strMutableObject1.getValue();
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
    public void MutableObject531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject531");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) 10L);
    }

    @Test
    public void MutableObject532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject532");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        strMutableObject1.setValue("");
        strMutableObject1.setValue("");
        java.lang.String str8 = strMutableObject1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject533");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass5 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject534");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject535");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("");
        java.lang.String str8 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject536");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void MutableObject537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject537");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str7 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject538");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.getValue();
        java.lang.String str6 = strMutableObject1.toString();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        boolean boolean9 = strMutableObject1.equals((java.lang.Object) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableObject539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject539");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void MutableObject540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject540");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) "hi!");
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>((java.io.Serializable) "hi!");
        java.lang.Class<?> wildcardClass9 = serializableMutableObject8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject541");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject5 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void MutableObject542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject542");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str6 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        java.lang.String str8 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject543");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("null");
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>(strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
    }

    @Test
    public void MutableObject544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject544");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("");
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject545");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type> typeMutableObject9 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject546");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        java.lang.Object obj5 = null;
        boolean boolean6 = strMutableObject0.equals(obj5);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type> typeMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type>();
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) typeMutableObject7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableObject547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject547");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        java.lang.Object obj5 = null;
        boolean boolean6 = strMutableObject0.equals(obj5);
        strMutableObject0.setValue("");
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject548");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass6);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type> typeMutableObject9 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject549");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void MutableObject550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject550");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass5 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject551");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>(strMutableObject1);
        java.lang.String str7 = strMutableObject1.getValue();
        strMutableObject1.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject552");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.getValue();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 10);
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject553");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str6 = strMutableObject0.toString();
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableObject554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject554");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        java.lang.String str6 = strMutableObject1.toString();
        java.lang.Class<?> wildcardClass7 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject555");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>(strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
    }

    @Test
    public void MutableObject556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject556");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject557");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
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
    public void MutableObject558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject558");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.Object obj8 = null;
        boolean boolean9 = strMutableObject0.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableObject559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject559");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.String str3 = strMutableObject1.getValue();
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.Class<?> wildcardClass5 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject560");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject561");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("");
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
    }

    @Test
    public void MutableObject562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject562");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject563");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = strMutableObject0.equals(obj7);
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject564");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = strMutableObject0.equals(obj5);
        strMutableObject0.setValue("");
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject565");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence> charSequenceMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass2 = charSequenceMutableObject1.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject566");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
    }

    @Test
    public void MutableObject567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject567");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        strMutableObject1.setValue("");
        java.lang.String str7 = strMutableObject1.toString();
        java.lang.String str8 = strMutableObject1.toString();
        java.lang.Class<?> wildcardClass9 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject568");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) 1.0f);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableObject569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject569");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        java.lang.String str5 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableObject570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject570");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        java.lang.String str5 = strMutableObject1.toString();
        java.lang.String str6 = strMutableObject1.toString();
        java.lang.String str7 = strMutableObject1.getValue();
        strMutableObject1.setValue("null");
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
    public void MutableObject571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject571");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void MutableObject572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject572");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void MutableObject573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject573");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("null");
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject574");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableObject575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject575");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str7 = strMutableObject6.toString();
        boolean boolean8 = strMutableObject1.equals((java.lang.Object) strMutableObject6);
        java.lang.Class<?> wildcardClass9 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject576");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("");
        java.lang.String str8 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject9 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject577");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void MutableObject578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject578");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.getValue();
        java.lang.String str4 = strMutableObject1.getValue();
        java.lang.Class<?> wildcardClass5 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject579");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.String str3 = strMutableObject1.toString();
        strMutableObject1.setValue("hi!");
        java.lang.String str6 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void MutableObject580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject580");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.getValue();
        strMutableObject1.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void MutableObject581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject581");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.getValue();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject582");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.getValue();
        java.lang.String str6 = strMutableObject1.toString();
        java.lang.String str7 = strMutableObject1.toString();
        java.lang.String str8 = strMutableObject1.getValue();
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
    public void MutableObject583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject583");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.String str3 = strMutableObject1.getValue();
        java.lang.String str4 = strMutableObject1.getValue();
        strMutableObject1.setValue("null");
        strMutableObject1.setValue("null");
        java.lang.String str9 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject584");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str8 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
    }

    @Test
    public void MutableObject585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject585");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
    }

    @Test
    public void MutableObject586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject586");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("null");
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str6 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void MutableObject587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject587");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.toString();
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
    public void MutableObject588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject588");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        java.lang.String str7 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableObject589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject589");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void MutableObject590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject590");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject591");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.getValue();
        java.lang.String str6 = strMutableObject1.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>((java.io.Serializable) strMutableObject1);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) strMutableObject1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void MutableObject592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject592");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("hi!");
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableObject593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject593");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence> charSequenceMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence>((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass2 = charSequenceMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject594");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        strMutableObject1.setValue("");
        strMutableObject1.setValue("hi!");
        java.lang.Class<?> wildcardClass9 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject595");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject596");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        java.lang.String str5 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void MutableObject597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject597");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void MutableObject598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject598");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.String str3 = strMutableObject1.getValue();
        strMutableObject1.setValue("null");
        java.lang.String str6 = strMutableObject1.toString();
        java.lang.Class<?> wildcardClass7 = strMutableObject1.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = annotatedElementMutableObject8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject599");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject600");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.String str3 = strMutableObject1.getValue();
        java.lang.String str4 = strMutableObject1.getValue();
        strMutableObject1.setValue("null");
        java.lang.String str7 = strMutableObject1.getValue();
        strMutableObject1.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
    }

    @Test
    public void MutableObject601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject601");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        boolean boolean9 = strMutableObject0.equals((java.lang.Object) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableObject602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject602");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass5 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject603");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.String str2 = strMutableObject1.getValue();
        strMutableObject1.setValue("");
        java.lang.Class<?> wildcardClass5 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject604");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.String str3 = strMutableObject1.getValue();
        strMutableObject1.setValue("null");
        java.lang.String str6 = strMutableObject1.toString();
        java.lang.String str7 = strMutableObject1.toString();
        java.lang.Class<?> wildcardClass8 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject605");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 1L);
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void MutableObject606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject606");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
    }

    @Test
    public void MutableObject607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject607");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void MutableObject608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject608");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void MutableObject609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject609");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        strMutableObject1.setValue("");
        strMutableObject1.setValue("hi!");
        java.lang.String str9 = strMutableObject1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject610");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.String str3 = strMutableObject1.getValue();
        java.lang.String str4 = strMutableObject1.getValue();
        strMutableObject1.setValue("null");
        java.lang.String str7 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
    }

    @Test
    public void MutableObject611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject611");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("hi!");
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void MutableObject612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject612");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void MutableObject613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject613");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str7 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject614");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        java.lang.String str5 = strMutableObject1.toString();
        java.lang.String str6 = strMutableObject1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
    }

    @Test
    public void MutableObject615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject615");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject616");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject617");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        java.lang.String str5 = strMutableObject1.getValue();
        java.lang.String str6 = strMutableObject1.getValue();
        strMutableObject1.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void MutableObject618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject618");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject619");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        java.lang.String str5 = strMutableObject1.getValue();
        java.lang.String str6 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
    }

    @Test
    public void MutableObject620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject620");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("");
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject621");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.Object obj8 = null;
        boolean boolean9 = strMutableObject0.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableObject622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject622");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject623");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject624");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        java.lang.String str5 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableObject625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject625");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
    }

    @Test
    public void MutableObject626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject626");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        java.lang.String str6 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void MutableObject627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject627");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>(strMutableObject1);
        strMutableObject1.setValue("");
        java.lang.String str9 = strMutableObject1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.MutableObject628");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        strMutableObject1.setValue("");
        java.lang.String str7 = strMutableObject1.toString();
        java.lang.String str8 = strMutableObject1.getValue();
        java.lang.String str9 = strMutableObject1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }
}

