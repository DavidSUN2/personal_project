
package MutableObject;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableObject0 {

    public static boolean debug = false;

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test01");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass2 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test02");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.Class<?> wildcardClass1 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test04");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        strMutableObject1.setValue("");
        java.lang.Class<?> wildcardClass4 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test05");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>();
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test06");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) (short) -1);
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
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test07");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.String str4 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test08");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("null");
        java.lang.Class<?> wildcardClass3 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test09");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 100.0f);
        java.lang.String str6 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test10");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass4 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test11");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 10.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test12");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 10.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str7 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test13");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test14");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass3 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test15");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        strMutableObject1.setValue("");
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test16");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 10.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test17");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test18");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 10.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test19");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 10.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) 0);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject9 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test20");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test21");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test22");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.Class<?> wildcardClass3 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test23");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 10.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test24");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test25");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence> charSequenceMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence>();
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test26");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 10.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test27");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass5 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test28");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 10.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("");
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test29");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("null");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) strMutableObject0);
        java.lang.String str4 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test30");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        strMutableObject1.setValue("");
        strMutableObject1.setValue("");
        strMutableObject1.setValue("");
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test31");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test32");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence> charSequenceMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence>((java.lang.CharSequence) "null");
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test33");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.String str4 = strMutableObject0.toString();
        java.io.Serializable serializable5 = null;
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>(serializable5);
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) serializableMutableObject6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test34");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str4 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test35");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 10.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test36");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 10.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test37");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test38");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("null");
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test39");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type> typeMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type>();
        java.lang.Class<?> wildcardClass1 = typeMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test40");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 10.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.String str7 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test41");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        strMutableObject3.setValue("");
        strMutableObject3.setValue("");
        boolean boolean8 = strMutableObject1.equals((java.lang.Object) strMutableObject3);
        java.lang.String str9 = strMutableObject3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test42");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        strMutableObject1.setValue("");
        strMutableObject1.setValue("");
        java.lang.String str6 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test43");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test44");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass3 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test45");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test46");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("");
    }
}

