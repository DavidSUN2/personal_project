
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
            System.out.format("%n%s%n", "MutableObject0.test001");
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
            System.out.format("%n%s%n", "MutableObject0.test002");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.Class<?> wildcardClass1 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test004");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass3 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test005");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.Class<?> wildcardClass2 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test006");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.Class<?> wildcardClass4 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test007");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test008");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence> charSequenceMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence>(charSequence0);
        java.lang.Class<?> wildcardClass2 = charSequenceMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test009");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass5 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test010");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass5 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test011");
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>();
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test012");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        boolean boolean9 = strMutableObject0.equals((java.lang.Object) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test013");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test014");
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
            System.out.format("%n%s%n", "MutableObject0.test015");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test016");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test017");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass5 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test018");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test019");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test020");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test021");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 1L);
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test022");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>(obj0);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test023");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = strMutableObject0.equals(obj5);
        java.lang.String str7 = strMutableObject0.toString();
        boolean boolean9 = strMutableObject0.equals((java.lang.Object) 0);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test024");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("null");
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test025");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>();
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test026");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        java.lang.Class<?> wildcardClass5 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test027");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test028");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>();
        boolean boolean9 = strMutableObject0.equals((java.lang.Object) genericDeclarationMutableObject8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test029");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = strMutableObject0.equals(obj5);
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test030");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test031");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test032");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) false);
        java.lang.Class<?> wildcardClass2 = objMutableObject1.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = genericDeclarationMutableObject3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test033");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test034");
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
            System.out.format("%n%s%n", "MutableObject0.test035");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.Class<?> wildcardClass2 = strMutableObject1.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = annotatedElementMutableObject3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test036");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test037");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test038");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass4 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test039");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence> charSequenceMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass1 = charSequenceMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test040");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test041");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("null");
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test042");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        strMutableObject0.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test043");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = strMutableObject0.equals(obj6);
        strMutableObject0.setValue("null");
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
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test044");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test045");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>> strComparableMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>>();
        java.lang.Class<?> wildcardClass1 = strComparableMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test046");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = strMutableObject0.equals(obj5);
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test047");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        java.lang.String str5 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>> strComparableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "null");
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) "null");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject9 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) "null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test048");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.Class<?> wildcardClass2 = strMutableObject1.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass2);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type> typeMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = typeMutableObject4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test049");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.Class<?> wildcardClass3 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test050");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str5 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test051");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test052");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        java.lang.String str5 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>> strComparableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "null");
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) "null");
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test053");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>(strMutableObject0);
        strMutableObject0.setValue("");
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test054");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = strMutableObject0.equals(obj6);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test055");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = strMutableObject0.equals(obj5);
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject9 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test056");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>(strMutableObject0);
        strMutableObject0.setValue("");
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test057");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test058");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 0.0d);
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test059");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>();
        java.lang.Class<?> wildcardClass1 = annotatedElementMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test060");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
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
            System.out.format("%n%s%n", "MutableObject0.test061");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test062");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        java.lang.String str2 = strMutableObject1.getValue();
        strMutableObject1.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test063");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        strMutableObject1.setValue("");
        java.lang.String str7 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test064");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test065");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.Class<?> wildcardClass4 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test066");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test067");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("hi!");
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test068");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test069");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.String str2 = strMutableObject1.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>();
        boolean boolean4 = strMutableObject1.equals((java.lang.Object) genericDeclarationMutableObject3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test070");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str8 = strMutableObject0.getValue();
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test071");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        java.lang.String str5 = strMutableObject1.toString();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str8 = strMutableObject7.toString();
        boolean boolean9 = strMutableObject1.equals((java.lang.Object) str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test072");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test073");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>> strComparableMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass2 = strComparableMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test074");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test075");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("");
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
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test076");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) strMutableObject6);
        java.lang.String str8 = strMutableObject6.toString();
        java.lang.Class<?> wildcardClass9 = strMutableObject6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test077");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test078");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject4.setValue("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = strMutableObject0.equals((java.lang.Object) strMutableObject4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test079");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        strMutableObject1.setValue("");
        strMutableObject1.setValue("hi!");
        java.lang.String str9 = strMutableObject1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test080");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>(strMutableObject0);
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test081");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test082");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test083");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.getValue();
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) 100L);
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject9 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test084");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
            System.out.format("%n%s%n", "MutableObject0.test085");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.String str3 = strMutableObject1.getValue();
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test086");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        java.lang.String str5 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>> strComparableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "null");
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) "null");
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test087");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 0.0d);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test088");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>> strComparableMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "null");
        java.lang.Class<?> wildcardClass2 = strComparableMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test089");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test090");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) true);
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test091");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        java.lang.Class<?> wildcardClass5 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test092");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str9 = strMutableObject0.getValue();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test093");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test094");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>();
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test095");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass5 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test096");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("");
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test097");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test098");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test099");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass4 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test100");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        strMutableObject1.setValue("");
        java.lang.String str7 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test101");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("");
        boolean boolean9 = strMutableObject0.equals((java.lang.Object) (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test102");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.Class<?> wildcardClass4 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test103");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean6 = strMutableObject4.equals((java.lang.Object) 100.0d);
        java.lang.String str7 = strMutableObject4.toString();
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) strMutableObject4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test104");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test105");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>(serializable0);
        java.lang.Class<?> wildcardClass2 = serializableMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test106");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject5 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str6 = strMutableObject5.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = strMutableObject5.equals(obj7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = strMutableObject0.equals((java.lang.Object) strMutableObject5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test107");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test108");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        java.lang.String str5 = strMutableObject1.getValue();
        java.lang.Class<?> wildcardClass6 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test109");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test110");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence> charSequenceMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence>((java.lang.CharSequence) "null");
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test111");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.Object obj7 = null;
        boolean boolean8 = strMutableObject0.equals(obj7);
        java.lang.String str9 = strMutableObject0.getValue();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test112");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 1L);
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) (byte) 0);
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test113");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.Class<?> wildcardClass3 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test114");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test115");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass4 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test116");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("hi!");
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test117");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str8 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test118");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test119");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 1L);
        strMutableObject0.setValue("hi!");
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test120");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test121");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test122");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test123");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        java.lang.String str5 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test124");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = strMutableObject0.equals(obj5);
        java.lang.String str7 = strMutableObject0.toString();
        boolean boolean9 = strMutableObject0.equals((java.lang.Object) (short) 10);
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test125");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = strMutableObject0.equals(obj5);
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.getValue();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test126");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test127");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test128");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test129");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        strMutableObject1.setValue("");
        java.lang.String str7 = strMutableObject1.toString();
        java.lang.Class<?> wildcardClass8 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test130");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test131");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test132");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 1L);
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test133");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.Class<?> wildcardClass3 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test134");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
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
        org.junit.Assert.assertNull(str4);
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test135");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 1.0d);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = strMutableObject0.equals((java.lang.Object) strMutableObject8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test136");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.toString();
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
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test137");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 1L);
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test138");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 0L);
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) 0.0d);
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test139");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 0.0d);
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test140");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("");
        strMutableObject0.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test141");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str7 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test142");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) str7);
        java.lang.Class<?> wildcardClass9 = objMutableObject8.getClass();
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test143");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("");
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test144");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test145");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("");
        java.lang.String str8 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test146");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 0.0d);
        java.lang.String str7 = strMutableObject0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test147");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.toString();
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test148");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) strMutableObject6);
        java.lang.String str8 = strMutableObject6.getValue();
        java.lang.String str9 = strMutableObject6.toString();
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test149");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test150");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.getValue();
        java.lang.String str2 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test151");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.Object obj5 = null;
        boolean boolean6 = strMutableObject0.equals(obj5);
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test152");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.getValue();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 10);
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test153");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.Class<?> wildcardClass2 = strMutableObject1.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test154");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test155");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.toString();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test156");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test157");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test158");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("null");
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test159");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        strMutableObject1.setValue("");
        java.lang.String str7 = strMutableObject1.toString();
        strMutableObject1.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test160");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test161");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.toString();
        java.lang.Class<?> wildcardClass4 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test162");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("null");
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test163");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>(strMutableObject1);
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>((java.io.Serializable) strMutableObject1);
        strMutableObject1.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test164");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test165");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test166");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = annotatedElementMutableObject7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test167");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        java.lang.String str5 = strMutableObject1.toString();
        java.lang.String str6 = strMutableObject1.getValue();
        java.lang.String str7 = strMutableObject1.getValue();
        java.lang.Class<?> wildcardClass8 = strMutableObject1.getClass();
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test168");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("null");
        java.lang.Class<?> wildcardClass3 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test169");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 1L);
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test170");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test171");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) "hi!");
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test172");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test173");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test174");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test175");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.String str3 = strMutableObject1.getValue();
        strMutableObject1.setValue("hi!");
        java.lang.Class<?> wildcardClass6 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test176");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass5 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test177");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("hi!");
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject9 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test178");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass4 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test179");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test180");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = strMutableObject0.equals(obj5);
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test181");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = strMutableObject0.equals(obj6);
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test182");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test183");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test184");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass5 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test185");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test186");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = strMutableObject0.equals(obj5);
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
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
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test187");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        boolean boolean6 = strMutableObject1.equals((java.lang.Object) 0L);
        java.lang.String str7 = strMutableObject1.getValue();
        java.lang.String str8 = strMutableObject1.getValue();
        java.lang.String str9 = strMutableObject1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
            System.out.format("%n%s%n", "MutableObject0.test188");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test189");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass5 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test190");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test191");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test192");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test193");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>(strMutableObject1);
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>((java.io.Serializable) strMutableObject1);
        java.lang.Class<?> wildcardClass8 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test194");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("null");
        java.lang.String str8 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test195");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test196");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("");
        strMutableObject0.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test197");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test198");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>(strMutableObject1);
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>((java.io.Serializable) strMutableObject1);
        strMutableObject1.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test199");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = strMutableObject0.equals(obj6);
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test200");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 0.0d);
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) 10.0f);
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test201");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.getValue();
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test202");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test203");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test204");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>();
        java.lang.Class<?> wildcardClass1 = strMutableMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test205");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
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
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test206");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        java.lang.String str5 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test207");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) (byte) 100);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        boolean boolean9 = strMutableObject0.equals((java.lang.Object) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test208");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test209");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass3 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test210");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test211");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("null");
        java.lang.Class<?> wildcardClass3 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test212");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test213");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.getValue();
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test214");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test215");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test216");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test217");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        strMutableObject0.setValue("");
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
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test218");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        strMutableObject1.setValue("");
        java.lang.String str6 = strMutableObject1.toString();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Class<?>> wildcardClassMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Class<?>>();
        boolean boolean8 = strMutableObject1.equals((java.lang.Object) wildcardClassMutableObject7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test219");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        strMutableObject1.setValue("");
        strMutableObject1.setValue("hi!");
        java.lang.Class<?> wildcardClass9 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test220");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 10.0f);
        strMutableObject0.setValue("hi!");
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test221");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.Object obj7 = null;
        boolean boolean8 = strMutableObject0.equals(obj7);
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test222");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.getValue();
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
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test223");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test224");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test225");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test226");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("");
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test227");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) 1.0f);
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test228");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass6);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6);
        java.lang.Class<?> wildcardClass9 = genericDeclarationMutableObject8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test229");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test230");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>(strMutableObject0);
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test231");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test232");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("hi!");
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.getValue();
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
            System.out.format("%n%s%n", "MutableObject0.test233");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("null");
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test234");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("null");
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test235");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.Object obj7 = null;
        boolean boolean8 = strMutableObject0.equals(obj7);
        java.lang.String str9 = strMutableObject0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test236");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 1L);
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test237");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 1L);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) boolean5);
        java.lang.Class<?> wildcardClass7 = objMutableObject6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test238");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test239");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.getValue();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 10);
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>((java.io.Serializable) strMutableObject0);
        java.lang.Class<?> wildcardClass9 = serializableMutableObject8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test240");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test241");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test242");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test243");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        java.lang.Class<?> wildcardClass5 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass5);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type> typeMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test244");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test245");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = strMutableObject0.equals(obj5);
        java.lang.String str7 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
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
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test246");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>(strMutableObject0);
        java.lang.Class<?> wildcardClass7 = strMutableObjectMutableObject6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test247");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject5 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test248");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test249");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        java.lang.String str5 = strMutableObject1.toString();
        java.lang.String str6 = strMutableObject1.toString();
        java.lang.String str7 = strMutableObject1.getValue();
        java.lang.Class<?> wildcardClass8 = strMutableObject1.getClass();
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test250");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 1L);
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test251");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test252");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test253");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>();
        java.lang.Class<?> wildcardClass1 = genericDeclarationMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject2 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) genericDeclarationMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test254");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("");
        java.lang.String str7 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test255");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        java.lang.String str5 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test256");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) 1.0f);
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>(strMutableObject0);
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test257");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str6 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test258");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("null");
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test259");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 0.0d);
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test260");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        java.lang.String str5 = strMutableObject1.toString();
        java.lang.String str6 = strMutableObject1.getValue();
        strMutableObject1.setValue("");
        java.lang.Class<?> wildcardClass9 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test261");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test262");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        java.lang.String str6 = strMutableObject1.getValue();
        strMutableObject1.setValue("null");
        java.lang.String str9 = strMutableObject1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test263");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.Object obj5 = null;
        boolean boolean6 = strMutableObject0.equals(obj5);
        java.lang.String str7 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test264");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.Class<?> wildcardClass3 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test265");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        java.lang.String str5 = strMutableObject1.toString();
        java.lang.String str6 = strMutableObject1.getValue();
        java.lang.String str7 = strMutableObject1.getValue();
        java.lang.String str8 = strMutableObject1.getValue();
        java.lang.String str9 = strMutableObject1.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test266");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.getValue();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 10);
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test267");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 10.0f);
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test268");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test269");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test270");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) "hi!");
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test271");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.toString();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test272");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
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
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test273");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.String str3 = strMutableObject1.getValue();
        strMutableObject1.setValue("null");
        strMutableObject1.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test274");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        boolean boolean7 = strMutableObject1.equals((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass8 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test275");
        org.apache.commons.lang3.mutable.Mutable<java.lang.String> strMutable0 = null;
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>(strMutable0);
        java.lang.Class<?> wildcardClass2 = strMutableMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test276");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = strMutableObject0.equals(obj7);
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test277");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        boolean boolean6 = strMutableObject1.equals((java.lang.Object) 0L);
        java.lang.String str7 = strMutableObject1.toString();
        boolean boolean9 = strMutableObject1.equals((java.lang.Object) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test278");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        strMutableObject1.setValue("null");
        strMutableObject1.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test279");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str8 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test280");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test281");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test282");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject5 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        java.lang.Class<?> wildcardClass6 = strMutableMutableObject5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test283");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test284");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 1L);
        strMutableObject0.setValue("hi!");
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test285");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 0L);
        java.lang.String str7 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>(strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test286");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test287");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test288");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type> typeMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type>();
        java.lang.Class<?> wildcardClass1 = typeMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test289");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        strMutableObject1.setValue("");
        java.lang.String str7 = strMutableObject1.getValue();
        java.lang.Class<?> wildcardClass8 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test290");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        java.lang.String str5 = strMutableObject1.toString();
        java.lang.String str6 = strMutableObject1.getValue();
        strMutableObject1.setValue("");
        java.lang.String str9 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test291");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.Object obj7 = null;
        boolean boolean8 = strMutableObject0.equals(obj7);
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test292");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test293");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test294");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test295");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.getValue();
        strMutableObject1.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test296");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test297");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) strMutableObject6);
        java.lang.String str8 = strMutableObject6.getValue();
        java.lang.String str9 = strMutableObject6.getValue();
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test298");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        java.lang.String str5 = strMutableObject1.toString();
        java.lang.Class<?> wildcardClass6 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test299");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>((java.io.Serializable) strMutableObject0);
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test300");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.getValue();
        strMutableObject1.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test301");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.getValue();
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
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test302");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test303");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test304");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
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
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test305");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) "hi!");
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test306");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        boolean boolean6 = strMutableObject1.equals((java.lang.Object) 0L);
        java.lang.String str7 = strMutableObject1.getValue();
        java.lang.String str8 = strMutableObject1.getValue();
        java.lang.Class<?> wildcardClass9 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test307");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test308");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.getValue();
        strMutableObject1.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test309");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>((java.io.Serializable) strMutableObject0);
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test310");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        java.lang.Class<?> wildcardClass8 = strMutableMutableObject7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test311");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("");
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test312");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = strMutableObject0.equals(obj5);
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.toString();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test313");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.getValue();
        java.lang.Object obj4 = null;
        boolean boolean5 = strMutableObject1.equals(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test314");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence> charSequenceMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass2 = charSequenceMutableObject1.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test315");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
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
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test316");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.getValue();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 10);
        java.lang.String str6 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test317");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str6 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        java.lang.String str8 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test318");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test319");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test320");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.String str3 = strMutableObject1.getValue();
        java.lang.String str4 = strMutableObject1.getValue();
        strMutableObject1.setValue("null");
        strMutableObject1.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test321");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        java.lang.String str5 = strMutableObject1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test322");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.getValue();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 10);
        strMutableObject0.setValue("");
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test323");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test324");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test325");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 1L);
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) (byte) 0);
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test326");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str5 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        java.lang.String str8 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test327");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        strMutableObject0.setValue("null");
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test328");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type> typeMutableObject9 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test329");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 0L);
        boolean boolean8 = strMutableObject0.equals((java.lang.Object) 0.0d);
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test330");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        boolean boolean6 = strMutableObject1.equals((java.lang.Object) 0L);
        java.lang.String str7 = strMutableObject1.getValue();
        java.lang.String str8 = strMutableObject1.getValue();
        java.lang.String str9 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
            System.out.format("%n%s%n", "MutableObject0.test331");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test332");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        strMutableObject1.setValue("");
        java.lang.String str6 = strMutableObject1.getValue();
        java.lang.String str7 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test333");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        strMutableObject1.setValue("");
        java.lang.String str7 = strMutableObject1.toString();
        java.lang.String str8 = strMutableObject1.toString();
        java.lang.Class<?> wildcardClass9 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test334");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = strMutableObject0.equals(obj6);
        java.lang.String str8 = strMutableObject0.getValue();
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
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test335");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 1L);
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test336");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str8 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject9 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test337");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("hi!");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject9 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test338");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        java.lang.String str5 = strMutableObject1.getValue();
        java.lang.String str6 = strMutableObject1.getValue();
        java.lang.Object obj7 = null;
        boolean boolean8 = strMutableObject1.equals(obj7);
        java.lang.String str9 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test339");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test340");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("null");
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test341");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 1L);
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test342");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        boolean boolean6 = strMutableObject1.equals((java.lang.Object) 0L);
        java.lang.String str7 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test343");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 0L);
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test344");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test345");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = strMutableObject0.equals(obj6);
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test346");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = strMutableObject0.equals(obj6);
        strMutableObject0.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test347");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("null");
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test348");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>> strComparableMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>>(strComparable0);
        java.lang.Class<?> wildcardClass2 = strComparableMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test349");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) "null");
        java.lang.Class<?> wildcardClass7 = objMutableObject6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test350");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test351");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test352");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test353");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test354");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test355");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.Object obj5 = null;
        boolean boolean6 = strMutableObject0.equals(obj5);
        strMutableObject0.setValue("");
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test356");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.getValue();
        java.lang.String str6 = strMutableObject1.getValue();
        java.lang.String str7 = strMutableObject1.toString();
        strMutableObject1.setValue("hi!");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test357");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
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
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test358");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        java.lang.String str6 = strMutableObject1.getValue();
        strMutableObject1.setValue("null");
        java.lang.String str9 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test359");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test360");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) strMutableObject6);
        java.lang.String str8 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject9 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test361");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test362");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) (byte) 100);
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test363");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test364");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test365");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        strMutableObject1.setValue("");
        java.lang.String str7 = strMutableObject1.toString();
        java.lang.String str8 = strMutableObject1.getValue();
        java.lang.String str9 = strMutableObject1.getValue();
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test366");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("hi!");
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test367");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        strMutableObject1.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test368");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        boolean boolean6 = strMutableObject1.equals((java.lang.Object) 0L);
        java.lang.String str7 = strMutableObject1.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test369");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.toString();
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test370");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.getValue();
        java.lang.String str6 = strMutableObject1.getValue();
        strMutableObject1.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test371");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        java.lang.Class<?> wildcardClass6 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test372");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str7 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test373");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("");
        java.lang.String str5 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test374");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test375");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) strMutableObject6);
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test376");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str7 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test377");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test378");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("");
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test379");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = strMutableObject0.equals(obj6);
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test380");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass5 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test381");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test382");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) (byte) 100);
        java.lang.String str7 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test383");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test384");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test385");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 1L);
        java.lang.String str6 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test386");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str8 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test387");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.String str3 = strMutableObject1.getValue();
        strMutableObject1.setValue("null");
        strMutableObject1.setValue("hi!");
        java.lang.String str8 = strMutableObject1.toString();
        java.lang.Class<?> wildcardClass9 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test388");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("hi!");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject9 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>(strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test389");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test390");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        java.lang.String str6 = strMutableObject1.getValue();
        strMutableObject1.setValue("null");
        java.lang.Class<?> wildcardClass9 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test391");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test392");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.String str8 = strMutableObject0.getValue();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test393");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test394");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.getValue();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 10);
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test395");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.String str3 = strMutableObject1.getValue();
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.toString();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test396");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        java.lang.Class<?> wildcardClass5 = strMutableMutableObject4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test397");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("hi!");
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test398");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass2 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test399");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) (byte) 100);
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test400");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass5 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test401");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test402");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) strMutableObject6);
        java.lang.String str8 = strMutableObject0.getValue();
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test403");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.Class<?> wildcardClass5 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test404");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test405");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        strMutableObject0.setValue("");
        java.lang.String str7 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test406");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass5 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) wildcardClass5);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test407");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test408");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test409");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test410");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test411");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("");
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test412");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.toString();
        java.lang.String str4 = strMutableObject1.getValue();
        java.lang.String str5 = strMutableObject1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test413");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test414");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test415");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.Object obj8 = null;
        boolean boolean9 = strMutableObject0.equals(obj8);
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test416");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test417");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        boolean boolean6 = strMutableObject1.equals((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass7 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test418");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str7 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test419");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str7 = strMutableObject6.toString();
        boolean boolean8 = strMutableObject1.equals((java.lang.Object) strMutableObject6);
        java.lang.String str9 = strMutableObject6.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test420");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str8 = strMutableObject0.getValue();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test421");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("");
        strMutableObject0.setValue("");
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test422");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        java.lang.Class<?> wildcardClass5 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test423");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
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
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test424");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test425");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>();
        boolean boolean9 = strMutableObject0.equals((java.lang.Object) genericDeclarationMutableObject8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test426");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.getValue();
        java.lang.String str5 = strMutableObject1.toString();
        java.lang.String str6 = strMutableObject1.getValue();
        java.lang.String str7 = strMutableObject1.getValue();
        java.lang.String str8 = strMutableObject1.toString();
        java.lang.String str9 = strMutableObject1.getValue();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test427");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) false);
        java.lang.Class<?> wildcardClass2 = objMutableObject1.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass2);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type> typeMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test428");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test429");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str7 = strMutableObject6.toString();
        boolean boolean8 = strMutableObject1.equals((java.lang.Object) strMutableObject6);
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject9 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>((java.io.Serializable) strMutableObject6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test430");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        java.lang.String str8 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test431");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("hi!");
        java.lang.Class<?> wildcardClass5 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass5);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test432");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 10.0f);
        strMutableObject0.setValue("hi!");
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test433");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test434");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("hi!");
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 10.0f);
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
            System.out.format("%n%s%n", "MutableObject0.test435");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test436");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test437");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.getValue();
        java.lang.Class<?> wildcardClass6 = strMutableObject1.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test438");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test439");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.String str8 = strMutableObject0.getValue();
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test440");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.String str3 = strMutableObject1.toString();
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test441");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        java.lang.String str5 = strMutableObject1.toString();
        java.lang.String str6 = strMutableObject1.getValue();
        java.lang.String str7 = strMutableObject1.toString();
        java.lang.String str8 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test442");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.String str3 = strMutableObject1.toString();
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.toString();
        strMutableObject1.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test443");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test444");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test445");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.Object obj7 = null;
        boolean boolean8 = strMutableObject0.equals(obj7);
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test446");
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
            System.out.format("%n%s%n", "MutableObject0.test447");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test448");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test449");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test450");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test451");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("");
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test452");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.getValue();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test453");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = strMutableObject0.equals(obj6);
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test454");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("hi!");
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass6 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test455");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test456");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test457");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test458");
        java.lang.reflect.AnnotatedElement annotatedElement0 = null;
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>(annotatedElement0);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test459");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("hi!");
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test460");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test461");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        strMutableObject0.setValue("");
        java.lang.String str6 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test462");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.getValue();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test463");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test464");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 0L);
        java.lang.String str7 = strMutableObject0.getValue();
        strMutableObject0.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test465");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        java.lang.String str7 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test466");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        boolean boolean5 = strMutableObject0.equals((java.lang.Object) 1L);
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>(strMutableObject0);
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test467");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
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
            System.out.format("%n%s%n", "MutableObject0.test468");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject5 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test469");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.getValue();
        java.lang.String str6 = strMutableObject1.getValue();
        java.lang.String str7 = strMutableObject1.toString();
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test470");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test471");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test472");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        strMutableObject1.setValue("");
        java.lang.String str6 = strMutableObject1.getValue();
        java.lang.String str7 = strMutableObject1.getValue();
        strMutableObject1.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test473");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        java.lang.String str5 = strMutableObject1.toString();
        java.lang.String str6 = strMutableObject1.toString();
        java.lang.String str7 = strMutableObject1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
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
            System.out.format("%n%s%n", "MutableObject0.test474");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        java.lang.Object obj7 = null;
        boolean boolean8 = strMutableObject0.equals(obj7);
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test475");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test476");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str4 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        boolean boolean7 = strMutableObject0.equals((java.lang.Object) strMutableObject6);
        java.lang.String str8 = strMutableObject6.toString();
        java.lang.String str9 = strMutableObject6.getValue();
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test477");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test478");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.String str3 = strMutableObject1.toString();
        java.lang.String str4 = strMutableObject1.toString();
        java.lang.String str5 = strMutableObject1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test479");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.getValue();
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 0.0d);
        java.lang.String str7 = strMutableObject0.toString();
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test480");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("null");
        java.lang.String str5 = strMutableObject1.getValue();
        java.lang.String str6 = strMutableObject1.getValue();
        java.lang.String str7 = strMutableObject1.toString();
        java.lang.Class<?> wildcardClass8 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test481");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        strMutableObject0.setValue("null");
        java.lang.String str5 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test482");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        java.lang.Class<?> wildcardClass9 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test483");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>> strComparableMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass2 = strComparableMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test484");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test485");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test486");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass5 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test487");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test488");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject5 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        java.lang.Object obj6 = null;
        boolean boolean7 = strMutableObject0.equals(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test489");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("");
        java.lang.String str6 = strMutableObject0.toString();
        strMutableObject0.setValue("");
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test490");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.String str5 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test491");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.toString();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test492");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>(strMutableObject1);
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>((java.io.Serializable) strMutableObject1);
        java.lang.String str8 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test493");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        strMutableObject1.setValue("");
        strMutableObject1.setValue("");
        java.lang.String str8 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test494");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 1.0d);
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test495");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.toString();
        java.lang.String str6 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject7 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>((java.io.Serializable) strMutableObject0);
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test496");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass3 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test497");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.getValue();
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject5 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        strMutableObject0.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test498");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        java.lang.String str4 = strMutableObject0.getValue();
        java.lang.String str5 = strMutableObject0.getValue();
        java.lang.String str6 = strMutableObject0.toString();
        java.lang.String str7 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test499");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.toString();
        java.lang.String str4 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass8 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.test500");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.String str3 = strMutableObject0.getValue();
        java.lang.String str4 = strMutableObject0.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = strMutableObject0.equals(obj5);
        java.lang.String str7 = strMutableObject0.getValue();
        java.lang.String str8 = strMutableObject0.toString();
        java.lang.String str9 = strMutableObject0.toString();
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
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null" + "'", str9.equals("null"));
    }
}

