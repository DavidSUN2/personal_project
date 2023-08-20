
package MutableObject;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableObject1 {

    public static boolean debug = false;

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test501");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test502");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test503");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test504");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test505");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test506");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test507");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("null");
        strMutableObject1.setValue("null");
        java.lang.String str4 = strMutableObject1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test508");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test509");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test510");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test511");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test512");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("hi!");
        java.lang.String str2 = strMutableObject1.getValue();
        java.lang.Class<?> wildcardClass3 = strMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test513");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test514");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test515");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test516");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test517");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test518");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test519");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test520");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test521");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test522");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test523");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test524");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test525");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test526");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test527");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        java.lang.String str1 = strMutableObject0.toString();
        strMutableObject0.setValue("null");
        strMutableObject0.setValue("");
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test528");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test529");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test530");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test531");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.Object> objMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Object>((java.lang.Object) 10L);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test532");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>("");
        strMutableObject1.setValue("hi!");
        strMutableObject1.setValue("");
        strMutableObject1.setValue("");
        java.lang.String str8 = strMutableObject1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test533");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test534");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test535");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test536");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test537");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test538");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test539");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test540");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test541");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test542");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test543");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("null");
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("");
        org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>> strMutableObjectMutableObject6 = new org.apache.commons.lang3.mutable.MutableObject<org.apache.commons.lang3.mutable.MutableObject<java.lang.String>>(strMutableObject0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null" + "'", str3.equals("null"));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test544");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test545");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test546");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test547");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test548");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test549");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test550");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test551");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test552");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test553");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test554");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test555");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test556");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test557");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test558");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test559");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test560");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test561");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test562");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test563");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test564");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test565");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence> charSequenceMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass2 = charSequenceMutableObject1.getClass();
        org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement> annotatedElementMutableObject3 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test566");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test567");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test568");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test569");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test570");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test571");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test572");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test573");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test574");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test575");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test576");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test577");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test578");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test579");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test580");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test581");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test582");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test583");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test584");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test585");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test586");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test587");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test588");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test589");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.String> strMutableObject0 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.String>();
        strMutableObject0.setValue("");
        java.lang.String str3 = strMutableObject0.getValue();
        strMutableObject0.setValue("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test590");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test591");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test592");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test593");
        org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence> charSequenceMutableObject1 = new org.apache.commons.lang3.mutable.MutableObject<java.lang.CharSequence>((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass2 = charSequenceMutableObject1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test594");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test595");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test596");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test597");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test598");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test599");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test600");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test601");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test602");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test603");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test604");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test605");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test606");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test607");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test608");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test609");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test610");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test611");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test612");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test613");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test614");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test615");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test616");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test617");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test618");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test619");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test620");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test621");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test622");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test623");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test624");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test625");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test626");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test627");
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
    public void MutableObject() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableObject1.test628");
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

