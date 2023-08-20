
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
            System.out.format("%n%s%n", "ConstantInitializer0.test001");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test002");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) -1 + "'", serializable2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test003");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable4);
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test004");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>(obj0);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test005");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer4);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer4.getClass();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) wildcardClass6);
        boolean boolean9 = serializableConstantInitializer1.equals((java.lang.Object) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test006");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable6);
        java.lang.String str8 = serializableConstantInitializer7.toString();
        boolean boolean9 = serializableConstantInitializer1.equals((java.lang.Object) str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test007");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) 1.0f);
        boolean boolean8 = serializableConstantInitializer1.equals((java.lang.Object) 1.0d);
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test008");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "");
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test009");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = serializable6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test010");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test011");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializerConstantInitializer3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test012");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable6 = serializableConstantInitializer5.get();
        java.io.Serializable serializable7 = serializableConstantInitializer5.getObject();
        java.lang.String str8 = serializableConstantInitializer5.toString();
        boolean boolean9 = serializableConstantInitializer1.equals((java.lang.Object) str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + ' ' + "'", serializable6.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + ' ' + "'", serializable7.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test013");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.String> strConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.String>("hi!");
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test014");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer4);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer4.getClass();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) wildcardClass6);
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test015");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable4);
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test016");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Comparable<java.lang.String>> strComparableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test017");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass5 = serializable4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1) + "'", serializable4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test018");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer4);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer4.getClass();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) wildcardClass6);
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test019");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test020");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) "hi!");
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test021");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test022");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test023");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test024");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) 1.0f);
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test025");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) 1);
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer6);
        java.io.Serializable serializable8 = serializableConstantInitializer6.get();
        java.io.Serializable serializable9 = serializableConstantInitializer6.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (byte) 1 + "'", serializable9.equals((byte) 1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test026");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) 1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer3);
        java.lang.Object obj5 = null;
        boolean boolean6 = serializableConstantInitializer3.equals(obj5);
        java.io.Serializable serializable7 = serializableConstantInitializer3.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer3.getObject();
        boolean boolean9 = serializableConstantInitializer1.equals((java.lang.Object) serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test027");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        boolean boolean8 = serializableConstantInitializer1.equals((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 100.0d + "'", serializable5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 100.0d + "'", serializable6.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test028");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = serializableConstantInitializer1.equals(obj5);
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test029");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) 1);
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer6);
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test030");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test031");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) 1.0f);
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test032");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) 10);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        boolean boolean7 = serializableConstantInitializer5.equals((java.lang.Object) 10);
        java.io.Serializable serializable8 = serializableConstantInitializer5.getObject();
        boolean boolean9 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1) + "'", serializable8.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test033");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) 1);
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer6);
        java.io.Serializable serializable8 = serializableConstantInitializer6.get();
        java.lang.String str9 = serializableConstantInitializer6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8.equals((byte) 1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test034");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test035");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test036");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) 1.0f);
        boolean boolean8 = serializableConstantInitializer1.equals((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test037");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test038");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = serializable6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test039");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass7);
        java.io.Serializable serializable9 = serializableConstantInitializer8.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test040");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test041");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer3.toString();
        java.lang.String str7 = serializableConstantInitializer3.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer3.get();
        java.lang.Class<?> wildcardClass9 = serializable8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test042");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0L);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test043");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) 1.0f);
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test044");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable4);
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test045");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + 0.0d + "'", serializable9.equals(0.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test046");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test047");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test048");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test049");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass5);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test050");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) (byte) 1);
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test051");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) "hi!");
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test052");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) -1 + "'", serializable2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test053");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test054");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test055");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 100.0d + "'", serializable5.equals(100.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test056");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str6 = serializableConstantInitializer5.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) str6);
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test057");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.lang.String str2 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer4);
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializerConstantInitializer6.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass7);
        boolean boolean9 = serializableConstantInitializer1.equals((java.lang.Object) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test058");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = serializableConstantInitializer5.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test059");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str6 = serializableConstantInitializer5.toString();
        java.lang.String str7 = serializableConstantInitializer5.toString();
        java.lang.String str8 = serializableConstantInitializer5.toString();
        boolean boolean9 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test060");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer4);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer4.getClass();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) wildcardClass6);
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test061");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test062");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer3.toString();
        java.lang.String str7 = serializableConstantInitializer3.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer3.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>> serializableConcurrentInitializerConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>) serializableConstantInitializer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test063");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.lang.String str5 = serializableConstantInitializer4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test064");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str6 = serializableConstantInitializer5.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) str6);
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test065");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) -1 + "'", serializable2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test066");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test067");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) 1.0d);
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 100.0d + "'", serializable5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + 100.0d + "'", serializable9.equals(100.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test068");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) 1.0f);
        boolean boolean8 = serializableConstantInitializer1.equals((java.lang.Object) 1.0d);
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test069");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test070");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test071");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test072");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str7 = serializableConstantInitializer6.toString();
        boolean boolean8 = serializableConstantInitializer1.equals((java.lang.Object) str7);
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test073");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializerConstantInitializer3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = annotatedElementConstantInitializer5.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = genericDeclarationConstantInitializer7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test074");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Comparable<java.lang.String>> strComparableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test075");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str6 = serializableConstantInitializer5.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) str6);
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test076");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable4);
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test077");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test078");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) -1 + "'", serializable2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test079");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test080");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 100.0d + "'", serializable3.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test081");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test082");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable4);
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer5.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test083");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = serializable6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test084");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer4);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer4.getClass();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) wildcardClass6);
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test085");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = typeConstantInitializer7.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test086");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass9 = serializable8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test087");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>> serializableConcurrentInitializerConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>) serializableConstantInitializer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test088");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test089");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 100.0d + "'", serializable5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test090");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass2 = objConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.lang.String str4 = serializableConstantInitializer3.toString();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test091");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test092");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test093");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) "hi!");
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test094");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer4);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer4.getClass();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) wildcardClass6);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test095");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer3.toString();
        java.lang.String str7 = serializableConstantInitializer3.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer3.get();
        java.io.Serializable serializable9 = serializableConstantInitializer3.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test096");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer3.toString();
        java.lang.String str7 = serializableConstantInitializer3.toString();
        java.lang.String str8 = serializableConstantInitializer3.toString();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test097");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) 1);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test098");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializerConstantInitializer3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = annotatedElementConstantInitializer5.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.io.Serializable serializable9 = serializableConstantInitializer8.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test099");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) 1);
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer6);
        java.io.Serializable serializable8 = serializableConstantInitializer6.get();
        java.lang.Class<?> wildcardClass9 = serializable8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (byte) 1 + "'", serializable8.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test100");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test101");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test102");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) (-1L));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test103");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0L);
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test104");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = typeConstantInitializer7.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test105");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test106");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 0.0d + "'", serializable6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test107");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str7 = serializableConstantInitializer6.toString();
        boolean boolean8 = serializableConstantInitializer1.equals((java.lang.Object) str7);
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test108");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        boolean boolean8 = serializableConstantInitializer1.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + ' ' + "'", serializable5.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + ' ' + "'", serializable6.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test109");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test110");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable4);
        java.io.Serializable serializable6 = serializableConstantInitializer5.getObject();
        java.lang.String str7 = serializableConstantInitializer5.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer5);
        boolean boolean9 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test111");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test112");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test113");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) 1.0f);
        boolean boolean8 = serializableConstantInitializer1.equals((java.lang.Object) 1.0d);
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test114");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.io.Serializable serializable8 = serializableConstantInitializer7.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test115");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test116");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test117");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str6 = serializableConstantInitializer5.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) str6);
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test118");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass6 = serializable5.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test119");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test120");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1) + "'", serializable2.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test121");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.Object obj6 = null;
        boolean boolean7 = serializableConstantInitializer1.equals(obj6);
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + ' ' + "'", serializable5.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test122");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0L);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test123");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test124");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializerConstantInitializer3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = annotatedElementConstantInitializer5.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test125");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test126");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.io.Serializable serializable6 = serializableConstantInitializer3.getObject();
        java.lang.String str7 = serializableConstantInitializer3.toString();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test127");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) (short) -1);
        boolean boolean9 = serializableConstantInitializer1.equals((java.lang.Object) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test128");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = serializableConstantInitializer5.get();
        java.io.Serializable serializable7 = serializableConstantInitializer5.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable7);
        java.io.Serializable serializable9 = serializableConstantInitializer8.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test129");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass3 = serializable2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test130");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0L);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test131");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer3);
        java.lang.String str5 = serializableConstantInitializer3.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.io.Serializable serializable7 = serializableConstantInitializer3.get();
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (short) -1 + "'", serializable7.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test132");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable5 = serializableConstantInitializer4.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test133");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 10L);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test134");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass5 = serializable4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test135");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        boolean boolean8 = serializableConstantInitializer6.equals((java.lang.Object) (short) 1);
        boolean boolean9 = serializableConstantInitializer1.equals((java.lang.Object) boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test136");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 1L);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test137");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass2 = objConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.lang.String str4 = serializableConstantInitializer3.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer3.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer3.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test138");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test139");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer4);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer4.getClass();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) wildcardClass6);
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test140");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) true);
        boolean boolean9 = serializableConstantInitializer1.equals((java.lang.Object) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test141");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass5);
        java.io.Serializable serializable7 = serializableConstantInitializer6.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer6);
        java.io.Serializable serializable9 = serializableConstantInitializer6.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test142");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str6 = serializableConstantInitializer5.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) str6);
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test143");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) (short) 0);
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 100.0d + "'", serializable8.equals(100.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test144");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test145");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = serializable8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test146");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (short) -1 + "'", serializable6.equals((short) -1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test147");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = genericDeclarationConstantInitializer7.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test148");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass5 = serializable4.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test149");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test150");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test151");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        boolean boolean9 = serializableConstantInitializer1.equals((java.lang.Object) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test152");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test153");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test154");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) 1);
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer6);
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test155");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test156");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test157");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) "");
        java.lang.String str6 = serializableConstantInitializer5.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test158");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test159");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test160");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test161");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test162");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 10L);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test163");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.Object obj7 = null;
        boolean boolean8 = serializableConstantInitializer1.equals(obj7);
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test164");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) (short) 0);
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 100.0d + "'", serializable8.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + 100.0d + "'", serializable9.equals(100.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test165");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test166");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 0.0d + "'", serializable6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 0.0d + "'", serializable7.equals(0.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test167");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializerConstantInitializer3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = annotatedElementConstantInitializer5.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test168");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) 1.0f);
        java.lang.String str7 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test169");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test170");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass3 = serializable2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable2);
        java.io.Serializable serializable5 = serializableConstantInitializer4.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 0.0f + "'", serializable2.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 0.0f + "'", serializable5.equals(0.0f));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test171");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test172");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 10L);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test173");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test174");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        boolean boolean9 = serializableConstantInitializer1.equals((java.lang.Object) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) -1 + "'", serializable2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (short) -1 + "'", serializable5.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (short) -1 + "'", serializable7.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test175");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer3.toString();
        java.lang.String str7 = serializableConstantInitializer3.toString();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test176");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test177");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass7);
        java.io.Serializable serializable9 = serializableConstantInitializer8.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test178");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str6 = serializableConstantInitializer5.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) str6);
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test179");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test180");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable7 = serializableConstantInitializer6.get();
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test181");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test182");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0L);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test183");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test184");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 0.0d + "'", serializable6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 0.0d + "'", serializable7.equals(0.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test185");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1) + "'", serializable2.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1) + "'", serializable3.equals((-1)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test186");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = serializableConstantInitializer5.get();
        java.lang.Class<?> wildcardClass7 = serializable6.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass7);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test187");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test188");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1) + "'", serializable4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1) + "'", serializable5.equals((-1)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test189");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test190");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        boolean boolean8 = serializableConstantInitializer1.equals((java.lang.Object) (short) -1);
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test191");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.lang.String str5 = serializableConstantInitializer1.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) 0.0d);
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test192");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + 0.0d + "'", serializable9.equals(0.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test193");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test194");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) "hi!");
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test195");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer3.toString();
        java.lang.String str7 = serializableConstantInitializer3.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer3.get();
        java.lang.String str9 = serializableConstantInitializer3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test196");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 0.0d + "'", serializable6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 0.0d + "'", serializable8.equals(0.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test197");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 10L);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 10L + "'", serializable2.equals(10L));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test198");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + ' ' + "'", serializable5.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + ' ' + "'", serializable6.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + ' ' + "'", serializable7.equals(' '));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test199");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test200");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) -1 + "'", serializable2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test201");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test202");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 1);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test203");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 1.0f);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test204");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) "hi!");
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test205");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass5);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass5);
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test206");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) 1);
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer6);
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = serializable8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test207");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer3);
        java.lang.String str5 = serializableConstantInitializer3.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str7 = serializableConstantInitializer3.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer3.getObject();
        java.io.Serializable serializable9 = serializableConstantInitializer3.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (short) -1 + "'", serializable8.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (short) -1 + "'", serializable9.equals((short) -1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test208");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass5);
        java.io.Serializable serializable7 = serializableConstantInitializer6.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer6);
        java.io.Serializable serializable9 = serializableConstantInitializer6.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test209");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test210");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable6 = serializableConstantInitializer5.get();
        java.io.Serializable serializable7 = serializableConstantInitializer5.getObject();
        java.lang.String str8 = serializableConstantInitializer5.toString();
        boolean boolean9 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + ' ' + "'", serializable6.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + ' ' + "'", serializable7.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test211");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test212");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test213");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass6 = serializable5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test214");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) (byte) 1);
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test215");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass3 = serializable2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        java.lang.String str5 = serializableConstantInitializer4.toString();
        java.lang.String str6 = serializableConstantInitializer4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 0.0f + "'", serializable2.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test216");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer3.toString();
        java.lang.String str7 = serializableConstantInitializer3.toString();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test217");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test218");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.io.Serializable serializable8 = serializableConstantInitializer7.get();
        java.io.Serializable serializable9 = serializableConstantInitializer7.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test219");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test220");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) -1 + "'", serializable2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test221");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Object obj4 = null;
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test222");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test223");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test224");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test225");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test226");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        boolean boolean8 = serializableConstantInitializer1.equals((java.lang.Object) (-1.0f));
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 100.0d + "'", serializable5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 100.0d + "'", serializable6.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test227");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) true);
        boolean boolean9 = serializableConstantInitializer6.equals((java.lang.Object) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test228");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) 1);
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer6);
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test229");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0);
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test230");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable7 = serializableConstantInitializer6.get();
        java.io.Serializable serializable8 = serializableConstantInitializer6.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test231");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass5);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test232");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1) + "'", serializable2.equals((-1)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test233");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = serializableConstantInitializer5.get();
        java.io.Serializable serializable7 = serializableConstantInitializer5.getObject();
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test234");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test235");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test236");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test237");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = genericDeclarationConstantInitializer5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test238");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test239");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test240");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) 1.0d);
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 100.0d + "'", serializable5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 100.0d + "'", serializable8.equals(100.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test241");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0f);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 100.0f + "'", serializable2.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 100.0f + "'", serializable3.equals(100.0f));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test242");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        java.lang.Class<?> wildcardClass6 = obj4.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test243");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) 1.0d);
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 100.0d + "'", serializable5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test244");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test245");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test246");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass7 = serializable6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (short) -1 + "'", serializable5.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (short) -1 + "'", serializable6.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test247");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (short) -1 + "'", serializable5.equals((short) -1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test248");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test249");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test250");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) 1.0f);
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>> serializableConcurrentInitializerConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>) serializableConstantInitializer1);
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test251");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test252");
        java.lang.CharSequence charSequence0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>(charSequence0);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test253");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass3 = serializable2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test254");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str6 = serializableConstantInitializer5.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) str6);
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test255");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test256");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.lang.String str8 = serializableConstantInitializer7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test257");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer3.toString();
        java.lang.String str7 = serializableConstantInitializer3.toString();
        java.lang.String str8 = serializableConstantInitializer3.toString();
        java.lang.String str9 = serializableConstantInitializer3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test258");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.Object obj2 = null;
        boolean boolean3 = serializableConstantInitializer1.equals(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test259");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test260");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        java.lang.String str5 = serializableConstantInitializer4.toString();
        java.lang.String str6 = serializableConstantInitializer4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test261");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) "hi!");
        boolean boolean9 = serializableConstantInitializer1.equals((java.lang.Object) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test262");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test263");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.lang.String str9 = serializableConstantInitializer8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test264");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass5);
        java.io.Serializable serializable7 = serializableConstantInitializer6.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer6);
        java.lang.String str9 = serializableConstantInitializer6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test265");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + ' ' + "'", serializable5.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + ' ' + "'", serializable7.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + ' ' + "'", serializable8.equals(' '));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test266");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test267");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test268");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test269");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test270");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) (short) 0);
        java.lang.String str8 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test271");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) -1 + "'", serializable2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test272");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test273");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test274");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) -1 + "'", serializable2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (short) -1 + "'", serializable6.equals((short) -1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test275");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100L);
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer6.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass7);
        boolean boolean9 = serializableConstantInitializer1.equals((java.lang.Object) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test276");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass7 = serializable6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 0.0d + "'", serializable6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test277");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test278");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass6 = serializable5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test279");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer6.getClass();
        boolean boolean8 = serializableConstantInitializer1.equals((java.lang.Object) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test280");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass9 = objConstantInitializer8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test281");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1L));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str4 = serializableConstantInitializer3.toString();
        java.lang.String str5 = serializableConstantInitializer3.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) str5);
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1L) + "'", serializable7.equals((-1L)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test282");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test283");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test284");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = serializable7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test285");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 10L);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str3 = serializableConstantInitializer1.toString();
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test286");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + ' ' + "'", serializable6.equals(' '));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test287");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = serializableConstantInitializer5.get();
        java.io.Serializable serializable7 = serializableConstantInitializer5.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable7);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test288");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable4);
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test289");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) 1);
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer6);
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test290");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test291");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.Object obj7 = null;
        boolean boolean8 = serializableConstantInitializer1.equals(obj7);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test292");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0L);
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.Object obj8 = null;
        boolean boolean9 = serializableConstantInitializer1.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test293");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable4);
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test294");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test295");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) (byte) 0);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test296");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer0);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializerConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test297");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + ' ' + "'", serializable5.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + ' ' + "'", serializable8.equals(' '));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test298");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test299");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        boolean boolean5 = serializableConstantInitializer3.equals((java.lang.Object) (short) 10);
        java.lang.String str6 = serializableConstantInitializer3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test300");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        boolean boolean7 = serializableConstantInitializer3.equals((java.lang.Object) '#');
        java.io.Serializable serializable8 = serializableConstantInitializer3.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test301");
        org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable> serializableConcurrentInitializer0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>> serializableConcurrentInitializerConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>>(serializableConcurrentInitializer0);
        java.lang.Class<?> wildcardClass2 = serializableConcurrentInitializerConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test302");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str6 = serializableConstantInitializer5.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) str6);
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test303");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test304");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer3);
        java.lang.String str5 = serializableConstantInitializer3.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str7 = serializableConstantInitializer3.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer3.get();
        java.io.Serializable serializable9 = serializableConstantInitializer3.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (short) -1 + "'", serializable8.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (short) -1 + "'", serializable9.equals((short) -1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test305");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.lang.String str8 = serializableConstantInitializer7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test306");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test307");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = serializableConstantInitializer5.get();
        java.lang.String str7 = serializableConstantInitializer5.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer5.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test308");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test309");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test310");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable4);
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test311");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str8 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test312");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (short) -1 + "'", serializable5.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (short) -1 + "'", serializable6.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (short) -1 + "'", serializable7.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test313");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.io.Serializable serializable8 = serializableConstantInitializer7.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test314");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test315");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test316");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + ' ' + "'", serializable5.equals(' '));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test317");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test318");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test319");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) -1 + "'", serializable2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test320");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass7 = serializable6.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable6);
        java.lang.String str9 = serializableConstantInitializer8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test321");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = serializableConstantInitializer5.get();
        java.io.Serializable serializable7 = serializableConstantInitializer5.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test322");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer6);
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test323");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 0.0d + "'", serializable8.equals(0.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test324");
        java.lang.reflect.Type type0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>(type0);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test325");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test326");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = serializableConstantInitializer5.get();
        java.io.Serializable serializable7 = serializableConstantInitializer5.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable7);
        java.lang.Class<?> wildcardClass9 = serializable7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test327");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test328");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) (short) 1);
        java.lang.String str6 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 100.0d + "'", serializable3.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test329");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.lang.String str9 = serializableConstantInitializer8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test330");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>> serializableConcurrentInitializerConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>) serializableConstantInitializer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test331");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 10);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 10 + "'", serializable3.equals(10));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test332");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = serializableConstantInitializer1.equals(obj5);
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test333");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test334");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + ' ' + "'", serializable6.equals(' '));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test335");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) (byte) 1);
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass7 = serializable6.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test336");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100);
        boolean boolean9 = serializableConstantInitializer6.equals((java.lang.Object) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test337");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test338");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + ' ' + "'", serializable7.equals(' '));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test339");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) "");
        java.lang.String str6 = serializableConstantInitializer5.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test340");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) "");
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Object obj4 = null;
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + "" + "'", serializable3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test341");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 0.0f + "'", serializable2.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 0.0f + "'", serializable3.equals(0.0f));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test342");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) 10);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test343");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test344");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test345");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test346");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>> serializableConcurrentInitializerConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>) serializableConstantInitializer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test347");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer6);
        java.lang.String str8 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test348");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 0.0d + "'", serializable6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + 0.0d + "'", serializable9.equals(0.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test349");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test350");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer3);
        java.lang.String str5 = serializableConstantInitializer3.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.io.Serializable serializable7 = serializableConstantInitializer3.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer3.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (short) -1 + "'", serializable7.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (short) -1 + "'", serializable8.equals((short) -1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test351");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 0.0d + "'", serializable2.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 0.0d + "'", serializable3.equals(0.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test352");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test353");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        java.io.Serializable serializable5 = serializableConstantInitializer4.get();
        java.lang.String str6 = serializableConstantInitializer4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test354");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = serializable4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test355");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass9 = serializable8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test356");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) 10.0f);
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test357");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test358");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test359");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test360");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) "");
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + "" + "'", serializable3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + "" + "'", serializable5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + "" + "'", serializable6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + "" + "'", serializable7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + "" + "'", serializable9.equals(""));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test361");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer3);
        java.lang.String str5 = serializableConstantInitializer3.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.io.Serializable serializable7 = serializableConstantInitializer3.get();
        java.io.Serializable serializable8 = serializableConstantInitializer3.getObject();
        java.lang.Class<?> wildcardClass9 = serializable8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (short) -1 + "'", serializable7.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (short) -1 + "'", serializable8.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test362");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable4);
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>> serializableConcurrentInitializerConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>) serializableConstantInitializer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test363");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) -1 + "'", serializable2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (short) -1 + "'", serializable5.equals((short) -1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test364");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass3 = serializable2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer6.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass7);
        boolean boolean9 = serializableConstantInitializer4.equals((java.lang.Object) serializableConstantInitializer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 0.0f + "'", serializable2.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test365");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (short) -1 + "'", serializable5.equals((short) -1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test366");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        java.io.Serializable serializable5 = serializableConstantInitializer4.getObject();
        java.lang.Object obj6 = null;
        boolean boolean7 = serializableConstantInitializer4.equals(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test367");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test368");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) 1);
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer6);
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test369");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test370");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.Object obj7 = null;
        boolean boolean8 = serializableConstantInitializer1.equals(obj7);
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test371");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass5);
        java.lang.String str7 = serializableConstantInitializer6.toString();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer6.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test372");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass2 = objConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.lang.String str4 = serializableConstantInitializer3.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer3.get();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test373");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable4);
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test374");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        boolean boolean7 = serializableConstantInitializer3.equals((java.lang.Object) '#');
        java.io.Serializable serializable8 = serializableConstantInitializer3.get();
        java.lang.String str9 = serializableConstantInitializer3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test375");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (short) -1 + "'", serializable5.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (short) -1 + "'", serializable6.equals((short) -1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test376");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (short) -1 + "'", serializable5.equals((short) -1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test377");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass7 = serializable6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) -1 + "'", serializable2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (short) -1 + "'", serializable6.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test378");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.lang.String str7 = serializableConstantInitializer6.toString();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test379");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass2 = objConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.lang.String str4 = serializableConstantInitializer3.toString();
        java.lang.String str5 = serializableConstantInitializer3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test380");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        boolean boolean7 = serializableConstantInitializer3.equals((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test381");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer3);
        java.lang.String str5 = serializableConstantInitializer3.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str7 = serializableConstantInitializer3.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer3.getObject();
        java.lang.Class<?> wildcardClass9 = serializable8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (short) -1 + "'", serializable8.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test382");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + ' ' + "'", serializable5.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test383");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test384");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 0.0d + "'", serializable6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 0.0d + "'", serializable8.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + 0.0d + "'", serializable9.equals(0.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test385");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test386");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 0.0f + "'", serializable2.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 0.0f + "'", serializable3.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 0.0f + "'", serializable4.equals(0.0f));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test387");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) 10);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1) + "'", serializable6.equals((-1)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test388");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.String> strConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.String>("");
        java.lang.Class<?> wildcardClass2 = strConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test389");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = serializableConstantInitializer1.equals(obj6);
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test390");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) 1);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test391");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (short) -1 + "'", serializable6.equals((short) -1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test392");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1));
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) 10);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1) + "'", serializable7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test393");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test394");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test395");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (short) -1 + "'", serializable5.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (short) -1 + "'", serializable6.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (short) -1 + "'", serializable7.equals((short) -1));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test396");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test397");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test398");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializerConstantInitializer3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable7 = serializableConstantInitializer6.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test399");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test400");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test401");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str6 = serializableConstantInitializer5.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) str6);
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = serializable8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test402");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 0.0d + "'", serializable8.equals(0.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test403");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test404");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) 1);
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer6);
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test405");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = serializableConstantInitializer5.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer5.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test406");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test407");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) (short) 0);
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 100.0d + "'", serializable8.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test408");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.io.Serializable serializable6 = serializableConstantInitializer5.get();
        java.io.Serializable serializable7 = serializableConstantInitializer5.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer5.get();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test409");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test410");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 100.0d + "'", serializable5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 100.0d + "'", serializable6.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 100.0d + "'", serializable7.equals(100.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test411");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test412");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test413");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.lang.String str8 = serializableConstantInitializer7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test414");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test415");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass5 = serializable4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test416");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + ' ' + "'", serializable7.equals(' '));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test417");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test418");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass3 = objConstantInitializer2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test419");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) 1.0f);
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test420");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test421");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test422");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test423");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.lang.String str6 = serializableConstantInitializer3.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer3.getObject();
        java.lang.String str8 = serializableConstantInitializer3.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer3.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test424");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable4);
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test425");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test426");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass5);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test427");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>> serializableConcurrentInitializerConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>) serializableConstantInitializer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test428");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        boolean boolean7 = serializableConstantInitializer3.equals((java.lang.Object) '#');
        java.io.Serializable serializable8 = serializableConstantInitializer3.get();
        java.lang.Class<?> wildcardClass9 = serializable8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test429");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) -1 + "'", serializable2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (short) -1 + "'", serializable5.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test430");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.lang.String str5 = serializableConstantInitializer1.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) 0.0d);
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test431");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass2 = objConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.io.Serializable serializable4 = serializableConstantInitializer3.get();
        java.lang.String str5 = serializableConstantInitializer3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test432");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) (byte) 1);
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test433");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test434");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence> charSequenceConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.CharSequence>((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass2 = charSequenceConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test435");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable4);
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer5);
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test436");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test437");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass3 = serializable2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable2);
        java.io.Serializable serializable5 = serializableConstantInitializer4.get();
        java.io.Serializable serializable6 = serializableConstantInitializer4.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer4.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 0.0f + "'", serializable2.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 0.0f + "'", serializable5.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 0.0f + "'", serializable6.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 0.0f + "'", serializable7.equals(0.0f));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test438");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable4 = serializableConstantInitializer3.get();
        java.io.Serializable serializable5 = serializableConstantInitializer3.get();
        java.io.Serializable serializable6 = serializableConstantInitializer3.get();
        java.io.Serializable serializable7 = serializableConstantInitializer3.getObject();
        boolean boolean8 = serializableConstantInitializer1.equals((java.lang.Object) serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (short) -1 + "'", serializable5.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (short) -1 + "'", serializable6.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (short) -1 + "'", serializable7.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test439");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass5 = serializable4.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable4);
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test440");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass2 = objConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.lang.String str4 = serializableConstantInitializer3.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer3.getObject();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test441");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test442");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        java.lang.String str7 = serializableConstantInitializer6.toString();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test443");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass3);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        java.io.Serializable serializable6 = serializableConstantInitializer5.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test444");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test445");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test446");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test447");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test448");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass2 = objConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass2);
        java.lang.Class<?> wildcardClass5 = annotatedElementConstantInitializer4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test449");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) "");
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + "" + "'", serializable3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test450");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test451");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>> serializableConcurrentInitializerConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>) serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass8 = serializableConcurrentInitializerConstantInitializer7.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test452");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializerConstantInitializer2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        java.lang.String str5 = serializableConstantInitializer4.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer4.get();
        java.io.Serializable serializable7 = serializableConstantInitializer4.get();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable7);
        java.lang.Class<?> wildcardClass9 = serializable7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test453");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1L));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>> serializableConcurrentInitializerConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>>((org.apache.commons.lang3.concurrent.ConcurrentInitializer<java.io.Serializable>) serializableConstantInitializer1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1L) + "'", serializable2.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1L) + "'", serializable3.equals((-1L)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test454");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0d);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str4 = serializableConstantInitializer3.toString();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.io.Serializable serializable6 = serializableConstantInitializer3.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer3.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer3.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test455");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test456");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test457");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test458");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 10L);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializerConstantInitializer2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test459");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test460");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test461");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test462");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        java.io.Serializable serializable5 = serializableConstantInitializer4.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer4.get();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test463");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer4);
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer4.getClass();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) wildcardClass6);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) boolean7);
        java.io.Serializable serializable9 = serializableConstantInitializer8.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + false + "'", serializable9.equals(false));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test464");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) 1.0d);
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass9 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 100.0d + "'", serializable5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 100.0d + "'", serializable8.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test465");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) (short) 1);
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = serializableConstantInitializer1.equals(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 100.0d + "'", serializable3.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test466");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 100.0d + "'", serializable3.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test467");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test468");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test469");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) 100);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test470");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test471");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str6 = serializableConstantInitializer5.toString();
        boolean boolean7 = serializableConstantInitializer1.equals((java.lang.Object) str6);
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test472");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass3 = serializable2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass3);
        java.lang.String str5 = serializableConstantInitializer4.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer4.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 0.0f + "'", serializable2.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test473");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 100.0d + "'", serializable5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 100.0d + "'", serializable7.equals(100.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test474");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 10);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 10 + "'", serializable2.equals(10));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test475");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer3);
        java.lang.String str5 = serializableConstantInitializer3.toString();
        boolean boolean6 = serializableConstantInitializer1.equals((java.lang.Object) serializableConstantInitializer3);
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 0.0f + "'", serializable7.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test476");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test477");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = annotatedElementConstantInitializer4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test478");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test479");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test480");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer9 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + ' ' + "'", serializable4.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + ' ' + "'", serializable5.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test481");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass3 = serializable2.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer4 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable2);
        java.io.Serializable serializable5 = serializableConstantInitializer4.getObject();
        java.lang.String str6 = serializableConstantInitializer4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + ' ' + "'", serializable5.equals(' '));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test482");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        boolean boolean3 = serializableConstantInitializer1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = serializableConstantInitializer1.equals(obj4);
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test483");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        java.lang.Object obj3 = null;
        boolean boolean4 = serializableConstantInitializer1.equals(obj3);
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable8 = serializableConstantInitializer1.get();
        java.lang.String str9 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + (-1.0d) + "'", serializable8.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test484");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (byte) 10);
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (byte) 10 + "'", serializable2.equals((byte) 10));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test485");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 10L);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass6 = serializable5.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement> annotatedElementConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.AnnotatedElement>((java.lang.reflect.AnnotatedElement) wildcardClass6);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 10L + "'", serializable3.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 10L + "'", serializable4.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 10L + "'", serializable5.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test486");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass6);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer8 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass6);
        java.io.Serializable serializable9 = serializableConstantInitializer8.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable9);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test487");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass5 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass5);
        java.io.Serializable serializable7 = serializableConstantInitializer6.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializable7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test488");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100L);
        java.lang.Class<?> wildcardClass2 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test489");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        boolean boolean5 = serializableConstantInitializer1.equals((java.lang.Object) 0L);
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass8 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test490");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.get();
        java.io.Serializable serializable7 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass8 = serializable7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) -1 + "'", serializable2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (short) -1 + "'", serializable6.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (short) -1 + "'", serializable7.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test491");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.io.Serializable serializable2 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (-1.0d) + "'", serializable2.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (-1.0d) + "'", serializable3.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test492");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object> objConstantInitializer2 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.Object>((java.lang.Object) serializableConstantInitializer1);
        org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>> serializableConstantInitializerConstantInitializer3 = new org.apache.commons.lang3.concurrent.ConstantInitializer<org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>>(serializableConstantInitializer1);
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.get();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable9 = serializableConstantInitializer1.get();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (-1.0d) + "'", serializable5.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + (-1.0d) + "'", serializable7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + (-1.0d) + "'", serializable9.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test493");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 0.0f);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.lang.Class<?> wildcardClass3 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + 0.0f + "'", serializable2.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test494");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) ' ');
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass4 = serializable3.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + ' ' + "'", serializable2.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + ' ' + "'", serializable3.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test495");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.io.Serializable serializable7 = serializableConstantInitializer1.getObject();
        java.lang.String str8 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 100.0d + "'", serializable4.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 100.0d + "'", serializable5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 100.0d + "'", serializable6.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 100.0d + "'", serializable7.equals(100.0d));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test496");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 10L);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass6 = serializable5.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type> typeConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 10L + "'", serializable3.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 10L + "'", serializable4.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 10L + "'", serializable5.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test497");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (-1.0d));
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.lang.String str5 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable6 = serializableConstantInitializer1.getObject();
        java.lang.String str7 = serializableConstantInitializer1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (-1.0d) + "'", serializable4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + (-1.0d) + "'", serializable6.equals((-1.0d)));
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test498");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) (short) -1);
        java.io.Serializable serializable2 = serializableConstantInitializer1.get();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.io.Serializable serializable4 = serializableConstantInitializer1.get();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.String str6 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass7 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable2 + "' != '" + (short) -1 + "'", serializable2.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + (short) -1 + "'", serializable3.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + (short) -1 + "'", serializable4.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + (short) -1 + "'", serializable5.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test499");
        java.io.Serializable serializable0 = null;
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>(serializable0);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable3 = serializableConstantInitializer1.get();
        java.lang.String str4 = serializableConstantInitializer1.toString();
        java.io.Serializable serializable5 = serializableConstantInitializer1.getObject();
        java.lang.Class<?> wildcardClass6 = serializableConstantInitializer1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializable5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ConstantInitializer() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ConstantInitializer0.test500");
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer1 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) 100.0d);
        java.lang.String str2 = serializableConstantInitializer1.toString();
        java.lang.String str3 = serializableConstantInitializer1.toString();
        java.lang.Class<?> wildcardClass4 = serializableConstantInitializer1.getClass();
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration> genericDeclarationConstantInitializer5 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer6 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable> serializableConstantInitializer7 = new org.apache.commons.lang3.concurrent.ConstantInitializer<java.io.Serializable>((java.io.Serializable) wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}

