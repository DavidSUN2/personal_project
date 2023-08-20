package MutableObject;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableObject0 {

    public static boolean debug = false;

    @Test
    public void MutableObject001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject001");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Class<?> wildcardClass2 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject002");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.Class<?> wildcardClass1 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableObject003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableObject004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject004");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        boolean boolean2 = strMutableObject0.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass3 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject005");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.Class<?> wildcardClass2 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject006");
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
    public void MutableObject007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject007");
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
    public void MutableObject008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject008");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence> charSequenceMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence>(charSequence0);
        java.lang.Class<?> wildcardClass2 = charSequenceMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject009");
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
    public void MutableObject010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject010");
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
    public void MutableObject011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject011");
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>();
    }

    @Test
    public void MutableObject012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject012");
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
    public void MutableObject013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject013");
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
    public void MutableObject014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject014");
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
    public void MutableObject015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject015");
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
    public void MutableObject016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject016");
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
    public void MutableObject017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject017");
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
    public void MutableObject018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject018");
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
    public void MutableObject019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject019");
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
    public void MutableObject020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject020");
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
    public void MutableObject021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject021");
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
    public void MutableObject022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject022");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>(obj0);
    }

    @Test
    public void MutableObject023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject023");
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
    public void MutableObject024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject024");
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
    public void MutableObject025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject025");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>();
    }

    @Test
    public void MutableObject026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject026");
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
    public void MutableObject027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject027");
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
    public void MutableObject028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject028");
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
    public void MutableObject029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject029");
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
    public void MutableObject030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject030");
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
    public void MutableObject031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject031");
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
    public void MutableObject032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject032");
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
    public void MutableObject033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject033");
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
    public void MutableObject034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject034");
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
    public void MutableObject035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject035");
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
    public void MutableObject036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject036");
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
    public void MutableObject037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject037");
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
    public void MutableObject038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject038");
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
    public void MutableObject039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject039");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence> charSequenceMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass1 = charSequenceMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableObject040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject040");
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
    public void MutableObject041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject041");
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
    public void MutableObject042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject042");
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
    public void MutableObject043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject043");
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
    public void MutableObject044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject044");
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
    public void MutableObject045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject045");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>> strComparableMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>>();
        java.lang.Class<?> wildcardClass1 = strComparableMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableObject046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject046");
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
    public void MutableObject047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject047");
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
    public void MutableObject048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject048");
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
    public void MutableObject049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject049");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.Class<?> wildcardClass3 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject050");
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
    public void MutableObject051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject051");
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
    public void MutableObject052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject052");
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
    public void MutableObject053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject053");
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
    public void MutableObject054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject054");
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
    public void MutableObject055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject055");
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
    public void MutableObject056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject056");
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
    public void MutableObject057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject057");
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
    public void MutableObject058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject058");
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
    public void MutableObject059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject059");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>();
        java.lang.Class<?> wildcardClass1 = annotatedElementMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableObject060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject060");
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
    public void MutableObject061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject061");
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
    public void MutableObject062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject062");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        java.lang.String str2 = strMutableObject1.getValue();
        strMutableObject1.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void MutableObject063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject063");
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
    public void MutableObject064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject064");
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
    public void MutableObject065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject065");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        java.lang.Class<?> wildcardClass4 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableObject066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject066");
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
    public void MutableObject067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject067");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("hi!");
        java.lang.Class<?> wildcardClass7 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableObject068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject068");
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
    public void MutableObject069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject069");
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
    public void MutableObject070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject070");
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
    public void MutableObject071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject071");
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
    public void MutableObject072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject072");
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
    public void MutableObject073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject073");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>> strComparableMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass2 = strComparableMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject074");
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
    public void MutableObject075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject075");
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
    public void MutableObject076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject076");
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
    public void MutableObject077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject077");
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
    public void MutableObject078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject078");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = strMutableObject0.equals(obj2);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject4.setValue("hi!");
        // The following exception was thrown during execution in MutableObject generation
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
    public void MutableObject079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject079");
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
    public void MutableObject080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject080");
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
    public void MutableObject081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject081");
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
    public void MutableObject082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject082");
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
    public void MutableObject083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject083");
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
    public void MutableObject084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject084");
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
    public void MutableObject085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject085");
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
    public void MutableObject086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject086");
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
    public void MutableObject087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject087");
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
    public void MutableObject088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject088");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>> strComparableMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "null");
        java.lang.Class<?> wildcardClass2 = strComparableMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject089");
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
    public void MutableObject090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject090");
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
    public void MutableObject091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject091");
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
    public void MutableObject092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject092");
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
    public void MutableObject093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject093");
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
    public void MutableObject094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject094");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>();
    }

    @Test
    public void MutableObject095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject095");
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
    public void MutableObject096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject096");
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
    public void MutableObject097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject097");
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
    public void MutableObject098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject098");
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
    public void MutableObject099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject099");
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
    public void MutableObject100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject100");
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
    public void MutableObject101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject101");
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
    public void MutableObject102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject102");
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
    public void MutableObject103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject103");
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
    public void MutableObject104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject104");
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
    public void MutableObject105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject105");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable> serializableMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.io.Serializable>(serializable0);
        java.lang.Class<?> wildcardClass2 = serializableMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject106");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        boolean boolean4 = strMutableObject0.equals((java.lang.Object) 'a');
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject5 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str6 = strMutableObject5.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = strMutableObject5.equals(obj7);
        // The following exception was thrown during execution in MutableObject generation
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
    public void MutableObject107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject107");
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
    public void MutableObject108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject108");
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
    public void MutableObject109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject109");
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
    public void MutableObject110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject110");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence> charSequenceMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence>((java.lang.CharSequence) "null");
    }

    @Test
    public void MutableObject111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject111");
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
    public void MutableObject112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject112");
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
    public void MutableObject113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject113");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.Class<?> wildcardClass3 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject114");
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
    public void MutableObject115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject115");
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
    public void MutableObject116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject116");
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
    public void MutableObject117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject117");
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
    public void MutableObject118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject118");
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
    public void MutableObject119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject119");
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
    public void MutableObject120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject120");
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
    public void MutableObject121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject121");
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
    public void MutableObject122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject122");
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
    public void MutableObject123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject123");
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
    public void MutableObject124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject124");
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
    public void MutableObject125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject125");
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
    public void MutableObject126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject126");
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
    public void MutableObject127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject127");
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
    public void MutableObject128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject128");
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
    public void MutableObject129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject129");
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
    public void MutableObject130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject130");
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
    public void MutableObject131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject131");
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
    public void MutableObject132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject132");
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
    public void MutableObject133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject133");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.Class<?> wildcardClass3 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject134");
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
    public void MutableObject135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject135");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        java.lang.String str2 = strMutableObject0.getValue();
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        boolean boolean6 = strMutableObject0.equals((java.lang.Object) 1.0d);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject8 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        // The following exception was thrown during execution in MutableObject generation
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
    public void MutableObject136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject136");
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
    public void MutableObject137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject137");
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
    public void MutableObject138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject138");
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
    public void MutableObject139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject139");
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
    public void MutableObject140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject140");
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
    public void MutableObject141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject141");
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
    public void MutableObject142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject142");
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
    public void MutableObject143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject143");
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
    public void MutableObject144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject144");
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
    public void MutableObject145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject145");
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
    public void MutableObject146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject146");
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
    public void MutableObject147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject147");
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
    public void MutableObject148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject148");
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
    public void MutableObject149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject149");
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
    public void MutableObject150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject150");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.getValue();
        java.lang.String str2 = strMutableObject0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
    }

    @Test
    public void MutableObject151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject151");
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
    public void MutableObject152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject152");
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
    public void MutableObject153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject153");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.Class<?> wildcardClass2 = strMutableObject1.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject154");
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
    public void MutableObject155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject155");
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
    public void MutableObject156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject156");
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
    public void MutableObject157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject157");
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
    public void MutableObject158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject158");
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
    public void MutableObject159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject159");
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
    public void MutableObject160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject160");
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
    public void MutableObject161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject161");
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
    public void MutableObject162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject162");
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
    public void MutableObject163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject163");
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
    public void MutableObject164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject164");
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
    public void MutableObject165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject165");
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
    public void MutableObject166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject166");
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
    public void MutableObject167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject167");
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
    public void MutableObject168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject168");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("null");
        java.lang.Class<?> wildcardClass3 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject169");
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
    public void MutableObject170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject170");
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
    public void MutableObject171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject171");
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
    public void MutableObject172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject172");
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
    public void MutableObject173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject173");
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
    public void MutableObject174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject174");
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
    public void MutableObject175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject175");
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
    public void MutableObject176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject176");
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
    public void MutableObject177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject177");
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
    public void MutableObject178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject178");
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
    public void MutableObject179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject179");
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
    public void MutableObject180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject180");
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
    public void MutableObject181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject181");
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
    public void MutableObject182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject182");
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
    public void MutableObject183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject183");
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
    public void MutableObject184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject184");
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
    public void MutableObject185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject185");
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
    public void MutableObject186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject186");
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
    public void MutableObject187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject187");
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
    public void MutableObject188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject188");
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
    public void MutableObject189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject189");
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
    public void MutableObject190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject190");
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
    public void MutableObject191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject191");
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
    public void MutableObject192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject192");
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
    public void MutableObject193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject193");
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
    public void MutableObject194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject194");
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
    public void MutableObject195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject195");
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
    public void MutableObject196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject196");
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
    public void MutableObject197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject197");
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
    public void MutableObject198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject198");
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
    public void MutableObject199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject199");
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
    public void MutableObject200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject200");
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
    public void MutableObject201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject201");
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
    public void MutableObject202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject202");
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
    public void MutableObject203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject203");
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
    public void MutableObject204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject204");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>();
        java.lang.Class<?> wildcardClass1 = strMutableMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableObject205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject205");
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
    public void MutableObject206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject206");
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
    public void MutableObject207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject207");
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
    public void MutableObject208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject208");
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
    public void MutableObject209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject209");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.Class<?> wildcardClass3 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject210");
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
    public void MutableObject211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject211");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("null");
        java.lang.Class<?> wildcardClass3 = strMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject212");
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
    public void MutableObject213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject213");
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
    public void MutableObject214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject214");
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
    public void MutableObject215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject215");
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
    public void MutableObject216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject216");
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
    public void MutableObject217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject217");
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
    public void MutableObject218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject218");
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
    public void MutableObject219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject219");
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
    public void MutableObject220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject220");
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
    public void MutableObject221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject221");
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
    public void MutableObject222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject222");
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
    public void MutableObject223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject223");
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
    public void MutableObject224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject224");
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
    public void MutableObject225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject225");
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
    public void MutableObject226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject226");
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
    public void MutableObject227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject227");
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
    public void MutableObject228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject228");
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
    public void MutableObject229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject229");
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
    public void MutableObject230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject230");
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
    public void MutableObject231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject231");
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
    public void MutableObject232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject232");
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
    public void MutableObject233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject233");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("hi!");
        strMutableObject0.setValue("null");
    }

    @Test
    public void MutableObject234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject234");
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
    public void MutableObject235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject235");
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
    public void MutableObject236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject236");
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
    public void MutableObject237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject237");
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
    public void MutableObject238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject238");
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
    public void MutableObject239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject239");
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
    public void MutableObject240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject240");
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
    public void MutableObject241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject241");
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
    public void MutableObject242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject242");
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
    public void MutableObject243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject243");
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
    public void MutableObject244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject244");
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
    public void MutableObject245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject245");
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
    public void MutableObject246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject246");
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
    public void MutableObject247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject247");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("hi!");
        java.lang.Object obj3 = null;
        boolean boolean4 = strMutableObject0.equals(obj3);
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject5 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>((org.apache.commons.lang3.mutable.Mutable<java.lang.String>) strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableObject248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject248");
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
    public void MutableObject249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject249");
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
    public void MutableObject250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject250");
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
    public void MutableObject251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject251");
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
    public void MutableObject252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject252");
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
    public void MutableObject253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject253");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>();
        java.lang.Class<?> wildcardClass1 = genericDeclarationMutableObject0.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject2 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) genericDeclarationMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableObject254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject254");
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
    public void MutableObject255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject255");
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
    public void MutableObject256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject256");
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
    public void MutableObject257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject257");
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
    public void MutableObject258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject258");
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
    public void MutableObject259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject259");
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
    public void MutableObject260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject260");
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
    public void MutableObject261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject261");
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
    public void MutableObject262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject262");
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
    public void MutableObject263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject263");
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
    public void MutableObject264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject264");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.Class<?> wildcardClass3 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject265");
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
    public void MutableObject266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject266");
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
    public void MutableObject267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject267");
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
    public void MutableObject268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject268");
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
    public void MutableObject269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject269");
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
    public void MutableObject270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject270");
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
    public void MutableObject271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject271");
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
    public void MutableObject272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject272");
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
    public void MutableObject273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject273");
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
    public void MutableObject274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject274");
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
    public void MutableObject275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject275");
        org.apache.commons.lang3.mutable.Mutable<java.lang.String> strMutable0 = null;
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>> strMutableMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.Mutable<java.lang.String>>(strMutable0);
        java.lang.Class<?> wildcardClass2 = strMutableMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject276");
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
    public void MutableObject277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject277");
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
    public void MutableObject278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject278");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.toString();
        strMutableObject1.setValue("");
        strMutableObject1.setValue("null");
        strMutableObject1.setValue("null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void MutableObject279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject279");
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
    public void MutableObject280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject280");
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
    public void MutableObject281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject281");
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
    public void MutableObject282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject282");
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
    public void MutableObject283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject283");
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
    public void MutableObject284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject284");
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
    public void MutableObject285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject285");
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
    public void MutableObject286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject286");
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
    public void MutableObject287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject287");
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
    public void MutableObject288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject288");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type> typeMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type>();
        java.lang.Class<?> wildcardClass1 = typeMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableObject289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject289");
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
    public void MutableObject290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject290");
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
    public void MutableObject291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject291");
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
    public void MutableObject292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject292");
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
    public void MutableObject293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject293");
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
    public void MutableObject294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject294");
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
    public void MutableObject295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject295");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.getValue();
        strMutableObject1.setValue("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void MutableObject296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject296");
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
    public void MutableObject297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject297");
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
    public void MutableObject298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject298");
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
    public void MutableObject299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject299");
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
    public void MutableObject300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject300");
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
    public void MutableObject301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject301");
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
    public void MutableObject302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject302");
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
    public void MutableObject303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject303");
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
    public void MutableObject304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject304");
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
    public void MutableObject305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject305");
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
    public void MutableObject306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject306");
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
    public void MutableObject307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject307");
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
    public void MutableObject308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject308");
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
    public void MutableObject309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject309");
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
    public void MutableObject310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject310");
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
    public void MutableObject311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject311");
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
    public void MutableObject312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject312");
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
    public void MutableObject313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject313");
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
    public void MutableObject314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject314");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence> charSequenceMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass2 = charSequenceMutableObject1.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject315");
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
    public void MutableObject316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject316");
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
    public void MutableObject317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject317");
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
    public void MutableObject318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject318");
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
    public void MutableObject319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject319");
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
    public void MutableObject320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject320");
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
    public void MutableObject321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject321");
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
    public void MutableObject322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject322");
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
    public void MutableObject323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject323");
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
    public void MutableObject324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject324");
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
    public void MutableObject325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject325");
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
    public void MutableObject326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject326");
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
    public void MutableObject327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject327");
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
    public void MutableObject328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject328");
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
    public void MutableObject329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject329");
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
    public void MutableObject330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject330");
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
    public void MutableObject331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject331");
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
    public void MutableObject332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject332");
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
    public void MutableObject333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject333");
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
    public void MutableObject334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject334");
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
    public void MutableObject335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject335");
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
    public void MutableObject336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject336");
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
    public void MutableObject337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject337");
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
    public void MutableObject338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject338");
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
    public void MutableObject339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject339");
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
    public void MutableObject340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject340");
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
    public void MutableObject341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject341");
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
    public void MutableObject342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject342");
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
    public void MutableObject343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject343");
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
    public void MutableObject344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject344");
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
    public void MutableObject345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject345");
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
    public void MutableObject346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject346");
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
    public void MutableObject347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject347");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("null");
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
    }

    @Test
    public void MutableObject348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject348");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>> strComparableMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>>(strComparable0);
        java.lang.Class<?> wildcardClass2 = strComparableMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject349");
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
    public void MutableObject350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject350");
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
    public void MutableObject351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject351");
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
    public void MutableObject352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject352");
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
    public void MutableObject353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject353");
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
    public void MutableObject354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject354");
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
    public void MutableObject355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject355");
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
    public void MutableObject356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject356");
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
    public void MutableObject357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject357");
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
    public void MutableObject358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject358");
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
    public void MutableObject359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject359");
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
    public void MutableObject360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject360");
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
    public void MutableObject361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject361");
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
    public void MutableObject362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject362");
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
    public void MutableObject363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject363");
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
    public void MutableObject364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject364");
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
    public void MutableObject365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject365");
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
    public void MutableObject366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject366");
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
    public void MutableObject367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject367");
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
    public void MutableObject368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject368");
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
    public void MutableObject369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject369");
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
    public void MutableObject370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject370");
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
    public void MutableObject371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject371");
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
    public void MutableObject372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject372");
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
    public void MutableObject373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject373");
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
    public void MutableObject374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject374");
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
    public void MutableObject375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject375");
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
    public void MutableObject376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject376");
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
    public void MutableObject377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject377");
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
    public void MutableObject378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject378");
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
    public void MutableObject379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject379");
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
    public void MutableObject380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject380");
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
    public void MutableObject381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject381");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.String str3 = strMutableObject1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
    }

    @Test
    public void MutableObject382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject382");
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
    public void MutableObject383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject383");
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
    public void MutableObject384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject384");
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
    public void MutableObject385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject385");
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
    public void MutableObject386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject386");
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
    public void MutableObject387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject387");
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
    public void MutableObject388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject388");
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
    public void MutableObject389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject389");
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
    public void MutableObject390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject390");
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
    public void MutableObject391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject391");
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
    public void MutableObject392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject392");
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
    public void MutableObject393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject393");
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
    public void MutableObject394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject394");
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
    public void MutableObject395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject395");
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
    public void MutableObject396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject396");
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
    public void MutableObject397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject397");
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
    public void MutableObject398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject398");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.getValue();
        java.lang.Class<?> wildcardClass2 = strMutableObject0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject399");
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
    public void MutableObject400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject400");
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
    public void MutableObject401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject401");
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
    public void MutableObject402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject402");
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
    public void MutableObject403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject403");
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
    public void MutableObject404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject404");
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
    public void MutableObject405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject405");
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
    public void MutableObject406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject406");
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
    public void MutableObject407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject407");
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
    public void MutableObject408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject408");
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
    public void MutableObject409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject409");
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
    public void MutableObject410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject410");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.toString();
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void MutableObject411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject411");
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
    public void MutableObject412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject412");
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
    public void MutableObject413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject413");
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
    public void MutableObject414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject414");
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
    public void MutableObject415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject415");
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
    public void MutableObject416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject416");
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
    public void MutableObject417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject417");
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
    public void MutableObject418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject418");
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
    public void MutableObject419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject419");
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
    public void MutableObject420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject420");
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
    public void MutableObject421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject421");
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
    public void MutableObject422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject422");
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
    public void MutableObject423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject423");
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
    public void MutableObject424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject424");
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
    public void MutableObject425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject425");
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
    public void MutableObject426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject426");
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
    public void MutableObject427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject427");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) false);
        java.lang.Class<?> wildcardClass2 = objMutableObject1.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration> genericDeclarationMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass2);
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type> typeMutableObject4 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject428");
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
    public void MutableObject429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject429");
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
    public void MutableObject430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject430");
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
    public void MutableObject431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject431");
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
    public void MutableObject432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject432");
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
    public void MutableObject433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject433");
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
    public void MutableObject434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject434");
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
    public void MutableObject435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject435");
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
    public void MutableObject436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject436");
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
    public void MutableObject437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject437");
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
    public void MutableObject438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject438");
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
    public void MutableObject439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject439");
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
    public void MutableObject440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject440");
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
    public void MutableObject441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject441");
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
    public void MutableObject442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject442");
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
    public void MutableObject443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject443");
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
    public void MutableObject444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject444");
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
    public void MutableObject445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject445");
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
    public void MutableObject446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject446");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        java.lang.String str2 = strMutableObject1.toString();
        java.lang.Class<?> wildcardClass3 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject447");
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
    public void MutableObject448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject448");
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
    public void MutableObject449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject449");
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
    public void MutableObject450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject450");
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
    public void MutableObject451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject451");
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
    public void MutableObject452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject452");
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
    public void MutableObject453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject453");
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
    public void MutableObject454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject454");
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
    public void MutableObject455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject455");
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
    public void MutableObject456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject456");
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
    public void MutableObject457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject457");
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
    public void MutableObject458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject458");
        java.lang.reflect.AnnotatedElement annotatedElement0 = null;
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>(annotatedElement0);
    }

    @Test
    public void MutableObject459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject459");
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
    public void MutableObject460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject460");
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
    public void MutableObject461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject461");
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
    public void MutableObject462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject462");
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
    public void MutableObject463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject463");
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
    public void MutableObject464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject464");
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
    public void MutableObject465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject465");
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
    public void MutableObject466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject466");
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
    public void MutableObject467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject467");
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
    public void MutableObject468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject468");
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
    public void MutableObject469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject469");
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
    public void MutableObject470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject470");
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
    public void MutableObject471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject471");
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
    public void MutableObject472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject472");
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
    public void MutableObject473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject473");
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
    public void MutableObject474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject474");
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
    public void MutableObject475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject475");
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
    public void MutableObject476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject476");
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
    public void MutableObject477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject477");
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
    public void MutableObject478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject478");
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
    public void MutableObject479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject479");
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
    public void MutableObject480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject480");
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
    public void MutableObject481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject481");
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
    public void MutableObject482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject482");
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
    public void MutableObject483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject483");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>> strComparableMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass2 = strComparableMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject484");
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
    public void MutableObject485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject485");
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
    public void MutableObject486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject486");
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
    public void MutableObject487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject487");
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
    public void MutableObject488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject488");
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
    public void MutableObject489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject489");
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
    public void MutableObject490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject490");
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
    public void MutableObject491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject491");
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
    public void MutableObject492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject492");
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
    public void MutableObject493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject493");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        strMutableObject1.setValue("");
        strMutableObject1.setValue("");
        java.lang.String str8 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject494");
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
    public void MutableObject495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject495");
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
    public void MutableObject496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject496");
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
    public void MutableObject497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject497");
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
    public void MutableObject498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject498");
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
    public void MutableObject499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject499");
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
    public void MutableObject500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject0.MutableObject500");
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

